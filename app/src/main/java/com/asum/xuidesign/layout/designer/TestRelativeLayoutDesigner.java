package com.asum.xuidesign.layout.designer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.asum.xuidesign.R;
import com.asum.xuidesign.interfaces.IUIDesigner;
import com.asum.xuidesign.utils.XDesigner;
import com.asum.xuidesign.utils.view.ButtonTools;
import com.asum.xuidesign.utils.view.ImageViewTools;
import com.asum.xuidesign.utils.view.RelativeLayoutTools;
import com.asum.xuidesign.utils.view.TextViewTools;

public class TestRelativeLayoutDesigner implements IUIDesigner {
	 private Context context;

	public Button button;
	public LinearLayout genLayout;

	public RelativeLayout relativeLayout;
	public Button relativeButton;
	public TextView textView;

	 private ImageView imageView;

	public void design(XDesigner designer, Intent intent) {
	}

	public void design(XDesigner designer, Object... values) {
		 Log.i("XJW", "Values：" + values[0]);
		 context = designer.getContext();

		 genLayout = designer.getViewById(R.id.layout_test);
//		 new LinearLayoutTools(genLayout).color(Color.BLUE);
//		 new XArea(context, genLayout).set(0, 0, XArea.WRAP, XArea.WRAP);

		 button = designer.getViewById(R.id.layout_test_button);
		 new ButtonTools(button).textColor(Color.BLACK).text("四四四四四四四四四四四").defaulPadding(false);
//		 new XArea(context, button).set(XArea.LEFT, XArea.TOP, XArea.MATCH, XArea.WRAP);
//		 new TextBuilder().add(-1, 30, Color.WHITE, 1).add(-1, 25, Color.YELLOW, 1).add(-1, 20, Color.BLACK, 1).build(button);

		 relativeLayout = designer.getViewById(R.id.layout_test_relative_layout);
		 new RelativeLayoutTools(relativeLayout).color(Color.RED).padding(30, 30, 30, 30);
//		 new XArea(context, relativeLayout).set(XArea.CENTER, 100, 200, 200);

		 relativeButton = designer.getViewById(R.id.layout_test_relative_button);
		 new ButtonTools(relativeButton).textColor(Color.BLUE).text("按钮");
//		 new XArea(context, relativeButton).set(XArea.LEFT, XArea.TOP, XArea.RIGHT, XArea.BOTTOM);

		 textView = designer.getViewById(R.id.layout_test_relative_textiew);
		 new TextViewTools(textView).defaulPadding(false).grav(Gravity.CENTER_HORIZONTAL).text("测试").sizeDp(40).textColor(Color.YELLOW).alpha(0.5);
//		 new XArea(context, textView).set(XArea.CENTER, XArea.CENTER, XArea.WRAP, XArea.WRAP);

		 imageView = designer.getViewById(R.id.layout_test_imageview);
		 new ImageViewTools(imageView).backColor(Color.BLACK).resId(R.mipmap.ic_launcher).padding(30, 100, 30, 30);
//		 new XArea(context, imageView).set(0, 0, 300, 300);
	}
}
