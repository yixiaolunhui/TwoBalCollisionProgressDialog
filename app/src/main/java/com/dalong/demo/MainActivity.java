package com.dalong.demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.dalong.demo.view.CustomImageView;

public class MainActivity extends AppCompatActivity {

    private CustomImageView faImageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initView();
    }

    private void initView() {

        faImageView1 = (CustomImageView)findViewById(R.id.imageview1);
        faImageView1.setInterval(60);//切换一次的时间
        faImageView1.setLoop(true);//是否循环切换
        faImageView1.addImageFrame(R.drawable.loading3_01);
        faImageView1.addImageFrame(R.drawable.loading3_02);
        faImageView1.addImageFrame(R.drawable.loading3_03);
        faImageView1.addImageFrame(R.drawable.loading3_04);
        faImageView1.addImageFrame(R.drawable.loading3_05);
        faImageView1.addImageFrame(R.drawable.loading3_06);
        faImageView1.addImageFrame(R.drawable.loading3_07);
        faImageView1.addImageFrame(R.drawable.loading3_08);
        faImageView1.addImageFrame(R.drawable.loading3_09);
        faImageView1.addImageFrame(R.drawable.loading3_10);
        faImageView1.addImageFrame(R.drawable.loading3_11);
        faImageView1.addImageFrame(R.drawable.loading3_12);
        faImageView1.addImageFrame(R.drawable.loading3_13);
        faImageView1.addImageFrame(R.drawable.loading3_14);
        faImageView1.addImageFrame(R.drawable.loading3_15);
        faImageView1.addImageFrame(R.drawable.loading3_16);
        faImageView1.addImageFrame(R.drawable.loading3_17);
        faImageView1.addImageFrame(R.drawable.loading3_18);
        faImageView1.addImageFrame(R.drawable.loading3_19);
        faImageView1.addImageFrame(R.drawable.loading3_20);
        faImageView1.addImageFrame(R.drawable.loading3_21);
    }

    @Override
    protected void onResume() {
        super.onResume();
        faImageView1.startAnimation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        faImageView1.stopAnimaion();
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
