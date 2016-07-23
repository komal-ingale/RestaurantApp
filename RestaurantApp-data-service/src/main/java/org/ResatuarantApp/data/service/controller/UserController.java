package org.ResatuarantApp.data.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	//
	// @RequestMapping(value = "/createUser", method = RequestMethod.POST,
	// produces = "application/json", consumes = "application/json")
	//
	// public @ResponseBody String createUser(@RequestBody String test) throws
	// Exception {
	//
	// return test;
	// }

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	// @RequestMapping(value = "/", method = RequestMethod.POST)
	// public String printWelcome(ModelMap model) {
	//
	// model.addAttribute("message", "Spring 3 MVC Hello World");
	// return "hello";
	//
	// }
	//
	// @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	// public ModelAndView hello(@PathVariable("name") String name) {
	//
	// ModelAndView model = new ModelAndView();
	// model.setViewName("hello");
	// model.addObject("msg", name);
	//
	// return model;
	//
	// }

}
