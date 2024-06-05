package zuci.Horus_on_Cloud_Connect.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_Id;
    @NotBlank(message = "First name cannot be blank")
    private String first_name;
    @NotBlank(message = "Last name cannot be blank")
    private String last_name;
    @UniqueElements(message="mailId must be unique")
    private String email;
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;
    @NotBlank(message = "must be selected")
    private String country;
    private long mobile_number;
    private String organisation;
    @OneToMany(targetEntity = GitAccount.class,cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="GitAccount",referencedColumnName = "user_Id")
    private List<GitAccount> gitAccount;

}
