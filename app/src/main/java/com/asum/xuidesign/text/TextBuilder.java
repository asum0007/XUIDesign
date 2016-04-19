package com.asum.xuidesign.text;

import java.util.ArrayList;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

import com.asum.xuidesign.vo.TextBuilderVo;

public class TextBuilder {
	private ArrayList<TextBuilderVo> textBuilderVos;

	/**
	 * 添加一个段
	 * 
	 * @param type
	 *            该段字体模式，例如：Typeface.NORMAL，-1代表正常模式
	 * @param textSize
	 *            该段字体大小
	 * @param color
	 *            该段字体颜色
	 * @param length
	 *            该段长度
	 * @return
	 */
	public TextBuilder add(int type, double textSize, int color, int length) {
		if (textBuilderVos == null) {
			textBuilderVos = new ArrayList<TextBuilderVo>();
		}

		TextBuilderVo textBuilderVo = new TextBuilderVo();
		if (type == -1) {
			textBuilderVo.setType(Typeface.NORMAL);
		} else {
			textBuilderVo.setType(type);
		}
		textBuilderVo.setTextSize(textSize);
		textBuilderVo.setColor(color);
		textBuilderVo.setLength(length);
		textBuilderVos.add(textBuilderVo);

		return this;
	}

	public TextBuilder clear() {
		if (textBuilderVos != null) {
			textBuilderVos.clear();
		}
		return this;
	}

	public TextBuilder build(TextView textView) {
		dispostText(textView, textView.getText().toString());
		return this;
	}

	public TextBuilder build(TextView textView, String text) {
		dispostText(textView, text);
		return this;
	}

	private void dispostText(TextView textView, String text) {
		if (textBuilderVos != null) {
			SpannableStringBuilder spanBuilder = new SpannableStringBuilder(text);

			for (int i = 0; i < textBuilderVos.size(); i++) {
				TextBuilderVo textBuilderVo = textBuilderVos.get(i);
				int start = 0;
				for (int j = 0; j < i; j++) {
					start += textBuilderVos.get(j).getLength();
				}

				ColorStateList color = ColorStateList.valueOf(textBuilderVo.getColor());
				TextAppearanceSpan span = new TextAppearanceSpan(null, textBuilderVo.getType(), (int) textBuilderVo.getTextSize(), color, null);
				spanBuilder.setSpan(span, start, textBuilderVo.getLength() + start, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
			}

			textView.setText(spanBuilder);
		}
	}
}
