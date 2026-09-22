package vn.tity.web_ban_sach_Spring_boot_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;
@Entity
@Data
@Table(name = "image")
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageID;
    @Column(name = "image_name", length = 256)
    private String imageName;
    @Column(name ="la_icon")
    private boolean laIcon;
    @Column(name = "image_path")
    private String imagePath;
    @Column(name = "image_data")
    @Lob
    private String imageData;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;


}
