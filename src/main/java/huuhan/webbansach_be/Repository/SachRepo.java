package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.DonHangE;
import huuhan.webbansach_be.Entity.SachE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "sach")
public interface SachRepo extends JpaRepository<SachE, Integer> {

}
