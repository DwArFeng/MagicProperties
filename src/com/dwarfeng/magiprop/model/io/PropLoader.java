package com.dwarfeng.magiprop.model.io;

import java.io.IOException;
import java.util.List;

import com.dwarfeng.magiprop.model.struct.Propline;

/**
 * ���Զ�ȡ����
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLoader {
	
	/**
	 * ��ȡ��ǩ��
	 * @return ��ȡ��ǩ��
	 * @throws IO�쳣��
	 */
	public List<Propline> loadLabels() throws IOException;

}
