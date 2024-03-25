package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
		/*
		 * JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * //insert query String
		 * query="insert into student(id ,name,city) values(?,?,?)";
		 * 
		 * //fire the query int result = template.update(query,02,"krishna", "bhopal");
		 * 
		 * System.out.println("number of record insserted.."+ result);
		 * 
		 * 
		 */
        
//        input
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        Student student =new Student();
//        student.setId(6265);
//        student.setName("aayushi");
//        student.setCity("atm");
//        
//        int result = studentDao.insert(student);
//        System.out.println("student added"+result);
        
        
        //update
//        Student student=new Student();
//        student.setId(02);
//        student.setName("king");
//        student.setCity("pune");
//        
//        int result = studentDao.change(student);
//        System.out.println("data change "+ result);
//        }
    
    // DELETE
        
        int result =studentDao.delete(76);
        System.out.println("deleted"+result);
    }
    
    
}
