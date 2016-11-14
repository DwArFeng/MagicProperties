package com.dwarfeng.magiprop.view.gui;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PropLinePanel extends JPanel {
	
	private final JList labelList;
	private final JList indexList;

	/**
	 * Create the panel.
	 */
	public PropLinePanel() {

		labelList = new JList();
		indexList = new JList();
		
		init();
	}
	
	private void init(){
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		scrollPane.setViewportView(labelList);
		
		scrollPane.setRowHeaderView(indexList);
	}

}
