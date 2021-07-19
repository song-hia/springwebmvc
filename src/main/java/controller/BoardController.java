package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.dao.BoardDAO;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	BoardDAO dao;
	
	@RequestMapping("list")
	public ModelAndView list(HttpServletRequest request) {
		String[] arr=request.getRequestURI().split("/");
		String context="/"+arr[1]+"/";
		String file="list";
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageboard",dao.list(1));
		mv.setViewName(context+file);
		return mv;
	}
}
