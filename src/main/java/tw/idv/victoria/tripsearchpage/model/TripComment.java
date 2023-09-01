package tw.idv.victoria.tripsearchpage.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripComment implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer tripId;

    private Integer rating;

    private String comment;

    private Integer status;

    private Integer editCount;

    private Integer tripOrderId;

}
