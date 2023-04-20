import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;
	private JTextField numLow;
	private JTextField numHigh;
	private JTextField listOneEntry;
	private JTextField listTwoEntry;
	private DefaultListModel<Integer> listOneNums;
	private JList<Integer> listOne;
	private DefaultListModel<Integer> listTwoNums;
	private JList<Integer> listTwo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		System.out.println("System Starting");
		initialize();
		System.out.println("System Started");
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 400, 450); // Actual width is 385 for some reason
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblHeading = new JLabel("Binary Operators");
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHeading.setBounds(0, 11, frame.getBounds().width, 30);
		frame.getContentPane().add(lblHeading);

		listOneNums = new DefaultListModel<Integer>();

		listTwoNums = new DefaultListModel<Integer>();

		listOne = new JList<Integer>(listOneNums);
		listOne.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(listOne);

		listTwo = new JList<Integer>(listTwoNums);
		listTwo.setBounds(0, listOne.getBounds().y, listOne.getBounds().width, listOne.getBounds().height);
		frame.getContentPane().add(listTwo);

		numLow = new JTextField();
		numLow.setHorizontalAlignment(SwingConstants.CENTER);
		numLow.setBounds(40, 60, 125, 25);
		frame.getContentPane().add(numLow);
		numLow.setColumns(10);
		numLow.setText("0");
		JLabel lblNumLow = new JLabel("List Low");
		lblNumLow.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumLow.setBounds(numLow.getBounds().x, numLow.getBounds().y - 30, numLow.getBounds().width, 40);
		frame.getContentPane().add(lblNumLow);

		numHigh = new JTextField();
		numHigh.setHorizontalAlignment(SwingConstants.CENTER);
		numHigh.setBounds(220, numLow.getBounds().y, numLow.getBounds().width, numLow.getBounds().height);
		frame.getContentPane().add(numHigh);
		numHigh.setColumns(10);
		numHigh.setText("10");
		JLabel lblNumHigh = new JLabel("List High");
		lblNumHigh.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumHigh.setBounds(numHigh.getBounds().x, numHigh.getBounds().y - 30, numHigh.getBounds().width, 40);
		frame.getContentPane().add(lblNumHigh);

		listOneEntry = new JTextField();
		listOneEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		listOneEntry.setBounds(numLow.getBounds().x, 100, numLow.getBounds().width, numLow.getBounds().height);
		frame.getContentPane().add(listOneEntry);
		listOneEntry.setColumns(10);
		listOneEntry.setToolTipText("List One Entry");
		/*JLabel lblListOneEntry = new JLabel("List High");
		lblListOneEntry.setHorizontalAlignment(SwingConstants.CENTER);
		lblListOneEntry.setBounds(lblListOneEntry.getBounds().x, lblListOneEntry.getBounds().y - 30,
				lblListOneEntry.getBounds().width, 40);
		frame.getContentPane().add(lblListOneEntry);*/

		listTwoEntry = new JTextField();
		listTwoEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		listTwoEntry.setBounds(numHigh.getBounds().x, listOneEntry.getBounds().y, numLow.getBounds().width,
				numLow.getBounds().height);
		frame.getContentPane().add(listTwoEntry);
		listTwoEntry.setColumns(10);

		JButton btnAddListOne = new JButton("Add to List One");
		btnAddListOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnAddListOne.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(btnAddListOne);

		JButton btnAddListTwo = new JButton("Add to List Two");
		btnAddListTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnAddListTwo.setBounds(0, btnAddListOne.getBounds().y, btnAddListOne.getBounds().width,
				btnAddListOne.getBounds().height);
		frame.getContentPane().add(btnAddListTwo);

		JButton btnAND = new JButton("AND");
		btnAND.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnAND.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(btnAND);

		JButton btnOR = new JButton("OR");
		btnOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnOR.setBounds(0, btnAND.getBounds().y, btnAND.getBounds().width, btnAND.getBounds().height);
		frame.getContentPane().add(btnOR);

		JButton btnXOR = new JButton("XOR");
		btnXOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnXOR.setBounds(btnAND.getBounds().getBounds().x, 0, btnAND.getBounds().width, btnAND.getBounds().height);
		frame.getContentPane().add(btnXOR);

		JButton btnNOR = new JButton("NOR");
		btnNOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNOR.setBounds(btnOR.getBounds().x, btnXOR.getBounds().y, btnAND.getBounds().width,
				btnAND.getBounds().height);
		frame.getContentPane().add(btnNOR);
	}
}
