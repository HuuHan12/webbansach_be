package huuhan.webbansach_be.Repository;

import huuhan.webbansach_be.Entity.DonHangE;
import huuhan.webbansach_be.Entity.NguoiDungE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepo extends JpaRepository<NguoiDungE, Integer> {

}
