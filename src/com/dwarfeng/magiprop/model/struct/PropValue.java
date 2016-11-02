package com.dwarfeng.magiprop.model.struct;

/**
 * 属性值。
 * @author  DwArFeng
 * @since 1.8
 */
public final class PropValue {
	
	private final String value;
	
	/**
	 * 新实例。
	 * @param value 指定的值。
	 */
	public PropValue(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
}
