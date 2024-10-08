package in.anshdevs.drivers;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="driver_availability")
public class DriverAvailabilityDAO extends PanacheEntity {

    private enum DriverStatus{AVAILABLE, BUSY, OFFLINE};
    @Id
    @GeneratedValue
    private String id;
    private String driverId;
    private DriverStatus status;
    private String lastLocationId;
    private String lastUpdated;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public String getLastLocationId() {
        return lastLocationId;
    }

    public void setLastLocationId(String lastLocationId) {
        this.lastLocationId = lastLocationId;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


}
