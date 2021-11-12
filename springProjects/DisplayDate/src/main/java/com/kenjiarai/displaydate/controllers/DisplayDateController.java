package com.kenjiarai.displaydate.controllers;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] dayOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int monthNumber = cal.get(Calendar.MONTH);
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeekNumber = cal.get(Calendar.DAY_OF_WEEK);
		int year = cal.get(Calendar.YEAR);
		
		model.addAttribute("year", year);
		model.addAttribute("month", month[monthNumber]);
		model.addAttribute("dayOfTheMonth", dayOfMonth);
		model.addAttribute("dayOfTheWeek", dayOfTheWeek[dayOfWeekNumber]);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		
		Date time = new Date();
		Calendar clock = Calendar.getInstance();
		clock.setTime(time);
		int hourTime = clock.get(Calendar.HOUR_OF_DAY) + 1;
		int minutesTime = clock.get(Calendar.MINUTE);
		String meridiem = "AM";
		
		if (hourTime > 12) {
			hourTime = hourTime - 12;
			meridiem = "PM";
		}
		
		model.addAttribute("hours", hourTime);
		model.addAttribute("minutes", minutesTime);
		model.addAttribute("meridiem", meridiem);
		
		return "time.jsp";
	}
}
