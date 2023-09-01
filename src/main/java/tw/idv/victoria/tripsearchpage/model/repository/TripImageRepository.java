package tw.idv.victoria.tripsearchpage.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import tw.idv.victoria.tripsearchpage.model.TripImage;

import java.util.List;
import java.util.Optional;

public interface TripImageRepository extends JpaRepository<TripImage, Integer> {


    /*
    * Find ID by required trip id
    * @param id
    * */
    @Query("SELECT t.id FROM TripImage t WHERE t.tripId=:id")
    public List<Integer> findIdsByTripId(@Param("id") int tripId);


}
