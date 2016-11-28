package com.dwarfeng.magiprop.view.obv;

import java.util.Set;

import javax.naming.OperationNotSupportedException;

/**
 * �۲������ϡ�
 * <p> ʵ�ָýӿ���ζ���ܹ���������ӡ��Ƴ�������۲�����Ҳ���Ա��������е����й۲�����
 * @author DwArFeng
 * @since 1.8
 */
public interface ObverserSet<T extends Obverser>{

	/**
	 * �Լ��ϵ���ʽ���ظù۲������ϡ�
	 * <p> �ü���Ϊֻ�����ϣ������κ��޸ķ��������׳� {@link OperationNotSupportedException}��
	 * @return ������ʽ�Ĺ۲������ϡ�
	 */
	public Set<T> getObversers();
	
	/**
	 * ��������ģ������ӹ۲�����
	 * @param obverser ָ���Ĺ۲�����
	 * @return �ö����Ƿ������˹۲������ϵĸı䡣
	 */
	public boolean addObverser(T obverser);
	
	/**
	 * ��������ģ�����Ƴ��۲�����
	 * @param obverser ָ���Ĺ۲�����
	 * @return �ö����Ƿ������˹۲������ϵĸı䡣
	 */
	public boolean removeObverser(T obverser);
	
	/**
	 * ��������ģ�����Ƴ����й۲�����
	 */
	public void clearObverser();
	
}
