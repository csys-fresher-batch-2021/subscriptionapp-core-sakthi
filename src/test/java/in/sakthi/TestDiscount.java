package in.sakthi;

import in.sakthi.model.Discount;
import in.sakthi.service.DiscountService;

public class TestDiscount {
	public static void main(String[] args) {
		String channelName = "Hotstar";
		String validity = "onthly";
		Discount list = new Discount(channelName, validity);
		DiscountService.discount(list);
		DiscountService.date(validity);
	}
}