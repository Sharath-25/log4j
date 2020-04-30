package com.xworkz.logging.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	private static final Logger logger = Logger.getLogger(WelcomeController.class);

	public WelcomeController() {
		super();
		logger.debug("Created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/index.do")
	public String getMessage(Model model) {
		if (logger.isDebugEnabled()) {
			logger.debug("getMessage() is executed");
		}
		model.addAttribute("message", "response from controller");

		logger.debug("printing messages on the console without System.out.println()");
		return "Welcome.jsp";

	}

}
