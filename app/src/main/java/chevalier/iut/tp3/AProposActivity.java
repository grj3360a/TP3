package chevalier.iut.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class AProposActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);
    }

    @Override
    public void onResume(){
        super.onResume();

        TextView tv = findViewById(R.id.date);
        tv.setText(new Date().toString());
    }
}
