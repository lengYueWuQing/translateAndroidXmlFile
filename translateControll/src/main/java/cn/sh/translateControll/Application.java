package cn.sh.translateControll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cn.sh.translateService","cn.sh.translateControll"})
public class Application {

	static final Logger LOG = LoggerFactory.getLogger(Application.class);
	/*@Autowired
	private UserService userService;
	@RequestMapping("/users")
	public void getUserInfo(@RequestParam(value="loginName",required=false)String loginName,@RequestParam(value="pass",required=false)String pass, HttpServletResponse response){
		System.out.println("访问users");
		Logger LOG=LoggerFactory.getLogger(Application.class);
		//return userService.getUserMess(loginName, pass);
		//Logger LOG=Logger.getLogger(Application.class);
		LOG.error("success");
		LOG.info("success");
		LOG.warn("success");
		try {
			response.getWriter().print("{\"id\"=5,\"name\"=\"haah\"}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	
	public static void main(String[] args) {
		LOG.info("启动SpringApplication");
		
		SpringApplication.run(Application.class, args);
	}

}
