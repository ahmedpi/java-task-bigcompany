package com.epam.javatask.company.service;

import java.util.List;

import com.epam.javatask.company.employee.Employee;

public interface ReportLineService {
	public List<String> getReportLineReport(List<Employee> employees);

	//public void printReportLineInfo();
}
