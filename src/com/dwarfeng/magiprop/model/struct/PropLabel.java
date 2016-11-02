package com.dwarfeng.magiprop.model.struct;

import java.util.Objects;

/**
 * 属性标签。
 * @author DwArFeng
 * @since 1.8
 */
public final class PropLabel {
	
	/**
	 * 指示属性标签的类型，有注释和正文两个类型。
	 * @author  DwArFeng
	 * @since 1.8
	 */
	public enum PropType{
		/**注释*/
		COMMENT,
		/**正文*/
		TEXT,
	}
	
	private final String content;
	private final PropType type;
	
	/**
	 * 新实例。
	 * @param content 内容。
	 * @param type 类型。
	 * @throws NullPointerException 入口参数为 null。
	 */
	public PropLabel(String content, PropType type) {
		Objects.requireNonNull(content, "入口参数 content 不能为 null。");
		Objects.requireNonNull(type, "入口参数 type 不能为 null。");
		
		this.content = content;
		this.type = type;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the type
	 */
	public PropType getType() {
		return type;
	}

}
