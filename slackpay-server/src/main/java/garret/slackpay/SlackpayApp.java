package garret.slackpay;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;

import org.apache.http.client.HttpClient;
import org.eclipse.jetty.servlets.CrossOriginFilter;

import io.dropwizard.Application;
import io.dropwizard.client.HttpClientBuilder;
import io.dropwizard.setup.Environment;

public class SlackpayApp extends Application<SlackpayConfiguration>
{

	public static void main(String[] args) throws Exception{
		new SlackpayApp().run(args);
	}
	
	@Override
	public void run(SlackpayConfiguration conf, Environment env)
			throws Exception {
	    final HttpClient httpClient = new HttpClientBuilder(env).using(conf.getHttpClientConfiguration()).build(conf.getApplicationName());

    	final FilterRegistration.Dynamic cors =
    		env.servlets().addFilter("CORS", CrossOriginFilter.class);
    	    // Configure CORS parameters
    	    cors.setInitParameter("allowedOrigins", "*");
    	    cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
    	    cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");
    	    // Add URL mapping
    	    cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
    	    
    	env.jersey().register(AliveResource.class);
    	env.jersey().register(new PayResource(httpClient));
		
	}
}
