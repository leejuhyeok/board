package com.leejuhyeok.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leejuhyeok.board.service.BoardService;

@Controller
public class HomeController {

	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping("")
	public String home(@PageableDefault Pageable pageable,Model model) {
		model.addAttribute("boardList", boardService.findBoardList(pageable));
		return "home";
	}

}
