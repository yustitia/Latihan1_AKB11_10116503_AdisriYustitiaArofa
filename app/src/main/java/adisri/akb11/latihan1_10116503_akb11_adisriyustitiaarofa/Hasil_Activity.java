package adisri.akb11.latihan1_10116503_akb11_adisriyustitiaarofa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hasil_Activity extends AppCompatActivity {
    final String Nama = "kamu";
    Button ok;
    String s_nama;
    TextView isinya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_);
        ok = (Button) findViewById(R.id.btn_ok);
        isinya = (TextView) findViewById(R.id.txt_isian);

        Bundle exBundle = getIntent().getExtras();
        s_nama = exBundle.getString(Nama);
        isinya.setText("Beres sekarang " + s_nama + " sudah bisa ngecek pengunaan HP mu tiap hari buat" +
                " bantu " + s_nama + " ngatur waktu");
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);}
        });
    }
}
