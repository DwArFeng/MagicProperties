package com.dwarfeng.magiprop.model.struct;

import java.util.Objects;

/**
 * ע�ͱ�ǩ��
 * @author  DwArFeng
 * @since 1.8
 */
public final class CommentPropLabel implements PropLabel{

	private final String label;
	
	/**
	 * ��ʵ����
	 * @param label ָ���ı�ǩ��
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>��
	 */
	public CommentPropLabel(String label) {
		Objects.requireNonNull(label, "��ڲ��� label ����Ϊ null��");
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
