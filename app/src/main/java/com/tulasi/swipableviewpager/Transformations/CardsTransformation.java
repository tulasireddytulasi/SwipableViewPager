package com.tulasi.swipableviewpager.Transformations;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

public class CardsTransformation implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        if (position >= 0) {
            page.setScaleX(0.7f - 0.05f * position);
            page.setScaleY(0.7f);
            page.setTranslationX(-page.getWidth() * position);
            page.setTranslationY(-30 * position);
        }
    }
}