package com.example.order_drinks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button maaza,coca,limca,add,sub,m1,m2,m3,a1,a2,a3;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maaza = findViewById(R.id.maaza);
        coca  = findViewById(R.id.coca);
        limca = findViewById(R.id.limca);
        m1    = findViewById(R.id.m1);
        m2    = findViewById(R.id.m2);
        m3    = findViewById(R.id.m3);
        a1    = findViewById(R.id.a1);
        a2    = findViewById(R.id.a2);
        a3    = findViewById(R.id.a3);
        t1    = findViewById(R.id.t1);
        t2    = findViewById(R.id.t2);
        t3    = findViewById(R.id.t3);

        m1.setVisibility(View.INVISIBLE);
        m2.setVisibility(View.INVISIBLE);
        m3.setVisibility(View.INVISIBLE);

        a1.setVisibility(View.INVISIBLE);
        a2.setVisibility(View.INVISIBLE);
        a3.setVisibility(View.INVISIBLE);

        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.INVISIBLE);


        maaza.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {


                maaza.setVisibility(View.INVISIBLE);
                m1.setVisibility(View.VISIBLE);
                a1.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);

                m1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(count<0){
                            t1.setText("0");
                        }else{
                            count--;
                            t1.setText(count+"");
                        }
                    }
                });

                a1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        count++;
                        t1.setText(count+"");
                    }
                });

            }
        });


        coca.setOnClickListener(new View.OnClickListener() {
            int count =0;
            @Override
            public void onClick(View v) {

                coca.setVisibility(View.INVISIBLE);
                m2.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);

                m2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (count < 0) {
                            t2.setText("0");
                        } else {
                            count--;
                            t2.setText(count+"");
                        }
                    }
                });

                a2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        count++;
                        t2.setText(count+"");
                    }
                });
            }
        });

        limca.setOnClickListener(new View.OnClickListener() {
            int count=0;
            @Override
            public void onClick(View v) {

                limca.setVisibility(View.INVISIBLE);
                m3.setVisibility(View.VISIBLE);
                a3.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);

                m3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (count < 0) {
                            t3.setText("0");
                        } else {
                            count--;
                            t3.setText(count+"");
                        }
                    }
                });

                a3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        count++;
                        t3.setText(count+"");
                    }
                });
            }
        });

    }
}