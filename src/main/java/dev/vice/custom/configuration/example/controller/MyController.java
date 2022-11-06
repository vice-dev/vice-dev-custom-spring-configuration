package dev.vice.custom.configuration.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.vice.custom.configuration.example.config.MyCustomComplexProperties;

@RestController
public class MyController {

//	@Autowired
//	NotificationService notificationService;

	@Autowired
	MyCustomComplexProperties myCustomComplexProperties;
	
	@GetMapping
	public void notifyUser() {
//		System.out.println(notificationService.getUri());
//		notificationService.notifyUser();
		System.out.println(myCustomComplexProperties);
		
	}
	

}
