package com.dwarfeng.magiprop.model;

import java.util.Objects;

import com.dwarfeng.magiprop.model.vim.ProplineModel;

/**
 * ģ�͹�������
 * @author DwArFeng
 * @since 1.8
 */
public final class ModelManager {
	
	private final ProplineModel proplineModel;
	
	public ModelManager(ProplineModel proplineModel) {
		Objects.requireNonNull(proplineModel, "��ڲ��� proplineModel ����Ϊ null��");
		
		this.proplineModel = proplineModel;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the proplineModel
	 */
	public ProplineModel getProplineModel() {
		return proplineModel;
	}

}
