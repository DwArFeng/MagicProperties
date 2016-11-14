package com.dwarfeng.magiprop.model.struct;

/**
 * 属性行。
 * <p> 属性字段是 .properties 文件中的行。比如：
 * <blockquote>
 * <code>
 * #注释行<br>
 * Properties_0 = 123<br>
 * （空行）<br>
 * Properties_1 = 456
 * </code>
 * </blockquote>
 * @author DwArFeng
 * @since 1.8
 */
public interface PropLine {
	
	/**
	 * 返回属性行的内容。
	 * <p> 该文本与 .porperties 文件中的内容是一致的。
	 * <blockquote>
	 * 注释以 #开头<br>
	 * 正文呈现 <code>%s = %s</code>的形式。<br>
	 * 空白行为<code>""</code>
	 * </blockquote>
	 * @return 属性行的内容。
	 */
	public String getContent();
	
	/**
	 * 返回属性行的类型。
	 * @return 属性行的类型。
	 */
	public PropLineType getType();
	
	
}
