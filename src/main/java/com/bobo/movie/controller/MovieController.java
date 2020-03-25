package com.bobo.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.vo.MovieVO;

@Controller
public class MovieController {
	
	//1711F 完成开发
	//1712D 完成开发
	//1712D 又改了
	
	@Resource
	private MovieService movieService;
	
	
	@RequestMapping("selects")
	public String list(MovieVO movieVO,Model model) {
		List<Movie> movies = movieService.selects(movieVO);
		model.addAttribute("movies",movies);
		return "movies";
	}

}
