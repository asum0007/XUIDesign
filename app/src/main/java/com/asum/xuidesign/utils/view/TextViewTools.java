package com.asum.xuidesign.utils.view;

import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class TextViewTools {
	private TextView view;

	public TextViewTools(TextView view) {
		this.view = view;
	}

	/**
	 * 对应setGravity()
	 * 
	 * @param direction
	 * @return TextViewTools
	 */
	public TextViewTools grav(int direction) {
		view.setGravity(direction);
		return this;
	}

	/**
	 * 对应setText()
	 * 
	 * @param text
	 * @return
	 */
	public TextViewTools text(String text) {
		view.setText(text);
		return this;
	}

	/**
	 * 对应setTextSize()
	 * 
	 * @param sizeDp
	 * @return
	 */
	public TextViewTools sizeDp(float sizeDp) {
		view.setTextSize(TypedValue.COMPLEX_UNIT_DIP, sizeDp);
		return this;
	}

	/**
	 * 对应setTextSize()
	 * 
	 * @param sizeSp
	 * @return
	 */
	public TextViewTools sizeSp(float sizeSp) {
		view.setTextSize(TypedValue.COMPLEX_UNIT_SP, sizeSp);
		return this;
	}

	/**
	 * 对应setTextSize()
	 * 
	 * @param sizePx
	 * @return
	 */
	public TextViewTools sizePx(float sizePx) {
		view.setTextSize(TypedValue.COMPLEX_UNIT_PX, sizePx);
		return this;
	}

	/**
	 * 对应setIncludeFontPadding()
	 * 
	 * @param haveDefaulPadding
	 * @return
	 */
	public TextViewTools defaulPadding(boolean haveDefaulPadding) {
		view.setIncludeFontPadding(haveDefaulPadding);
		return this;
	}

	/**
	 * 对应setTextColor()
	 * 
	 * @param color
	 * @return
	 */
	public TextViewTools textColor(int color) {
		view.setTextColor(color);
		return this;
	}

	/**
	 * 对应setAlpha()
	 * 
	 * @param alpha
	 * @return
	 */
	public TextViewTools alpha(double alpha) {
		view.setAlpha((float) alpha);
		return this;
	}

	/**
	 * 对应setVisibility()
	 * 
	 * @param type
	 * @return
	 */
	public TextViewTools visibility(boolean type) {
		if (type) {
			view.setVisibility(View.VISIBLE);
		} else {
			view.setVisibility(View.GONE);
		}
		return this;
	}

	/**
	 * 对应setPadding()
	 * 
	 * @param l
	 * @param t
	 * @param r
	 * @param b
	 * @return
	 */
	public TextViewTools padding(double l, double t, double r, double b) {
		view.setPadding((int) l, (int) t, (int) r, (int) b);
		return this;
	}

	/**
	 * 点击效果（覆盖文字颜色）
	 * 
	 * @param resId
	 * @return
	 */
	public TextViewTools clickResId(int resId) {
		view.setTextColor(view.getContext().getResources().getColorStateList(resId));
		return this;
	}

	/**
	 * 对应setBackgroundColor()
	 * 
	 * @param color
	 * @return
	 */
	public TextViewTools backColor(int color) {
		view.setBackgroundColor(color);
		return this;
	}

	/**
	 * 对应setBackgroundResource()
	 * 
	 * @param resId
	 * @return
	 */
	public TextViewTools backResId(int resId) {
		view.setBackgroundResource(resId);
		return this;
	}
}
