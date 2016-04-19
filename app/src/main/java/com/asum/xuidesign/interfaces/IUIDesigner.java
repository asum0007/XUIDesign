package com.asum.xuidesign.interfaces;

import android.content.Intent;

import com.asum.xuidesign.utils.XDesigner;

public interface IUIDesigner {
	public void design(XDesigner designer, Intent intent);

	public void design(XDesigner designer, Object... values);
}
