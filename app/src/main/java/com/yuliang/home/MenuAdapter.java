package com.yuliang.home;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zxl.vlayoutdemo.R;

import static com.yuliang.home.Config.IMG_URLS;
import static com.yuliang.home.Config.ITEM_NAMES;
import static com.yuliang.home.Config.MENU_VIEW_TYPE;

/**
 * @author YuLiang
 * update  2019/1/3
 * <a href="750749212@qq.com">Contact me</a>
 */
public class MenuAdapter extends BaseDelegateAdapter {
    private Context context;


    public MenuAdapter(Context context) {
        super(context, getLayoutHelp(), R.layout.vlayout_menu
                , 10, MENU_VIEW_TYPE);
        this.context = context;
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);
        holder.setText(R.id.tv_menu_title_home, ITEM_NAMES[position] + "");
        holder.setImageResource(R.id.iv_menu_home, IMG_URLS[position]);
        holder.getView(R.id.ll_menu_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ITEM_NAMES[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    static LayoutHelper getLayoutHelp() {
        //menu
        // 在构造函数设置每行的网格个数
        GridLayoutHelper gridLayoutHelper = new GridLayoutHelper(5);
        gridLayoutHelper.setPadding(0, 16, 0, 16);
        gridLayoutHelper.setVGap(16);// 控制子元素之间的垂直间距
        gridLayoutHelper.setHGap(0);// 控制子元素之间的水平间距
        gridLayoutHelper.setBgColor(Color.WHITE);
        return gridLayoutHelper;
    }
}
