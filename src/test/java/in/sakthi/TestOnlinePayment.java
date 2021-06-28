package in.sakthi;

import java.sql.SQLException;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.OnlinePayment;
import in.sakthi.service.OnlinePaymentService;

public class TestOnlinePayment {
	public static void main(String[] args) throws ServiceException, SQLException {
		long mobileNo = 8838193600L;
		long cardNo = 3245122735694463L;
		int pinNo = 2413;
		int amount = 200;
		OnlinePayment pay = new OnlinePayment(mobileNo, cardNo, pinNo, amount);
		if (OnlinePaymentService.isValidOnlinePayment(mobileNo, cardNo, pinNo, pay)) {
			System.out.println("Your Online Payment is Successfull...");
		} else {
			System.out.println("The Online Payment is rejected...");
		}
	}
}
