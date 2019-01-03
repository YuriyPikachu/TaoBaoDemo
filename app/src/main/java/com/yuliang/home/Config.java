package com.yuliang.home;

import com.zxl.vlayoutdemo.R;

/**
 * @author YuLiang
 * update  2019/1/3
 * <a href="750749212@qq.com">Contact me</a>
 */
public interface Config {
    //不同item必须不同的viewtype
    int BANNER_VIEW_TYPE = 1;
    int MENU_VIEW_TYPE = 2;
    int NEWS_VIEW_TYPE = 3;
    int TITLE_VIEW_TYPE = 4;
    int GRID_VIEW_TYPE = 5;


    int[] IMG_URLS = {R.mipmap.ic_tian_mao, R.mipmap.ic_ju_hua_suan, R.mipmap.ic_tian_mao_guoji, R.mipmap.ic_waimai, R.mipmap.ic_chaoshi, R.mipmap.ic_voucher_center, R.mipmap.ic_travel, R.mipmap.ic_tao_gold, R.mipmap.ic_auction, R.mipmap.ic_classify};
    String[] ITEM_NAMES = {"天猫", "聚划算", "天猫国际", "外卖", "天猫超市", "充值中心", "飞猪旅行", "领金币", "拍卖", "分类"};
    int[] GRID_URL = {R.mipmap.flashsale1, R.mipmap.flashsale2, R.mipmap.flashsale3, R.mipmap.flashsale4};
    int[] ITEM_URL = {R.mipmap.item1, R.mipmap.item2, R.mipmap.item3, R.mipmap.item4, R.mipmap.item5};
}