package umg.community.app.com.communityumg.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import umg.community.app.com.communityumg.MainActivity;
import umg.community.app.com.communityumg.R;

public class Login extends AppCompatActivity{

    Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        btnMain = (Button) findViewById(R.id.btn_home);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Login.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }



}
