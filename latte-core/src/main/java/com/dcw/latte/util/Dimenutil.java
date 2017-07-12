package com.dcw.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.dcw.latte.app.Latte;

/**
 * @Author： duchunwei
 * @Date: 2017/7/12   15:48
 * @Email： duchunwei_it@163.com
 * 获取屏幕宽高工具
 */

public class Dimenutil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
