package com.dwarfeng.magiprop.view.obv;

import com.dwarfeng.magiprop.model.struct.PropLabel;

/**
 * 属性标签观察器。
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLabelObverser {
	
	/**
	 * 通知视图添加属性标签。
	 * @param index 指定的序号。
	 * @param propLabel 指定的属性标签。
	 */
	public void fireAdded(int index, PropLabel propLabel);
	
	/**
	 * 通知视图移除属性标签。
	 * @param index 指定的序号。
	 */
	public void fireRemoved(int index);
	
	/**
	 * 通知视图更改属性标签。
	 * @param index 指定的序号。
	 * @param propLabel 指定的属性标签。
	 */
	public void fireChanged(int index, PropLabel propLabel);
	
	/**
	 * 通知视图属性标签清空。
	 */
	public void fireCleared();

}
