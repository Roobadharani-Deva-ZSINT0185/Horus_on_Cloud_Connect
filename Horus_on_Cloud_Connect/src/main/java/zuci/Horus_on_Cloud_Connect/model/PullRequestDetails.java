package zuci.Horus_on_Cloud_Connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PullRequestDetails {
    @Id
    private int prId;
    private String requesterName;
    private String fromBranch;
    private String mergingBranch;
    private LocalDateTime date;
    private String status;
}
