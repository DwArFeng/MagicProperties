package com.dwarfeng.magiprop.model.cfg;

import com.dwarfeng.dutil.basic.str.Name;

/**
 * ���ü���
 * @author  DwArFeng
 * @since 1.8
 */
public interface ConfigKey extends Name{

	/**
	 * ��ȡ�����ü�������ֵ�������
	 * @return ����ֵ�������
	 */
	public ConfigValueChecker getValueChecker();
	
}
