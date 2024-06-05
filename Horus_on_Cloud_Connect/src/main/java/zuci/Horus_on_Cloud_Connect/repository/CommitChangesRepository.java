package zuci.Horus_on_Cloud_Connect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zuci.Horus_on_Cloud_Connect.model.CommitChanges;

public interface CommitChangesRepository extends JpaRepository<CommitChanges,Integer> {
}
