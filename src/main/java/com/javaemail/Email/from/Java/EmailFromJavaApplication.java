package com.javaemail.Email.from.Java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailFromJavaApplication {
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args)  {
		SpringApplication.run(EmailFromJavaApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("korrrens@gmail.com","ALERT!!!","Internet connection lost!");
	}
}
