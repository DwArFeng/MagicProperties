package com.dwarfeng.magiprop.view.obv;

import com.dwarfeng.magiprop.model.struct.PropLine;

/**
 * ���Ա�ǩ�۲�����
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLineObverser133 {
	
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
	 * ֪ͨ��ͼ�Ƴ�ĳһƬ��������Ա�ǩ��
	 * <p> �÷�����Ĭ��ʵ��Ч�ʵ��£�Ϊ�����Ч�ʣ�����д�÷�����
	 * @param fromIndex ��ʼ���±ꡣ
	 * @param toIndex �������±ꡣ
	 */
	public default void fireRemoved(int fromIndex, int toIndex){
		for(int i = fromIndex ; i <= toIndex ; i ++){
			fireRemoved(fromIndex);
		}
	}
	
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
