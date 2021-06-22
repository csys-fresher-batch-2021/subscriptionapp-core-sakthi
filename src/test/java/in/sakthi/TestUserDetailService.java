package in.sakthi;

import in.sakthi.model.UserDetail;
import in.sakthi.service.RegisterService;
import in.sakthi.valid.ValidUserDetail;

public class TestUserDetailService {

	public static void main(String[] args) {

		String name = "Sakthi";
		long mobileNo = 8838193600L;
		String email = "Sakthi14@gmail.com";

		UserDetail reg = new UserDetail(name, mobileNo, email);
		if (ValidUserDetail.isValidUser(name, mobileNo, email)) {
			RegisterService.registerUser(reg);
			System.out.println("Sucessfully Registered");
		} else {
			System.out.println("Invalid Registered");
		}

	}

}
