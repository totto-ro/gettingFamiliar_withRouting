package com.codindojo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/coding" )

public class CodingController {
	
	@RequestMapping( value = "", method = RequestMethod.GET )
	public String index( ) {
		return "<h1>Hello Coding Dojo!</h1>";
	}
	
	@RequestMapping( value = "/python", method = RequestMethod.GET )
	public String secondPage() {
		return "<h1>Python/Django was awesome!</h1>";
	}
	
	@RequestMapping( value = "/java", method = RequestMethod.GET )
	public String thirdPage() {
		return "<h1>Java/Spring is better!</h1>";
	}

}
