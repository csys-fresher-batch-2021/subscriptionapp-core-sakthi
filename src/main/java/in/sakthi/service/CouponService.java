package in.sakthi.service;

import java.sql.SQLException;
import in.sakthi.dao.CouponDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.Coupon;
import in.sakthi.validation.CouponValidation;

public class CouponService {
	private CouponService() {

	}

	/**
	 * Check the condition in all details
	 * 
	 * @param name
	 * @param age
	 * @param mobileNo
	 * @param couponName
	 * @param prize
	 * @param couponId
	 * @return
	 * @throws SQLException
	 */
	public static boolean checkCoupon(String name, int age, Long mobileNo, String couponName, String prize,
			Integer couponId) throws ServiceException {
		boolean valid = false;
		Coupon coupon = new Coupon(name, age, mobileNo, couponId, couponName, prize);
		boolean isRegister = CouponService.isValidCoupon(name, age, mobileNo, couponName, prize);
		if (isRegister) {
			CouponService.registerCoupon(coupon);
			valid = true;
		}
		return isRegister;
	}

	public static boolean isValidCoupon(String name, Integer age, long mobileNo, String couponName, String prize) {
		boolean isValid = false;
		try {
			if (CouponValidation.isValidName(name) && CouponValidation.isValidAge(age)
					&& CouponValidation.isValidMobileno(mobileNo) && CouponValidation.isValidcouponName(couponName)
					&& CouponValidation.isValidPrize(prize)) {
				isValid = true;
			}
		} catch (Exception e) {
			throw new ServiceException("The Invalid Validation");
		}
		return isValid;
	}

	public static boolean registerCoupon(Coupon couponobj) {
		try {
			CouponDao.couponRegister(couponobj);
		} catch (SQLException e) {
			throw new ServiceException("Cannot register Coupon");
		}
		return true;
	}

}
