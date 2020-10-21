package onlineShop.log;

import org.springframework.stereotype.Component;

//@component is a annotation from spring that identify the following codes is a component which need to be a bean
//so serverLogger is a bean which is an object controlled by Spring
@Component(value = "serverLogger")
public class ServerLogger implements Logger {

	public void log(String info) {
		System.out.println("server log = " + info);
	}

}
