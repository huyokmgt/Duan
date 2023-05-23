package huyvqph29932.fpoly.du_an_mau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import huyvqph29932.fpoly.du_an_mau.dao.demoDB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoDB demoDB = new demoDB(getApplicationContext());
        demoDB.thanhVien();
    }
}