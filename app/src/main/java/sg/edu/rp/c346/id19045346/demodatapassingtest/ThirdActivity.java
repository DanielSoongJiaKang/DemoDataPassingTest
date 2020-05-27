package sg.edu.rp.c346.id19045346.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer2 = findViewById(R.id.textView2);
        Intent ReceiveIntent = getIntent();
        char myletter = ReceiveIntent.getCharExtra("letter",'b');
        tvAnswer2.setText("Character value received is: " + myletter);
    }
}
