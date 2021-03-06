package com.mukireus.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameScreenActivity extends AppCompatActivity {

  Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTry;
  int sayac = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game_screen);
    btnOne = findViewById(R.id.btnOneOne);
    btnTwo = findViewById(R.id.btnOneTwo);
    btnThree = findViewById(R.id.btnOneThree);
    btnFour = findViewById(R.id.btnTwoOne);
    btnFive = findViewById(R.id.btnTwoTwo);
    btnSix = findViewById(R.id.btnTwoThree);
    btnSeven = findViewById(R.id.btnThreeOne);
    btnEight = findViewById(R.id.btnThreeTwo);
    btnNine = findViewById(R.id.btnThreeThree);
    btnTry = findViewById(R.id.btnTryAgain);

    btnTry.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
      }
    });

    btnOne.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnOne);
      }
    });
    btnTwo.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnTwo);
      }
    });
    btnThree.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnThree);

      }
    });
    btnFour.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnFour);

      }
    });
    btnFive.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnFive);

      }
    });
    btnSix.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnSix);

      }
    });
    btnSeven.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnSeven);
      }
    });
    btnEight.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnEight);

      }
    });
    btnNine.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ResourceAsColor")
      @Override
      public void onClick(View view) {
        Click(btnNine);
      }
    });
  }

  @SuppressLint("ResourceAsColor")
  public void Click(Button btn) {
    if (sayac == 0) {
      btn.setText("X");
      btn.setTextSize(70);
      btn.setTextColor(Color.parseColor("#56E7A5"));
      btn.setEnabled(false);
      sayac++;
    } else {
      btn.setText("O");
      btn.setTextSize(70);
      btn.setTextColor(Color.parseColor("#30D7D7"));
      btn.setEnabled(false);
      sayac--;
    }
  }
}
