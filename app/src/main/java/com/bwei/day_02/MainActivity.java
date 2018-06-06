package com.bwei.day_02;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.MyViewPager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private int[] img = {R.drawable.ph2,R.drawable.ph3,R.drawable.ph4,R.drawable.ph6};

    private List<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化视图
        initViews();
        //初始化数据
        initDatas();

    }

    private void initDatas() {

        for (int i = 0; i < img.length; i++) {

            list.add(img[i]);

        }
        MyViewPager adapter = new MyViewPager(list, MainActivity.this);
        viewPager.setAdapter(adapter);

    }

    private void initViews() {

        viewPager = findViewById(R.id.viewpager);

    }
    /**
     * 我处理了一个bug
     */
}
