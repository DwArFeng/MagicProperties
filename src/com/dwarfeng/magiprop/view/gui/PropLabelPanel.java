package com.dwarfeng.magiprop.view.gui;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PropLabelPanel extends JPanel {
	
	private final JList labelList;
	private final JList indexList;

	/**
	 * Create the panel.
	 */
	public PropLabelPanel() {

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
