package com.yuliang.home;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.chad.library.adapter.base.BaseViewHolder;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.zxl.vlayoutdemo.R;

import java.util.ArrayList;

import static com.yuliang.home.Config.BANNER_VIEW_TYPE;


/**
 * @author YuLiang
 * update  2019/1/3
 * <a href="750749212@qq.com">Contact me</a>
 */
public class BannerAdapter extends BaseDelegateAdapter {
    private Context context;
    public BannerAdapter(Context context) {
        super(context, new LinearLayoutHelper()
                , R.layout.vlayout_banner, 1, BANNER_VIEW_TYPE);
        this.context = context;
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("http://bpic.wotucdn.com/11/66/23/55bOOOPIC3c_1024.jpg!/fw/780/quality/90/unsharp/true/compress/true/watermark/url/L2xvZ28ud2F0ZXIudjIucG5n/repeat/true");
        arrayList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505470629546&di=194a9a92bfcb7754c5e4d19ff1515355&imgtype=0&src=http%3A%2F%2Fpics.jiancai.com%2Fimgextra%2Fimg01%2F656928666%2Fi1%2FT2_IffXdxaXXXXXXXX_%2521%2521656928666.jpg");
        // 绑定数据
        Banner mBanner = holder.getView(R.id.banner);
        //设置banner样式
        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器
        mBanner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        mBanner.setImages(arrayList);
        //设置banner动画效果
        mBanner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
        //        mBanner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        mBanner.isAutoPlay(true);
        //设置轮播时间
        mBanner.setDelayTime(5000);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        mBanner.start();

        mBanner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Toast.makeText(context, "banner点击了" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
