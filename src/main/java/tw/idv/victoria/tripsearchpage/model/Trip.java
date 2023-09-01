package tw.idv.victoria.tripsearchpage.model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trip implements Serializable {

	public static final long serialVersionUID = 3L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tripId;

	@OneToOne
	@JoinColumn(name = "tripTypeId")
	private TripType tripType;

	private int vendorId;

	private String tripName;

	private String tripDescription;

	private String tripNote;

	private int tripDay;

	private String city;

	private int totalSales;

	private int priceAdult;

	private int priceChild;

	private int minTravelersNo;

	private int maxTravelersNo;

	private double ratingSum;

	private int ratingCount;

	private Integer status;

	private String tripContent;

}