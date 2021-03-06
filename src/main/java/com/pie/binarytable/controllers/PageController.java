package com.pie.binarytable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
Controller for simple pages
 */
@Controller
public class PageController
{
	@GetMapping("/terms")
	public String terms()
	{
		return "terms";
	}

	@GetMapping("/index")
	public String main()
	{
		return "index";
	}

	@GetMapping("/")
	public String index()
	{
		return "index";
	}

	@GetMapping("/goal")
	public String goal()
	{
		return "goal";
	}

	@GetMapping("/contacts")
	public String contact()
	{
		return "contacts";
	}

	@GetMapping("/usecases")
	public String useCases()
	{
		return "usecases";
	}
}
