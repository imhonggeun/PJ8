package com.java.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.dto.BoardDTO;
import com.java.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardDaoImp implements BoardDao{
	
	private final BoardMapper boardMapper;
	
	@Override
	public List<BoardDTO> boardlist(String accept) {
		return boardMapper.boardlist(accept);
	}

	@Override
	public BoardDTO boarddetail(int no) {
		return boardMapper.boarddetail(no);
	}

	@Override
	public int bardedit(BoardDTO boardDTO) {
		return boardMapper.bardedit(boardDTO);
	}

	@Override
	public int boardadd(BoardDTO boardDTO) {
		return boardMapper.boardadd(boardDTO);
	}

}
