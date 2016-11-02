package com.dwarfeng.magiprop.model.cfg;

import com.dwarfeng.dutil.basic.str.Name;

/**
 * 配置键。
 * @author  DwArFeng
 * @since 1.8
 */
public interface ConfigKey extends Name{

	/**
	 * 获取该配置键的配置值检查器。
	 * @return 配置值检查器。
	 */
	public ConfigValueChecker getValueChecker();
	
}
