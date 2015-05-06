package garret.slackpay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackList {
	
	
	@JsonProperty("ok")
	private boolean ok;
	
	@JsonProperty("members")
	private List<SlackUser> members;
	
	public List<SlackUser> getMembers(){
		return this.members;
	}
}
