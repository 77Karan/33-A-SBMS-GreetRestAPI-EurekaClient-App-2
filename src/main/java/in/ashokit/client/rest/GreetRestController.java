package in.ashokit.client.rest;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeServiceClient;

@RestController
public class GreetRestController 
{
	@Autowired
	private WelcomeServiceClient welcomeServiceClient;
	
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		String gretResp ="Welcome Back to RCB...!!!";
		String welcomeResp =welcomeServiceClient.invokeWelcomeService();
		
		StringJoiner joiner = new StringJoiner(",");
		joiner.add(gretResp);
		joiner.add(welcomeResp);
		return joiner.toString();
	}

}
