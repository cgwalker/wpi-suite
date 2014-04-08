package edu.wpi.cs.wpisuitetng.modules.PlanningPoker.view.Overview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class StartPage extends JPanel {
	/**
	 * 
	 * @param infoContainer
	 *            the container class that is to include this StartPage
	 */
	public StartPage(JPanel infoContainer) {
		// creates a new panel and sets it in the infoContainer
		JPanel startPane = new JPanel();
		startPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		infoContainer.add(startPane);
		startPane.setLayout(new BorderLayout(0, 0));

		// creates a label (title to panel) and adds it to the startPane
		JPanel startTitle = new JPanel();
		startTitle.setBorder(new LineBorder(Color.LIGHT_GRAY));
		startPane.add(startTitle, BorderLayout.NORTH);

		// I heard you like labels, so I put a label inside yo label #swag
		JLabel lblGettingStarted = new JLabel("Getting Started");
		lblGettingStarted.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		startTitle.add(lblGettingStarted);

		//adds the text for getting started with scrollbars if needed to the container in startPane
		JPanel tipsContainer = new JPanel();
		tipsContainer.setBorder(new LineBorder(Color.LIGHT_GRAY));
		startPane.add(tipsContainer, BorderLayout.CENTER);
		tipsContainer.setLayout(new BorderLayout(0, 0));
		JTextPane text = new JTextPane();
		text.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		JScrollPane jsp = new JScrollPane(text);
		tipsContainer.add(jsp);
	}
}
