package zuci.Horus_on_Cloud_Connect.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommitDetails {
    @Id
    private int commit_Id;
    private String committerName;
    private String committerEmail;
    private String message;
    private LocalDateTime date;
    @OneToMany(targetEntity = CommitChanges.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
    @JoinColumn(name="CommitChanges",referencedColumnName = "commit_Id")
    private List<CommitChanges> commitChanges;

}
