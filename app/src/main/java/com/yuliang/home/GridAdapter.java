package com.yuliang.home;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zxl.vlayoutdemo.R;

import static com.yuliang.home.Config.GRID_URL;
import static com.yuliang.home.Config.GRID_VIEW_TYPE;


/**
 * @author YuLiang
 * update  2019/1/3
 * <a href="750749212@qq.com">Contact me</a>
 */
public class GridAdapter extends BaseDelegateAdapter {
    private Context context;
    public GridAdapter(Context context) {
        super(context, getLayoutHelp(), R.layout.vlayout_grid
                , 4, GRID_VIEW_TYPE);
        this.context = context;
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);
        int item = GRID_URL[position];
        ImageView iv = holder.getView(R.id.iv);
        Glide.with(context).load(item).into(iv);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "item" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    static LayoutHelper getLayoutHelp() {
        //item1 gird
        GridLayoutHelper gridLayoutHelper1 = new GridLayoutHelper(2);
        gridLayoutHelper1.setMargin(0, 0, 0, 0);
        gridLayoutHelper1.setPadding(0, 0, 0, 0);
        gridLayoutHelper1.setVGap(0);// 控制子元素之间的垂直间距
        gridLayoutHelper1.setHGap(0);// 控制子元素之间的水平间距
        gridLayoutHelper1.setBgColor(Color.WHITE);
        gridLayoutHelper1.setAutoExpand(true);//是否自动填充空白区域
        return gridLayoutHelper1;
    }
}
