package huuhan.webbansach_be.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "quyen")
public class QuyenE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_quyen")
    private int maQuyen;
    @Column(name = "ten_quyen")
    private String tenQuyen;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinTable(
            name = "nguoidung_quyen",
            joinColumns = @JoinColumn(name = "ma_quyen"),
            inverseJoinColumns = @JoinColumn(name = "ma_nguoi_dung")
    )
    List<NguoiDungE> danhSachNguoiDung;

}
