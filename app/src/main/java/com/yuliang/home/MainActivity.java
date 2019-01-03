package com.yuliang.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.zxl.vlayoutdemo.R;

import java.util.LinkedList;
import java.util.List;
import static com.yuliang.home.Config.ITEM_URL;

/**
 * Created by YuLiang on 2017/9/15.
 */
public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private List<DelegateAdapter.Adapter> mAdapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mAdapters = new LinkedList<>();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);

        VirtualLayoutManager layoutManager = new VirtualLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
        mRecyclerView.setRecycledViewPool(viewPool);
        viewPool.setMaxRecycledViews(0, 10);

        DelegateAdapter delegateAdapter = new DelegateAdapter(layoutManager, true);
        mRecyclerView.setAdapter(delegateAdapter);

        BannerAdapter bannerAdapter = new BannerAdapter(this);
        mAdapters.add(bannerAdapter);

        MenuAdapter menuAdapter = new MenuAdapter(this);
        mAdapters.add(menuAdapter);

        NewsAdapter newsAdapter = new NewsAdapter(this);
        mAdapters.add(newsAdapter);

        for (int i = 0; i < ITEM_URL.length; i++) {
            TitleAdapter titleAdapter = new TitleAdapter(this,i);
            mAdapters.add(titleAdapter);

            GridAdapter girdAdapter = new GridAdapter(this);
            mAdapters.add(girdAdapter);
        }

        delegateAdapter.setAdapters(mAdapters);
    }
}
