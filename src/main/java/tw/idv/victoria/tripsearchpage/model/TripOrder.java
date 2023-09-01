package tw.idv.victoria.tripsearchpage.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripOrder implements Serializable {

    private static final long serialVersionUID = 7L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tripOrderId;

    private Integer memberId;

    private Integer tourGroupId;

    private Integer orderStatus;

    private Timestamp payDate;

    private String payType;

    private Integer totalPrice;

    private Integer travelersAdult;

    private Integer travelersChildren;

    private String remarks;

    private Integer employeeId;

    private Integer refundStatus;

    private Integer paymentStatus;

    private String refundReason;

}
