package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("arunheart")
	private Heart heart;

	
//	public void setHear(Heart heart) {
//		this.heart = heart;
//		System.out.println("Setter Method is Called");
//	}
//	
//	                                                                     //If you are used @Autowired Annotaion, We don't need to using
//	public Human(Heart heart) {                                            Setters and constructors.Then how will be spring inject the object    
//		this.heart = heart;                                                into out dependencies ?                           
//		System.out.println("Constructor is Called");                             Because the XMl configuration will configure and inject the  
//	}                                                                       objects into our respective dependencies.We mentioned the dependencies
//	                                                                        with values.  
//	Human()
//	{
//		System.out.println("Default Constructor is called");
//	}

	void pumping() {
		
	if(heart != null) {
		
		heart.pump();
		System.out.println("The Name of Animal is:" + heart.getNameOfAnimal() + " The Number of Hearts of that animal is:" + heart.getNoOfHearts());
	}
	else {
		System.out.println("You are heart is not pumping");
		System.out.println(" So You are Dead");
	}
	
	}
	

}
