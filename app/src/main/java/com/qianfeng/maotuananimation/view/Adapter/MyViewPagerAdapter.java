package com.qianfeng.maotuananimation.view.Adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by qf on 2016/11/8.
 */

public class MyViewPagerAdapter extends PagerAdapter {
    private List<ImageView> list;
    private int imgNum;

    public MyViewPagerAdapter(List<ImageView> list, int imgNum) {
        this.list = list;
        this.imgNum = imgNum;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView=list.get(position%imgNum);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(((View) object));
    }
}
