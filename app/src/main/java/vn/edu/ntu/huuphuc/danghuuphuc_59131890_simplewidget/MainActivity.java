package vn.edu.ntu.huuphuc.danghuuphuc_59131890_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen,edtNgaySinh,edtSoThichKhac;
    RadioGroup rdgGioiTinh;
    RadioButton rbnam,rbnu,rbgt;
    CheckBox cbxemphim,cbnghenhac,cbcafe,cbstayhome,cbvaobep;
    Button btxacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }
    private void addViews(){
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        rbnam = findViewById(R.id.rbnam);
        rbnu = findViewById(R.id.rbnu);
        cbxemphim = findViewById(R.id.cbxemphim);
        cbnghenhac = findViewById(R.id.cbnghenhac);
        cbcafe = findViewById(R.id.cbcafe);
        cbstayhome = findViewById(R.id.cbstayhome);
        cbvaobep = findViewById(R.id.cbvaobep);
        btxacnhan = findViewById(R.id.btxacnhan);
    }
    private void addEvent(){
        btxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThongTin();
            }
        });
    }
    private void ThongTin(){
        String hoten = edtTen.getText().toString();
        String ngaysinh = edtNgaySinh.getText().toString();
        int rdgt = rdgGioiTinh.getCheckedRadioButtonId();
        rbgt = findViewById(rdgt);
        String gioitinh = rbgt.getText().toString();
        String cbsothich = "";
        if(cbxemphim.isChecked()){
            cbsothich += cbxemphim.getText().toString();
        }
        if(cbnghenhac.isChecked()){
            cbsothich += cbnghenhac.getText().toString() +"; ";
        }
        if(cbcafe.isChecked()){
            cbsothich += cbcafe.getText().toString()+"; ";
        }
        if(cbstayhome.isChecked()){
            cbsothich += cbstayhome.getText().toString()+"; ";
        }
        if(cbxemphim.isChecked()){
            cbsothich += cbxemphim.getText().toString()+"; ";
        }
        if(cbvaobep.isChecked()){
            cbsothich += cbvaobep.getText().toString();
        }
        cbsothich +="; "+ edtSoThichKhac.getText().toString();


        Toast.makeText(getApplicationContext(),hoten + "\n"
                        + "Ngày Sinh: "+ngaysinh+ "\n"+"Giới tính: "+gioitinh+"\n"+"Sở thích: "+cbsothich,Toast.LENGTH_SHORT).show();
    }
}
