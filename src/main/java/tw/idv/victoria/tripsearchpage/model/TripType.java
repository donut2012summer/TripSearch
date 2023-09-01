package tw.idv.victoria.tripsearchpage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripType implements Serializable {

    public static final long serialVersionUID = 99L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripTypeId;

    private String tripTypeName;

}
