package garret.slackpay;

import java.util.Scanner;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.HttpClient;

@Path("pay")
@Produces(MediaType.TEXT_PLAIN)
public class PayResource {
	
	private final HttpClient client;
	
	public PayResource(HttpClient client) {
		this.client = client;
	}
	
	@GET
	public String getPay(@BeanParam SlackInfo info){
		String text = info.getText();
		Scanner s = new Scanner(text);

		String username = "";
		if (s.hasNext()){
			username = s.next();
		}else{
			return "invalid";
		}
		
		String recip = SlackItem.getSlackEmail(username,client);
		if (recip == null){
			return "invalid";
		}
		
		double amt = 0;
		if (s.hasNext()){
			String temp = s.next();
			if (temp.matches("[$][0-9]*.[0-9][0-9]")){
			amt = Double.parseDouble(temp.replaceAll("[$]", ""));
			}else{
				return "invalid";
			}
		}else{
			return "invalid";
		}
		
		String note = s.nextLine();
		
		VenmoTransaction txn = VenmoTransaction.getPayTransaction(amt, recip, username, note);
		return txn.getLink();
		
	}

}
