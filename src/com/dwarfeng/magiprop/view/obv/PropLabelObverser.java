package com.dwarfeng.magiprop.view.obv;

import com.dwarfeng.magiprop.model.struct.PropLabel;

/**
 * ���Ա�ǩ�۲�����
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLabelObverser {
	
	/**
	 * ֪ͨ��ͼ������Ա�ǩ��
	 * @param index ָ������š�
	 * @param propLabel ָ�������Ա�ǩ��
	 */
	public void fireAdded(int index, PropLabel propLabel);
	
	/**
	 * ֪ͨ��ͼ�Ƴ����Ա�ǩ��
	 * @param index ָ������š�
	 */
	public void fireRemoved(int index);
	
	/**
	 * ֪ͨ��ͼ�������Ա�ǩ��
	 * @param index ָ������š�
	 * @param propLabel ָ�������Ա�ǩ��
	 */
	public void fireChanged(int index, PropLabel propLabel);
	
	/**
	 * ֪ͨ��ͼ���Ա�ǩ��ա�
	 */
	public void fireCleared();

}
