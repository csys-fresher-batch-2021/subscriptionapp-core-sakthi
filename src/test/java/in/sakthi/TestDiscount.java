package in.sakthi;

import in.sakthi.model.Discount;
import in.sakthi.service.DiscountService;

public class TestDiscount {
	public static void main(String[] args) {
		String channelName = "Hotstar";
		String validity = "Monthly";
		Integer amount = 200;
		Discount list = new Discount(channelName, validity,amount);
		DiscountService.discount(list);
		DiscountService.date(amount,validity);
	}
}