package com.jasrin.newbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText etxtURL;
    TextView etxtBookmark;
    Button btnGo,btnGoogle,btnFacebook,btnYouTube,btnProthomAlo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        etxtURL=findViewById(R.id.etxt_url);
        etxtBookmark=findViewById(R.id.etxt_bookmark);

        btnGo=findViewById(R.id.btn_go);
        btnGoogle=findViewById(R.id.btn_google);
        btnFacebook=findViewById(R.id.btn_facebook);
        btnYouTube=findViewById(R.id.btn_youtube);
        btnProthomAlo=findViewById(R.id.btn_prothomalo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=etxtURL.getText().toString();

                if (url.isEmpty())
                {
                    Toast.makeText(HomeActivity.this, "Please Enter URL", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);
                }
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","google.com");
                startActivity(intent);
            }
        });


        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","facebook.com");
                startActivity(intent);
            }
        });

        btnYouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","youtube.com");
                startActivity(intent);
            }
        });

        btnProthomAlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","prothomalo.com");
                startActivity(intent);
            }
        });

    }
}
