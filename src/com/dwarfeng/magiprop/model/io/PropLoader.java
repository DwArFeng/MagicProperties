package com.dwarfeng.magiprop.model.io;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import com.dwarfeng.magiprop.model.struct.PropLabel;
import com.dwarfeng.magiprop.model.struct.PropValue;
import com.dwarfeng.magiprop.model.struct.TextPropLabel;

/**
 * 属性读取器。
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLoader {
	
	/**
	 * 读取标签。
	 * @return 读取标签。
	 * @throws IO异常。
	 */
	public List<PropLabel> loadLabels() throws IOException;
	
	/**
	 * 读取指定正文标签在指定的语言处对应的值。
	 * @param textPropLabel 指定的正文标签。
	 * @param locale 指定的语言。
	 * @return 指定的值。
	 * @throws NullPointerException 入口参数为 <code>null</code>。
	 */
	public PropValue loadValue(TextPropLabel textPropLabel, Locale locale);

}
