package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "san_pham")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "danh_muc_id")
    private DanhMuc danhMuc;

    @ManyToOne
    @JoinColumn(name = "thuong_hieu_id")
    private ThuongHieu thuongHieu;

    @ManyToOne
    @JoinColumn(name = "mau_sac_id")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "hinh_anh_id")
    private HinhAnh hinhAnh;

    @Column(name = "ten", nullable = false, length = 50)
    private String ten;

    @Column(name = "hinh_dai_dien", length = 255)
    private String hinhDaiDien;

    @Column(name = "bao_hanh")
    private Integer baoHanh;

    @Column(name = "gia_nhap", nullable = false)
    private Integer giaNhap;

    @Column(name = "gia_ban", nullable = false)
    private Integer giaBan;

    @Column(name = "thue", nullable = false)
    private Float thue;

    @Column(name = "mo_ta", length = 255)
    private String moTa;
}
