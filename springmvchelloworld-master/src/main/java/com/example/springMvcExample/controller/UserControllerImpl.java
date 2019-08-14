package com.example.springMvcExample.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springMvcExample.model.User;
import com.example.springMvcExample.service.CompanyService;
import com.example.springMvcExample.service.UserService;

@Controller
public class UserControllerImpl implements UserController {

	@Autowired
	private UserService userService;

	@Override
	public boolean registerUser(User user) throws SQLException {

		return userService.registerUser(user);
	}

	@RequestMapping(path = "/registerUserPage", method = RequestMethod.GET)
	public ModelAndView registerUser(Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerUser");
		model.addAttribute("registerUser", new User());
		return mv;
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ModelAndView registerCompany(@Valid @ModelAttribute("registerUser") User registerUser, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			map.addAttribute("registerUser", registerUser);
			mav = new ModelAndView("registerUser");
			return mav;
		}

		else {
			map.addAttribute("registerUser", registerUser);
			userService.registerUser(registerUser);
			if (registerUser.getUsertype().equalsIgnoreCase("Admin")) {
				map.addAttribute("adminLogin", new User());
				mav = new ModelAndView("adminLogin");
			} else {
				map.addAttribute("userLogin", new User());
				mav = new ModelAndView("userLogin");
			}

			return mav;
		}

	}

	@RequestMapping(path = "/adminLoginPage", method = RequestMethod.GET)
	public ModelAndView loginAdminPage(Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminLogin");
		model.addAttribute("adminLogin", new User());
		return mv;
	}

	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	public ModelAndView adminLogin(@ModelAttribute("adminLogin") User adminLogin, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		map.addAttribute("adminLogin", adminLogin);
		int check = userService.loginUser(adminLogin.getUsername(), adminLogin.getPassword());
		if (check == 1) {
			mav = new ModelAndView("adminLandingPage");
		}

		else {
			map.addAttribute("adminLogin", adminLogin);
			mav = new ModelAndView("adminLogin");
		}

		return mav;
	}

	@RequestMapping(path = "/userLoginPage", method = RequestMethod.GET)
	public ModelAndView loginUserPage(Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userLogin");
		model.addAttribute("userLogin", new User());
		return mv;
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public ModelAndView userLogin(@ModelAttribute("userLogin") User userLogin, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		map.addAttribute("userLogin", userLogin);
		int check = userService.loginUser(userLogin.getUsername(), userLogin.getPassword());
		if (check == 1) {
			mav = new ModelAndView("userLandingPage");
		}

		else {
			mav = new ModelAndView("userLogin");
		}

		return mav;
	}

}
