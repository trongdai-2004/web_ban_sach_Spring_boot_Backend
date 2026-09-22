package vn.tity.web_ban_sach_Spring_boot_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "shipping_method")
public class ShippingMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="shipping_method_id")
    private int shippingMethodID;
    @Column(name ="shipping_method_name")
    private String shippingMethodName;
    @Column(name ="shipping_method_description")
    private String shippingMethodDescription;
    @Column(name ="shipping_fee")
    private Double shippingFee;

    @OneToMany(mappedBy = "shippingMethod", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Order> listOrder;
}
