package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.java.dao.BoardDao;
import com.java.dto.BoardDTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImp implements BoardService{
	
	private final BoardDao boardDao;

	@Override
	public String boardlist(Model model, HttpServletRequest req) {
		String accept = req.getParameter("accept");
		if (accept == null || accept =="") accept ="2";
		List<BoardDTO> boardDTO = boardDao.boardlist(accept);
		model.addAttribute("result", boardDTO);
		return "boardlist";
	}

	@Override
	public String boarddetail(Model model, HttpServletRequest req) {
		int no = Integer.parseInt(req.getParameter("no"));
		BoardDTO boardDTO = boardDao.boarddetail(no);
		model.addAttribute("result", boardDTO);
		return "boarddetail";
	}

	@Override
	public String boardedit(HttpServletRequest req) {
		int no = Integer.parseInt(req.getParameter("no"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		BoardDTO boardDTO = BoardDTO.builder().no(no).title(title).content(content).build();
		boardDao.bardedit(boardDTO);
		return "redirect:/";
	}

	@Override
	public String boardadd(HttpServletRequest req) {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		BoardDTO boardDTO = BoardDTO.builder().title(title).content(content).build();
		boardDao.boardadd(boardDTO);
		return "redirect:/";
	}

}
