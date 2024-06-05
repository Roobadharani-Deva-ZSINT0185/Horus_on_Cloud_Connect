package zuci.Horus_on_Cloud_Connect.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommitChanges {
    @Id
    private int changeId;
    private String path;
}
