package garret.slackpay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackUser {

	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("profile")
	private SlackProfile profile;
	
	public SlackProfile getProfile(){
		return this.profile;
	}
	
	public String getName(){
		return this.name;
	}
}
