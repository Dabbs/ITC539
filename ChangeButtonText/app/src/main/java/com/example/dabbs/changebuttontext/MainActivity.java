package com.example.dabbs.changebuttontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  buckyButton = (Button)findViewById(R.id.buckyButton);

        // Change Text when button click
        buckyButton.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
                    TextView buckysText = (TextView)findViewById(R.id.buckyText);
                    buckysText.setText("Good job Hoss");
                }
            }
        );


        buckyButton.setOnLongClickListener(
                new Button.OnLongClickListener(){

                    public boolean onLongClick(View v){
                        TextView buckysText = (TextView)findViewById(R.id.buckyText);
                        buckysText.setText("Long line, that was a long time!");
                        return true;
                    }

                }
        );
    }
}
