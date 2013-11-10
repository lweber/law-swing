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
import javax.swing.JPasswordField;

/**
 * This class combines a JLabel and a JPasswordField into one component.
 * 
 * @author Lloyd
 */
public class LabeledPasswordField extends JComponent {
	
	private static final long serialVersionUID = 1L;
	private JPasswordField textField;
	
	public LabeledPasswordField(String label, String fieldValue, int fieldWidth, KeyListener keyListener) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel(label));
		textField = new JPasswordField();
		textField.setMargin(new Insets(2, 1, 2, 1));
		textField.setPreferredSize(new Dimension(fieldWidth, 22));
		textField.addKeyListener(keyListener);
		add(textField);
		textField.setText(fieldValue != null ? fieldValue : "");
	}
	
	public char[] getPassword() {
		return textField.getPassword();
	}
	
}
