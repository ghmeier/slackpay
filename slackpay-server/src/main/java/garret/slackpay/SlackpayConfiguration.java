package garret.slackpay;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.client.HttpClientConfiguration;

public class SlackpayConfiguration extends Configuration {
	  @NotEmpty
	  private String applicationName = "slackpay";
	  
	  @NotEmpty
	  private String slack_token;
	  
	  @Valid
	  @NotNull
	  private HttpClientConfiguration httpClient = new HttpClientConfiguration();
	  
	  @JsonProperty("httpClient")
	  public HttpClientConfiguration getHttpClientConfiguration() {
	      return httpClient;
	  }
	  
	  @JsonProperty("slack_token")
	  public String getSlackToken(){
		  return slack_token;
	  }
	  
	  @JsonProperty("slack_token")
	  public void setSlackToken(String token){
		  slack_token = token;
	  }
	  
	  public String getApplicationName() {
	    return applicationName;
	  }
	 
}