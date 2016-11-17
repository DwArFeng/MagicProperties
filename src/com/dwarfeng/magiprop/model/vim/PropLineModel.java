package com.dwarfeng.magiprop.model.vim;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.dwarfeng.magiprop.model.struct.PropLine;

/**
 * ������ģ�͡�
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLineModel extends List<PropLine>{
	
	/**
	 * ָ���������еļ��Ƿ���������ص������ж�ӵ�С�
	 * @param index ָ������Ŷ�Ӧ�������С�
	 * @return ��Ӧ�������еļ��Ƿ���������ص������ж�ӵ��
	 * @throws IndexOutOfBoundsException ���Խ�硣 
	 */
	public boolean isComplete(int index);
	
	/**
	 * ָ���������еļ��Ƿ�������һ����ص������в�ӵ�С�
	 * @param index ָ������Ŷ�Ӧ�������С�
	 * @return ��Ӧ�������еļ��Ƿ�������һ����ص������в�ӵ�С�
	 * @throws IndexOutOfBoundsException ���Խ�硣
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
