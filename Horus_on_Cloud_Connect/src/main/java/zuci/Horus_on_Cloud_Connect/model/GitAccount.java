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
public class GitAccount {
    @Id
    private int git_Id;
    private String privateAccessKey;
    private String link;
    @OneToMany(targetEntity = Repositories.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
    @JoinColumn(name="Repositories",referencedColumnName = "git_Id")
    private List<Repositories> repositories;
}
