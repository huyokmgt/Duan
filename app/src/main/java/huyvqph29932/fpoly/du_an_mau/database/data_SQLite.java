package huyvqph29932.fpoly.du_an_mau.database;

public class data_SQLite {
    public static final String INSERT_THU_THU = "Insert into ThuThu(MaTT, HoTen,MatKhau) values" +
            "('admin','Huy Admin','admin')," +
            "('test1','Huy1 Admin1','1234')," +
            "('test2','Huy2 Admin2','1123')";

    public static final String INSER_THANH_VIEN = "insert into thanhvien(hoTen,namSinh) values" +
            "('le quang dao','2000')," +
            "('vi the bao','2001')," +
            "('vi the quan','2002')," +
            "('vi quang trung','2003')," +
            "('vi trung truc','2004')," +
            "('vi van khiem','2005')," +
            "('vi quang liem','2006')," +
            "('vi the hoa','2007')," +
            "('vi tieu thien','2008')" ;


    public  static final String INSERT_LOAI_SACH = "insert into LoaiSach(tenloai) values" +
            "('Tiếng Anh')," +
            "('Tiếng BỈ')," +
            "('Tiếng ÁO')," +
            "('Tiếng ĐỨC')," +
            "('Tiếng TBN')," +
            "('Tiếng BĐN')," +
            "('Tiếng Nhật')," +
            "('Tiếng Hàn')," +
            "('Tiếng Trung')";
    public  static final String INSERT_SACH = "insert into Sach(TenSach,giaThue,maLoai) values" +
            "('army','3000','2')," +
            "('magenta','4000','3')," +
            "('orange','5000','4')," +
            "('ble','6000','5')";
    public  static final String INSERT_PHIEU_MUON = "";
}
