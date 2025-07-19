package com.java.dao;

import java.util.List;

import com.java.dto.BoardDTO;

public interface BoardDao {

	List<BoardDTO> boardlist(String accept); //전체리스트를 accept 기준으로 보여줌

	BoardDTO boarddetail(int no); // 하나 선택

	int bardedit(BoardDTO boardDTO);// 수정

	int boardadd(BoardDTO boardDTO); // 글 추가

}
