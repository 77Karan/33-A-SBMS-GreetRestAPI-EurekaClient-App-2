package in.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-SERVICE")
public interface WelcomeServiceClient
{
	@GetMapping("/welcome")
	public String invokeWelcomeService();

}
