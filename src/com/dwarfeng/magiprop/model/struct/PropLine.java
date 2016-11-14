package com.dwarfeng.magiprop.model.struct;

/**
 * �����С�
 * <p> �����ֶ��� .properties �ļ��е��С����磺
 * <blockquote>
 * <code>
 * #ע����<br>
 * Properties_0 = 123<br>
 * �����У�<br>
 * Properties_1 = 456
 * </code>
 * </blockquote>
 * @author DwArFeng
 * @since 1.8
 */
public interface PropLine {
	
	/**
	 * ���������е����ݡ�
	 * <p> ���ı��� .porperties �ļ��е�������һ�µġ�
	 * <blockquote>
	 * ע���� #��ͷ<br>
	 * ���ĳ��� <code>%s = %s</code>����ʽ��<br>
	 * �հ���Ϊ<code>""</code>
	 * </blockquote>
	 * @return �����е����ݡ�
	 */
	public String getContent();
	
	/**
	 * ���������е����͡�
	 * @return �����е����͡�
	 */
	public PropLineType getType();
	
	
}
