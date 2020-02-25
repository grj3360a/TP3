package chevalier.iut.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> precSearch = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void onSearch(MenuItem mi){
        Intent in = new Intent(this, RechercheActivity.class);
        startActivityForResult(in, 711);
    }

    @Override
    protected void onActivityResult(int aRequestCode, int aResultCode, Intent aData) {
        if(aRequestCode == 711){
            TextView tv = findViewById(R.id.titleMain);
            ListView v = findViewById(R.id.listView);
            switch(aResultCode){

                case Activity.RESULT_OK:
                    String researchText = aData.getStringExtra("researchText");
                    precSearch.add(researchText);

                    final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, precSearch);
                    v.setAdapter(adapter);
                    break;

                default:
                    tv.setText("C'est annulé fréro : " + aResultCode);
                    break;

            }

        }
    }

    public void onPropos(MenuItem mi){
        Intent in = new Intent(this, AProposActivity.class);
        startActivity(in);
    }
}
