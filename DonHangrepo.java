package spring.api.apistart.repository;
import spring.api.apistart.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonHangrepo extends JpaRepository<DonHang, Integer> {
}

