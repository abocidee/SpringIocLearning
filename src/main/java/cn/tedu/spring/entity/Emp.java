package cn.tedu.spring.entity;

import java.sql.Date;

public class Emp {
  private Integer empNo;
  private String  ename;
  private String job;
  private Integer  mgr;
  private Date hireDate;
  private Double salary;
  private Double comm;
  private Integer deptno;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getEmpNo() {
	return empNo;
}
public void setEmpNo(Integer empNo) {
	this.empNo = empNo;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public Integer getMgr() {
	return mgr;
}
public void setMgr(Integer mgr) {
	this.mgr = mgr;
}
public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public Double getComm() {
	return comm;
}
public void setComm(Double comm) {
	this.comm = comm;
}
public Integer getDeptno() {
	return deptno;
}
public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}
  
  
  
}
