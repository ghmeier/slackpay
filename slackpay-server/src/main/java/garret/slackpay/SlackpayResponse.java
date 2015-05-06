package garret.slackpay;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackpayResponse {
	
	String message;
	
	public SlackpayResponse(String message){
		this.message = message;
	}
	
	@JsonProperty
	public String getMessage(){
		return this.message;
	}
	
	@JsonProperty
	public void setMessage(String message){
		this.message = message;
	}
}
