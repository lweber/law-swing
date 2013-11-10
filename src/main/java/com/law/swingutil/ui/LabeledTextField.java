/*
 * Created on Apr 1, 2012
 */
package com.law.swingutil.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * This class combines a JLabel and a JTextField into one component.
 * 
 * @author Lloyd
 */
public class LabeledTextField extends JComponent {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	public LabeledTextField(String label, String fieldValue, int fieldWidth, KeyListener keyListener) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel(label));
		textField = new JTextField();
		textField.setMargin(new Insets(2, 1, 2, 1));
		textField.setPreferredSize(new Dimension(fieldWidth, 22));
		textField.addKeyListener(keyListener);
		add(textField);
		textField.setText(fieldValue != null ? fieldValue : "");
	}
	
	public String getFieldValue() {
		return textField.getText();
	}
	
}
