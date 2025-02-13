package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chi_tiet_don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "don_hang_id")
    private Integer donHangId;

    @Column(name = "san_pham_id")
    private Integer sanPhamId;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "thue")
    private Integer thue;

    @Column(name = "thanh_tien")
    private Integer thanhTien;
}
