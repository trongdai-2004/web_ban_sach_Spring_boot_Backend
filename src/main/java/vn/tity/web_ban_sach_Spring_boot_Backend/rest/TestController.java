package vn.tity.web_ban_sach_Spring_boot_Backend.rest;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.tity.web_ban_sach_Spring_boot_Backend.dao.OrderItemRepository;
import vn.tity.web_ban_sach_Spring_boot_Backend.entity.OrderItem;

@RestController
public class TestController {
    private OrderItemRepository repository;
    @Autowired
    public TestController(OrderItemRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/")
    public void test(){

//        OrderItem ctdh = new OrderItem();
//        repository.save(ctdh);
    }
}
