package com.asum.xuidesign;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.asum.xuidesign.designer.UIDesignMainActivityDesigner;
import com.asum.xuidesign.utils.XDesigner;

public class UIDesignMainActivity extends Activity {
    private XDesigner designer;
    private UIDesignMainActivityDesigner uiDesigner;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        designer = new XDesigner();
        uiDesigner = (UIDesignMainActivityDesigner) designer.design(this, R.layout.activity_uidesign_main);

        initializeEvent();
    }

    private void initializeEvent() {
        uiDesigner.textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
