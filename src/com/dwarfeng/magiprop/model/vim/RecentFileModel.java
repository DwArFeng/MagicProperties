package com.dwarfeng.magiprop.model.vim;

import java.io.File;
import java.util.List;

import com.dwarfeng.magiprop.view.obv.ObverserSet;
import com.dwarfeng.magiprop.view.obv.RecentFileObverser;

/**
 * 近期文件模型。
 * @author DwArFeng
 * @since 1.8
 */
public interface RecentFileModel extends List<File>, ObverserSet<RecentFileObverser>{

	/**
	 * 获取该近期文件模型最多能记录多少个文件。
	 * @return 最多能记录多少个文件。
	 */
	public int getLimit();
	
	/**
	 * 设置该近期文件模型中最多能记录多少个文件。
	 * <p> 如果新的限制比原有的限制要小，则模型会放弃多于的文件。
	 * @param limit 记录文件的限制。
	 * @throws IllegalArgumentException 入口参数小于0。
	 */
	public void setLimit(int limit);
	
	/**
	 * 返回模型中实际有多少个近期文件。
	 * <p> 对于任意的近期文件模型，恒有<code>getSize() <= getLimit()</code>。模型中的实际近期文件数量。
	 * @return 
	 */
	@Override
	public int size();
	
}
