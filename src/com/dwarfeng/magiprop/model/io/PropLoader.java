package com.dwarfeng.magiprop.model.io;

import java.io.IOException;
import java.util.List;

import com.dwarfeng.magiprop.model.struct.Propline;

/**
 * 属性读取器。
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLoader {
	
	/**
	 * 读取标签。
	 * @return 读取标签。
	 * @throws IO异常。
	 */
	public List<Propline> loadLabels() throws IOException;

}
