package com.dwarfeng.magiprop.model;

import java.util.Objects;

import com.dwarfeng.magiprop.model.vim.ProplineModel;

/**
 * 模型管理器。
 * @author DwArFeng
 * @since 1.8
 */
public final class ModelManager {
	
	private final ProplineModel proplineModel;
	
	public ModelManager(ProplineModel proplineModel) {
		Objects.requireNonNull(proplineModel, "入口参数 proplineModel 不能为 null。");
		
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
