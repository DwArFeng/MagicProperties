package com.dwarfeng.magiprop.model.struct;

import java.util.List;
import java.util.Locale;

import javax.naming.OperationNotSupportedException;

import com.dwarfeng.dutil.basic.str.Name;
import com.dwarfeng.magiprop.view.obv.PropLineModelObverser;

/**
 * 属性行模型。
 * <p> 该模型负责记录不同语言环境下的 properties 文件的数据，是该程序中最重要的数据模型之一。
 * <p> 属性行模型是根据 properties 文件的结构定义的，properties 属性的结构如下：
 * <blockquote>
 * 假设一个属性的名字叫做 Prop，则它有如下的几个部分构成。<p>
 * 有一个主文件，名字叫做 Prop.properties<br>
 * 有不同语言的不同文件，比如
 * <blockquote>
 * Prop_zh.properties<br>
 * Prop_ja.properties<br>
 * Prop_en.properties
 * </blockquote>
 * 其中，零个至多个文件的内容可能与默认值是一致的，比如Prop属性的默认语言是中文，则理应有 Prop_zh.proterties 中的内容与 Prop.properties的内容一致。
 * </blockquote>
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLineModel extends Name{
	

	/**
	 * 判断一个语言是不是默认的语言。
	 * @param locale 指定的语言。
	 * @return 指定的语言是不是默认的语言。
	 */
	public boolean isDefault(Locale locale);
	
	/**
	 * 获取默认的属性行列表。
	 * <p> 返回的属性行列表不可以编辑，调用其编辑方法会抛出 {@link OperationNotSupportedException}。
	 * @return 默认的属性行列表。
	 */
	public List<PropLine> getDefault();
	
	/**
	 * 获取指定语言对应的属性行列表。
	 * <p> 返回的属性行列表不可以编辑，调用其编辑方法会抛出 {@link OperationNotSupportedException}。
	 * @param locale 指定的语言。
	 * @return 指定的语言对应的属性行列表。
	 */
	public List<PropLine> get(Locale locale);
	
	/**
	 * 向属性行模型中添加观察器。
	 * @param obverser 指定的观察器。
	 */
	public void addObverser(PropLineModelObverser obverser);
	
	/**
	 * 从属性行模型中移除观察器。
	 * @param obverser 指定的观察器。
	 */
	public void removeObverser(PropLineModelObverser obverser);
	
	/**
	 * 从属性行模型中移除所有观察器。
	 */
	public void clearObverser();
	
}
