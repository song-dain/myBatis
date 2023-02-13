package com.ambition.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ambition.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	
	@GetMapping("/board")
	public String boardSelect(Model model) {
		
		model.addAttribute("list", boardService.select());
		
		return "board";
	}
	

}
