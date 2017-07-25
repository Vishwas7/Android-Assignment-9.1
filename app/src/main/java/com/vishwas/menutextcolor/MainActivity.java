package com.vishwas.menutextcolor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

// Declaring variable
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // In here getting the widgets reference from XML layout
        textView = (TextView) findViewById(R.id.text);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*
            In here using MenuInflater
                This class is used to instantiate menu XML files into Menu objects.
        */
        /*
            public MenuInflater getMenuInflater ()
        */
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucolor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                // In here assigning  the text color to red
                textView.setTextColor(Color.RED);
                return true;
            case R.id.green:
                // In here assigning  the text color to green
                textView.setTextColor(Color.GREEN);
                return true;
            case R.id.blue:
                // In here assigning the text color to blue
                textView.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}