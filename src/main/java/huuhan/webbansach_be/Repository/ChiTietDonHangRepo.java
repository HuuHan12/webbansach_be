package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.ChiTietDonHangE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "chi-tiet-don-hang")
public interface ChiTietDonHangRepo extends JpaRepository<ChiTietDonHangE, Long> {

}
