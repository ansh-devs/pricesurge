package in.anshdevs.shared;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="trips")
public class Trips {
    @Id
    @GeneratedValue
    public UUID tripId;
    public String requestId;
    public String driverId;
    public String startTime;
    public String endTime;
    public String actualDistance;
    public String actualDuration;
    public String baseFare;
    public String surgeMultiplier;
    public String finalFare;
}
