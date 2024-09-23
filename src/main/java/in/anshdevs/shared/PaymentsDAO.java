package in.anshdevs.shared;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="payments")
public class PaymentsDAO {

    public enum PaymentStatus  {PENDING, COMPLETED, FAILED, REFUNDED};

    @Id
    @GeneratedValue
    public UUID paymentId;
    public String transactionId;
    public String tripId;
    public String amount;
    public PaymentStatus status;
    public String paymentMethod;
    public String transactionTime;

}
