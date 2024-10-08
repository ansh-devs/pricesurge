package in.anshdevs.drivers;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DriverRepository implements PanacheRepository<DriverAvailabilityDAO> {
}
