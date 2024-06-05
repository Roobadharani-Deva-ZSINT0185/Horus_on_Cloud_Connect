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
public class Repositories {
    @Id
    private int repo_Id;
    private String repoName;
    private String owner;
    @OneToMany(targetEntity = zuci.Horus_on_Cloud_Connect.model.Collaborators.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
    @JoinColumn(name="Collaborators",referencedColumnName = "repo_Id")
    private List<zuci.Horus_on_Cloud_Connect.model.Collaborators> Collaborators;
    @OneToMany(targetEntity = Branches.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
    @JoinColumn(name="Branches",referencedColumnName = "repo_Id")
    private List<Branches> branches;
    @OneToMany(targetEntity = PullRequestDetails.class,cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="PullRequests",referencedColumnName = "repo_Id")
    private List<PullRequestDetails> pullRequestDetails;
}
