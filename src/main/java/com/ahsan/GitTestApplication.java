package com.ahsan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestApplication 
{

	@PostMapping("/purchase/{userName}/{amount}/{productName}")
	public String purchase(@RequestBody Order order)
	{
		
		return "";
		
	//	return "Hi"+ order.get +" order for "+productName+" with amount "+amount+" stored successfully";
	}
	
	
	public static void main(String[] args)  
	{
		SpringApplication.run(GitTestApplication.class, args);
		
		System.out.println("Ahsan Shareef Mohammed");
		
		System.out.println("Ibrahim Shareef Mohammed");
		
		System.out.println("Mustafa Shareef Mohammed");
		
		
	}

}
