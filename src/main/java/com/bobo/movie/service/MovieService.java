package com.bobo.movie.service;

import java.util.List;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;

public interface MovieService{
	/**模糊查询
	 * 
	 * @param movieVOs
	 * @return
	 */
	List<Movie> selects(MovieVO movieVOs);
}
