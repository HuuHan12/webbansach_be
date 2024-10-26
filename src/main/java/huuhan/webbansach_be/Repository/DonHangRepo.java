package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.DonHangE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(path = "don-hang")
public interface DonHangRepo extends JpaRepository<DonHangE, Integer> {

}
