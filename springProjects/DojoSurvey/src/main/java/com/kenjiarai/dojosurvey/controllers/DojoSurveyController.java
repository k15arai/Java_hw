package com.kenjiarai.dojosurvey.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kenjiarai.dojosurvey.classes.DojoSurvey;

@Controller
public class DojoSurveyController {
	
	// Get
	@GetMapping("/")
	public String survey() {
		return "form.jsp";
	}
	
	// Get
	@GetMapping("/results")
	public String results(HttpSession session, Model model) {
		
		ArrayList<DojoSurvey> items = (ArrayList<DojoSurvey>) session.getAttribute("survey_results");
		
		if ( items == null) {
			items = new ArrayList<DojoSurvey>();
		}
		
		model.addAttribute("survey_results", items);
		
		return "results.jsp";
	}
	
	// Post
	@PostMapping("/results")
	public String addSurveyInfo(
			@RequestParam(value="full_name") String full_name,
			@RequestParam(value="dojo_location") String dojo_location,
			@RequestParam(value="favorite_language") String favorite_language,
			@RequestParam(value="comment_textarea") String comment_textarea,
			HttpSession session,
			RedirectAttributes redirectAttributes
			) {
		
		ArrayList<DojoSurvey> items = (ArrayList<DojoSurvey>) session.getAttribute("survey_results");
		
		if ( items == null ) {
			items = new ArrayList<DojoSurvey>();
		}
		
		items.add(new DojoSurvey(items.size() + 1, full_name, dojo_location, favorite_language, comment_textarea));
		
		session.setAttribute("survey_results", items);
		
		redirectAttributes.addFlashAttribute("message", "Your results have been logged");
		
		return "redirect:/results";
		
	}

}
