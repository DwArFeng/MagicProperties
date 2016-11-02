package com.dwarfeng.magiprop.model.struct;

import java.util.Objects;

/**
 * 正文标签
 * @author  DwArFeng
 * @since 1.8
 */
public final class TextPropLabel implements PropLabel{

	private final String label;
	
	/**
	 * 新实例。
	 * @param label 指定的标签。
	 * @throws NullPointerException 入口参数为 <code>null</code>。
	 */
	public TextPropLabel(String label) {
		Objects.requireNonNull(label, "入口参数 label 不能为 null。");
		this.label = label;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.dwarfeng.magiprop.model.struct.PropLabel#getLabel()
	 */
	@Override
	public String getLabel() {
		return this.label;
	}

	
	
}
