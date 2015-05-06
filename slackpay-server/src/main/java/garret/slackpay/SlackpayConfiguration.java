package garret.slackpay;

import java.util.HashMap;
import java.util.Map;

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
	  private Map<String,String> slack_token = new HashMap<String,String>();
	  
	  @Valid
	  @NotNull
	  private HttpClientConfiguration httpClient = new HttpClientConfiguration();
	  
	  @JsonProperty("httpClient")
	  public HttpClientConfiguration getHttpClientConfiguration() {
	      return httpClient;
	  }
	  
	  @JsonProperty("slack_token")
	  public String getSlackToken(String team){
		  return slack_token.get(team);
	  }
	  
	  @JsonProperty("slack_token")
	  public void setSlackToken(Map<String,String> tokens){
		  slack_token = tokens;
	  }
	  
	  public String getApplicationName() {
	    return applicationName;
	  }
	 
}