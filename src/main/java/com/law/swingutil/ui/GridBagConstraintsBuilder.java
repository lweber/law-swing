/*
 * Created on Dec 31, 2012
 */
package com.law.swingutil.ui;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagConstraintsBuilder {
	
	private GridBagConstraints gbc = new GridBagConstraints();
	
	private GridBagConstraintsBuilder() {}
	private GridBagConstraintsBuilder(int gridx, int gridy) { gridX(gridx); gridY(gridy); }
	
	/**
	 * Specifies the cell containing the leading edge of the component's display area, where
	 * the first cell in a row has gridx=0. The leading edge of a component's display area is
	 * its left edge for a horizontal, left-to-right container and its right edge for a horizontal,
	 * right-to-left container. The value RELATIVE specifies that the component be placed immediately
	 * following the component that was added to the container just before this component was added.
	 * <p> The default value is RELATIVE. gridx should be a non-negative value.
	 */
	public GridBagConstraintsBuilder gridX(int x) { gbc.gridx = x; return this; }
	
	/**
	 * Specifies the cell at the top of the component's display area, where the topmost cell has
	 * gridy=0. The value RELATIVE specifies that the component be placed just below the component
	 * that was added to the container just before this component was added. <p> The default value
	 * is RELATIVE. gridy should be a non-negative value. 
	 */
	public GridBagConstraintsBuilder gridY(int y) { gbc.gridy = y; return this; }
	
	/**
	 * Specify the number of cells in a row for the component's display area. <p> Use REMAINDER
	 * to specify that the component is the last component in its row and the component's
	 * display area will be from gridx to the last cell in the row.
	 * Use RELATIVE to specify that the component is the next-to-last component in its row and
	 * the component's display area will be from gridx to the next to the last one in its
	 * row. <p> gridwidth should be non-negative and the default value is 1.
	 */
	public GridBagConstraintsBuilder gridWidth(int w) { gbc.gridwidth = w; return this; }
	public GridBagConstraintsBuilder gridWidthRemainder() { gbc.gridwidth = GridBagConstraints.REMAINDER; return this; }
	public GridBagConstraintsBuilder gridWidthRelative() { gbc.gridwidth = GridBagConstraints.RELATIVE; return this; }
	
	/**
	 * Specify the number of cells in a column for the component's display area. <p> Use REMAINDER
	 * to specify that the component is the last component in its column and the component's
	 * display area will be from gridy to the last cell in the column.
	 * Use RELATIVE to specify that the component is the next-to-last component in its column and
	 * the component's display area will be from gridy to the next to the last one in its
	 * column. <p> gridheight should be non-negative and the default value is 1.
	 */
	public GridBagConstraintsBuilder gridHeight(int h) { gbc.gridheight = h; return this; }
	public GridBagConstraintsBuilder gridHeightRemainder() { gbc.gridheight = GridBagConstraints.REMAINDER; return this; }
	public GridBagConstraintsBuilder gridHeightRelative() { gbc.gridheight = GridBagConstraints.RELATIVE; return this; }
	
	/**
	 * Specifies how to distribute extra horizontal space. <p> The grid bag layout manager calculates
	 * the weight of a column to be the maximum weightx of all the components in a column. If the
	 * resulting layout is smaller horizontally than the area it needs to fill, the extra space is
	 * distributed to each column in proportion to its weight. A column that has a weight of zero
	 * receives no extra space. <p> If all the weights are zero, all the extra space appears between
	 * the grids of the cell and the left and right edges. <p> The default value of this field is 0.
	 * weightx should be a non-negative value.
	 */
	public GridBagConstraintsBuilder weightX(double wx) { gbc.weightx = wx; return this; }
	
	/**
	 * Specifies how to distribute extra vertical space. <p> The grid bag layout manager calculates
	 * the weight of a row to be the maximum weighty of all the components in a row. If the resulting
	 * layout is smaller vertically than the area it needs to fill, the extra space is distributed to
	 * each row in proportion to its weight. A row that has a weight of zero receives no extra space.
	 * <p> If all the weights are zero, all the extra space appears between the grids of the cell and
	 * the top and bottom edges. <p> The default value of this field is 0. weighty should be a
	 * non-negative value.
	 */
	public GridBagConstraintsBuilder weightY(double wy) { gbc.weighty = wy; return this; }
	
	/**
	 * Determine where, within the display area, to place the component when the component is
	 * smaller than its display area. <p> The default value is CENTER. <p> There are three kinds
	 * of possible values: orientation relative, baseline relative and absolute. The absolute values are:
	 * CENTER, NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, and NORTHWEST.
	 */
	public GridBagConstraintsBuilder anchor(int a) { gbc.anchor = a; return this; }
	public GridBagConstraintsBuilder north() { gbc.anchor = GridBagConstraints.NORTH; return this; }
	public GridBagConstraintsBuilder northEast() { gbc.anchor = GridBagConstraints.NORTHEAST; return this; }
	public GridBagConstraintsBuilder east() { gbc.anchor = GridBagConstraints.EAST; return this; }
	public GridBagConstraintsBuilder southEast() { gbc.anchor = GridBagConstraints.SOUTHEAST; return this; }
	public GridBagConstraintsBuilder south() { gbc.anchor = GridBagConstraints.SOUTH; return this; }
	public GridBagConstraintsBuilder southWest() { gbc.anchor = GridBagConstraints.SOUTHWEST; return this; }
	public GridBagConstraintsBuilder west() { gbc.anchor = GridBagConstraints.WEST; return this; }
	public GridBagConstraintsBuilder northWest() { gbc.anchor = GridBagConstraints.NORTHWEST; return this; }
	public GridBagConstraintsBuilder center() { gbc.anchor = GridBagConstraints.CENTER; return this; }
	
	/**
	 * This field is used when the component's display area is larger than the component's
	 * requested size. It determines whether to resize the component, and if so, how.
	 * <p> The following values are valid for fill: <ul>
	 * <li> NONE: Do not resize the component.
	 * <li> HORIZONTAL: Make the component wide enough to fill its display area horizontally, but do not change its height. 
	 * <li> VERTICAL: Make the component tall enough to fill its display area vertically, but do not change its width. 
	 * <li> BOTH: Make the component fill its display area entirely. 
	 * </ul> <p> The default value is NONE.
	 */
	public GridBagConstraintsBuilder fill(int f) { gbc.fill = f; return this; }
	public GridBagConstraintsBuilder fillNone() { gbc.fill = GridBagConstraints.NONE; return this; }
	public GridBagConstraintsBuilder fillHoriz() { gbc.fill = GridBagConstraints.HORIZONTAL; return this; }
	public GridBagConstraintsBuilder fillVert() { gbc.fill = GridBagConstraints.VERTICAL; return this; }
	public GridBagConstraintsBuilder fillBoth() { gbc.fill = GridBagConstraints.BOTH; return this; }
	
	/**
	 * Specify the external padding of the component, the minimum amount of space between the
	 * component and the edges of its display area. <p> The default value is new Insets(0, 0, 0, 0). 
	 */
	public GridBagConstraintsBuilder insets(int top, int left, int bottom, int right) { gbc.insets = new Insets(top, left, bottom, right); return this; }
	public GridBagConstraintsBuilder insets(Insets i) { gbc.insets = i; return this; }
	
	/**
	 * Specify the internal padding of the component, how much space to add to the minimum width
	 * of the component. The width of the component is at least its minimum width plus ipadx pixels.
	 * <p> The default value is 0.
	 */
	public GridBagConstraintsBuilder iPadX(int px) { gbc.ipadx = px; return this; }
	
	/**
	 * Specify the internal padding, that is, how much space to add to the minimum height of the
	 * component. The height of the component is at least its minimum height plus ipady pixels.
	 * <p> The default value is 0. 
	 */
	public GridBagConstraintsBuilder iPadY(int py) { gbc.ipady = py; return this; }
	
	/**
	 * Construct and return a new GridBagConstraintsBuilder with default values.
	 */
	public static GridBagConstraintsBuilder gbcBuilder() {
		return new GridBagConstraintsBuilder();
	}
	
	/**
	 * Construct and return a new GridBagConstraintsBuilder with the given gridx and gridy values,
	 * and all other default values.
	 */
	public static GridBagConstraintsBuilder gbcBuilder(int gridx, int gridy) {
		return new GridBagConstraintsBuilder(gridx, gridy);
	}
	
	/**
	 * Return the GridBagConstraints object.
	 */
	public GridBagConstraints build() {
		return gbc;
	}
	
}
