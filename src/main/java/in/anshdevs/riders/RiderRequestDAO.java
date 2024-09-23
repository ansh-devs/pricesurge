package in.anshdevs.riders;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ride_requests")
public class RiderRequestDAO {

    public enum RideStatus{PENDING, ACCEPTED, COMPLETED, CANCELLED};

    @Id
    @GeneratedValue
    public String requestId;
    public String riderId;
    public String pickupLocationId;
    public String dropoffLocationId;
    public String requestTime;
    public RideStatus status;
    public String estimatedDistance;
    public String estimatedDuration;
    public String actualPickupTime;
    public String actualDropoffTime;
}
