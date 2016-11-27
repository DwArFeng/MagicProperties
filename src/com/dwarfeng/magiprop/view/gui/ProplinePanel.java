package com.dwarfeng.magiprop.view.gui;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.dwarfeng.magiprop.model.vim.ProplineModel;

import javax.swing.JComboBox;
import javax.swing.JButton;

/**
 * 属性行面板。
 * <p> 该面板用来显示属性文件的属性行。
 * @author  DwArFeng
 * @since 1.8
 */
public final class ProplinePanel extends JPanel {
	
	private final JList labelList;
	private final JList indexList;
	private final JComboBox comboBox;
	private final JPanel panel;
	private final JButton btnNewButton;
	
	private ProplineModel model;


	/**
	 * Create the panel.
	 */
	public ProplinePanel() {

		labelList = new JList();
		indexList = new JList();
		comboBox = new JComboBox<>();
		panel = new JPanel();
		btnNewButton = new JButton("...");	//TODO 以后改成图标
		
		init();
	}
	
	private void init(){
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		scrollPane.setViewportView(labelList);
		
		scrollPane.setRowHeaderView(indexList);
		
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(comboBox, BorderLayout.CENTER);
		
		panel.add(btnNewButton, BorderLayout.EAST);
	}

}
