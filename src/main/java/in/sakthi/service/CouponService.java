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
	public static boolean isValidCoupon(String name, Integer age, long mobileNo, String couponName, Coupon coupon) {
		boolean isValid = false;
		try {
			if (CouponValidation.isValidName(name) && CouponValidation.isValidAge(age)
					&& CouponValidation.isValidMobileno(mobileNo) && CouponValidation.isValidcouponName(couponName)) {
				isValid = true;
				CouponDao.couponRegister(coupon);
			}
		} catch (Exception e) {
			throw new ServiceException("The Invalid Validation");
		}
		return isValid;
	}
}
