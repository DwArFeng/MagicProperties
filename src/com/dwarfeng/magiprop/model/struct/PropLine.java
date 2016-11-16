package com.dwarfeng.magiprop.model.struct;

import java.util.Objects;

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
	 * <p> 需要保证该方法恒不返回 <code>null</code>。
	 * @return 属性行的内容。
	 */
	public String getContent();
	
	/**
	 * 返回属性行的类型。
	 * @return 属性行的类型。
	 */
	public PropLineType getType();
	
	/**
	 * 返回该属性行对象的键。
	 * <p> 注释、空值、错误值的键等于其内容。
	 * <p> 该方法恒不返回 <code>null</code>。
	 * @return 对象的键。
	 */
	public String getKey();
	
	/**
	 * 获取该属性行的值。
	 * <p> 如果该属性行中没有值，则返回 <code>null</code>。
	 * @return 该属性行的值。
	 */
	public String getValue();
	
	/**
	 * 判断该属性行是否有值。
	 * @return 该属性行是否有值。
	 */
	public boolean hasValue();
	
	/**
	 * 判断两行属性行是否相等。
	 * <p> 当且仅当 obj 属于 PropLine 接口且 <code>this.getContent().equals((PropLine) obj) == true</code>时，该方法返回 <code>true</code>。
	 * @param obj 指定的对象。
	 * @return 该对象是否与指定的对象相等。
	 */
	@Override
	public boolean equals(Object obj);
	
	/**
	 * 返回该对象的哈希值。
	 * @return 对象的哈希值。
	 */
	@Override
	public int hashCode();
	
	/**
	 * 重写该方法，以便于直观的表示对象，通常，可重写为：
	 * <blockquote>
	 * <code>
	 * <pre>
	 * public String toString(){
	 * 	return getContent();
	 * }
	 * </pre>
	 * </code>
	 * </blockquote>
	 * @return 返回该对象的文本表示。
	 */
	@Override
	public String toString();
	
}
