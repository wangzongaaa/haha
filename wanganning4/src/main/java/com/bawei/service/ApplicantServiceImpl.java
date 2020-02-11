package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.ApplicantDao;
import com.bawei.entity.Applicant;

@Service
public class ApplicantServiceImpl implements ApplicantService{
	
	@Autowired
	private ApplicantDao applicantDao;
	@Override
	public List<Applicant> listApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return applicantDao.listApplicant(applicant);
	}
	
	@Override
	public Integer addApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return applicantDao.addApplicant(applicant);
	}
	
	@Override
	public List<Applicant> listjob() {
		// TODO Auto-generated method stub
		return applicantDao.listjob();
	}

	@Override
	public Integer addscore(Applicant applicant) {
		// TODO Auto-generated method stub
		return applicantDao.addscore(applicant);
	}

}
