package tw.idv.victoria.tripsearchpage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.idv.victoria.tripsearchpage.model.repository.TripImageRepository;

@Service
public class TripImageService {

	private final TripImageRepository tripImageRepository;

	@Autowired
	public TripImageService(final TripImageRepository tripImageRepository){
		this.tripImageRepository = tripImageRepository;
	}

	public static final String IMG_URL = "/img/trips/";

	public String findImgUrl(final int tripId) {
		final List<Integer> arrays = tripImageRepository.findIdsByTripId(tripId);

		if (arrays.isEmpty()) {
			return IMG_URL + 0;
		}
		return IMG_URL + arrays.get(0);
	}

	/* end */
}
