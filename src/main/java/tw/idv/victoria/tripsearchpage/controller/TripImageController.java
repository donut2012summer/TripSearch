package tw.idv.victoria.tripsearchpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tw.idv.victoria.tripsearchpage.service.TripService;


@RestController
public class TripImageController {

	private final TripService tripService;

	@Autowired
	public TripImageController(final TripService tripService) {
		this.tripService = tripService;
	}

	/*
	* Set the endpoint of the img
	* {imgUrl:[0-9]+} : {imgUrl} can only be numbers
	* regular expression [0-9]+ : must consist of one or more digits (0 to 9).
	* */
	@GetMapping(value = "/img/trips/{imgUrl:[0-9]+}", produces = MediaType.IMAGE_GIF_VALUE)
	public byte[] getPhoto(@PathVariable("imgUrl") final int id) {
		return tripService.findImg(id);
	}

}
