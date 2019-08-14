package com.example.springMvcExample.controller;

import java.sql.SQLException;
import java.util.List;

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
import com.example.springMvcExample.model.StockExchange;
import com.example.springMvcExample.service.StockExchangeService;

@Controller
public class StockExchangeControllerImpl implements StockExchangeController {

	@Autowired
	private StockExchangeService stockExchangeService;

	@Override
	public boolean insertStockExchange(StockExchange stockExchange) throws SQLException {
		// TODO Auto-generated method stub
		return stockExchangeService.insertStockExchange(stockExchange);

	}

	@Override
	public List<StockExchange> getStockExchangeList() throws Exception {
		// TODO Auto-generated method stub
		return stockExchangeService.getStockExchangeList();
	}

	@RequestMapping(path = "/registerStockPage", method = RequestMethod.GET)
	public ModelAndView registerCompany(Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerStock");
		model.addAttribute("stockRegister", new StockExchange());
		return mv;
	}

	@RequestMapping(value = "/registerStock", method = RequestMethod.POST)
	public ModelAndView registerCompany(@Valid @ModelAttribute("stockRegister") StockExchange stockRegister,
			BindingResult result, HttpServletRequest request, HttpSession session, ModelMap map) throws Exception {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			map.addAttribute("stockRegister", stockRegister);
			mav = new ModelAndView("registerStock");
			return mav;
		}

		else {
			map.addAttribute("stockRegister", stockRegister);
			stockExchangeService.insertStockExchange(stockRegister);
			mav = new ModelAndView("stockExchangeList");
			mav.addObject("stockExchangeList", stockExchangeService.getStockExchangeList());

			return mav;
		}

	}

	@RequestMapping(path = "/stockList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("stockExchangeList");
		mav = new ModelAndView("stockExchangeList");
		mav.addObject("stockExchangeList", stockExchangeService.getStockExchangeList());
		return mav;
	}

}