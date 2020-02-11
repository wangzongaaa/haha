package com.bawei.entity;

public class Applicant {
	

	private Integer id;
	private String name;
	private String gender;
	private String birthday;
	private String college;
	private String major;
	private Integer edu;
	private Integer degree;
	private String  created;
	
	private Integer  aid;
	private Integer jid;
	private Integer score;

	private Integer ids;
	private String names;
	private Integer require_edu;
	private Integer require_degree;
	private String intro;
	
	
	
	


	public Applicant(Integer id, String name, String gender, String birthday, String college, String major, Integer edu,
			Integer degree, String created, Integer aid, Integer jid, Integer score, Integer ids, String names,
			Integer require_edu, Integer require_degree, String intro) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.college = college;
		this.major = major;
		this.edu = edu;
		this.degree = degree;
		this.created = created;
		this.aid = aid;
		this.jid = jid;
		this.score = score;
		this.ids = ids;
		this.names = names;
		this.require_edu = require_edu;
		this.require_degree = require_degree;
		this.intro = intro;
	}






	@Override
	public String toString() {
		return "Applicant [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", college="
				+ college + ", major=" + major + ", edu=" + edu + ", degree=" + degree + ", created=" + created
				+ ", aid=" + aid + ", jid=" + jid + ", score=" + score + ", ids=" + ids + ", names=" + names
				+ ", require_edu=" + require_edu + ", require_degree=" + require_degree + ", intro=" + intro + "]";
	}






	public Integer getId() {
		return id;
	}






	public void setId(Integer id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getGender() {
		return gender;
	}






	public void setGender(String gender) {
		this.gender = gender;
	}






	public String getBirthday() {
		return birthday;
	}






	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}






	public String getCollege() {
		return college;
	}






	public void setCollege(String college) {
		this.college = college;
	}






	public String getMajor() {
		return major;
	}






	public void setMajor(String major) {
		this.major = major;
	}






	public Integer getEdu() {
		return edu;
	}






	public void setEdu(Integer edu) {
		this.edu = edu;
	}






	public Integer getDegree() {
		return degree;
	}






	public void setDegree(Integer degree) {
		this.degree = degree;
	}






	public String getCreated() {
		return created;
	}






	public void setCreated(String created) {
		this.created = created;
	}






	public Integer getAid() {
		return aid;
	}






	public void setAid(Integer aid) {
		this.aid = aid;
	}






	public Integer getJid() {
		return jid;
	}






	public void setJid(Integer jid) {
		this.jid = jid;
	}






	public Integer getScore() {
		return score;
	}






	public void setScore(Integer score) {
		this.score = score;
	}






	public Integer getIds() {
		return ids;
	}






	public void setIds(Integer ids) {
		this.ids = ids;
	}






	public String getNames() {
		return names;
	}






	public void setNames(String names) {
		this.names = names;
	}






	public Integer getRequire_edu() {
		return require_edu;
	}






	public void setRequire_edu(Integer require_edu) {
		this.require_edu = require_edu;
	}






	public Integer getRequire_degree() {
		return require_degree;
	}






	public void setRequire_degree(Integer require_degree) {
		this.require_degree = require_degree;
	}






	public String getIntro() {
		return intro;
	}






	public void setIntro(String intro) {
		this.intro = intro;
	}






	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
