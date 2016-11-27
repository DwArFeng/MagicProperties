package com.dwarfeng.magiprop.model.struct;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.naming.OperationNotSupportedException;

import com.dwarfeng.dutil.basic.str.Name;
import com.dwarfeng.magiprop.view.obv.ProplineModelObverser;

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
 * 其中，零个至多个文件的内容可能与默认值是一致的，比如Prop属性的默认语言是中文，则理应有 Prop_zh.proterties 中的内容与 Prop.properties的内容一致。<br>
 * 一个语言是默认语言意味着该语言强制与默认语言同步。
 * </blockquote>
 * @author  DwArFeng
 * @since 1.8
 */
public interface ProplineModel extends Name{
	
	/**
	 * 判断一个语言是不是默认的语言。
	 * @param locale 指定的语言。
	 * @return 指定的语言是不是默认的语言。
	 */
	public boolean isDefault(Locale locale);
	
	/**
	 * 获取属性行模型中的所有默认语言。
	 * @return 属性行中的所有默认语言。
	 */
	public Set<Locale> getDefaultLocales();
	
	/**
	 * 获取默认的属性行列表。
	 * <p> 返回的属性行列表不可以编辑，调用其编辑方法会抛出 {@link OperationNotSupportedException}。
	 * @return 默认的属性行列表。
	 */
	public List<Propline> getDefault();
	
	/**
	 * 获取指定语言对应的属性行列表。
	 * <p> 返回的属性行列表不可以编辑，调用其编辑方法会抛出 {@link OperationNotSupportedException}。
	 * @param locale 指定的语言。
	 * @return 指定的语言对应的属性行列表。
	 */
	public List<Propline> get(Locale locale);
	
	
	/**
	 * 向模型的默认语言中添加一个属性行。
	 * @param index 指定的位置。
	 * @param propline 指定的属性行。
	 * @throws IndexOutOfBoundsException 位置越界。
	 * @throws 入口参数为 <code>null</code>。
	 */
	public void add(int index, Propline propline);
	
	/**
	 * 从模型的默认语言中移除一个属性行。
	 * @param index 指定的位置。
	 * @throws IndexOutOfBoundsException 位置越界。
	 */
	public void remove(int index);
	
	/**
	 * 从模型的默认语言中设置指定位置的属性行。
	 * @param index 指定的位置。
	 * @param propline 需要被设置的属性行。
	 * @throws IndexOutOfBoundsException 位置越界。
	 * @throws NullPointerException 入口参数为 <code>null</code>。
	 */
	public void set(int index, Propline propline);
	
	/**
	 * 在指定的语言中添加指定位置的属性行。
	 * <p> 当指定的语言是默认语言时会抛出异常。
	 * @param locale 指定的语言。
	 * @param index 指定的位置。
	 * @param propline 需要被添加的属性行。
	 * @throws IndexOutOfBoundsException 位置越界。
	 * @throws IllegalArgumentException 指定的语言为默认语言。
	 */
	public void add(Locale locale, int index, Propline propline);
	
	/**
	 * 
	 * @param locale
	 * @param index
	 * @param propline
	 */
	public void remove(Locale locale, int index, Propline propline);
	
	/**
	 * 
	 * @param locale
	 * @param index
	 * @param propline
	 */
	public void set(Locale locale, int index, Propline propline);
	
	
	/**
	 * 向属性行模型中添加观察器。
	 * @param obverser 指定的观察器。
	 */
	public void addObverser(ProplineModelObverser obverser);
	
	/**
	 * 从属性行模型中移除观察器。
	 * @param obverser 指定的观察器。
	 */
	public void removeObverser(ProplineModelObverser obverser);
	
	/**
	 * 从属性行模型中移除所有观察器。
	 */
	public void clearObverser();
	
}
