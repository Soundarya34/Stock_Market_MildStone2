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

import com.example.springMvcExample.model.Company;
import com.example.springMvcExample.model.User;
import com.example.springMvcExample.service.CompanyService;
import com.example.springMvcExample.service.UserService;

@Controller
public class CompanyControllerImpl implements CompanyController {

	@Autowired
	private CompanyService companyService;

	@Autowired
	private UserService userService;

	@Override
	public boolean insertCompany(Company company) throws SQLException {
		return companyService.insertCompany(company);

	}

	
	
	@RequestMapping(path = "/createCompanyPage", method = RequestMethod.GET)
	public ModelAndView registerCompany(Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CreateCompany");
		model.addAttribute("company", new Company());
		return mv;
	}

	

	@RequestMapping(value = "/registerCompany", method = RequestMethod.GET)
	public ModelAndView registerCompany(@Valid @ModelAttribute("company") Company company, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			
			
			map.addAttribute("company", company);
			mav = new ModelAndView("CreateCompany");
			return mav;
		}

		else {
			map.addAttribute("company", company);
			companyService.insertCompany(company);
			mav = new ModelAndView("companyList");
			mav.addObject("companyList", companyService.getCompanyList());
			return mav;
		}

	}
	
	@RequestMapping(path = "/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList", companyService.getCompanyList());
		return mv;
	}

	

	/*@Override
	public boolean updateCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return companyService.updateCompany(company);
	}


	@RequestMapping(path = "/update", method = RequestMethod.GET)
	public ModelAndView update(Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("update");
		model.addAttribute("updateCompany", new Company());

		return mv;
	}
	
	
	
	@RequestMapping(value = "/updateCompany", method = RequestMethod.POST)
	public ModelAndView updateCompany(@ModelAttribute("updateCompany") Company company, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			map.addAttribute("company", company);
			mav = new ModelAndView("CreateCompany");
			return mav;
		} else {
			String companyName = request.getParameter("companyName");
			String ceoName = request.getParameter("ceoName");

			String id = request.getParameter("companyCode");
			int compId = Integer.parseInt(id);
			company.setCompanyCode(compId);
			company.setCompanyName(companyName);
			company.setCeoName(ceoName);
			map.addAttribute("company", company);
			
			companyService.updateCompany(company);
			
			mav = new ModelAndView("companyList");
			mav.addObject("companyList", companyService.getCompanyList());
			return mav;
		}

	}*/

}