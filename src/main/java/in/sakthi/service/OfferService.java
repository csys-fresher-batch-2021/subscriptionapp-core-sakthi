package in.sakthi.service;

import java.sql.SQLException;
import java.util.List;
import in.sakthi.dao.OfferDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.log.Logger;
import in.sakthi.model.Offer;

public class OfferService {
	/**
	 * list of the offer Details
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static List<Offer> getOffer() throws ServiceException {
		try {
			return OfferDao.getAllOffer();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws ServiceException {
		List<Offer> offerList = OfferService.getOffer();
		for (Offer listOffer : offerList) {
			String obj = "Offer is: " + listOffer;
			Logger.logger(obj);
		}
	}
}
