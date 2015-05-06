package garret.slackpay;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("pay")
@Produces(MediaType.TEXT_PLAIN)
public class PayResource {
	
	@GET
	public String getPay(@BeanParam SlackInfo info){
		String text = info.getText();
		
		String[] tokens = text.split(" ");
		
		if (tokens.length < 2){
			return "Invalid";
		}
		
		String recip = tokens[0];
		double amt = Double.parseDouble(tokens[1].replaceAll("[$]", ""));
		String note = "";
		if (tokens.length >= 3){
			note = tokens[2];
		}
		
		VenmoTransaction txn = VenmoTransaction.getPayTransaction(amt, recip, note);
		return txn.getLink();
		
	}

}
