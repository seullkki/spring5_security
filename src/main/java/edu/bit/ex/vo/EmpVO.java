package edu.bit.ex.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmpVO {

	private String empNo;						
	private String eName;
	private String	job;
	private String	mgr;
	private String	hiredate;
	private int	sal;
	private int	comm;
	private int	deptNo;
	
	private List<AuthVO> authList;

	
//	public EmpVO() {
//		super();
//	}
//
//	public EmpVO(String empNo, String eName, String job, String mgr, String hiredate, int sal, int comm, int deptNo, List<AuthVO> authList
//			) {
//		super();
//		this.empNo = empNo;
//		this.eName = eName;
//		this.job = job;
//		this.mgr = mgr;
//		this.hiredate = hiredate;
//		this.sal = sal;
//		this.comm = comm;
//		this.deptNo = deptNo;
//		this.authList = authList;
//
//	}
//
//	public String getEmpNo() {
//		return empNo;
//	}
//
//	public void setEmpNo(String empNo) {
//		this.empNo = empNo;
//	}
//
//	public String geteName() {
//		return eName;
//	}
//
//	public void seteName(String eName) {
//		this.eName = eName;
//	}
//
//	public String getJob() {
//		return job;
//	}
//
//	public void setJob(String job) {
//		this.job = job;
//	}
//
//	public String getMgr() {
//		return mgr;
//	}
//
//	public void setMgr(String mgr) {
//		this.mgr = mgr;
//	}
//
//	public String getHiredate() {
//		return hiredate;
//	}
//
//	public void setHiredate(String hiredate) {
//		this.hiredate = hiredate;
//	}
//
//	public int getSal() {
//		return sal;
//	}
//
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
//
//	public int getComm() {
//		return comm;
//	}
//
//	public void setComm(int comm) {
//		this.comm = comm;
//	}
//
//	public int getDeptNo() {
//		return deptNo;
//	}
//
//	public void setDeptNo(int deptNo) {
//		this.deptNo = deptNo;
//	}
//
//	public List<AuthVO> getAuthList() {
//		return authList;
//	}
//
//	public void setAuthList(List<AuthVO> authList) {
//		this.authList = authList;
//	}

	
}
