package garret.slackpay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackProfile {	
	@JsonProperty("email")
	private String email;
	
	public String getEmail(){
		return this.email;
	}
}
