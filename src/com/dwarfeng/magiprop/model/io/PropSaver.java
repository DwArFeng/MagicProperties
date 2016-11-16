package com.dwarfeng.magiprop.model.io;

import com.dwarfeng.magiprop.model.struct.PropLine;

/**
 * �����б�������
 * <p> �ýӿڶ����˽������б���ķ�����
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropSaver{
	
	/**
	 * 
	 * @param iterable
	 */
	public void save(Iterable<PropLine> iterable);
	
	/**
	 * 
	 * @param arr
	 */
	public default void save(PropLine[] arr){
		//TODO
	}

}
