package com.asum.xuidesign.utils;

import java.util.ArrayList;

import android.view.ViewGroup;

import com.asum.xuidesign.vo.TViewVo;

public class LayoutViewList {
	private ArrayList<TViewVo> views;

	public LayoutViewList(ViewGroup layout) {
		views = getAllChildViews(layout);
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

	public ArrayList<TViewVo> getAllChildViews(ViewGroup layout) {
		TViewVo view = new TViewVo();
		view.setView(layout.getChildAt(0));
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
		views.add(view);
		return views;
	}
}
