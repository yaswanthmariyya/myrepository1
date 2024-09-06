package com.yaswanth.app001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class apprunner implements CommandLineRunner {
    @Autowired
    private Environment env;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Details");
        System.out.println("----------------------");
        System.out.println("server port Number :"+env.getProperty("server.port"));
        System.out.println("Application Name :"+env.getProperty("spring.application.name"));
        System.out.println();
        System.out.println("Employee Details");
        System.out.println("----------------------");
        System.out.println("employee name :"+env.getProperty("employee.eno"));
        System.out.println("employee email :"+env.getProperty("employee.ename"));
        System.out.println("Employee Salary :"+env.getProperty("employee.esal"));
        System.out.println("Employee Address :"+env.getProperty("employee.eaddr"));
        System.out.println("Student Details");
        System.out.println("----------------------------");
        System.out.println("Student Id           : "+env.getProperty("student.sid"));
        System.out.println("Student Name         : "+env.getProperty("student.sname"));
        System.out.println("Student Address      : "+env.getProperty("student.saddr"));
    }
}
