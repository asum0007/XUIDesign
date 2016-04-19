package com.asum.xuidesign.vo;

import android.view.View;

public class TViewVo {
	private View view;

	@SuppressWarnings("unchecked")
	public <T extends View> T getView() {
		return (T) view;
	}

	public void setView(View view) {
		this.view = view;
	}
}
