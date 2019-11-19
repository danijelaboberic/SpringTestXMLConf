package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    static Student s;
	public static void main(String[] args){
		ApplicationContext ctx = new FileSystemXmlApplicationContext("student.xml");		 
		s=ctx.getBean(Student.class);
		s.predstaviSe();
		
	}


}
