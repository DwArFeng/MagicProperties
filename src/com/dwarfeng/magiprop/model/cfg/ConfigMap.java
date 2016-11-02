package com.dwarfeng.magiprop.model.cfg;

import java.util.Map;
import java.util.Objects;

/**
 * ����ӳ�䡣
 * @author  DwArFeng
 * @since 1.8
 */
public interface ConfigMap extends Map<ConfigKey, String> {
	
	/**
	 * ����ָ���ļ���Ӧ��ֵ��Ϸ���
	 * @param configKey ָ���ļ���
	 * @return ָ���ļ���Ӧ��ֵ�Ƿ�Ϸ���
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>���������ü���ֵ�����Ϊ <code>null</code>��
	 */
	public default boolean isValid(ConfigKey configKey){
		Objects.requireNonNull(configKey, "��ڲ��� configKey ����Ϊ null��");
		ConfigValueChecker checker = configKey.getValueChecker();
		Objects.requireNonNull(checker, "���ü� configKey ��ֵ�����Ϊ null��");
		return checker.isValid(get(configKey));
	}
	
	/**
	 * ����ָ���ļ���Ӧ��ֵ�Ƿ񲻺Ϸ���
	 * @param configKey ָ���ļ���
	 * @return ָ���ļ���Ӧ��ֵ�Ƿ񲻺Ϸ���
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>���������ü���ֵ�����Ϊ <code>null</code>��
	 */
	public default boolean nonValid(ConfigKey configKey){
		Objects.requireNonNull(configKey, "��ڲ��� configKey ����Ϊ null��");
		ConfigValueChecker checker = configKey.getValueChecker();
		Objects.requireNonNull(checker, "���ü� configKey ��ֵ�����Ϊ null��");
		return checker.nonValid(get(configKey));
	}

}
