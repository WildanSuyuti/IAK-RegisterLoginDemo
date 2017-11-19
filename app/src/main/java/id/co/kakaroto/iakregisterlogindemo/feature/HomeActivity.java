package id.co.kakaroto.iakregisterlogindemo.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import id.co.kakaroto.iakregisterlogindemo.R;
import id.co.kakaroto.iakregisterlogindemo.model.Person;
import id.co.kakaroto.iakregisterlogindemo.utility.DatabaseHandler;
import id.co.kakaroto.iakregisterlogindemo.utility.SessionManager;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView tvResult = findViewById(R.id.tv_result);
        for (Person person : DatabaseHandler.getInstance().getAllUser()) {
            tvResult.append(person.toString());
        }

/*        Button btnLogout = findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                SessionManager.getInstance().clear();
            }
        });*/
    }

    public void logout(View view) {
        finish();
        SessionManager.getInstance().clear();
    }
}
