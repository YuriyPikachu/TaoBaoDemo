package com.yuliang.home.adapter;

import android.content.Context;

import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yuliang.home.adapter.BaseDelegateAdapter;
import com.zxl.vlayoutdemo.R;

import static com.yuliang.home.Config.ITEM_URL;
import static com.yuliang.home.Config.TITLE_VIEW_TYPE;


/**
 * @author YuLiang
 * update  2019/1/3
 * <a href="750749212@qq.com">Contact me</a>
 */
public class TitleAdapter extends BaseDelegateAdapter {
    private int finalI;

    public TitleAdapter(Context context, int finalI) {
        super(context, new LinearLayoutHelper(), R.layout.vlayout_title, 1, TITLE_VIEW_TYPE);
        this.finalI = finalI;
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        holder.setImageResource(R.id.iv, ITEM_URL[finalI]);
    }
}
