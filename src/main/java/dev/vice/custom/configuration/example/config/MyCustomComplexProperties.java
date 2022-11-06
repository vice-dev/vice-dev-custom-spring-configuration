package dev.vice.custom.configuration.example.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "vice.dev.mail.service")
public class MyCustomComplexProperties {

	private String hostName;
	private int port;
	private String from;
	private List<String> recepients;
	private Map<String, String> headers;
	private Credentials creds;
	
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public List<String> getRecepients() {
		return recepients;
	}
	public void setRecepients(List<String> recepients) {
		this.recepients = recepients;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public Credentials getCreds() {
		return creds;
	}
	public void setCreds(Credentials creds) {
		this.creds = creds;
	}
	@Override
	public String toString() {
		return "MyCustomComplexProperties [hostName=" + hostName + ", port=" + port + ", from=" + from + ", recepients="
				+ recepients + ", headers=" + headers + ", creds=" + creds + "]";
	}
	
	

}
