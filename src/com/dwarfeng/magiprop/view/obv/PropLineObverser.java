package com.dwarfeng.magiprop.view.obv;

import com.dwarfeng.magiprop.model.struct.PropLine;

/**
 * ���Ա�ǩ�۲�����
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLineObverser {
	
	/**
	 * ֪ͨ��ͼ������Ա�ǩ��
	 * @param index ָ������š�
	 * @param propLabel ָ�������Ա�ǩ��
	 */
	public void fireAdded(int index, PropLine propLabel);
	
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
	public void fireChanged(int index, PropLine propLabel);
	
	/**
	 * ֪ͨ��ͼ���Ա�ǩ��ա�
	 */
	public void fireCleared();

}
