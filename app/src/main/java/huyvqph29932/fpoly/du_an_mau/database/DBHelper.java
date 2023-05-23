package huyvqph29932.fpoly.du_an_mau.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "PNLIB";
    private static final int DB_VERSION = 1;

    static final String CREATE_TABLE_THU_THU =
            "create table ThuThu (maTT TEXT PRIMARY KEY, " +
                    "hoTen TEXT NOT NULL, " +
                    "matkhau TEXT NOT NULL)";
    //
    static final String CREATE_TABLE_THANH_VIEN =
            "create table ThanhVien (" +
                    "maTV INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "hoTen TEXT NOT NULL," +
                    "namSinh TEXT NOT NULL)";
    //
    static final String CREATE_TABLE_LOAI_SACH =
            "create table LoaiSach (" +
                    "maLoai INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "tenLoai TEXT NOT NULL)";
    //
    static final String CREATE_TABLE_SACH =
            "create table Sach (" +
                    "maSach INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "tenLoai TETX NOT NULL)";
    //
    static final String CREARE_TABLE_PHIEU_MUON =
            "create table PhieuMuon (" +
                    "maPM INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "maTT TEXT REFERENCES ThuThu(naTT)," +
                    "maTV INTEGER REFERENCES ThanhVien(maTV)," +
                    "maSach INTEGER REFERENCES Sach(maSach)," +
                    "tienThue INTEGER NOT NULL," +
                    "ngay DATE NOT NULL, " +
                    "traSach INTEGER NOT NULL )";

    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_THU_THU);
        db.execSQL(CREATE_TABLE_THANH_VIEN);
        db.execSQL(CREATE_TABLE_LOAI_SACH);
        db.execSQL(CREATE_TABLE_SACH);
        db.execSQL(CREARE_TABLE_PHIEU_MUON);

        //INSERT data
        db.execSQL(data_SQLite.INSERT_THU_THU);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    String dropTableLoaiThuThu = "drop table if exists ThuThu";
    db.execSQL(dropTableLoaiThuThu);
    String dropTableThanhVien = "drop table if exists ThanhVien";
    db.execSQL(dropTableThanhVien);
    String dropTableLoaiSach = "drop table if exists LoaiSach";
    db.execSQL(dropTableLoaiSach);
    String dropTableSach = "drop table if exists Sach";
    db.execSQL(dropTableSach);
    String dropTablePhieuMuon = "drop table if exists PhieuMuon";
    db.execSQL(dropTablePhieuMuon);

    onCreate(db);

    }
}
