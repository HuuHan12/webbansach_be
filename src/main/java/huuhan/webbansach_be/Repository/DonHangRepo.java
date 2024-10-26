package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.DonHangE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonHangRepo extends JpaRepository<DonHangE, Integer> {

}
