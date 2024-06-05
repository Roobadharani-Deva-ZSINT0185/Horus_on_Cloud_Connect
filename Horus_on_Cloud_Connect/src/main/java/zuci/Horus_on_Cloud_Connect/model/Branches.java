package zuci.Horus_on_Cloud_Connect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Branches {
    @Id
    private int branch_Id;
    private String branchName;
    @OneToMany(targetEntity = CommitDetails.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
    @JoinColumn(name="CommitDetails",referencedColumnName = "branch_Id")
    private List<CommitDetails> commitDetails;
}