package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class arrivement {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table_1;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTable table_2;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTable table_3;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrivement window = new arrivement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public arrivement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 80, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane.addTab("����װ������", null, desktopPane_4, null);
		
		textField_26 = new JTextField();
		textField_26.setText("  Ӫҵ��ҵ��Ա��");
		textField_26.setBounds(150, 0, 700, 21);
		desktopPane_4.add(textField_26);
		textField_26.setColumns(10);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setText("װ�����ڣ���/��/�գ�");
		textPane_19.setBounds(150, 31, 126, 21);
		desktopPane_4.add(textPane_19);
		
		textField_27 = new JTextField();
		textField_27.setBounds(286, 31, 40, 21);
		desktopPane_4.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(336, 31, 31, 21);
		desktopPane_4.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(377, 31, 31, 21);
		desktopPane_4.add(textField_29);
		textField_29.setColumns(10);
		
		JTextPane textPane_20 = new JTextPane();
		textPane_20.setText("���˱��");
		textPane_20.setBounds(150, 62, 54, 21);
		desktopPane_4.add(textPane_20);
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setText("Ӫҵ�����");
		textPane_21.setBounds(150, 93, 75, 21);
		desktopPane_4.add(textPane_21);
		
		textField_30 = new JTextField();
		textField_30.setBounds(286, 62, 122, 21);
		desktopPane_4.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(286, 93, 122, 21);
		desktopPane_4.add(textField_31);
		textField_31.setColumns(10);
		
		JTextPane textPane_22 = new JTextPane();
		textPane_22.setText("�����");
		textPane_22.setBounds(499, 31, 42, 21);
		desktopPane_4.add(textPane_22);
		
		JTextPane textPane_23 = new JTextPane();
		textPane_23.setText("Ѻ��Ա");
		textPane_23.setBounds(499, 62, 42, 21);
		desktopPane_4.add(textPane_23);
		
		JTextPane textPane_24 = new JTextPane();
		textPane_24.setText("��װԱ");
		textPane_24.setBounds(499, 93, 42, 21);
		desktopPane_4.add(textPane_24);
		
		textField_32 = new JTextField();
		textField_32.setBounds(551, 31, 155, 21);
		desktopPane_4.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(551, 62, 155, 21);
		desktopPane_4.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setBounds(551, 93, 155, 21);
		desktopPane_4.add(textField_34);
		textField_34.setColumns(10);
		
		JTextPane textPane_25 = new JTextPane();
		textPane_25.setText("������");
		textPane_25.setBounds(154, 124, 42, 21);
		desktopPane_4.add(textPane_25);
		
		textField_35 = new JTextField();
		textField_35.setBounds(286, 124, 122, 21);
		desktopPane_4.add(textField_35);
		textField_35.setColumns(10);
		
		final JButton button_13 = new JButton("���");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_13){
					 
				}
			}
		});
		button_13.setBounds(728, 150, 93, 23);
		desktopPane_4.add(button_13);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(150, 183, 700, 323);
		desktopPane_4.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				" ", "������", "װ������", "�����", "��������", "���˱��", "Ѻ��Ա", "Ӫҵ�����", "��װԱ"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(173, 536, 21, 23);
		desktopPane_4.add(checkBox_3);
		
		JButton button_14 = new JButton("����");
		button_14.setBounds(200, 536, 93, 23);
		desktopPane_4.add(button_14);
		
		JButton button_15 = new JButton("ȷ��");
		button_15.setBounds(600, 536, 93, 23);
		desktopPane_4.add(button_15);
		
		JButton button_16 = new JButton("�ύ");
		button_16.setBounds(757, 536, 93, 23);
		desktopPane_4.add(button_16);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("Ӫҵ�����ﵥ", null, desktopPane_1, null);
		
		textField_7 = new JTextField();
		textField_7.setText("  Ӫҵ��ҵ��Ա��");
		textField_7.setBounds(150, 0, 700, 21);
		desktopPane_1.add(textField_7);
		textField_7.setColumns(10);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("�������ڣ���/��/�գ�");
		textPane_8.setBounds(150, 58, 54, 21);
		desktopPane_1.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("����/��/�գ�");
		textPane_9.setBounds(203, 58, 78, 21);
		desktopPane_1.add(textPane_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(291, 58, 44, 21);
		desktopPane_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(345, 58, 31, 21);
		desktopPane_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(386, 58, 31, 21);
		desktopPane_1.add(textField_10);
		textField_10.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"���ﵽ��״̬", "����", "����"}));
		spinner.setBounds(540, 57, 126, 22);
		desktopPane_1.add(spinner);
		
		JList list = new JList();
		list.setBounds(314, 212, 36, -40);
		desktopPane_1.add(list);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText("������");
		textPane_10.setBounds(150, 89, 44, 21);
		desktopPane_1.add(textPane_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(291, 89, 126, 21);
		desktopPane_1.add(textField_11);
		textField_11.setColumns(10);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setText("�������");
		textPane_11.setBounds(445, 132, 54, 21);
		desktopPane_1.add(textPane_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(540, 132, 126, 21);
		desktopPane_1.add(textField_12);
		textField_12.setColumns(10);
		
		JButton button_4 = new JButton("���");
		button_4.setBounds(708, 130, 93, 23);
		desktopPane_1.add(button_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(203, 182, 647, 315);
		desktopPane_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				" ", "�������", "��������", "������", "���ﵽ��״̬"
			}
		));
		scrollPane.setViewportView(table);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(232, 528, 21, 23);
		desktopPane_1.add(checkBox);
		
		JButton button_5 = new JButton("����");
		button_5.setBounds(259, 528, 93, 23);
		desktopPane_1.add(button_5);
		
		JButton button_6 = new JButton("�ύ");
		button_6.setBounds(708, 528, 93, 23);
		desktopPane_1.add(button_6);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("�ɼ���", null, desktopPane_2, null);
		
		textField_13 = new JTextField();
		textField_13.setText("  Ӫҵ��ҵ��Ա ��");
		textField_13.setBounds(150, 0, 700, 21);
		desktopPane_2.add(textField_13);
		textField_13.setColumns(10);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText("�������ڣ���/��/�գ�");
		textPane_12.setBounds(150, 46, 126, 21);
		desktopPane_2.add(textPane_12);
		
		textField_14 = new JTextField();
		textField_14.setBounds(286, 46, 40, 21);
		desktopPane_2.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(336, 46, 31, 21);
		desktopPane_2.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(377, 46, 31, 21);
		desktopPane_2.add(textField_16);
		textField_16.setColumns(10);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText("����Ա");
		textPane_13.setBounds(500, 46, 45, 21);
		desktopPane_2.add(textPane_13);
		
		textField_17 = new JTextField();
		textField_17.setBounds(555, 46, 85, 21);
		desktopPane_2.add(textField_17);
		textField_17.setColumns(10);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText("�������");
		textPane_14.setBounds(212, 87, 54, 21);
		desktopPane_2.add(textPane_14);
		
		textField_18 = new JTextField();
		textField_18.setBounds(286, 87, 122, 21);
		desktopPane_2.add(textField_18);
		textField_18.setColumns(10);
		
		JButton button_7 = new JButton("���");
		button_7.setBounds(693, 99, 93, 23);
		desktopPane_2.add(button_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 132, 700, 361);
		desktopPane_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				" ", "�������", "��������", "����Ա"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(173, 522, 21, 23);
		desktopPane_2.add(checkBox_1);
		
		JButton button_8 = new JButton("����");
		button_8.setBounds(200, 522, 93, 23);
		desktopPane_2.add(button_8);
		
		JButton button_9 = new JButton("�ύ");
		button_9.setBounds(693, 522, 93, 23);
		desktopPane_2.add(button_9);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("�տ��д", null, desktopPane_3, null);
		
		textField_19 = new JTextField();
		textField_19.setText("  Ӫҵ��ҵ��Ա��");
		textField_19.setBounds(150, 0, 700, 21);
		desktopPane_3.add(textField_19);
		textField_19.setColumns(10);
		
		JTextPane textPane_15 = new JTextPane();
		textPane_15.setText("�տ����ڣ���/��/�գ�");
		textPane_15.setBounds(150, 45, 126, 21);
		desktopPane_3.add(textPane_15);
		
		textField_20 = new JTextField();
		textField_20.setBounds(286, 45, 41, 21);
		desktopPane_3.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(337, 45, 31, 21);
		desktopPane_3.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(378, 45, 31, 21);
		desktopPane_3.add(textField_22);
		textField_22.setColumns(10);
		
		JTextPane textPane_16 = new JTextPane();
		textPane_16.setText("�տ���Ա");
		textPane_16.setBounds(512, 45, 66, 21);
		desktopPane_3.add(textPane_16);
		
		textField_23 = new JTextField();
		textField_23.setBounds(588, 45, 90, 21);
		desktopPane_3.add(textField_23);
		textField_23.setColumns(10);
		
		JTextPane textPane_17 = new JTextPane();
		textPane_17.setText("�տ���");
		textPane_17.setBounds(179, 76, 54, 21);
		desktopPane_3.add(textPane_17);
		
		textField_24 = new JTextField();
		textField_24.setBounds(286, 76, 123, 21);
		desktopPane_3.add(textField_24);
		textField_24.setColumns(10);
		
		JTextPane textPane_18 = new JTextPane();
		textPane_18.setText("�������");
		textPane_18.setBounds(522, 76, 54, 21);
		desktopPane_3.add(textPane_18);
		
		textField_25 = new JTextField();
		textField_25.setBounds(588, 76, 90, 21);
		desktopPane_3.add(textField_25);
		textField_25.setColumns(10);
		
		JButton button_10 = new JButton("���");
		button_10.setBounds(757, 74, 93, 23);
		desktopPane_3.add(button_10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(150, 124, 700, 362);
		desktopPane_3.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				" ", "�տ���", "�տ�����", "�տ���Ա", "�տ���", "�������"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(173, 524, 21, 23);
		desktopPane_3.add(checkBox_2);
		
		JButton button_11 = new JButton("����");
		button_11.setBounds(200, 524, 93, 23);
		desktopPane_3.add(button_11);
		
		JButton button_12 = new JButton("�ύ");
		button_12.setBounds(739, 524, 93, 23);
		desktopPane_3.add(button_12);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("������Ϣ����", null, desktopPane, null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("���ӳ�����Ϣ");
		textPane.setBounds(150, 30, 78, 21);
		desktopPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("��������");
		textPane_1.setBounds(160, 61, 54, 21);
		desktopPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("����ʱ��");
		textPane_2.setBounds(160, 90, 54, 21);
		desktopPane.add(textPane_2);
		
		textField = new JTextField();
		textField.setBounds(224, 61, 150, 21);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 90, 150, 21);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("���ƺ�");
		textPane_3.setBounds(464, 61, 45, 21);
		desktopPane.add(textPane_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(519, 61, 150, 21);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("�ύ");
		button.setBounds(744, 61, 93, 23);
		desktopPane.add(button);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("���г�����Ϣ");
		textPane_4.setBounds(150, 191, 78, 21);
		desktopPane.add(textPane_4);
		
		textField_3 = new JTextField();
		textField_3.setText("���복������");
		textField_3.setBounds(224, 222, 445, 21);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button_1 = new JButton("��ѯ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(744, 221, 93, 23);
		desktopPane.add(button_1);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("��������");
		textPane_5.setBounds(160, 277, 54, 21);
		desktopPane.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("����ʱ��");
		textPane_6.setBounds(160, 308, 54, 21);
		desktopPane.add(textPane_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(224, 277, 150, 21);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(224, 308, 150, 21);
		desktopPane.add(textField_5);
		textField_5.setColumns(10);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("���ƺ�");
		textPane_7.setBounds(464, 277, 45, 21);
		desktopPane.add(textPane_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(519, 277, 150, 21);
		desktopPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton button_2 = new JButton("ɾ��������Ϣ");
		button_2.setBounds(519, 416, 120, 23);
		desktopPane.add(button_2);
		
		JButton button_3 = new JButton("�޸ĳ�����Ϣ");
		button_3.setBounds(717, 416, 120, 23);
		desktopPane.add(button_3);
		
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(Color.WHITE);
		tabbedPane.addTab("˾����Ϣ����", null, desktopPane_5, null);
		
		JTextPane textPane_26 = new JTextPane();
		textPane_26.setText("����˾����Ϣ");
		textPane_26.setBounds(87, 10, 78, 21);
		desktopPane_5.add(textPane_26);
		
		JTextPane textPane_27 = new JTextPane();
		textPane_27.setText("˾�����");
		textPane_27.setBounds(97, 41, 54, 21);
		desktopPane_5.add(textPane_27);
		
		textField_36 = new JTextField();
		textField_36.setBounds(161, 41, 121, 21);
		desktopPane_5.add(textField_36);
		textField_36.setColumns(10);
		
		JTextPane textPane_28 = new JTextPane();
		textPane_28.setText("���֤��");
		textPane_28.setBounds(97, 71, 54, 21);
		desktopPane_5.add(textPane_28);
		
		textField_37 = new JTextField();
		textField_37.setBounds(161, 72, 121, 21);
		desktopPane_5.add(textField_37);
		textField_37.setColumns(10);
		
		JTextPane textPane_29 = new JTextPane();
		textPane_29.setText("�Ա�");
		textPane_29.setBounds(107, 101, 30, 21);
		desktopPane_5.add(textPane_29);
		
		textField_38 = new JTextField();
		textField_38.setBounds(161, 103, 66, 21);
		desktopPane_5.add(textField_38);
		textField_38.setColumns(10);
		
		JTextPane textPane_30 = new JTextPane();
		textPane_30.setText("��ʻ֤����");
		textPane_30.setBounds(87, 132, 66, 21);
		desktopPane_5.add(textPane_30);
		
		textField_39 = new JTextField();
		textField_39.setBounds(161, 132, 121, 21);
		desktopPane_5.add(textField_39);
		textField_39.setColumns(10);
		
		JTextPane textPane_31 = new JTextPane();
		textPane_31.setText("����");
		textPane_31.setBounds(392, 41, 30, 21);
		desktopPane_5.add(textPane_31);
		
		JTextPane textPane_32 = new JTextPane();
		textPane_32.setText("�������ڣ���/��/�գ�");
		textPane_32.setBounds(348, 71, 126, 21);
		desktopPane_5.add(textPane_32);
		
		JTextPane textPane_33 = new JTextPane();
		textPane_33.setText("�ֻ�");
		textPane_33.setBounds(392, 101, 30, 21);
		desktopPane_5.add(textPane_33);
		
		textField_40 = new JTextField();
		textField_40.setBounds(485, 41, 90, 21);
		desktopPane_5.add(textField_40);
		textField_40.setColumns(10);
		
		textField_41 = new JTextField();
		textField_41.setBounds(484, 71, 40, 21);
		desktopPane_5.add(textField_41);
		textField_41.setColumns(10);
		
		textField_42 = new JTextField();
		textField_42.setBounds(532, 71, 30, 21);
		desktopPane_5.add(textField_42);
		textField_42.setColumns(10);
		
		textField_43 = new JTextField();
		textField_43.setBounds(572, 71, 30, 21);
		desktopPane_5.add(textField_43);
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		textField_44.setBounds(485, 101, 117, 21);
		desktopPane_5.add(textField_44);
		textField_44.setColumns(10);
		
		JButton button_17 = new JButton("�ύ");
		button_17.setBounds(651, 130, 93, 23);
		desktopPane_5.add(button_17);
		
		JTextPane textPane_34 = new JTextPane();
		textPane_34.setText("����˾����Ϣ");
		textPane_34.setBounds(87, 211, 78, 21);
		desktopPane_5.add(textPane_34);
		
		textField_45 = new JTextField();
		textField_45.setText("����˾�����");
		textField_45.setBounds(161, 258, 441, 21);
		desktopPane_5.add(textField_45);
		textField_45.setColumns(10);
		
		JButton button_18 = new JButton("��ѯ");
		button_18.setBounds(651, 257, 93, 23);
		desktopPane_5.add(button_18);
		
		JTextPane textPane_35 = new JTextPane();
		textPane_35.setText("˾�����");
		textPane_35.setBounds(97, 309, 54, 21);
		desktopPane_5.add(textPane_35);
		
		JTextPane textPane_36 = new JTextPane();
		textPane_36.setText("���֤��");
		textPane_36.setBounds(97, 340, 54, 21);
		desktopPane_5.add(textPane_36);
		
		JTextPane textPane_37 = new JTextPane();
		textPane_37.setText("�Ա�");
		textPane_37.setBounds(107, 371, 30, 21);
		desktopPane_5.add(textPane_37);
		
		JTextPane textPane_38 = new JTextPane();
		textPane_38.setText("��ʻ֤����");
		textPane_38.setBounds(87, 405, 66, 21);
		desktopPane_5.add(textPane_38);
		
		textField_46 = new JTextField();
		textField_46.setBounds(161, 309, 121, 21);
		desktopPane_5.add(textField_46);
		textField_46.setColumns(10);
		
		textField_47 = new JTextField();
		textField_47.setBounds(161, 340, 121, 21);
		desktopPane_5.add(textField_47);
		textField_47.setColumns(10);
		
		textField_48 = new JTextField();
		textField_48.setBounds(161, 371, 66, 21);
		desktopPane_5.add(textField_48);
		textField_48.setColumns(10);
		
		textField_49 = new JTextField();
		textField_49.setBounds(161, 405, 121, 21);
		desktopPane_5.add(textField_49);
		textField_49.setColumns(10);
		
		JTextPane textPane_39 = new JTextPane();
		textPane_39.setText("����");
		textPane_39.setBounds(392, 309, 30, 21);
		desktopPane_5.add(textPane_39);
		
		JTextPane textPane_40 = new JTextPane();
		textPane_40.setText("�������ڣ���/��/�գ�");
		textPane_40.setBounds(348, 340, 126, 21);
		desktopPane_5.add(textPane_40);
		
		JTextPane textPane_41 = new JTextPane();
		textPane_41.setText("�ֻ�");
		textPane_41.setBounds(392, 371, 30, 21);
		desktopPane_5.add(textPane_41);
		
		textField_50 = new JTextField();
		textField_50.setBounds(485, 371, 117, 21);
		desktopPane_5.add(textField_50);
		textField_50.setColumns(10);
		
		JButton button_19 = new JButton("ɾ��˾����Ϣ");
		button_19.setBounds(348, 474, 126, 23);
		desktopPane_5.add(button_19);
		
		JButton button_20 = new JButton("�޸�˾����Ϣ");
		button_20.setBounds(509, 474, 126, 23);
		desktopPane_5.add(button_20);
		
		textField_51 = new JTextField();
		textField_51.setBounds(485, 309, 117, 21);
		desktopPane_5.add(textField_51);
		textField_51.setColumns(10);
		
		textField_52 = new JTextField();
		textField_52.setBounds(485, 340, 40, 21);
		desktopPane_5.add(textField_52);
		textField_52.setColumns(10);
		
		textField_53 = new JTextField();
		textField_53.setBounds(532, 340, 30, 21);
		desktopPane_5.add(textField_53);
		textField_53.setColumns(10);
		
		textField_54 = new JTextField();
		textField_54.setBounds(572, 340, 30, 21);
		desktopPane_5.add(textField_54);
		textField_54.setColumns(10);
	}
}
