package zuci.Horus_on_Cloud_Connect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zuci.Horus_on_Cloud_Connect.model.CommitDetails;

@Repository
public interface CommitDetailsRepository extends JpaRepository<CommitDetails,Integer> {
}
