package sg.edu.rp.c346.id19045346.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvDouble = findViewById(R.id.Viewdouble);
        Intent ReceiveIntent = getIntent();
        double decimalz = ReceiveIntent.getDoubleExtra("decimal",0.0);
        tvDouble.setText("Double value received is: "+ decimalz);

    }
}
