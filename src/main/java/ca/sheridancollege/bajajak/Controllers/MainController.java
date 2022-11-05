
package ca.sheridancollege.bajajak.Controllers;

/**
 * @author akshitabajaj
 *
 */
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
	
	@GetMapping("/")
	public String Index() {
		return "index.html";
	}
	
	@GetMapping("/inventory/*")
	public String InventoryIndex() {
		return "index.html";
	}

}
