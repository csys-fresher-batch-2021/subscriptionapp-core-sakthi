package in.sakthi.service;

import in.sakthi.dao.UserDetailDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.UserDetail;

public class RegisterService {

	public static boolean registerUser(UserDetail regobj) {
		try {
			UserDetailDao.register(regobj);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("Cannot Register");
		}
		return true;

	}

}
