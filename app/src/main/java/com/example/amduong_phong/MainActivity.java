package com.example.amduong_phong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_CD;
    TextView  txt_AL;
    EditText edt_DL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_CD =findViewById(R.id.btn_CD);
        txt_AL = findViewById(R.id.txt_Al);
        edt_DL = findViewById(R.id.edt_DL);
        btn_CD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String can = "", Chi = "";
                int DL = Integer.parseInt(edt_DL.getText().toString());
                switch (DL % 10)
                {
                    case 0: can = "Canh";break;
                    case 1: can = "Tân";break;
                    case 2: can = "Nhâm";break;
                    case 3: can = "Quý";break;
                    case 4: can = "Giáp";break;
                    case 5: can = "Ất";break;
                    case 6: can = "Bính";break;
                    case 7: can = "Đinh";break;
                    case 8: can = "Mậu";break;
                    case 9: can = "Kỷ";break;
                }
                switch (DL % 12)
                {
                    case 0: Chi = "Thân";break;
                    case 1: Chi = "Dậu";break;
                    case 2: Chi = "Tuất";break;
                    case 3: Chi = "Hợi";break;
                    case 4: Chi = "Tý";break;
                    case 5: Chi = "Sửu";break;
                    case 6: Chi = "Dần";break;
                    case 7: Chi = "Mẹo";break;
                    case 8: Chi = "Thìn";break;
                    case 9: Chi = "Tỵ";break;
                    case 10: Chi = "Ngọ";break;
                    case 11: Chi = "Mùi";break;
                }
                txt_AL.setText(can+" "+Chi);
            }
        });
    }
}