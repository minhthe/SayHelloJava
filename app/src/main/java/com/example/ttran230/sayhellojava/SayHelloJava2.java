package com.example.ttran230.sayhellojava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dell on 7/6/2016.
 */
public class SayHelloJava2 extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        String appName = "this is app Name";
        String windownText = "Please touch me from windown text";
        String buttonLabel = "show hello world";

        LinearLayout mainWindown = new LinearLayout(this);
        mainWindown.setOrientation(LinearLayout.VERTICAL);
        setTitle(appName);

        TextView label = new TextView(this);
        label.setText(windownText);
        mainWindown.addView(label);

        Button helloButton = new Button(this);
        helloButton.setText(buttonLabel);
        helloButton.setOnClickListener(new Toaster());
        mainWindown.addView(helloButton);
        setContentView(mainWindown);
    }

private class Toaster implements View.OnClickListener{
    @Override
    public void onClick(View clickedButton){
        String helloText = "hello world";
        Toast message = Toast.makeText(SayHelloJava2.this, helloText, Toast.LENGTH_LONG);
        message.show();
    }
}
}
