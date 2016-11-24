package com.dwarfeng.magiprop.model;

import java.util.Objects;

import com.dwarfeng.magiprop.model.struct.PropLineModel;

/**
 * 模型管理器。
 * @author DwArFeng
 * @since 1.8
 */
public final class ModelManager {
	
	private final PropLineModel propLineModel;
	
	public ModelManager(PropLineModel propLineModel) {
		Objects.requireNonNull(propLineModel, "入口参数 propLineModel 不能为 null。");
		
		this.propLineModel = propLineModel;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the propLineModel
	 */
	public PropLineModel getPropLineModel() {
		return propLineModel;
	}

}
