package com.kalwaeswar.url;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText url = (EditText) findViewById(R.id.url);
                String strURL = url.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strURL));
                startActivity(intent);
            }
        });
    }
}
