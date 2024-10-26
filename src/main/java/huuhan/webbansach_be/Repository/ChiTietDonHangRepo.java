package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.ChiTietDonHangE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepo extends JpaRepository<ChiTietDonHangE, Long> {

}
