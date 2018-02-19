package com.stationary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stationary.command.JobProfileCommand;
import com.stationary.service.StationaryService;

@Controller
public class StationaryRegistrationController {

	@Autowired
	StationaryService service;
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}

	@RequestMapping(name = "/job-profile.htm", method = RequestMethod.GET)
	public String showJobProfilePage(Model model) {

		JobProfileCommand command = new JobProfileCommand();

		model.addAttribute("jobRegistrationCommand", command);
		return "job-profile";
	}

	@RequestMapping("/contact.htm")
	public String showContactPage() {
		return "contact-us";
	}

	@RequestMapping("/statistics.htm")
	public String renderStatisticsView() {
		return "statistics";
	}

	@RequestMapping("/job.htm")
	public String renderJobView() {
		return "job";
	}

	@RequestMapping(name = "/stationary", method = RequestMethod.POST)
	public String processRegistration(Model model, @ModelAttribute JobProfileCommand command,
			BindingResult errors) {
		
		String jobId = service.persistJobTransaction(command);
		
		System.out.println(command);
		
		model.addAttribute("jobId", jobId);
		model.addAttribute("result", true);
		
		return "job-profile";
	}

	@RequestMapping("/about-us.htm")
	public String renderAboutPage() {
		return "about_us";
	}
}
