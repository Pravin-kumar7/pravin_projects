package com.firstspring;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) { 
    String name; 
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo(); 
    name = student.getName();
    System.out.println("Developer name :- " +name);

    
}  
}  