package in.anshdevs.shared;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="surge_pricing")
public class SurgePricing {
    @Id
    @GeneratedValue
    public UUID surgeId;
    public String locationId;
    public String surgeMultiplier;
    public String startTime;
    public String endTime;
    public String reason;
}
