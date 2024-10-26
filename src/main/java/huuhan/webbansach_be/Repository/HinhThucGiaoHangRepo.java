package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.DonHangE;
import huuhan.webbansach_be.Entity.HinhThucGiaoHangE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
@RepositoryRestResource(path = "hinh-thuc-giao-hang")
public interface HinhThucGiaoHangRepo extends JpaRepository<HinhThucGiaoHangE, Integer> {

}
