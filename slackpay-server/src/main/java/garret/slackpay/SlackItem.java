package garret.slackpay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.ws.rs.HttpMethod;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SlackItem {

	public static String getSlackEmail (String username,HttpClient client){
		
		String email = null;
		HttpGet get = new HttpGet("https://slack.com/api/users.list?token=xoxp-2801095921-2806004971-4743837401-be17e8");
		try {
			HttpResponse res = client.execute(get);

			ObjectMapper mapper = new ObjectMapper();
			SlackList list = mapper.readValue(res.getEntity().getContent(), SlackList.class);
			for (SlackUser u:list.getMembers()){
				if (u.getName().equals(username.replace("@", ""))){
					email = u.getProfile().getEmail();
					break;
				}
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return email;
	}
	
	public HttpResponse getSlackChannel(String team_id){
		return null;
	}
}
