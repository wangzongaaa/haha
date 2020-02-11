package com.bawei.dao;

import java.util.List;

import com.bawei.entity.Applicant;

public interface ApplicantDao {
	List<Applicant> listApplicant(Applicant applicant);
	Integer addApplicant(Applicant applicant);
	List<Applicant> listjob();
	Integer addscore(Applicant applicant);
}
