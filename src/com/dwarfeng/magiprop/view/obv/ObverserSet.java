package com.dwarfeng.magiprop.view.obv;

import java.util.Set;

import javax.naming.OperationNotSupportedException;

/**
 * 观察器集合。
 * <p> 实现该接口意味着能够向其中添加、移除、清除观察器，也可以遍历集合中的所有观察器。
 * @author DwArFeng
 * @since 1.8
 */
public interface ObverserSet<T extends Obverser>{

	/**
	 * 以集合的形式返回该观察器集合。
	 * <p> 该集合为只读集合，调用任何修改方法将会抛出 {@link OperationNotSupportedException}。
	 * @return 集合形式的观察器集合。
	 */
	public Set<T> getObversers();
	
	/**
	 * 向属性行模型中添加观察器。
	 * @param obverser 指定的观察器。
	 * @return 该动作是否引起了观察器集合的改变。
	 */
	public boolean addObverser(T obverser);
	
	/**
	 * 从属性行模型中移除观察器。
	 * @param obverser 指定的观察器。
	 * @return 该动作是否引起了观察器集合的改变。
	 */
	public boolean removeObverser(T obverser);
	
	/**
	 * 从属性行模型中移除所有观察器。
	 */
	public void clearObverser();
	
}
