package com.dwarfeng.magiprop.model.struct;

/**
 * ����ֵ��
 * @author  DwArFeng
 * @since 1.8
 */
public final class PropValue {
	
	private final String value;
	
	/**
	 * ��ʵ����
	 * @param value ָ����ֵ��
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
