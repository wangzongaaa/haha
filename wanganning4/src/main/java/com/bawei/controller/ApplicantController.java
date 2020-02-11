package com.bawei.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Applicant;
import com.bawei.service.ApplicantService;

@Controller
public class ApplicantController {
	@Autowired
	private ApplicantService applicantService;
	
	@RequestMapping("listApplicant")
	public String listApplicant(Applicant applicant,HttpServletRequest httpServletRequest)
	{
		List<Applicant> listApplicant = applicantService.listApplicant(applicant);
		httpServletRequest.setAttribute("listApplicant", listApplicant);
		return "list";
	}
	
	@RequestMapping("toaddApplicant")
	public String toaddApplicant(){
		return "add";
	}
	

	@PostMapping("addApplicant")
	@ResponseBody
	public boolean addApplicant(Applicant applicant)
	{
		Integer addApplicant = applicantService.addApplicant(applicant);
		return addApplicant>0;
	}
	
	@RequestMapping("toaddscore")
	public String toaddscore(Applicant applicant,HttpServletRequest httpServletRequest)
	{
		List<Applicant> listApplicant = applicantService.listApplicant(applicant);
		List<Applicant> listjob = applicantService.listjob();
		System.out.println(listjob);
		httpServletRequest.setAttribute("listApplicant",listApplicant.get(0));
		httpServletRequest.setAttribute("listjob",listjob);
		return "addscore";
	}
	
	@PostMapping("addscore")
	@ResponseBody
	public boolean addscore(Applicant applicant,HttpServletRequest httpServletRequest)
	{
		Integer addscore = applicantService.addscore(applicant);
		return addscore>0;
	}
}
