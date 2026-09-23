package vn.tity.web_ban_sach_Spring_boot_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "order_item")

public class OrderItem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "order_item_id")
        private Long orderItemID;
        @Column(name = "quantity")
        private int Quantity;
        @Column(name = "price")
        private double Price;
        @ManyToOne(cascade = {
                CascadeType.PERSIST, CascadeType.MERGE,
                CascadeType.DETACH, CascadeType.REFRESH
        })
        @JoinColumn(name = "book_id",nullable = false)
        private Book book;

        @ManyToOne(cascade = {
                CascadeType.PERSIST, CascadeType.MERGE,
                CascadeType.DETACH, CascadeType.REFRESH
        })
        @JoinColumn(name = "order_id",nullable = false)
        private Order order;


}
