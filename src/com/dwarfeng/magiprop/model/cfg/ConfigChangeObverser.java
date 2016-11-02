package com.dwarfeng.magiprop.model.cfg;

import java.util.Set;

/**
 * 配置值改变观察器。
 * @author  DwArFeng
 * @since 1.8
 */
public interface ConfigChangeObverser {
	
	/**
	 * 返回该观察器感兴趣的键列表。
	 * <p> 注意，如果该观察器没有感兴趣的键，应该返回一个大小为<code>0</code>的集合，而不是 <code>null</code>。
	 * @return 该观察器感兴趣的键列表。
	 */
	public Set<ConfigKey> getInterestedKeys();
	
	/**
	 * 通知观察器某个键发生了改变。
	 * <p> 可以保证入口参数 key 指示的键都永远是 {@link #getInterestedKeys()} 键集的其中之一。
	 * @param key 指定的键。
	 * @param value 改变后的新值。
	 */
	public void fireKeyChange(ConfigKey key, String value);

}
