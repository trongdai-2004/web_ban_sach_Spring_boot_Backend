package vn.tity.web_ban_sach_Spring_boot_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.tity.web_ban_sach_Spring_boot_Backend.entity.OrderItem;

@RepositoryRestResource(path = "order-item")
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
