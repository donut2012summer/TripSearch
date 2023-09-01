package tw.idv.victoria.tripsearchpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.idv.victoria.tripsearchpage.model.repository.TripImageRepository;
import tw.idv.victoria.tripsearchpage.model.repository.TripRepository;
import tw.idv.victoria.tripsearchpage.model.TripImage;

import java.util.Optional;

@Service
public class TripService{
    private final TripRepository tripRepository;
    private final TripImageRepository tripImageRepository;

    @Autowired
    public TripService(TripRepository tripRepository, TripImageRepository tripImageRepository) {
        this.tripRepository = tripRepository;
        this.tripImageRepository = tripImageRepository;
    }

    /*
    * Get byte[] of image by image id
    * @param id
    * */
    public byte[] findImg(final int id) {

        // findById() from JpaRepository to get the Optional<TripImage> by id
        Optional<TripImage> tripImage = tripImageRepository.findById(id);

        // if result of TripImage.getImage() exist, then return, else return null
        return tripImage.map(TripImage::getImage).orElse(null);
    }

    /* end */
}
