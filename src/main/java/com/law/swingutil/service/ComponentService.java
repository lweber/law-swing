/*
 * Created on Mar 29, 2012
 */
package com.law.swingutil.service;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.law.swingutil.ui.LabeledPasswordField;
import com.law.swingutil.ui.LabeledTextField;

/**
 * Service whose job is to wrestle Swing UI components into submission.
 * 
 * @author Lloyd
 */
public class ComponentService {
	
	/**
	 * Create a button component.
	 * 
	 * @param name - 
	 * @param enabled - 
	 * @param actionListener - 
	 * 
	 * @return
	 */
	public JButton createButton(String name, boolean enabled,
			ActionListener actionListener) {
		
		JButton newButton = new JButton(name);
		newButton.setEnabled(enabled);
		newButton.setFocusable(false);
		if (actionListener != null) {
			newButton.addActionListener(actionListener);
		}
		
		return newButton;
	}
	
	/**
	 * Create a checkbox component.
	 * 
	 * @param name - 
	 * @param fgColor - 
	 * @param bgColor - 
	 * @param actionListener - 
	 * 
	 * @return
	 */
	public JCheckBox createCheckbox(String name, boolean isSelected,
			Color fgColor, Color bgColor, ActionListener actionListener) {
		
		JCheckBox newCb = new JCheckBox(name);
		newCb.setForeground(fgColor);
		newCb.setBackground(bgColor);
		newCb.setFocusable(false);
		newCb.setSelected(isSelected);
		if (actionListener != null) {
			newCb.addActionListener(actionListener);
		}
		
		return newCb;
	}
	
	/**
	 * Create a combined JLabel and JTextField as one component.
	 * 
	 * <p> The resulting object is a super class of JComponent.
	 * 
	 * @param label - The label value.
	 * @param fieldValue - The initial field value.
	 * @param fieldWidth - The width of the field.
	 * 
	 * @return
	 */
	public LabeledTextField createLabeledTextField(String label, String fieldValue, int fieldWidth) {
		return new LabeledTextField(label, fieldValue, fieldWidth, null);
	}
	
	/**
	 * Create a combined JLabel and JTextField as one component.
	 * 
	 * <p> The resulting object is a super class of JComponent.
	 * <p> A key listener may be provided, or may be null.
	 * 
	 * @param label - The label value.
	 * @param fieldValue - The initial field value.
	 * @param fieldWidth - The width of the field.
	 * @param keyListener - A key listener to add to the text field, or null.
	 * 
	 * @return
	 */
	public LabeledTextField createLabeledTextField(String label, String fieldValue, int fieldWidth,
			KeyListener keyListener) {
		return new LabeledTextField(label, fieldValue, fieldWidth, keyListener);
	}
	
	/**
	 * Create a combined JLabel and JPasswordField as one component.
	 * 
	 * <p> The resulting object is a super class of JComponent.
	 * 
	 * @param label - The label value.
	 * @param fieldValue - The initial field value.
	 * @param fieldWidth - The width of the field.
	 * 
	 * @return
	 */
	public LabeledPasswordField createLabeledPasswordField(String label, String fieldValue, int fieldWidth) {
		return new LabeledPasswordField(label, fieldValue, fieldWidth, null);
	}
	
	/**
	 * Create a combined JLabel and JPasswordField as one component.
	 * 
	 * <p> The resulting object is a super class of JComponent.
	 * 
	 * @param label - The label value.
	 * @param fieldValue - The initial field value.
	 * @param fieldWidth - The width of the field.
	 * @param keyListener - A key listener to add to the text field, or null.
	 * 
	 * @return
	 */
	public LabeledPasswordField createLabeledPasswordField(String label, String fieldValue, int fieldWidth,
			KeyListener keyListener) {
		return new LabeledPasswordField(label, fieldValue, fieldWidth, keyListener);
	}
	
	/**
	 * Create a panel component populated with components in a vertical layout,
	 * each one below the previous one.
	 * 
	 * @param width - Width of the panel and each child component.
	 * @param width - Height of the panel.
	 * @param borderInsets - Empty border insets around the whole component, or
	 *  null for none.
	 * @param bgColor - Background color for the whole component, or null for
	 *  default.
	 * @param components - Child components.
	 * 
	 * @return A new panel component.
	 */
	public JPanel createVerticalComponentPanel(int width, int height, Insets borderInsets,
			Color bgColor, JComponent...components) {
		
		JPanel componentPanel = new JPanel();
		componentPanel.setLayout(new BoxLayout(componentPanel, BoxLayout.Y_AXIS));
		componentPanel.setPreferredSize(new Dimension(width, height));
		
		if (borderInsets != null) {
			componentPanel.setBorder(new EmptyBorder(borderInsets));
		}
		
		if (bgColor != null) {
			componentPanel.setBackground(bgColor);
		}
		
		for (JComponent c : components) {
			c.setMaximumSize(new Dimension(width, 26));
			componentPanel.add(c);
			componentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		}
		
		return componentPanel;
	}
	
	/**
	 * Create a panel component populated with components in a horizontal layout,
	 * each one to the right of the previous one.
	 * 
	 * @param width - Width for each child component.
	 * @param borderInsets - Empty border insets around the whole component, or
	 *  null for none.
	 * @param bgColor - Background color for the whole component, or null for
	 *  default.
	 * @param components - Child components.
	 * 
	 * @return A new panel component.
	 */
	public JPanel createHorizontalComponentPanel(int width, Insets borderInsets,
			Color bgColor, JComponent...components) {
		
		JPanel componentPanel = new JPanel();
		componentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		if (borderInsets != null) {
			componentPanel.setBorder(new EmptyBorder(borderInsets));
		}
		
		if (bgColor != null) {
			componentPanel.setBackground(bgColor);
		}
		
		int i = components.length;
		for (JComponent c : components) {
			c.setPreferredSize(new Dimension(width, 26));
			componentPanel.add(c);
			if (i-- > 1) {
				componentPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			}
		}
		
		return componentPanel;
	}
	
}
