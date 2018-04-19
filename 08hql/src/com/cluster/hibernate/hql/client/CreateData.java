package com.cluster.hibernate.hql.client;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cluster.hibernate.hql.entity.Department;
import com.cluster.hibernate.hql.entity.Employee;

public class CreateData {
	
	public void createDeptEmployeeData(Transaction trans, Session session){
		
		Calendar calendar = Calendar.getInstance();
		
		// Creating records for Accounts Department
		Department accountDepartment = new Department("ACCOUNTING", "NEW YORK");
		calendar.set(1981, 8, 06);
		Employee employeeClark = new Employee("CLARK", "MANAGER", new Date(calendar.getTimeInMillis()), 2450);
		calendar.set(1981, 10, 17);
		Employee employeeKing = new Employee("KING", "PRESIDENT", new Date(calendar.getTimeInMillis()), 5000);
		employeeClark.setDepartment(accountDepartment);
		employeeKing.setDepartment(accountDepartment);
		Set<Employee> hsEmployee =  new HashSet<Employee>();
		hsEmployee.add(employeeClark);	
		hsEmployee.add(employeeKing);
		accountDepartment.setHsEmployee(hsEmployee);
		session.save(accountDepartment);

		// Creating records for Research Department
		Department researchDepartment = new Department("RESEARCH", "DALLAS");
		calendar.set(1981, 8, 06);
		Employee employeeSmith = new Employee("SMITH", "CLERK", new Date(calendar.getTimeInMillis()), 800);
		calendar.set(1987, 3, 19);
		Employee employeeScott = new Employee("SCOTT", "ANALYST", new Date(calendar.getTimeInMillis()), 3000);
		calendar.set(1981, 2, 12);
		Employee employeeFord = new Employee("FORD", "ANALYST", new Date(calendar.getTimeInMillis()), 3000);
		calendar.set(1981, 3, 2);
		Employee employeeJones = new Employee("JONES", "MANAGER", new Date(calendar.getTimeInMillis()), 2975);
		employeeSmith.setDepartment(researchDepartment);
		employeeScott.setDepartment(researchDepartment);
		employeeFord.setDepartment(researchDepartment);
		employeeJones.setDepartment(researchDepartment);
		hsEmployee =  new HashSet<Employee>();
		hsEmployee.add(employeeSmith);	
		hsEmployee.add(employeeScott);
		hsEmployee.add(employeeFord);	
		hsEmployee.add(employeeJones);
		researchDepartment.setHsEmployee(hsEmployee);
		session.save(researchDepartment);

		// Creating records for SALES Department
		Department salesDepartment = new Department("SALES", "CHICAGO");
		calendar.set(1981, 8, 06);
		Employee employeeAllen = new Employee("ALLEN", "SALESMAN", new Date(calendar.getTimeInMillis()), 1600, new Double(300));
		calendar.set(1987, 3, 19);
		Employee employeeJames = new Employee("JAMES", "CLERK", new Date(calendar.getTimeInMillis()), 950);
		calendar.set(1981, 2, 12);
		Employee employeeBlake = new Employee("BLAKE", "MANAGER", new Date(calendar.getTimeInMillis()), 2850);
		calendar.set(1981, 3, 2);
		Employee employeeMartin = new Employee("MARTIN", "SALESMAN", new Date(calendar.getTimeInMillis()), 1250, new Double(1400));
		calendar.set(1981, 3, 2);
		Employee employeeTurner = new Employee("TURNER", "SALESMAN", new Date(calendar.getTimeInMillis()), 1500, new Double(0));
		calendar.set(1981, 3, 2);
		Employee employeeWard = new Employee("WARD", "SALESMAN", new Date(calendar.getTimeInMillis()), 1250, new Double(500));

		employeeAllen.setDepartment(salesDepartment);
		employeeJames.setDepartment(salesDepartment);
		employeeBlake.setDepartment(salesDepartment);
		employeeMartin.setDepartment(salesDepartment);
		employeeTurner.setDepartment(salesDepartment);
		employeeWard.setDepartment(salesDepartment);

		hsEmployee =  new HashSet<Employee>();
		hsEmployee.add(employeeAllen);	
		hsEmployee.add(employeeJames);
		hsEmployee.add(employeeBlake);	
		hsEmployee.add(employeeMartin);
		hsEmployee.add(employeeTurner);	
		hsEmployee.add(employeeWard);
		salesDepartment.setHsEmployee(hsEmployee);
		session.save(salesDepartment);
		
		// Creating records for OPERATIONS Department (no employees in Operations department)
		Department operationsDepartment = new Department("OPERATIONS", "BOSTON");
		session.save(operationsDepartment);
		
		// Creating employee records who do not belong to any department
		calendar.set(1981, 3, 2);
		Employee employeeAdams = new Employee("ADAMS", "CLERK", new Date(calendar.getTimeInMillis()), 1100);
		calendar.set(1981, 3, 2);
		Employee employeeMiller = new Employee("MILLER", "CLERK", new Date(calendar.getTimeInMillis()), 1300);
		session.save(employeeAdams);
		session.save(employeeMiller);

	//	trans.commit();
		System.out.println("Done !!!!");

		
	}

}
