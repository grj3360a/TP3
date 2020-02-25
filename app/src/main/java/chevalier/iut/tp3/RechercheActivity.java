package chevalier.iut.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RechercheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);
    }

    public void onValidate(View v){
        Intent result = new Intent();
        String researchText = ((EditText) findViewById(R.id.editText)).getText().toString();
        result.putExtra("researchText", researchText);
        setResult(Activity.RESULT_OK, result);
        finish();
    }
}
