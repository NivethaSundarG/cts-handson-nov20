package com.org.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	int n=10;
		String name="Anita";
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.delete();
		service.store();
		service.getEmployee(n);
		service.updateEmployee(n, "Nivetha");
		service.simpleMethod(n, 12345);
		service.simpleMethodTwo(name);
    }
}
