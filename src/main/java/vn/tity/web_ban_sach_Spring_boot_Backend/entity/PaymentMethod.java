package vn.tity.web_ban_sach_Spring_boot_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="payment_method_id")
    private int shippingMethodID;
    @Column(name ="payment_method_name")
    private String shippingMethodName;
    @Column(name ="payment_method_description")
    private String shippingMethodDescription;
    @Column(name ="payment_fee")
    private Double shippingFee;

    @OneToMany(mappedBy = "paymentMethod", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Order> listOrder;
}
