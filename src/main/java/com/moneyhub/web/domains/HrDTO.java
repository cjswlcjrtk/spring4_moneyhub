package com.moneyhub.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class HrBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String empno,
	ename,
	job,
	mgr,
	hiredate,
	sal,
	comm,
	deptno,
	dname,
	loc;
}
