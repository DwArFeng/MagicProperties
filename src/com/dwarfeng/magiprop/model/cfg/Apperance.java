package com.dwarfeng.magiprop.model.cfg;

/**
 * 程序的外观接口。
 * <p> 该接口可以提供程序所需的文本字段、图片等等。
 * @author DwArFeng
 * @since 1.8
 */
public interface Apperance {

	/**
	 * 
	 * @param key
	 * @return
	 * @throws NullPointerException 入口参数为 <code>null</code>。
	 */
	public String getString(StringFieldKey key);
	
}
