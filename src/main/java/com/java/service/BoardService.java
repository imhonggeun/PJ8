package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface BoardService {

	public String boardlist(Model model, HttpServletRequest req); //전체 리스트

	public String boarddetail(Model model, HttpServletRequest req); // 디테일 화면

	public String boardedit(HttpServletRequest req); //수정

	public String boardadd(HttpServletRequest req); //글추가

}
