package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Range;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rollButton;

    private ImageView title;
//private ImageView imageDice1;
//private ImageView imageDice2;
private  Button resetButton;
private ImageButton diceButton;
private  ImageButton diceButton2;
    public int sou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rollButton= findViewById(R.id.roll_button);

        title =findViewById(R.id.titleView);
        //imageDice1 = findViewById(R.id.dice1);
        //imageDice2 = findViewById(R.id.dice2);
        diceButton= findViewById(R.id.diceButton);
        diceButton2= findViewById(R.id.diceButton2);
        resetButton = findViewById(R.id.resetButton);
//imageDice1.setVisibility(View.INVISIBLE);
//imageDice2.setVisibility(View.INVISIBLE);
diceButton.setVisibility(View.INVISIBLE);
diceButton2.setVisibility(View.INVISIBLE);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //textView.setVisibility(View.VISIBLE);
                    title.setVisibility(View.VISIBLE);
           //         textView.setText("ButtonRolled");

                    //   textView.setTextColor(Color.blue(1));
                   Toast.makeText( MainActivity.this ,"You have clicked the button",Toast.LENGTH_SHORT).show();
                   rollButton.setText("Dice Rolled");
            int randomNumberDice1= ChangeDice1();
            int randomNumberDice2= ChangeDice2();


                if (randomNumberDice1==6&&randomNumberDice2==6){
                    Toast.makeText(MainActivity.this,"JACKPOT!",Toast.LENGTH_LONG);
                }
                //imageDice1.setVisibility(View.VISIBLE);
               // imageDice2.setVisibility(View.VISIBLE);
diceButton.setVisibility(View.VISIBLE);
diceButton2.setVisibility(View.VISIBLE);


            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // imageDice1.setVisibility(View.INVISIBLE);
               // imageDice2.setVisibility(View.INVISIBLE);
                rollButton.setText("Roll the dice");
                diceButton.setVisibility(View.INVISIBLE);
                diceButton2.setVisibility(View.INVISIBLE);


            }
        });
        diceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

              ChangeDice1();
            }
            });
        diceButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

              ChangeDice2();
            }
            });
    }
    int ChangeDice1(){
        Random random = new Random();
        int randomNumberDice1 = random.nextInt(6)+1;
        switch (randomNumberDice1){
            case 1:
                diceButton.setImageResource(R.drawable.dice_1);
             //   imageDice1.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceButton.setImageResource(R.drawable.dice_2);
               // imageDice1.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceButton.setImageResource(R.drawable.dice_3);
               // imageDice1.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceButton.setImageResource(R.drawable.dice_4);
                //imageDice1.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceButton.setImageResource(R.drawable.dice_5);
               // imageDice1.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceButton.setImageResource(R.drawable.dice_6);
               // imageDice1.setImageResource(R.drawable.dice_6);
                break;

        }return randomNumberDice1;
    }
    int ChangeDice2(){
        Random random = new Random();
        int randomNumberDice2= random.nextInt(6)+1;

        switch (randomNumberDice2){
            case 1:
                diceButton2.setImageResource(R.drawable.dice_1);
                //imageDice2.setImageResource(R.drawable.dice_1);
                break;
            case 2:

                diceButton2.setImageResource(R.drawable.dice_2);
                //imageDice2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceButton2.setImageResource(R.drawable.dice_3);
                //imageDice2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceButton2.setImageResource(R.drawable.dice_4);
                //imageDice2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceButton2.setImageResource(R.drawable.dice_5);
                //imageDice2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceButton2.setImageResource(R.drawable.dice_6);
                //imageDice2.setImageResource(R.drawable.dice_6);
                break;

        }return  randomNumberDice2;}

}