package com.asum.xuidesign.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asum.xuidesign.interfaces.IUIDesigner;

public class XLayoutDesigner {
	private Context context;
	private ViewGroup layout;
	private LayoutViewList viewList;
	private IUIDesigner uiDesigner;

	public IUIDesigner design(ViewGroup layout, int layoutId, XDesigner designer, Object... values) {
		this.layout = layout;
		initializeViews(layoutId);
		initializeDesigner(designer, values);

		return uiDesigner;
	}

	public <T extends View> T getViewById(int id) {
		return viewList.getViewById(id).getView();
	}

	public IUIDesigner getUiDesigner() {
		return uiDesigner;
	}

	private void initializeViews(int layoutId) {
		if (layoutId != -1) {
			LayoutInflater inflater = LayoutInflater.from(layout.getContext());
			View mainView = inflater.inflate(layoutId, null);
			layout.addView(mainView);
		}

		context = layout.getContext();
		viewList = new LayoutViewList(layout);
	}

	private void initializeDesigner(XDesigner designer, Object... values) {
		String activityName = layout.getClass().getSimpleName();
		String designerName = layout.getClass().getPackage().getName() + ".designer." + activityName + "Designer";

		try {
			Class<?> designerClass = Class.forName(designerName);
			uiDesigner = (IUIDesigner) designerClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (uiDesigner != null) {
			uiDesigner.design(designer, values);
		}
	}

	public Context getContext() {
		return context;
	}

	public ViewGroup getMe() {
		return layout;
	}
}
