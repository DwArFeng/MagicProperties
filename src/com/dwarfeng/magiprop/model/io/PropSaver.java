package com.dwarfeng.magiprop.model.io;

import java.util.Locale;

import com.dwarfeng.magiprop.model.struct.CommentPropLabel;
import com.dwarfeng.magiprop.model.struct.PropValue;
import com.dwarfeng.magiprop.model.struct.TextPropLabel;

/**
 * 属性保存器。
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropSaver {
	
	/**
	 * 保存注释标签。
	 * @param commentPropLabel 指定的注释标签。
	 * @throws NullPointerException 入口参数为 <code>null</code>。
	 */
	public void saveComment(CommentPropLabel commentPropLabel);
	
	/**
	 * 保存正文标签。
	 * @param propLabel 指定的正文标签。
	 * @param value 指定的值。
	 * @param locale 指定的地区。
	 */
	/**
	 * 保存正文标签。
	 * @param textPropLabel 指定的正文标签。
	 * @param value 指定的值。
	 * @param locale 指定的地区。
	 * @throws NullPointerException 入口参数为 <code>null</code>。
	 */
	public void saveText(TextPropLabel textPropLabel, PropValue value, Locale locale);

}
