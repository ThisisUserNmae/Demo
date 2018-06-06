package com.bwei.day_02;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.MyListViewAdapter;
import adapter.MyViewPager;
import bean.Bean;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private int[] img = {R.drawable.ph2, R.drawable.ph3, R.drawable.ph4, R.drawable.ph6};

    private int[] age = {12, 23, 45, 12, 34, 12, 12, 12, 23, 34};

    private List<Integer> list = new ArrayList<>();

    private List<Bean> ageList = new ArrayList<>();
    private ListView mLvAge;

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

        //循环这添加到集合中
        for (int i = 0; i < img.length; i++) {
            //添加集合中
            list.add(img[i]);

        }

        for (int i = 0; i < ageList.size(); i++) {

            Bean b = new Bean(age[i]);

            ageList.add(b);

        }

        //设置适配器
        MyViewPager adapter = new MyViewPager(list, MainActivity.this);
        viewPager.setAdapter(adapter);

        MyListViewAdapter adapter1 = new MyListViewAdapter(ageList,MainActivity.this);

        mLvAge.setAdapter(adapter1);

    }
    //初始化视图
    private void initViews() {
        //获取资源ID
        viewPager = findViewById(R.id.viewpager);
        mLvAge = findViewById(R.id.lv_age);
    }
    /**
     * 我处理了一个bug
     */
    /**
     * 添加了一段注释
     */
}
