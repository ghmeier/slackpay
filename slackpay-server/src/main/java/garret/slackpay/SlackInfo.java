package garret.slackpay;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackInfo {
	@QueryParam("token")
	public String token;
	
	@QueryParam("team_id")
	public String team_id;
	
	@QueryParam("team_domain")
	public String team_domain;
	
	@QueryParam("channel_id")
	public String channel_id;
	
	@QueryParam("user_id")
	public String user_id;
	
	@QueryParam("user_name")
	public String user_name;
	
	@QueryParam("command")
	public String command;
	
	@QueryParam("text")
	public String text;

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
