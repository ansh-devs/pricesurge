package in.anshdevs.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="users")
public class UserDAO {
    @Id
    @GeneratedValue
    public UUID id;
    public String userType;
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String passwordHash;
    public String createdAt;
    public String lastLogin;

}
