package in.sakthi.service;

import java.sql.SQLException;
import java.util.List;
import in.sakthi.dao.OfferDao;
import in.sakthi.log.Logger;
import in.sakthi.model.Offer;

public class OfferService {
	public static List<Offer> getOffer() throws SQLException {
		return OfferDao.getAllOffer();
	}
	public static void main(String[] args) throws SQLException {
		List<Offer> offerList = OfferService.getOffer();
		for (Offer listOffer : offerList) {
			String obj = "Offer is: "+listOffer;
			Logger.logger(obj);
	}
}
}
