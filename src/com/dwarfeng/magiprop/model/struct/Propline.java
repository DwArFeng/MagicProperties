package com.dwarfeng.magiprop.model.struct;

/**
 * �����С�
 * <p> �����ֶ��� .properties �ļ��е��С����磺
 * <code>
 * <pre>
 * #ע����<br>
 * Properties_0 = 123<br>
 * �����У�<br>
 * Properties_1 = 456
 * </pre>
 * </code>
 * @author DwArFeng
 * @since 1.8
 */
public interface Propline {
	
	/**
	 * ���������е����ݡ�
	 * <p> ���ı��� .porperties �ļ��е�������һ�µġ�
	 * <blockquote>
	 * ע���� #��ͷ<br>
	 * ���ĳ��� <code>%s = %s</code>����ʽ��<br>
	 * �հ���Ϊ<code>""</code>
	 * </blockquote>
	 * <p> ��Ҫ��֤�÷����㲻���� <code>null</code>��
	 * @return �����е����ݡ�
	 */
	public String getContent();
	
	/**
	 * ���������е����͡�
	 * @return �����е����͡�
	 */
	public ProplineType getType();
	
	/**
	 * ���ظ������ж���ļ���
	 * <p> ע�͡���ֵ������ֵ�ļ����������ݡ�
	 * <p> �÷����㲻���� <code>null</code>��
	 * @return ����ļ���
	 */
	public String getKey();
	
	/**
	 * ��ȡ�������е�ֵ��
	 * <p> �������������û��ֵ���򷵻� <code>null</code>��
	 * @return �������е�ֵ��
	 */
	public String getValue();
	
	/**
	 * �жϸ��������Ƿ���ֵ��
	 * @return ���������Ƿ���ֵ��
	 */
	public boolean hasValue();
	
	/**
	 * �ж������������Ƿ���ȡ�
	 * <p> ���ҽ��� obj ���� Propline �ӿ��� <code>this.getContent().equals((Propline) obj) == true</code>ʱ���÷������� <code>true</code>��
	 * @param obj ָ���Ķ���
	 * @return �ö����Ƿ���ָ���Ķ�����ȡ�
	 */
	@Override
	public boolean equals(Object obj);
	
	/**
	 * ���ظö���Ĺ�ϣֵ��
	 * @return ����Ĺ�ϣֵ��
	 */
	@Override
	public int hashCode();
	
	/**
	 * ��д�÷������Ա���ֱ�۵ı�ʾ����ͨ��������дΪ��
	 * <code>
	 * <pre>
	 * public String toString(){
	 * 	return getContent();
	 * }
	 * </pre>
	 * </code>
	 * @return ���ظö�����ı���ʾ��
	 */
	@Override
	public String toString();
	
}
