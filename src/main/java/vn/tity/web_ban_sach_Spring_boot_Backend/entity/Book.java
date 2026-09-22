package vn.tity.web_ban_sach_Spring_boot_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookID;
    @Column(name = "book_name",length = 256)
    private String bookName;
    @Column(name = "author",length = 512)
    private String Author;
    @Column(name = "isbn",length = 256)
    private String ISBN;
    @Column(name = "description",columnDefinition = "text")
    private String Description;
    @Column(name ="original_price" )
    private Double originalPrice;
    @Column(name ="price" )
    private double price;
    @Column(name ="quantity" )
    private int quantity;
    @Column(name ="average_rating" )
    private Double averageRating;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
            @JoinTable(
                    name = "book_category",
                    joinColumns = @JoinColumn(name = "book_id"),
                    inverseJoinColumns = @JoinColumn(name = "category_id")
            )
    List<Category> listCategory;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<image> listImage;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)

    List<Review> listReview;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    List<OrderItem>listOrderItem;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade =CascadeType.ALL)
    List<Wishlist>wishList;

}
