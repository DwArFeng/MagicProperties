package com.dwarfeng.magiprop.model.io;

import java.util.Locale;

import com.dwarfeng.magiprop.model.struct.CommentPropLabel;
import com.dwarfeng.magiprop.model.struct.PropValue;
import com.dwarfeng.magiprop.model.struct.TextPropLabel;

/**
 * ���Ա�������
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropSaver {
	
	/**
	 * ����ע�ͱ�ǩ��
	 * @param commentPropLabel ָ����ע�ͱ�ǩ��
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>��
	 */
	public void saveComment(CommentPropLabel commentPropLabel);
	
	/**
	 * �������ı�ǩ��
	 * @param propLabel ָ�������ı�ǩ��
	 * @param value ָ����ֵ��
	 * @param locale ָ���ĵ�����
	 */
	/**
	 * �������ı�ǩ��
	 * @param textPropLabel ָ�������ı�ǩ��
	 * @param value ָ����ֵ��
	 * @param locale ָ���ĵ�����
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>��
	 */
	public void saveText(TextPropLabel textPropLabel, PropValue value, Locale locale);

}
