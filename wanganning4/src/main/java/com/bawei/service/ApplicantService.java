package com.bawei.service;

import java.util.List;

import com.bawei.entity.Applicant;

public interface ApplicantService {

	List<Applicant> listApplicant(Applicant applicant);
	List<Applicant> listjob();
	Integer addApplicant(Applicant applicant);
	Integer addscore(Applicant applicant);
}
