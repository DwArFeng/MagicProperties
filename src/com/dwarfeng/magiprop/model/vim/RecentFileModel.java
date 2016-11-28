package com.dwarfeng.magiprop.model.vim;

import java.io.File;
import java.util.List;

import com.dwarfeng.magiprop.view.obv.ObverserSet;
import com.dwarfeng.magiprop.view.obv.RecentFileObverser;

/**
 * �����ļ�ģ�͡�
 * @author DwArFeng
 * @since 1.8
 */
public interface RecentFileModel extends List<File>, ObverserSet<RecentFileObverser>{

	/**
	 * ��ȡ�ý����ļ�ģ������ܼ�¼���ٸ��ļ���
	 * @return ����ܼ�¼���ٸ��ļ���
	 */
	public int getLimit();
	
	/**
	 * ���øý����ļ�ģ��������ܼ�¼���ٸ��ļ���
	 * <p> ����µ����Ʊ�ԭ�е�����ҪС����ģ�ͻ�������ڵ��ļ���
	 * @param limit ��¼�ļ������ơ�
	 * @throws IllegalArgumentException ��ڲ���С��0��
	 */
	public void setLimit(int limit);
	
	/**
	 * ����ģ����ʵ���ж��ٸ������ļ���
	 * <p> ��������Ľ����ļ�ģ�ͣ�����<code>getSize() <= getLimit()</code>��ģ���е�ʵ�ʽ����ļ�������
	 * @return 
	 */
	@Override
	public int size();
	
}
