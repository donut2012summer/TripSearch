package tw.idv.victoria.tripsearchpage.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourGroup implements Serializable {

    public static final long serialVersionUID = 33L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tourGroupId;

    private Integer tripId;

    private Integer priceAdult;

    private Integer priceChild;

    private Date startDate;

    private Integer confirmedTravelersNo;

    private Integer minTravelersNo;

    private Integer maxTravelersNo;

    private Integer status;

}
