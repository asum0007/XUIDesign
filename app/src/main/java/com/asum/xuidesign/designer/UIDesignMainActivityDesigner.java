package com.asum.xuidesign.designer;

import android.content.Intent;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.asum.xuidesign.R;
import com.asum.xuidesign.interfaces.IUIDesigner;
import com.asum.xuidesign.layout.TestRelativeLayout;
import com.asum.xuidesign.utils.XDesigner;

/**
 * Created by Asum on 2016/4/8 0008.
 */
public class UIDesignMainActivityDesigner implements IUIDesigner {
    public TextView textView;
    public LinearLayout layout;
    public ImageView imageView;
    public TestRelativeLayout testLayout;

    public void design(XDesigner designer, Intent intent) {
        textView = designer.getViewById(R.id.activity_main_textview);
        layout = designer.getViewById(R.id.activity_main_linealayout);
        imageView = designer.getViewById(R.id.activity_main_imageview);
        testLayout=designer.getViewById(R.id.activity_main_test_layout);

        textView.setText("成功成功成功成功成功成功成功成功成功");
        layout.setBackgroundColor(Color.BLUE);
        imageView.setImageResource(R.mipmap.ic_launcher);
    }

    public void design(XDesigner designer, Object... values) {
    }
}
