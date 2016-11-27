package com.dwarfeng.magiprop.model.io;

import com.dwarfeng.magiprop.model.struct.Propline;

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
	public void save(Iterable<Propline> iterable);
	
	/**
	 * 
	 * @param arr
	 */
	public default void save(Propline[] arr){
		//TODO
	}

}
