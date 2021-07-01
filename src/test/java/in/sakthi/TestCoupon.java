package in.sakthi;

import java.sql.SQLException;

import in.sakthi.dao.CouponDao;
import in.sakthi.model.Coupon;
import in.sakthi.service.CouponService;

public class TestCoupon {

	public static void main(String[] args) throws SQLException  {
		String name = "Priya";
		Integer age = 24;
		Long mobileNo = 9838193608L;
		Integer couponId = 102;
		String couponName = "Christmas";
		String prize = "Wallet";
		Coupon coupon = new Coupon(name, age, mobileNo, couponId, couponName, prize);
		if (CouponService.isValidCoupon(name, age, mobileNo, couponName, prize, coupon)) {
			CouponService.registerCoupon(coupon);
			System.out.println("Your Detail is Registered Successfully...");
		} else {
			System.out.println("Your Detail is not Registered...");
		}
	}
}
