package in.anshdevs.vehicles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "vehicles")
public class VehicleDAO {

    @Id
    @GeneratedValue
    public UUID vehicleId;
    public String driverId;
    public String vehicleType;
    public String licencePlate;
    public String capacity;
}
