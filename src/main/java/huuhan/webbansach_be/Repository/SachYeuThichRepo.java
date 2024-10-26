package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.DonHangE;
import huuhan.webbansach_be.Entity.SachYeuThichE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "sach-yeu-thich")
public interface SachYeuThichRepo extends JpaRepository<SachYeuThichE, Integer> {

}
