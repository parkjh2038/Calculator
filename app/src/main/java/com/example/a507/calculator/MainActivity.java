package com.example.a507.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected double ans = 0.;
    protected Button btnResult;

    protected void inputNum() {
    }

    double op4(double x) {
        protected double op4 (String sOp, double x){
            return 0.;
        }
        double mathOp ( double x){
            protected double mathOp (String sFun,double x){
                return 0.;
            }
            void printNum ( double x){
                protected void printNum ( double x){

                }

                protected void calculate () {

                }

                @Override
                protected void onCreate(Bundle savedInstanceState){
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);
                    btnResult = (Button) findViewById(R.id.btnResult);
                    btnResult.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            calculate();
                        }
                    });
                }
            }
        }
    }
}