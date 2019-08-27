package com.capg.SpringAssignment.CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.SpringAssignment.Question.Question;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Bean.xml");
		Question ques=(Question)con.getBean("Question");
		System.out.println(ques);

	}

}
