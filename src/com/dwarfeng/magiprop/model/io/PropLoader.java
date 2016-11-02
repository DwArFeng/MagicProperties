package com.dwarfeng.magiprop.model.io;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import com.dwarfeng.magiprop.model.struct.PropLabel;
import com.dwarfeng.magiprop.model.struct.PropValue;
import com.dwarfeng.magiprop.model.struct.TextPropLabel;

/**
 * ���Զ�ȡ����
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLoader {
	
	/**
	 * ��ȡ��ǩ��
	 * @return ��ȡ��ǩ��
	 * @throws IO�쳣��
	 */
	public List<PropLabel> loadLabels() throws IOException;
	
	/**
	 * ��ȡָ�����ı�ǩ��ָ�������Դ���Ӧ��ֵ��
	 * @param textPropLabel ָ�������ı�ǩ��
	 * @param locale ָ�������ԡ�
	 * @return ָ����ֵ��
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>��
	 */
	public PropValue loadValue(TextPropLabel textPropLabel, Locale locale);

}
