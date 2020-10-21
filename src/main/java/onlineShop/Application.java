package onlineShop;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import onlineShop.log.PaymentAction;

public class Application {
	public static void main(String[] args) {
		//create a container with beans and beans would be instantiated by container
		ApplicationContext context = new ClassPathXmlApplicationContext("payment.xml");
		//get bean from container 'context'
		PaymentAction paymentAction = (PaymentAction) context.getBean("paymentAction");
		//use the bean  'paymentAction' (bean name by default would be lowercase camel)
		paymentAction.pay(new BigDecimal(2));
	}

}
