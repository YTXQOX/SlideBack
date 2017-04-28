package com.ljstudio.android.slideback;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import com.ljstudio.android.slideback.model.SlideConfig;
import com.ljstudio.android.slideback.widget.SlideFrame;

import wzk.com.library.R;


public class SlideClose {

    public static void initSlideClose(Activity currentActivity,SlideConfig config) {
        View decorView = currentActivity.getWindow().getDecorView();
        View contentView = ((ViewGroup)decorView).getChildAt(0);
        ((ViewGroup) decorView).removeView(contentView);

        SlideFrame slideFrame = new SlideFrame(currentActivity,config,contentView);
        slideFrame.setId(R.id.slide_frame);
        contentView.setId(R.id.slide_content);
        ((ViewGroup) decorView).addView(slideFrame, 0);
    }
}
