package vn.tity.web_ban_sach_Spring_boot_Backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vn.tity.web_ban_sach_Spring_boot_Backend.entity.Category;

@SpringBootTest
class WebBanSachSpringBootBackendApplicationTests {

	@Test
	void contextLoads() {

		Category category = new Category();
		category.setCategoryID(1);
		category.setCategoryName("Giáo khoa");
	}

}
