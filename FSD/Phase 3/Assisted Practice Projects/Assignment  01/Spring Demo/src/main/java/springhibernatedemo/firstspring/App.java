package springhibernatedemo.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       
       Student s1=(Student) context.getBean("s");
       // object of marks class
       Marks m=s1.getMark();
       System.out.println("ID is :"+s1.getId());
       System.out.println("Name is :"+s1.getName());
       System.out.println("English Marks :"+m.getEnglish());
       System.out.println("DSA Marks :"+m.getDsa());
       System.out.println("Math Marks :"+m.getMath());
    }
}
