package com.asum.xuidesign.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.asum.xuidesign.R;
import com.asum.xuidesign.layout.designer.TestRelativeLayoutDesigner;
import com.asum.xuidesign.utils.XDesigner;

public class TestRelativeLayout extends RelativeLayout {
	private XDesigner designer;
	private TestRelativeLayoutDesigner uiDesigner;

	public TestRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);

		designer = new XDesigner();
		uiDesigner = (TestRelativeLayoutDesigner) designer.design(this, R.layout.layout_test, "参数1");
//
//		intializeEvent();
	}

	private void intializeEvent() {
		uiDesigner.button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

			}
		});
	}
}
