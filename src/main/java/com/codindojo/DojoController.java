package com.codindojo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	
	@RequestMapping( value = "/dojo", method = RequestMethod.GET )
	public String indexDojo( ) {
		return "<h1>The dojo is awesome!</h1>";
	}
	
	@RequestMapping( value = "/{dojo}", method = RequestMethod.GET )
	public String secondPageDojo( @PathVariable("dojo") String dojo_name ) {
		
		if( dojo_name.equals("burbank-dojo") ) {
			return "<h1>Burbank Dojo is located in Southern California</h1>";
		}
		else if( dojo_name.equals("san-jose") ){
			return "<h1>SJ dojo is the headquarters</h1>";
		}
		return "<h1>Wrong path! Try again!</h1>";
	}
	
}
