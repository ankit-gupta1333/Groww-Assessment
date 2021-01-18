package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llNos, llTiles, llChoseNo, llTryMore;
    Button btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine;
    Button btTile1, btTile2, btTile3, btTile4, btTile5, btTile6, btTile7, btTile8, btTile9, btTryAgain;
    int selectedNo, noOfChances=0;
    int one, two, three, four, five, six, seven, eight, nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        llNos = findViewById(R.id.ll_nos);
        llChoseNo = findViewById(R.id.ll_chose_no);
        llTiles = findViewById(R.id.ll_tiles);
        llTryMore = findViewById(R.id.ll_Try_more);
        btOne = findViewById(R.id.bt_one);
        btTwo = findViewById(R.id.bt_two);
        btThree = findViewById(R.id.bt_three);
        btFour = findViewById(R.id.bt_four);
        btFive = findViewById(R.id.bt_five);
        btSix = findViewById(R.id.bt_six);
        btSeven = findViewById(R.id.bt_seven);
        btEight = findViewById(R.id.bt_eight);
        btNine = findViewById(R.id.bt_nine);
        btTile1 = findViewById(R.id.bt_1);
        btTile2 = findViewById(R.id.bt_2);
        btTile3 = findViewById(R.id.bt_3);
        btTile4 = findViewById(R.id.bt_4);
        btTile5 = findViewById(R.id.bt_5);
        btTile6 = findViewById(R.id.bt_6);
        btTile7 = findViewById(R.id.bt_7);
        btTile8 = findViewById(R.id.bt_8);
        btTile9 = findViewById(R.id.bt_9);
        btTryAgain = findViewById(R.id.bt_try_again);

        btOne.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btFive.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btEight.setOnClickListener(this);
        btNine.setOnClickListener(this);

        btTile1.setOnClickListener(this);
        btTile2.setOnClickListener(this);
        btTile3.setOnClickListener(this);
        btTile4.setOnClickListener(this);
        btTile5.setOnClickListener(this);
        btTile6.setOnClickListener(this);
        btTile7.setOnClickListener(this);
        btTile8.setOnClickListener(this);
        btTile9.setOnClickListener(this);
        btTryAgain.setOnClickListener(this);

        int randomNo = r.nextInt((9-1)+1) + 1;
        one = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        two = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        three = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        four = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        five = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        six = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        seven = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        eight = randomNo;
        randomNo = r.nextInt((9-1)+1) + 1;
        nine = randomNo;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_one:
                noOfChances=0;
                selectedNo = 1;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_two:
                noOfChances=0;
                selectedNo = 2;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_three:
                noOfChances=0;
                selectedNo = 3;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_four:
                noOfChances=0;
                selectedNo = 4;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_five:
                noOfChances=0;
                selectedNo = 5;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_six:
                noOfChances=0;
                selectedNo = 6;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_seven:
                noOfChances=0;
                selectedNo = 7;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_eight:
                noOfChances=0;
                selectedNo = 8;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_nine:
                noOfChances=0;
                selectedNo = 9;
                llNos.setVisibility(View.GONE);
                llChoseNo.setVisibility(View.INVISIBLE);
                llTiles.setVisibility(View.VISIBLE);
                break;
            case R.id.bt_1:
                noOfChances++;
                if(one==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+one+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_2:
                noOfChances++;
                if(two==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+two+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_3:
                noOfChances++;
                if(three==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+three+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_4:
                noOfChances++;
                if(four==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+four+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_5:
                noOfChances++;
                if(five==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+five+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_6:
                noOfChances++;
                if(six==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+six+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_7:
                noOfChances++;
                if(seven==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+seven+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_8:
                noOfChances++;
                if(eight==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+eight+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_9:
                noOfChances++;
                if(nine==selectedNo && noOfChances<3)  {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Congrats! You won.", Toast.LENGTH_SHORT).show();
                }
                else if(noOfChances>=3) {
                    llTryMore.setVisibility(View.VISIBLE);
                    llTiles.setVisibility(View.GONE);
                    Toast.makeText(this, "Sorry! You are fail.", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(this, "This was "+nine+", You have "+(3-noOfChances)+" more chance, try up!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_try_again:
                llTiles.setVisibility(View.GONE);
                llTryMore.setVisibility(View.GONE);
                llNos.setVisibility(View.VISIBLE);
                llChoseNo.setVisibility(View.VISIBLE);
            default:break;
        }
    }
}
