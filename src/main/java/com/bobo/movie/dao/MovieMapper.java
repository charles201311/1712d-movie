package com.bobo.movie.dao;

import java.util.List;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;

public interface MovieMapper {
	
	/**模糊查询
	 * 
	 * @param movieVOs
	 * @return
	 */
	List<Movie> selects(MovieVO movieVOs);

}
