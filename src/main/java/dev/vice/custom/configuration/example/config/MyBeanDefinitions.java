package dev.vice.custom.configuration.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.vice.custom.configuration.example.service.impl.NotificationService;

@Configuration
public class MyBeanDefinitions {
	
	
	@ConditionalOnProperty(prefix = "vice.dev", name = "notification.service.enabled", havingValue = "true")
	@Bean
	public NotificationService regbean(@Value("${vice.dev.notification.service.uri:localhots:8088}") String uri) {
		NotificationService service = new NotificationService();
		service.setUri(uri);
		return service;
	}

}
