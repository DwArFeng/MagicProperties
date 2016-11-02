package com.dwarfeng.magiprop.model.vim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

import com.dwarfeng.magiprop.model.struct.PropLabel;
import com.dwarfeng.magiprop.view.obv.PropLabelObverser;

/**
 * 属性标签模型。
 * @author  DwArFeng
 * @since 1.8
 */
public final class PropLabelModel {
	
	private final Set<PropLabelObverser> obversers = Collections.newSetFromMap(new WeakHashMap<>());
	
	private final List<PropLabel> list = new ArrayList<>();
	
	/**
	 * 新实例。
	 */
	public PropLabelModel() {}
	
	/**
	 * 向模型中添加指定的属性标签。
	 * @param propLabel 指定的属性标签。
	 * @throws NullPointerException 入口参数为 <code>null</code>。
	 */
	public void add(PropLabel propLabel){
		Objects.requireNonNull(propLabel, "入口参数 propLabel 不能为 null。");
		int index = list.size();
		list.add(propLabel);
		for(PropLabelObverser obverser : obversers){
			if(Objects.nonNull(obverser)){
				obverser.fireAdded(index, propLabel);
			}
		}
	}
	
	/**
	 * 在指定的位置添加指定的属性标签。
	 * @param index 指定的位置。
	 * @param propLabel 指定的属性标签。
	 * @throws NullPointerException 入口参数为 null。
	 * @throws IndexOutOfBoundsException 序号越界。
	 */
	public void add(int index, PropLabel propLabel){
		Objects.requireNonNull(propLabel, "入口参数 propLabel 不能为 null。");
		list.add(index, propLabel);
		for(PropLabelObverser obverser : obversers){
			if(Objects.nonNull(obverser)){
				obverser.fireAdded(index, propLabel);
			}
		}
	}
	
	/**
	 * 在指定的位置移除属性标签。
	 * @param index 指定的位置。
	 * @throws IndexOutOfBoundsException 序号越界。
	 */
	public void remove(int index){
		list.remove(index);
		for(PropLabelObverser obverser : obversers){
			if(Objects.nonNull(obverser)){
				obverser.fireRemoved(index);
			}
		}
	}
	
	/**
	 * 清除模型中的数据。
	 */
	public void clear(){
		list.clear();
		for(PropLabelObverser obverser : obversers){
			if(Objects.nonNull(obverser)){
				obverser.fireCleared();
			}
		}
	}

}
