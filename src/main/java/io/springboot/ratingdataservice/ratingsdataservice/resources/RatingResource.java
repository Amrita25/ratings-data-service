package io.springboot.ratingdataservice.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import io.springboot.ratingdataservice.ratingsdataservice.models.Rating;
import io.springboot.ratingdataservice.ratingsdataservice.models.UserRating;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId){
		return new Rating(movieId,5);
	}
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId){
		List<Rating> ratings= Arrays.asList(new Rating("1234", 5),
				new Rating("5678", 4),
				new Rating("3456", 5));
		UserRating userRating=new UserRating();
		userRating.setUserRatings(ratings);
		System.out.println("inside getUserRating in rating data service");
		return userRating;
	}

}
