package com.asum.xuidesign.utils.view;

import android.widget.LinearLayout;

public class LinearLayoutTools {
	private LinearLayout layout;

	public LinearLayoutTools(LinearLayout layout) {
		this.layout = layout;
	}

	/**
	 * 对应setOrientation()
	 * 
	 * @param tation
	 * @return
	 */
	public LinearLayoutTools orientation(int tation) {
		layout.setOrientation(tation);
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
	public LinearLayoutTools padding(double l, double t, double r, double b) {
		layout.setPadding((int) l, (int) t, (int) r, (int) b);
		return this;
	}

	/**
	 * 对应setBackgroundColor()
	 * 
	 * @param color
	 * @return
	 */
	public LinearLayoutTools color(int color) {
		layout.setBackgroundColor(color);
		return this;
	}

	/**
	 * 对应setBackgroundResource()
	 * 
	 * @param resId
	 * @return
	 */
	public LinearLayoutTools resId(int resId) {
		layout.setBackgroundResource(resId);
		return this;
	}
}
