package com.dwarfeng.magiprop.model.vim;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.dwarfeng.magiprop.model.struct.Propline;
import com.dwarfeng.magiprop.view.obv.ProplineModelObverser;

/**
 * {@link ProplineModel}的默认实现。
 * <p> 实现方法 //TODO
 * @author  DwArFeng
 * @since 1.8
 */
public final class DefaultProplineModel implements ProplineModel {

	/**
	 * 生成一个新的实例。
	 */
	public DefaultProplineModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean contains(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDefault(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Locale> getDefaultLocales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Propline> getDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Propline> get(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Propline propline) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(int index, Propline propline) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Locale locale, int index, Propline propline) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Locale locale, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(Locale locale, int index, Propline propline) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addLocale(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLocale(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addDefaultLocale(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeDefaultLocale(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clearObverser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<ProplineModelObverser> getObversers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addObverser(ProplineModelObverser obverser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeObverser(ProplineModelObverser obverser) {
		// TODO Auto-generated method stub
		return false;
	}

}
