package com.dwarfeng.magiprop.control;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.dwarfeng.dutil.basic.prog.DefaultVersion;
import com.dwarfeng.dutil.basic.prog.Version;
import com.dwarfeng.dutil.basic.prog.VersionType;
import com.dwarfeng.magiprop.model.ModelManager;
import com.dwarfeng.magiprop.view.ViewManager;

/**
 * �������ࡣ
 * @author  DwArFeng
 * @since 1.8
 */
public final class Magiprop {
	
	static{
		AUTHOR = "DwArFeng";
		VERSION = new DefaultVersion.Builder()
				.type(VersionType.RELEASE)
				.firstVersion((byte) 0).secondVersion((byte) 0).thirdVersion((byte) 1)
				.buildDate("20161102").buildVersion('A')
				.build();
		LANGUAGE_PATH = "resource/lang/stringField";
		IMAGE_PATH = "/resource/image/";
		CONFIG_PATH = "config/setting.cfg";
		RESENTFILE_PATH = "config/resent-file.cfg";
	}
	
	/**����*/
	public static final String AUTHOR ;
	/**�汾*/
	public static final Version VERSION;
	/**��������Դλ��*/
	public static final String LANGUAGE_PATH;
	/**ͼ����Դ�ļ���λ��*/
	public static final String IMAGE_PATH;
	/**�����ļ�λ��*/
	public static final String CONFIG_PATH;
	/**����ļ�λ��*/
	public static final String RESENTFILE_PATH;
	
	/**
	 * ��������
	 * @param args the args.
	 */
	public static void main(String[] args) {
		new Magiprop().start();
	}
	
	private final ViewManager viewManager;
	private final ModelManager modelManager;
	
	private RuntimeStatus runtimeStatus;
	
	public Magiprop() {
		
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
			//���ڳ��������е������֧����һ��ۣ���˲������׳����쳣��
		}

		this.modelManager = new ModelManager(
				
		);
		this.viewManager = new ViewManager(
				
		);
		
		runtimeStatus = RuntimeStatus.NOT_START;
	}
	
	/**
	 * ��������
	 * @throws IllegalStateException �����ڷǻ�δ��ʼ����״̬���ô˷�����
	 */
	public void start(){
		if(runtimeStatus != RuntimeStatus.NOT_START){
			throw new IllegalStateException("�����Ѿ�����");
		}
		
	}
	
	/**
	 * �˳�����
	 * @throws IllegalStateException �����ڻ�δ��ʼ����ʱ���Ѿ�����ʱ���ô˷�����
	 */
	public void exit(){
		
	}
	
	
	/*
	 * ���������״̬��
	 */
	private static enum RuntimeStatus{
		//��������
		RUNNING,
		//��δ��ʼ����
		NOT_START,
		//�Ѿ��˳�
		EXITED,
		//�Ѿ�����
		CRASH,
	}

}
