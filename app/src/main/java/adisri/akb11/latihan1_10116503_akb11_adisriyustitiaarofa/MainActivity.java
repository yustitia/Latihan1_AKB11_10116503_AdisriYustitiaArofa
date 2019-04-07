package adisri.akb11.latihan1_10116503_akb11_adisriyustitiaarofa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Nama : adisri yustitia arofa
// NIM  : 10116503
// kelas: AKB-11
// tanggal buat : 5 april 2019
    private Button awal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        awal = (Button)findViewById(R.id.btn_masuk);
        awal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent awal = new Intent(getApplicationContext(),Loginawal_Activity.class);
                startActivity(awal);
            }
        });


    }
}
