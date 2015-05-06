package garret.slackpay;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackInfo {
	public String token;
	public String team_id;
	public String team_domain;
	public String channel_id;
	public String user_id;
	public String user_name;
	public String command;
	public String text;
	
	public SlackInfo(String token,String team_id, String team_domain,String channel_id,String channel_name,String user_id,String user_name,String command,String text){
		this.token = token;
		this.team_id = team_id;
		this.team_domain = team_domain;
		this.channel_id = channel_id;
		this.user_id = user_id;
		this.user_name = user_name;
		this.command = command;
		this.text = text;
	}

	@JsonProperty
	public String getToken() {
		return token;
	}

	@JsonProperty
	public void setToken(String token) {
		this.token = token;
	}

	@JsonProperty
	public String getTeam_id() {
		return team_id;
	}

	@JsonProperty
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	@JsonProperty
	public String getTeam_domain() {
		return team_domain;
	}

	@JsonProperty
	public void setTeam_domain(String team_domain) {
		this.team_domain = team_domain;
	}

	@JsonProperty
	public String getChannel_id() {
		return channel_id;
	}

	@JsonProperty
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	@JsonProperty
	public String getUser_id() {
		return user_id;
	}

	@JsonProperty
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@JsonProperty
	public String getUser_name() {
		return user_name;
	}

	@JsonProperty
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@JsonProperty
	public String getCommand() {
		return command;
	}

	@JsonProperty
	public void setCommand(String command) {
		this.command = command;
	}

	@JsonProperty
	public String getText() {
		return text;
	}

	@JsonProperty
	public void setText(String text) {
		this.text = text;
	}
}
