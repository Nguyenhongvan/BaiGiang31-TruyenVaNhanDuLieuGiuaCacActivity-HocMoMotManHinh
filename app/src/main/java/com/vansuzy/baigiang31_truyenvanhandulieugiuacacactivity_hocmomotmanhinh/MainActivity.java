package com.vansuzy.baigiang31_truyenvanhandulieugiuacacactivity_hocmomotmanhinh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMo1ManHinh(View view) {
        Intent i = new Intent(MainActivity.this, ManHinh2Activity.class);   // đối số 1: là màn hình hiện tại gọi Intent này (tên Activity.this); đối số 2: là màn hình mà bạn muốn mở lên (tên Activity.class)

        // gửi lệnh tới Android System để mở màn hình
        startActivity(i);
    }
}
