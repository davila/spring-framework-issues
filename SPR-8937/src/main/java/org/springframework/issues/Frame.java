package org.springframework.issues;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class created just fine.
 * 
 * @author Dan
 * 
 */
@Component
public class Frame extends JFrame
{
	private static final long serialVersionUID = 7771688811357320920L;

	@Autowired
	private Table table;

	@PostConstruct
	public void init()
	{
		this.setContentPane(new JScrollPane(table));

		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
