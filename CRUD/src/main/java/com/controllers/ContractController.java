package com.controllers;

import com.entities.Contract;
import com.servicesapi.ContractService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author 06528
 */


@Controller
@RequestMapping("users")
public class ContractController {
        @Autowired
        ContractService contractServices;

        @RequestMapping(value="/contract", method = RequestMethod.GET)
	public ModelAndView getPage(){
		ModelAndView view =new ModelAndView("contract");
		return view;
	}
   	@RequestMapping(value="/saveOrUpdate", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved(Contract contract){
		Map<String,Object> map = new HashMap<String,Object>();
		
		if(contractServices.saveOrUpdate(contract)){
			map.put("status","200");
			map.put("message","Your record have been saved successfully");
		}
		
		return map;
	}     
}
