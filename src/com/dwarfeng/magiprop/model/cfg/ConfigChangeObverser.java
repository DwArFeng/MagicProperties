package com.dwarfeng.magiprop.model.cfg;

import java.util.Set;

/**
 * ����ֵ�ı�۲�����
 * @author  DwArFeng
 * @since 1.8
 */
public interface ConfigChangeObverser {
	
	/**
	 * ���ظù۲�������Ȥ�ļ��б�
	 * <p> ע�⣬����ù۲���û�и���Ȥ�ļ���Ӧ�÷���һ����СΪ<code>0</code>�ļ��ϣ������� <code>null</code>��
	 * @return �ù۲�������Ȥ�ļ��б�
	 */
	public Set<ConfigKey> getInterestedKeys();
	
	/**
	 * ֪ͨ�۲���ĳ���������˸ı䡣
	 * <p> ���Ա�֤��ڲ��� key ָʾ�ļ�����Զ�� {@link #getInterestedKeys()} ����������֮һ��
	 * @param key ָ���ļ���
	 * @param value �ı�����ֵ��
	 */
	public void fireKeyChange(ConfigKey key, String value);

}
