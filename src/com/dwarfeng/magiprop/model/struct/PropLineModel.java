package com.dwarfeng.magiprop.model.struct;

import java.util.List;
import java.util.Locale;

import javax.naming.OperationNotSupportedException;

import com.dwarfeng.dutil.basic.str.Name;
import com.dwarfeng.magiprop.view.obv.PropLineModelObverser;

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
 * ���У����������ļ������ݿ�����Ĭ��ֵ��һ�µģ�����Prop���Ե�Ĭ�����������ģ�����Ӧ�� Prop_zh.proterties �е������� Prop.properties������һ�¡�
 * </blockquote>
 * @author  DwArFeng
 * @since 1.8
 */
public interface PropLineModel extends Name{
	

	/**
	 * �ж�һ�������ǲ���Ĭ�ϵ����ԡ�
	 * @param locale ָ�������ԡ�
	 * @return ָ���������ǲ���Ĭ�ϵ����ԡ�
	 */
	public boolean isDefault(Locale locale);
	
	/**
	 * ��ȡĬ�ϵ��������б�
	 * <p> ���ص��������б����Ա༭��������༭�������׳� {@link OperationNotSupportedException}��
	 * @return Ĭ�ϵ��������б�
	 */
	public List<PropLine> getDefault();
	
	/**
	 * ��ȡָ�����Զ�Ӧ���������б�
	 * <p> ���ص��������б����Ա༭��������༭�������׳� {@link OperationNotSupportedException}��
	 * @param locale ָ�������ԡ�
	 * @return ָ�������Զ�Ӧ���������б�
	 */
	public List<PropLine> get(Locale locale);
	
	/**
	 * ��������ģ������ӹ۲�����
	 * @param obverser ָ���Ĺ۲�����
	 */
	public void addObverser(PropLineModelObverser obverser);
	
	/**
	 * ��������ģ�����Ƴ��۲�����
	 * @param obverser ָ���Ĺ۲�����
	 */
	public void removeObverser(PropLineModelObverser obverser);
	
	/**
	 * ��������ģ�����Ƴ����й۲�����
	 */
	public void clearObverser();
	
}
