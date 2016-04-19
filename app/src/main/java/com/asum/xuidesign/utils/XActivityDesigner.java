package com.asum.xuidesign.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.asum.xuidesign.interfaces.IUIDesigner;

public class XActivityDesigner {
	private Context context;
	private Activity activity;
	private ActivityViewList viewList;
	private IUIDesigner uiDesigner;

	public IUIDesigner design(Activity activity, int layoutId, XDesigner designer) {
		this.activity = activity;

		initializeViews(layoutId);
		initializeDesigner(designer);

		return uiDesigner;
	}

	public <T extends View> T getViewById(int id) {
		return viewList.getViewById(id).getView();
	}

	public IUIDesigner getUiDesigner() {
		return uiDesigner;
	}

	private void initializeViews(int layoutId) {
		activity.setContentView(layoutId);

		context = activity.getWindow().getContext();
		viewList = new ActivityViewList(activity);
	}

	private void initializeDesigner(XDesigner designer) {
		String activityName = activity.getClass().getSimpleName();
		String designerName = activity.getClass().getPackage().getName() + ".designer." + activityName + "Designer";

		try {
			Class<?> designerClass = Class.forName(designerName);
			uiDesigner = (IUIDesigner) designerClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (uiDesigner != null) {
			uiDesigner.design(designer, activity.getIntent());
		}
	}

	public Context getContext() {
		return context;
	}

	public Activity getActivity() {
		return activity;
	}
}
