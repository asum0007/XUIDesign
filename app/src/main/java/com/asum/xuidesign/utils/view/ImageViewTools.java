package com.asum.xuidesign.utils.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ImageViewTools {
	private ImageView imageView;

	public ImageViewTools(ImageView imageView) {
		this.imageView = imageView;
	}

	/**
	 * 对应setScaleType()
	 * 
	 * @param type
	 * @return
	 */
	public ImageViewTools scaleType(ScaleType type) {
		imageView.setScaleType(type);
		return this;
	}

	/**
	 * 对应setBackgroundColor()
	 * 
	 * @param color
	 * @return
	 */
	public ImageViewTools backColor(int color) {
		imageView.setBackgroundColor(color);
		return this;
	}

	/**
	 * 对应setImageResource()
	 * 
	 * @param resId
	 * @return
	 */
	public ImageViewTools resId(int resId) {
		imageView.setImageResource(resId);
		return this;
	}

	/**
	 * 对应setImageBitmap()
	 * 
	 * @param bitmap
	 * @return
	 */
	public ImageViewTools bitmap(Bitmap bitmap) {
		imageView.setImageBitmap(bitmap);
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
	public ImageViewTools padding(double l, double t, double r, double b) {
		imageView.setPadding((int) l, (int) t, (int) r, (int) b);
		return this;
	}
}
