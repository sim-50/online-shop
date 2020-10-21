package onlineShop.log;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//component 实例一个bean 被spring管理的object就是bean
@Component
public class PaymentAction {
	@Autowired
	private Logger logger;
	//Logger is a interface with ServerLogger.
	//ServerLogger is still OK here.
	//injection is runtime operation.

	public void pay(BigDecimal payValue) {
		logger.log("pay begin, payValue is " + payValue);
		logger.log("pay end");
	}

}
