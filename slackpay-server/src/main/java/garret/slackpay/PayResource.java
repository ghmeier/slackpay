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
@Produces(MediaType.APPLICATION_JSON)

public class PayResource {
	
	@GET
	public SlackInfo getPay(@BeanParam SlackInfo info){

		return info;
		
	}

}
