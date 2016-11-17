package com.dwarfeng.magiprop.model.vim;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.dwarfeng.magiprop.model.struct.PropLine;

/**
 * 属性行模型。
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLineModel extends List<PropLine>{
	
	/**
	 * 指定的属性行的键是否在所有相关的语言中都拥有。
	 * @param index 指定的序号对应的属性行。
	 * @return 对应的属性行的键是否在所有相关的语言中都拥有
	 * @throws IndexOutOfBoundsException 序号越界。 
	 */
	public boolean isComplete(int index);
	
	/**
	 * 指定的属性行的键是否在至少一个相关的语言中不拥有。
	 * @param index 指定的序号对应的属性行。
	 * @return 对应的属性行的键是否在至少一个相关的语言中不拥有。
	 * @throws IndexOutOfBoundsException 序号越界。
	 */
	public default boolean nonComplete(int index){
		return ! isComplete(index);
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Set<Locale> getIncompleteLocales(int index);

}
