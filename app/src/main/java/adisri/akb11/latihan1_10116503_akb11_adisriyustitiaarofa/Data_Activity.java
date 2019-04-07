package adisri.akb11.latihan1_10116503_akb11_adisriyustitiaarofa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Data_Activity extends AppCompatActivity {
    final String Nama ="kamu";
    EditText nama,umur;
    Button selanjutnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_);
        nama = (EditText) findViewById(R.id.txt_nama);
        umur = (EditText) findViewById(R.id.txt_umur);
        selanjutnya = (Button) findViewById(R.id.btn_selanjutnya);

        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t_nama = nama.getText().toString();
                String t_umur = umur.getText().toString();

                boolean isEmpty =false;
                if (TextUtils.isEmpty(t_nama)){
                    isEmpty = true;
                    nama.setError("nama belum diisi silahkan isi nama dulu");
                }else if(TextUtils.isEmpty(t_umur)){
                    isEmpty = true;
                    umur.setError("umur belum diiisi silahkan isi umur dulu");

                }else{
                    Intent selajutnya = new Intent(Data_Activity.this,Hasil_Activity.class);
                    selajutnya.putExtra(Nama,t_nama);
                    startActivity(selajutnya);

                }
            }
        });



    }
}
