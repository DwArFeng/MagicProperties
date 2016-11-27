package com.dwarfeng.magiprop.view.obv;

import com.dwarfeng.magiprop.model.struct.Propline;

/**
 * 属性标签观察器。
 * @author  DwArFeng
 * @since 1.8
 */
public interface ProplineObverser133 {
	
	/**
	 * 通知视图添加属性标签。
	 * @param index 指定的序号。
	 * @param propLabel 指定的属性标签。
	 */
	public void fireAdded(int index, Propline propLabel);
	
	/**
	 * 通知视图移除属性标签。
	 * @param index 指定的序号。
	 */
	public void fireRemoved(int index);
	
	/**
	 * 通知视图移除某一片区域的属性标签。
	 * <p> 该方法的默认实现效率低下，为了提高效率，请重写该方法。
	 * @param fromIndex 开始的下标。
	 * @param toIndex 结束的下标。
	 */
	public default void fireRemoved(int fromIndex, int toIndex){
		for(int i = fromIndex ; i <= toIndex ; i ++){
			fireRemoved(fromIndex);
		}
	}
	
	/**
	 * 通知视图更改属性标签。
	 * @param index 指定的序号。
	 * @param propLabel 指定的属性标签。
	 */
	public void fireChanged(int index, Propline propLabel);
	
	/**
	 * 通知视图属性标签清空。
	 */
	public void fireCleared();

}
