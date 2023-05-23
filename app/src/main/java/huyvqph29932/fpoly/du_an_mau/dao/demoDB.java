package huyvqph29932.fpoly.du_an_mau.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import huyvqph29932.fpoly.du_an_mau.database.DBHelper;
import huyvqph29932.fpoly.du_an_mau.model.ThanhVien;

public class demoDB {
    private SQLiteDatabase database;
    ThanhVienDAO thanhVienDAO;
    static final String TAG = "//====";

    public demoDB(Context context) {
        DBHelper dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
        thanhVienDAO = new ThanhVienDAO(context);
    }

    public void thanhVien(){
//        List<ThanhVien> ls = new ArrayList<>();
        ThanhVien tv  = new ThanhVien(1,"huy ok","2000");
        if (thanhVienDAO.insert(tv)>0){
            Log.i(TAG, "them thanh cong");
        }else {
            Log.i(TAG,"them that bai");
        }
        Log.i(TAG,"============");
        Log.i(TAG,"tong so thanh vien: "+thanhVienDAO.getAll().size());
        Log.i(TAG,"======sau khi sua======");
        tv = new ThanhVien(1,"huyok 11","2000");
        thanhVienDAO.update(tv);
        Log.i(TAG,"tong so thanh vien: " + thanhVienDAO.getAll().size());
    }
}
