package com.dwarfeng.magiprop.model.cfg;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.omg.CORBA.portable.Delegate;

/**
 * 配置映射的默认实现。
 * @author  DwArFeng
 * @since 1.8
 */
public final class DefaultConfigMap implements ConfigMap {
	
	private final Map<ConfigKey, String> delegate;
	
	/**
	 * 新实例。
	 * @param delegate 配置映射代理。
	 * @throws NullPointerException 入口参数为 <code>null</code>
	 */
	public DefaultConfigMap(Map<ConfigKey, String> delegate) {
		Objects.requireNonNull(delegate, "入口参数 delegate 不能为 null。");
		this.delegate = delegate;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String put(ConfigKey key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends ConfigKey, ? extends String> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<ConfigKey> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<String> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<ConfigKey, String>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
