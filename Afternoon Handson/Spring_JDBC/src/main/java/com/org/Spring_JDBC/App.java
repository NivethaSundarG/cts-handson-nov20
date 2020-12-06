package com.org.Spring_JDBC;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("employeeService");
		List<Employee> list = service.fetchAllEmployee();
		list.forEach(e -> System.out.println(e));
	
    }
}
