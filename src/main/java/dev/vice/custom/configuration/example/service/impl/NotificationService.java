package dev.vice.custom.configuration.example.service.impl;

public class NotificationService {
	
	private String uri;
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void notifyUser() {
		System.out.println("notifying user");
	}

}
