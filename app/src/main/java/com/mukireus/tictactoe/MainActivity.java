package com.mukireus.tictactoe;

import android.view.View.OnClickListener;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button btnStart, btnInfo;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btnStart = findViewById(R.id.btnStart);
    btnInfo = findViewById(R.id.btnInfo);
    btnStart.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, GameScreenActivity.class);
        startActivity(intent);
      }
    });
    btnInfo.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Muhammet Ömer - Github : @mukireus Version 1.0", Toast.LENGTH_LONG).show();
      }
    });


  }
}
