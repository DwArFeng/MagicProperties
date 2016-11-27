package com.dwarfeng.magiprop.model.io;

import com.dwarfeng.magiprop.model.struct.Propline;

/**
 * 属性行保存器。
 * <p> 该接口定义了将属性行保存的方法。
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
