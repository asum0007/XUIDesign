package com.asum.xuidesign.utils.view;

import android.widget.RelativeLayout;

public class RelativeLayoutTools {
	private RelativeLayout layout;

	public RelativeLayoutTools(RelativeLayout layout) {
		this.layout = layout;
	}

	/**
	 * 对应setBackgroundColor()
	 * 
	 * @param color
	 * @return
	 */
	public RelativeLayoutTools color(int color) {
		layout.setBackgroundColor(color);
		return this;
	}

	/**
	 * 对应setBackgroundResource()
	 * 
	 * @param resId
	 * @return
	 */
	public RelativeLayoutTools resId(int resId) {
		layout.setBackgroundResource(resId);
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
	public RelativeLayoutTools padding(double l, double t, double r, double b) {
		layout.setPadding((int) l, (int) t, (int) r, (int) b);
		return this;
	}
}
