package com.example.android;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView mainscreen;
    TextView prevValue;
    String operation;
    Button resultBtn;
    public double firstValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextView();
    }

    //getting fields as program starts
    public void initTextView(){
        mainscreen = findViewById(R.id.textView);
        prevValue = findViewById(R.id.prevValue);
        resultBtn = findViewById(R.id.result);
    }
    //updating main textfield
    public void textUpdate (String number){
        String text = mainscreen.getText().toString();
        text += number;
        mainscreen.setText(text);
    }
    //updating extra field to see previous action
    public void prevValueUpdate(String number){
        prevValue.setText(number);
    }
    //action buttons
    public void button1 (View view){
        textUpdate("1");
    }
    public void button2 (View view){
        textUpdate("2");
    }
    public void button3 (View view){
        textUpdate("3");
    }
    public void button4 (View view){
        textUpdate("4");
    }
    public void button5 (View view){
        textUpdate("5");
    }
    public void button6 (View view){
        textUpdate("6");
    }
    public void button7 (View view){
        textUpdate("7");
    }
    public void button8 (View view){
        textUpdate("8");
    }
    public void button9 (View view){
        textUpdate("9");
    }
    public void button0 (View view){
        textUpdate("0");
    }

    public void buttonplus (View view){
        firstValue = Double.parseDouble(mainscreen.getText().toString());
        textUpdate("+");
        prevValueUpdate(mainscreen.getText().toString());
        mainscreen.setText("");
        operation = "+";
    }

    public void buttonminus (View view){
        firstValue = Double.parseDouble(mainscreen.getText().toString());
        textUpdate("-");
        prevValueUpdate(mainscreen.getText().toString());
        mainscreen.setText("");
        operation = "-";
    }

    public void multiply (View view){
        firstValue = Double.parseDouble(mainscreen.getText().toString());
        textUpdate("*");
        prevValueUpdate(mainscreen.getText().toString());
        mainscreen.setText("");
        operation = "*";
    }

    public void divide (View view){
        firstValue = Double.parseDouble(mainscreen.getText().toString());
        textUpdate("/");
        prevValueUpdate(mainscreen.getText().toString());
        mainscreen.setText("");
        operation = "/";
    }
    //resetting the program values
    public void restart(View view) {
        resultBtn.setOnClickListener(this::result);
        prevValue.setText("");
        mainscreen.setText("");
    }
    //receiving result
    public void result (View view) {
        switch (operation) {
            case "+": {
                prevValue.setText(prevValue.getText() + Double.toString(firstValue));
                mainscreen.setText(Double.toString(firstValue + Double.parseDouble(mainscreen.getText().toString())));
                resultBtn.setOnClickListener(null);

                break;
            }
            case "-": {
                prevValue.setText(prevValue.getText() + Double.toString(firstValue));
                mainscreen.setText(Double.toString(firstValue - Double.parseDouble(mainscreen.getText().toString())));
                resultBtn.setOnClickListener(null);
                break;

            }
            case "*": {
                prevValue.setText(prevValue.getText() + Double.toString(firstValue));
                mainscreen.setText(Double.toString(firstValue * Double.parseDouble(mainscreen.getText().toString())));
                resultBtn.setOnClickListener(null);
                break;
            }
            case "/": {
                prevValue.setText(prevValue.getText() + Double.toString(firstValue));
                mainscreen.setText(Double.toString(firstValue / Double.parseDouble(mainscreen.getText().toString())));
                resultBtn.setOnClickListener(null);
                break;
            }
            default:

                    break;
        }
    }


    }
