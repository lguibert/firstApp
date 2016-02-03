package com.example.lucas.myapplication;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        Switch sw = (Switch) findViewById(R.id.switch1);

        if (sw.isChecked()) {
            switch (view.getId()) {
                case R.id.radioButton:
                    if (checked) {
                        changeColorClock(getResources().getColor(R.color.colorAccent));
                    }
                    break;
                case R.id.radioButton2:
                    if (checked) {
                        changeColorClock(getResources().getColor(R.color.colorCool));
                    }
                    break;
                case R.id.radioButton3:
                    if (checked) {
                        changeColorClock(getResources().getColor(R.color.colorPlusCoolCool));
                    }
                    break;
                case R.id.radioButton4:
                    if (checked) {
                        changeColorClock(getResources().getColor(R.color.colorPlusCool));
                    }
                    break;
            }
        }
    }

    private void changeColorClock(int color) {
        final TextClock txcl = (TextClock) findViewById(R.id.textClock);

        txcl.setTextColor(color);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
