package in.anshdevs.locations;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;


@Entity
@Table(name = "locations")
public class LocationDAO {
        @Id
        @GeneratedValue
        public UUID locationId;
        public String city;
        public String region;
        public String latitude;
        public String longitude;
        public String geoHash;

}
