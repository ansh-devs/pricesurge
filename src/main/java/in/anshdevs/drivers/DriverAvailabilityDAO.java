package in.anshdevs.drivers;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="driver_availability")
public class DriverAvailabilityDAO {
    public enum DriverStatus{AVAILABLE, BUSY, OFFLINE};
    @Id
    @GeneratedValue
    public String id;
    public String driverId;
    public DriverStatus status;
    public String lastLocationId;
    public String lastUpdated;
}
