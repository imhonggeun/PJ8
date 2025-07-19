package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("/") //전체 리스트
	public String boardlist(Model model, HttpServletRequest req) {
		return boardService.boardlist(model,req);
	}
	@GetMapping("/boarddetail")
	public String boarddetail(Model model, HttpServletRequest req) {
		return boardService.boarddetail(model,req);
	}
	@PostMapping("/edit")
	public String boardedit(HttpServletRequest req) {
		return boardService.boardedit(req);
	}
	@GetMapping("/boardadd")
	public String boardadd() {
		return "boardadd";
	}
	@PostMapping("/boardadd")
	public String boardadd(HttpServletRequest req) {
		return boardService.boardadd(req);
	}	

}
