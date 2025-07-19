package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.java.dto.BoardDTO;

@Mapper
public interface BoardMapper {

	@Select("""
			<script>
		    SELECT * FROM test
		    <where>
		        <if test="accept == 1">
		            accept = #{accept}
		        </if>
		        <if test="accept == 0">
		            accept = #{accept}
		        </if>
		    </where>
		</script>
		""")
	List<BoardDTO> boardlist(String accept);

	@Select("select * from test where no = #{no}")
	BoardDTO boarddetail(int no);

	@Update("UPDATE test set title=#{title},content=#{content} where no=#{no}")
	int bardedit(BoardDTO boardDTO);

	@Insert("insert into test (title,content) values (#{title},#{content})")
	int boardadd(BoardDTO boardDTO);

}
