package huuhan.webbansach_be;

import huuhan.webbansach_be.Entity.TheLoaiE;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebbansachBeApplicationTests {

	@Test
	void contextLoads() {
		TheLoaiE theLoai = new TheLoaiE();
		theLoai.setMaTheLoai(1);
		theLoai.setTenTheLoai("Giáo khoa");
	}

}
