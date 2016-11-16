package com.dwarfeng.magiprop.model.vim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

import com.dwarfeng.magiprop.model.struct.PropLine;
import com.dwarfeng.magiprop.view.obv.PropLineObverser;

/**
 * ���Ա�ǩģ�͡�
 * @author  DwArFeng
 * @since 1.8
 */
public final class PropLineModel133 {
	
	private final Set<PropLineObverser> obversers = Collections.newSetFromMap(new WeakHashMap<>());
	
	private final List<PropLine> list = new ArrayList<>();
	
	/**
	 * ��ʵ����
	 */
	public PropLineModel133() {}
	
	/**
	 * ��ģ�������ָ�������Ա�ǩ��
	 * @param propLabel ָ�������Ա�ǩ��
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>��
	 */
	public void add(PropLine propLabel){
		Objects.requireNonNull(propLabel, "��ڲ��� propLabel ����Ϊ null��");
		int index = list.size();
		list.add(propLabel);
		for(PropLineObverser obverser : obversers){
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
	public void add(int index, PropLine propLabel){
		Objects.requireNonNull(propLabel, "��ڲ��� propLabel ����Ϊ null��");
		list.add(index, propLabel);
		for(PropLineObverser obverser : obversers){
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
		for(PropLineObverser obverser : obversers){
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
		for(PropLineObverser obverser : obversers){
			if(Objects.nonNull(obverser)){
				obverser.fireCleared();
			}
		}
	}

}
