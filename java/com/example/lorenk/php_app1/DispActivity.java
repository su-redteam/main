package com.example.lorenk.php_app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DispActivity extends AppCompatActivity {


    int counter = 6;
    public static int[] powerstate = new int[6];
    public static int[] faultstate = new int[6];

    private ImageView on1,off1,fault1;
    private ImageView on2,off2,fault2;
    private ImageView on3,off3,fault3;
    private ImageView on4,off4,fault4;
    private ImageView on5,off5,fault5;
    private ImageView on6,off6,fault6;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp);

        on1 = (ImageView) findViewById(R.id.onView1);
        on2 = (ImageView) findViewById(R.id.onView2);
        on3 = (ImageView) findViewById(R.id.onView3);
        on4 = (ImageView) findViewById(R.id.onView4);
        on5 = (ImageView) findViewById(R.id.onView5);
        on6 = (ImageView) findViewById(R.id.onView6);

        off1 = (ImageView) findViewById(R.id.offView1);
        off2 = (ImageView) findViewById(R.id.offView2);
        off3 = (ImageView) findViewById(R.id.offView3);
        off4 = (ImageView) findViewById(R.id.offView4);
        off5 = (ImageView) findViewById(R.id.offView5);
        off6 = (ImageView) findViewById(R.id.offView6);

        fault1 = (ImageView) findViewById(R.id.faultView1);
        fault2 = (ImageView) findViewById(R.id.faultView2);
        fault3 = (ImageView) findViewById(R.id.faultView3);
        fault4 = (ImageView) findViewById(R.id.faultView4);
        fault5 = (ImageView) findViewById(R.id.faultView5);
        fault6 = (ImageView) findViewById(R.id.faultView6);

        for(int i = 0; i < counter; i++){
            powerstate[i] = 0;
            faultstate[i] = 0;
        }

        on1.setVisibility(View.INVISIBLE);
        on2.setVisibility(View.INVISIBLE);
        on3.setVisibility(View.INVISIBLE);
        on4.setVisibility(View.INVISIBLE);
        on5.setVisibility(View.INVISIBLE);
        on6.setVisibility(View.INVISIBLE);

        fault1.setVisibility(View.INVISIBLE);
        fault2.setVisibility(View.INVISIBLE);
        fault3.setVisibility(View.INVISIBLE);
        fault4.setVisibility(View.INVISIBLE);
        fault5.setVisibility(View.INVISIBLE);
        fault6.setVisibility(View.INVISIBLE);
    }


    //The Fault buttons toggle
    public void testFault1(View view) {
        if (faultstate[0] == 0 ) {
            faultstate[0] = 1;
        }else{
            faultstate[0] = 0;
        }

        if (faultstate[0] == 1) {
            fault1.setVisibility(View.VISIBLE);
        }else {
            fault1.setVisibility(View.INVISIBLE);
        }
    }
    public void testFault2(View view) {
        if (faultstate[1] == 0 ) {
            faultstate[1] = 1;
        }else{
            faultstate[1] = 0;
        }

        if (faultstate[1] == 1) {
            fault2.setVisibility(View.VISIBLE);
        }else {
            fault2.setVisibility(View.INVISIBLE);
        }
    }
    public void testFault3(View view) {
        if (faultstate[2] == 0 ) {
            faultstate[2] = 1;
        }else{
            faultstate[2] = 0;
        }

        if (faultstate[2] == 1) {
            fault3.setVisibility(View.VISIBLE);
        }else {
            fault3.setVisibility(View.INVISIBLE);
        }
    }
    public void testFault4(View view) {
        if (faultstate[3] == 0 ) {
            faultstate[3] = 1;
        }else{
            faultstate[3] = 0;
        }

        if (faultstate[3] == 1) {
            fault4.setVisibility(View.VISIBLE);
        }else {
            fault4.setVisibility(View.INVISIBLE);
        }
    }
    public void testFault5(View view) {
        if (faultstate[4] == 0 ) {
            faultstate[4] = 1;
        }else{
            faultstate[4] = 0;
        }

        if (faultstate[4] == 1) {
            fault5.setVisibility(View.VISIBLE);
        }else {
            fault5.setVisibility(View.INVISIBLE);
        }
    }
    public void testFault6(View view) {
        if (faultstate[5] == 0 ) {
            faultstate[5] = 1;
        }else {
            faultstate[5] = 0;
        }

        if (faultstate[5] == 1) {
            fault6.setVisibility(View.VISIBLE);
        }else {
            fault6.setVisibility(View.INVISIBLE);
        }
    }

    //On/Off button toggle
    public void testSwitch1(View view) {
        if (powerstate[0] == 0 ) {
            powerstate[0] = 1;
        }else {
            powerstate[0] = 0;
        }

        if (powerstate[0] == 1) {
            on1.setVisibility(View.VISIBLE);
            off1.setVisibility(View.INVISIBLE);
        }else {
            on1.setVisibility(View.INVISIBLE);
            off1.setVisibility(View.VISIBLE);
        }
    }
    public void testSwitch2(View view) {
        if (powerstate[1] == 0 ) {
            powerstate[1] = 1;
        }else {
            powerstate[1] = 0;
        }

        if (powerstate[1] == 1) {
            on2.setVisibility(View.VISIBLE);
            off2.setVisibility(View.INVISIBLE);
        }else {
            on2.setVisibility(View.INVISIBLE);
            off2.setVisibility(View.VISIBLE);
        }
    }
    public void testSwitch3(View view) {
        if (powerstate[2] == 0 ) {
            powerstate[2] = 1;
        }else {
            powerstate[2] = 0;
        }

        if (powerstate[2] == 1) {
            on3.setVisibility(View.VISIBLE);
            off3.setVisibility(View.INVISIBLE);
        }else {
            on3.setVisibility(View.INVISIBLE);
            off3.setVisibility(View.VISIBLE);
        }
    }
    public void testSwitch4(View view) {
        if (powerstate[3] == 0 ) {
            powerstate[3] = 1;
        }else {
            powerstate[3] = 0;
        }

        if (powerstate[3] == 1) {
            on4.setVisibility(View.VISIBLE);
            off4.setVisibility(View.INVISIBLE);
        }else {
            on4.setVisibility(View.INVISIBLE);
            off4.setVisibility(View.VISIBLE);
        }
    }
    public void testSwitch5(View view) {
        if (powerstate[4] == 0 ) {
            powerstate[4] = 1;
        }else {
            powerstate[4] = 0;
        }

        if (powerstate[4] == 1) {
            on5.setVisibility(View.VISIBLE);
            off5.setVisibility(View.INVISIBLE);
        }else {
            on5.setVisibility(View.INVISIBLE);
            off5.setVisibility(View.VISIBLE);
        }
    }
    public void testSwitch6(View view) {
        if (powerstate[5] == 0 ) {
            powerstate[5] = 1;
        }else {
            powerstate[5] = 0;
        }

        if (powerstate[5] == 1) {
            on6.setVisibility(View.VISIBLE);
            off6.setVisibility(View.INVISIBLE);
        }else {
            on6.setVisibility(View.INVISIBLE);
            off6.setVisibility(View.VISIBLE);
        }
    }



}

































































































































































































































































































































































































































































































































































































































































































































































































































































































































