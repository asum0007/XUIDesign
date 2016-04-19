package com.asum.xuidesign.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.asum.xuidesign.interfaces.IUIDesigner;

/**
 * Activity界面设计者
 * 
 * @author Asum
 * 
 */
public class XDesigner {
	private XActivityDesigner activityDesigner;
	private XLayoutDesigner layoutDesigner;

	public IUIDesigner design(Activity activity, int layoutId) {
		activityDesigner = new XActivityDesigner();
		return activityDesigner.design(activity, layoutId, this);
	}

	public IUIDesigner design(ViewGroup layout, int layoutId, Object... values) {
		layoutDesigner = new XLayoutDesigner();
		return layoutDesigner.design(layout, layoutId, this, values);
	}

	public <T extends View> T getViewById(int id) {
		if (activityDesigner != null) {
			return activityDesigner.getViewById(id);
		} else if (layoutDesigner != null) {
			return layoutDesigner.getViewById(id);
		}
		return null;
	}

	public IUIDesigner getUiDesigner() {
		if (activityDesigner != null) {
			return activityDesigner.getUiDesigner();
		} else if (layoutDesigner != null) {
			return layoutDesigner.getUiDesigner();
		}
		return null;
	}

	public Context getContext() {
		if (activityDesigner != null) {
			return activityDesigner.getContext();
		} else if (layoutDesigner != null) {
			return layoutDesigner.getContext();
		}
		return null;
	}

	public ViewGroup getContentLayout() {
		return layoutDesigner.getMe();
	}

	public Activity getActivity() {
		return activityDesigner.getActivity();
	}
}
