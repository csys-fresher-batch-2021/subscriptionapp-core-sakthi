package in.sakthi.service;

import in.sakthi.model.OnlinePayment;
import in.sakthi.valid.ValidOnlinePayment;

public class OnlinePaymentService {
	
	private OnlinePaymentService() {
		throw new IllegalStateException("OnlinePaymentService");
	}
	
	public static boolean checkOnlinePayment(long mobileNo,long cardNo,int pinNo)
	{
		boolean valid = false;
		OnlinePayment pay = new OnlinePayment(mobileNo,cardNo, pinNo, null);
		boolean isRegister = ValidOnlinePayment.isValidOnlinePayment(mobileNo, cardNo, pinNo);
		if(isRegister) {
			OnlineRegister.registerPayment(pay);
			valid = true;
		}
		return isRegister;
	}
		
	}
