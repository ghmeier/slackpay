package garret.slackpay;

import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

public class SlackpayConfiguration extends Configuration {
	  @NotEmpty
	  private String applicationName = "slackpay";

	  public String getApplicationName() {
	    return applicationName;
	  }
}