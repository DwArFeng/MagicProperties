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
 * ���Ա�ǩģ�͡�
 * @author  DwArFeng
 * @since 1.8
 */
public final class PropLabelModel {
	
	private final Set<PropLabelObverser> obversers = Collections.newSetFromMap(new WeakHashMap<>());
	
	private final List<PropLabel> list = new ArrayList<>();
	
	/**
	 * ��ʵ����
	 */
	public PropLabelModel() {}
	
	/**
	 * ��ģ�������ָ�������Ա�ǩ��
	 * @param propLabel ָ�������Ա�ǩ��
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>��
	 */
	public void add(PropLabel propLabel){
		Objects.requireNonNull(propLabel, "��ڲ��� propLabel ����Ϊ null��");
		int index = list.size();
		list.add(propLabel);
		for(PropLabelObverser obverser : obversers){
			if(Objects.nonNull(obverser)){
				obverser.fireAdded(index, propLabel);
			}
		}
	}
	
	/**
	 * ��ָ����λ�����ָ�������Ա�ǩ��
	 * @param index ָ����λ�á�
	 * @param propLabel ָ�������Ա�ǩ��
	 * @throws NullPointerException ��ڲ���Ϊ null��
	 * @throws IndexOutOfBoundsException ���Խ�硣
	 */
	public void add(int index, PropLabel propLabel){
		Objects.requireNonNull(propLabel, "��ڲ��� propLabel ����Ϊ null��");
		list.add(index, propLabel);
		for(PropLabelObverser obverser : obversers){
			if(Objects.nonNull(obverser)){
				obverser.fireAdded(index, propLabel);
			}
		}
	}
	
	/**
	 * ��ָ����λ���Ƴ����Ա�ǩ��
	 * @param index ָ����λ�á�
	 * @throws IndexOutOfBoundsException ���Խ�硣
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
	 * ���ģ���е����ݡ�
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
