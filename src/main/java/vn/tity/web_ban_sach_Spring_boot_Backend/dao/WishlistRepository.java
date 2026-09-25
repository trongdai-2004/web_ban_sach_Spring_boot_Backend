package vn.tity.web_ban_sach_Spring_boot_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.tity.web_ban_sach_Spring_boot_Backend.entity.Wishlist;
@RepositoryRestResource(path = "wishlist")
public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
        
}
