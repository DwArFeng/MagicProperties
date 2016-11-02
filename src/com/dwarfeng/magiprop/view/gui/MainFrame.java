package com.dwarfeng.magiprop.view.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dwarfeng.dutil.basic.gui.swing.JAdjustableBorderPanel;

public class MainFrame extends JFrame {

	private final JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public MainFrame() {

		contentPane = new JPanel();
		
		init();
	}
	
	private void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JAdjustableBorderPanel adjustableBorderPanel = new JAdjustableBorderPanel();
		adjustableBorderPanel.setSeperatorThickness(5);
		adjustableBorderPanel.setWestVisible(true);
		adjustableBorderPanel.setWestEnabled(true);
		contentPane.add(adjustableBorderPanel, BorderLayout.CENTER);
	}

}
