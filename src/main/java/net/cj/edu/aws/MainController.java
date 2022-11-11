package net.cj.edu.aws;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "<h1>aws-devops</h1>";
	}

}
