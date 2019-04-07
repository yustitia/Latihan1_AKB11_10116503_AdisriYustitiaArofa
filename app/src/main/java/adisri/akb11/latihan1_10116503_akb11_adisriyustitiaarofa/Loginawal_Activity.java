package adisri.akb11.latihan1_10116503_akb11_adisriyustitiaarofa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loginawal_Activity extends AppCompatActivity {
    private Button masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginawal_);
        masuk = (Button)findViewById(R.id.btn_masuk2);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk =new Intent(getApplicationContext(),Data_Activity.class);
                startActivity(masuk);
            }
        });
    }
}
