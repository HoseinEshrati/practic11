package com.example.hosein.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    RadioGroup radioGroup;
    RadioButton r1, r2, r3;
    CheckBox checkBoxvisibility, checkBoxtarnsparent;
    int i;
    boolean checkt, checkv;
    Button buttonimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        config();

        buttonimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioburoonselected()==1){

                    imageView.setImageResource(R.drawable.a);


                }

                else if (radioburoonselected()==2){


                    imageView.setImageResource(R.drawable.b);
                }
                else if (radioburoonselected()==3){

                    imageView.setImageResource(R.drawable.c);

                }else
                    Toast.makeText(MainActivity.this,"Select Image",Toast.LENGTH_SHORT).show();


                



            }
        });

    }

    public void config() {
        buttonimg = (Button) findViewById(R.id.btimg);
        imageView = (ImageView) findViewById(R.id.img);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        r1 = (RadioButton) findViewById(R.id.R1);
        r2 = (RadioButton) findViewById(R.id.R2);
        r3 = (RadioButton) findViewById(R.id.R3);
        checkBoxtarnsparent = (CheckBox) findViewById(R.id.t);
        checkBoxvisibility = (CheckBox) findViewById(R.id.v);

    }

    public int radioburoonselected() {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (r1.getId() == checkedId) {
                    i = 1;


                } else if (r2.getId() == checkedId) {

                    i = 2;

                } else if (r3.getId() == checkedId) {
                    i = 3;

                } else
                    i = 0;
            }
        });

        return i;
    }

    public boolean checktransparentselected() {

        checkBoxtarnsparent.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    checkt = true;

                } else checkt = false;
            }
        });

        return checkt;
    }


    public boolean checkvisibilityselected() {

        checkBoxvisibility.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {

                    checkv = true;
                } else checkv = false;
            }
        });

        return checkv;
    }

}
