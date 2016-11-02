package com.dwarfeng.magiprop.model.struct;

import java.util.Objects;

/**
 * ���Ա�ǩ��
 * @author DwArFeng
 * @since 1.8
 */
public final class PropLabel {
	
	/**
	 * ָʾ���Ա�ǩ�����ͣ���ע�ͺ������������͡�
	 * @author  DwArFeng
	 * @since 1.8
	 */
	public enum PropType{
		/**ע��*/
		COMMENT,
		/**����*/
		TEXT,
	}
	
	private final String content;
	private final PropType type;
	
	/**
	 * ��ʵ����
	 * @param content ���ݡ�
	 * @param type ���͡�
	 * @throws NullPointerException ��ڲ���Ϊ null��
	 */
	public PropLabel(String content, PropType type) {
		Objects.requireNonNull(content, "��ڲ��� content ����Ϊ null��");
		Objects.requireNonNull(type, "��ڲ��� type ����Ϊ null��");
		
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
