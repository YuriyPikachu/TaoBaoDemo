package com.yuliang.home;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.chad.library.adapter.base.BaseViewHolder;
import com.sunfusheng.marqueeview.MarqueeView;
import com.zxl.vlayoutdemo.R;

import java.util.ArrayList;
import java.util.List;

import static com.yuliang.home.Config.NEWS_VIEW_TYPE;


/**
 * @author YuLiang
 * update  2019/1/3
 * <a href="750749212@qq.com">Contact me</a>
 */
public class NewsAdapter extends BaseDelegateAdapter {
    private Context context;
    public NewsAdapter(Context context) {
        super(context, new LinearLayoutHelper()
                , R.layout.vlayout_news, 1, NEWS_VIEW_TYPE);
        this.context = context;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        MarqueeView marqueeView1 = holder.getView(R.id.marqueeView1);
        MarqueeView marqueeView2 = holder.getView(R.id.marqueeView2);

        List<String> info1 = new ArrayList<>();
        info1.add("这个是用来搞笑的，不要忽略小细节！");
        info1.add("都注意这里，不要忽略小细节！");

        List<String> info2 = new ArrayList<>();
        info2.add("我是淘宝，在意小细节！");
        info2.add("啦啦啦啦，我就是来搞笑的！");

        marqueeView1.startWithList(info1);
        marqueeView2.startWithList(info2);
        // 在代码里设置自己的动画
        marqueeView1.startWithList(info1, R.anim.anim_bottom_in, R.anim.anim_top_out);
        marqueeView2.startWithList(info2, R.anim.anim_bottom_in, R.anim.anim_top_out);

        marqueeView1.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(context, textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        marqueeView2.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(context, textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
