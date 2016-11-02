package com.dwarfeng.magiprop.model.cfg;

import java.util.Map;
import java.util.Objects;

/**
 * 配置映射。
 * @author  DwArFeng
 * @since 1.8
 */
public interface ConfigMap extends Map<ConfigKey, String> {
	
	/**
	 * 返回指定的键对应的值否合法。
	 * @param configKey 指定的键。
	 * @return 指定的键对应的值是否合法。
	 * @throws NullPointerException 入口参数为 <code>null</code>，或者配置键的值检查器为 <code>null</code>。
	 */
	public default boolean isValid(ConfigKey configKey){
		Objects.requireNonNull(configKey, "入口参数 configKey 不能为 null。");
		ConfigValueChecker checker = configKey.getValueChecker();
		Objects.requireNonNull(checker, "配置键 configKey 的值检查器为 null。");
		return checker.isValid(get(configKey));
	}
	
	/**
	 * 返回指定的键对应的值是否不合法。
	 * @param configKey 指定的键、
	 * @return 指定的键对应的值是否不合法。
	 * @throws NullPointerException 入口参数为 <code>null</code>，或者配置键的值检查器为 <code>null</code>。
	 */
	public default boolean nonValid(ConfigKey configKey){
		Objects.requireNonNull(configKey, "入口参数 configKey 不能为 null。");
		ConfigValueChecker checker = configKey.getValueChecker();
		Objects.requireNonNull(checker, "配置键 configKey 的值检查器为 null。");
		return checker.nonValid(get(configKey));
	}

}
