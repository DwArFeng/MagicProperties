package com.dwarfeng.magiprop.model.struct;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.naming.OperationNotSupportedException;

import com.dwarfeng.dutil.basic.str.Name;
import com.dwarfeng.magiprop.view.obv.ProplineModelObverser;

/**
 * ������ģ�͡�
 * <p> ��ģ�͸����¼��ͬ���Ի����µ� properties �ļ������ݣ��Ǹó���������Ҫ������ģ��֮һ��
 * <p> ������ģ���Ǹ��� properties �ļ��Ľṹ����ģ�properties ���ԵĽṹ���£�
 * <blockquote>
 * ����һ�����Ե����ֽ��� Prop�����������µļ������ֹ��ɡ�<p>
 * ��һ�����ļ������ֽ��� Prop.properties<br>
 * �в�ͬ���ԵĲ�ͬ�ļ�������
 * <blockquote>
 * Prop_zh.properties<br>
 * Prop_ja.properties<br>
 * Prop_en.properties
 * </blockquote>
 * ���У����������ļ������ݿ�����Ĭ��ֵ��һ�µģ�����Prop���Ե�Ĭ�����������ģ�����Ӧ�� Prop_zh.proterties �е������� Prop.properties������һ�¡�<br>
 * һ��������Ĭ��������ζ�Ÿ�����ǿ����Ĭ������ͬ����
 * </blockquote>
 * @author  DwArFeng
 * @since 1.8
 */
public interface ProplineModel extends Name{
	
	/**
	 * �ж�һ�������ǲ���Ĭ�ϵ����ԡ�
	 * @param locale ָ�������ԡ�
	 * @return ָ���������ǲ���Ĭ�ϵ����ԡ�
	 */
	public boolean isDefault(Locale locale);
	
	/**
	 * ��ȡ������ģ���е�����Ĭ�����ԡ�
	 * @return �������е�����Ĭ�����ԡ�
	 */
	public Set<Locale> getDefaultLocales();
	
	/**
	 * ��ȡĬ�ϵ��������б�
	 * <p> ���ص��������б����Ա༭��������༭�������׳� {@link OperationNotSupportedException}��
	 * @return Ĭ�ϵ��������б�
	 */
	public List<Propline> getDefault();
	
	/**
	 * ��ȡָ�����Զ�Ӧ���������б�
	 * <p> ���ص��������б����Ա༭��������༭�������׳� {@link OperationNotSupportedException}��
	 * @param locale ָ�������ԡ�
	 * @return ָ�������Զ�Ӧ���������б�
	 */
	public List<Propline> get(Locale locale);
	
	
	/**
	 * ��ģ�͵�Ĭ�����������һ�������С�
	 * @param index ָ����λ�á�
	 * @param propline ָ���������С�
	 * @throws IndexOutOfBoundsException λ��Խ�硣
	 * @throws ��ڲ���Ϊ <code>null</code>��
	 */
	public void add(int index, Propline propline);
	
	/**
	 * ��ģ�͵�Ĭ���������Ƴ�һ�������С�
	 * @param index ָ����λ�á�
	 * @throws IndexOutOfBoundsException λ��Խ�硣
	 */
	public void remove(int index);
	
	/**
	 * ��ģ�͵�Ĭ������������ָ��λ�õ������С�
	 * @param index ָ����λ�á�
	 * @param propline ��Ҫ�����õ������С�
	 * @throws IndexOutOfBoundsException λ��Խ�硣
	 * @throws NullPointerException ��ڲ���Ϊ <code>null</code>��
	 */
	public void set(int index, Propline propline);
	
	/**
	 * ��ָ�������������ָ��λ�õ������С�
	 * <p> ��ָ����������Ĭ������ʱ���׳��쳣��
	 * @param locale ָ�������ԡ�
	 * @param index ָ����λ�á�
	 * @param propline ��Ҫ����ӵ������С�
	 * @throws IndexOutOfBoundsException λ��Խ�硣
	 * @throws IllegalArgumentException ָ��������ΪĬ�����ԡ�
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
	 * ��������ģ������ӹ۲�����
	 * @param obverser ָ���Ĺ۲�����
	 */
	public void addObverser(ProplineModelObverser obverser);
	
	/**
	 * ��������ģ�����Ƴ��۲�����
	 * @param obverser ָ���Ĺ۲�����
	 */
	public void removeObverser(ProplineModelObverser obverser);
	
	/**
	 * ��������ģ�����Ƴ����й۲�����
	 */
	public void clearObverser();
	
}
