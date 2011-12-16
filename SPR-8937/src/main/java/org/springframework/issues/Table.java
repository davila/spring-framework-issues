package org.springframework.issues;

import javax.swing.JTable;

import org.springframework.stereotype.Component;

/**
 * This is the culprit.
 * 
 * @author Dan
 * 
 */
@Component
public class Table extends JTable
{
	private static final long serialVersionUID = 8734377335402844292L;
}
