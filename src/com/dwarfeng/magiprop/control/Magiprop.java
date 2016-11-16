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
 * 主程序类。
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
	
	/**作者*/
	public static final String AUTHOR ;
	/**版本*/
	public static final Version VERSION;
	/**多语言资源位置*/
	public static final String LANGUAGE_PATH;
	/**图形资源文件夹位置*/
	public static final String IMAGE_PATH;
	/**配置文件位置*/
	public static final String CONFIG_PATH;
	/**最近文件位置*/
	public static final String RESENTFILE_PATH;
	
	/**
	 * 主函数。
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
			//由于程序中所有的组件都支持这一外观，因此不可能抛出该异常。
		}

		this.modelManager = new ModelManager(
				
		);
		this.viewManager = new ViewManager(
				
		);
		
		runtimeStatus = RuntimeStatus.NOT_START;
	}
	
	/**
	 * 启动程序。
	 * @throws IllegalStateException 程序在非还未开始运行状态调用此方法。
	 */
	public void start(){
		if(runtimeStatus != RuntimeStatus.NOT_START){
			throw new IllegalStateException("程序已经启动");
		}
		
	}
	
	/**
	 * 退出程序。
	 * @throws IllegalStateException 程序在还未开始启动时或已经结束时调用此方法。
	 */
	public void exit(){
		
	}
	
	
	/*
	 * 程序的运行状态。
	 */
	private static enum RuntimeStatus{
		//正在运行
		RUNNING,
		//还未开始运行
		NOT_START,
		//已经退出
		EXITED,
		//已经崩溃
		CRASH,
	}

}
