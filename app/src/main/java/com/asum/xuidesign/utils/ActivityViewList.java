package com.asum.xuidesign.utils;

import android.app.Activity;
import android.view.ViewGroup;

import com.asum.xuidesign.vo.TViewVo;

import java.util.ArrayList;

public class ActivityViewList {
	private ArrayList<TViewVo> views;

	public ActivityViewList(Activity activity) {
		views = getAllChildViews(activity);
	}

	public ArrayList<TViewVo> getViews() {
		return views;
	}

	public TViewVo getViewById(int id) {
		for (int i = 0; i < views.size(); i++) {
			if (views.get(i).getView().getId() == id) {
				return views.get(i);
			}
		}
		return null;
	}

	public ArrayList<TViewVo> getAllChildViews(Activity activity) {
		TViewVo view = new TViewVo();
		view.setView(activity.getWindow().getDecorView());
		return getAllChildViews(view);
	}

	private ArrayList<TViewVo> getAllChildViews(TViewVo view) {
		ArrayList<TViewVo> views = new ArrayList<TViewVo>();
		if (view.getView() instanceof ViewGroup) {
			ViewGroup vp = (ViewGroup) view.getView();
			for (int i = 0; i < vp.getChildCount(); i++) {
				TViewVo viewchild = new TViewVo();
				viewchild.setView(vp.getChildAt(i));
				views.add(viewchild);
				views.addAll(getAllChildViews(viewchild));
			}
		}
		return views;
	}
}
