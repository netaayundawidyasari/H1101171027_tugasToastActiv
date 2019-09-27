package com.aplikasi.kuis1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int mCount = 27;
            private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =  (TextView) findViewById(R.id.textView3);
    }
    public void toast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT);
        toast.show();



    }

    public void countup(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
    public void countDown(View View){
        mCount--;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

}

}
