package org.controller;

import javax.validation.Valid;

import org.custompropertyeditor.ApplicantNameCustomEditor;
import org.data.Applicant;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("admissionForm");
		return modelAndView;
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		// webDataBinder.setDisallowedFields(new String[]{"age"});
		webDataBinder.registerCustomEditor(String.class, "name",
				new ApplicantNameCustomEditor());
		

	}

	@ModelAttribute
	public void modelCollege(Model model) {
		model.addAttribute("headerMsg",
				"Welcome to ABC College Of Engineering  !");
	}

	@RequestMapping(value = "/admissionSubmit", method = RequestMethod.POST)
	public ModelAndView success(
			@Valid @ModelAttribute("applicant") Applicant applicant,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("admissionForm");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("admissionSuccess");
		return modelAndView;
	}

}
