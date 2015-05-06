package garret.slackpay;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("pay")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PayResource {
	
	@GET
	public SlackpayResponse getPay(@QueryParam("to") String to, @QueryParam("from") String from, @QueryParam("amt") String amt){
		
		return new SlackpayResponse(to + " "+ from + " " + amt);
		
	}

}
