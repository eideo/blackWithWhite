package financial;
/**
 * ������Ա����������������֧���������ѯ���˻�����
 * @author ���
 * 2015.12.03
 * 
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class accountAddition {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTextField textField_8;
	private JTable table_1;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table_2;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTable table_3;
	private JTextField textField_21;
	private JTable table_4;
	private JTextField textField_22;
	private JTable table_5;
	private JTextField textField_23;
	private JTable table_6;
	private JTable table_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accountAddition window = new accountAddition();
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
	public accountAddition() {
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
		
		//�������Ľ���
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("�������", null, desktopPane, null);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("�鿴���ڣ���/��/�գ�");
		textPane_9.setBounds(150, 43, 126, 21);
		desktopPane.add(textPane_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(286, 43, 105, 21);
		desktopPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton button_3 = new JButton("��ѯ");
		button_3.setBounds(649, 93, 93, 23);
		desktopPane.add(button_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 156, 700, 376);
		desktopPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
				"�տ�����", "�տλ", "�տ���", "�տ", "�տ���", "�տ�ص�"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"��ѡ��Ӫҵ��", "����ʡ�Ͼ�������Ӫҵ��"}));
		comboBox.setBounds(534, 43, 158, 21);
		desktopPane.add(comboBox);
		
		//����֧���Ľ���
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("����֧��", null, desktopPane_1, null);
		
		textField = new JTextField();
		textField.setText("  ������Ա��");
		textField.setBounds(150, 0, 700, 21);
		desktopPane_1.add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("��������(��/��/�գ�");
		textPane.setBounds(150, 31, 121, 21);
		desktopPane_1.add(textPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(281, 31, 139, 21);
		desktopPane_1.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("������");
		textPane_4.setBounds(472, 31, 54, 21);
		desktopPane_1.add(textPane_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(536, 31, 66, 21);
		desktopPane_1.add(textField_4);
		textField_4.setColumns(10);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("������");
		textPane_5.setBounds(653, 31, 42, 21);
		desktopPane_1.add(textPane_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(705, 31, 128, 21);
		desktopPane_1.add(textField_5);
		textField_5.setColumns(10);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("�����˺�");
		textPane_6.setBounds(150, 62, 54, 21);
		desktopPane_1.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("��Ŀ");
		textPane_7.setBounds(482, 62, 31, 21);
		desktopPane_1.add(textPane_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(536, 62, 66, 21);
		desktopPane_1.add(textField_6);
		textField_6.setColumns(10);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("��ע");
		textPane_8.setBounds(663, 62, 31, 21);
		desktopPane_1.add(textPane_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(705, 62, 128, 21);
		desktopPane_1.add(textField_7);
		textField_7.setColumns(10);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"�й�ũҵ�����Ͼ�����֧��", "�й�ũҵ�����Ͼ���ϼ֧��"}));
		comboBox_1.setBounds(214, 62, 206, 21);
		desktopPane_1.add(comboBox_1);
		
		//��Ӹ�����¼�����
		JButton button = new JButton("���");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table.getRowCount();i++){
					if(table.getValueAt(i, 0)==null&&table.getValueAt(i, 1)==null&&table.getValueAt(i, 2)==null&&table.getValueAt(i, 3)==null&&table.getValueAt(i, 4)==null
							&&table.getValueAt(i, 5)==null&&table.getValueAt(i, 6)==null){
				           table.setValueAt(i+1, i, 0);
				           table.setValueAt(textField_1.getText(), i, 1);
				           table.setValueAt(textField_4.getText(), i, 2);
				           table.setValueAt(textField_5.getText(), i, 3);
				           table.setValueAt(comboBox_1.getSelectedItem(), i, 4);
				           table.setValueAt(textField_6.getText(), i, 5);
				           table.setValueAt(textField_7.getText(), i, 6);
				           break;
					}
				}
			}
		});
		button.setBounds(705, 116, 93, 23);
		desktopPane_1.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 169, 700, 327);
		desktopPane_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"���ID", "��������", "������", "������", "�����˻�", "��Ŀ", "��ע"
			}
		));
		scrollPane.setViewportView(table);
		//�������table��һ�е��¼�����
		JButton button_1 = new JButton("����");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i =table.getRowCount()-1;i>=0;i--){
					if(table.getValueAt(i, 0)!=null||table.getValueAt(i, 1)!=null||table.getValueAt(i, 2)!=null||table.getValueAt(i, 3)!=null||
							table.getValueAt(i, 4)!=null||table.getValueAt(i, 5)!=null||table.getValueAt(i, 6)!=null){
						table.setValueAt(null, i, 0);
						table.setValueAt(null, i, 1);
						table.setValueAt(null, i, 2);
						table.setValueAt(null, i, 3);
						table.setValueAt(null, i, 4);
						table.setValueAt(null, i, 5);
						table.setValueAt(null, i, 6);
						break;
					}
				}
			}
		});
		button_1.setBounds(178, 523, 93, 23);
		desktopPane_1.add(button_1);
		
		JButton button_2 = new JButton("�ύ");
		button_2.setBounds(705, 523, 93, 23);
		desktopPane_1.add(button_2);
		
		//�����ѯ�Ľ���
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("�����ѯ", null, desktopPane_2, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(90, 76, 800, 459);
		desktopPane_2.add(tabbedPane_1);
		
		//�ɱ������Ĳ�ѯ����
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane_1.addTab("�ɱ������", null, desktopPane_4, null);
		
		JTextPane textPane_24 = new JTextPane();
		textPane_24.setText("ϵͳ��ǰ���ڣ�");
		textPane_24.setBounds(138, 45, 90, 21);
		desktopPane_4.add(textPane_24);
		
		JButton button_17 = new JButton("��ѯ");
		button_17.setBounds(500, 90, 93, 23);
		desktopPane_4.add(button_17);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(114, 186, 479, 43);
		desktopPane_4.add(scrollPane_7);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"������", "��֧��", "������", "��ֹʱ��"
			}
		));
		scrollPane_7.setViewportView(table_7);
		
		JButton button_18 = new JButton("����");
		button_18.setBounds(500, 357, 93, 23);
		desktopPane_4.add(button_18);
		
		//��Ӫ�����Ĳ�ѯ����
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(Color.WHITE);
		tabbedPane_1.addTab("��Ӫ�����", null, desktopPane_5, null);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText("��ʼ���ڣ���/��/�գ�");
		textPane_13.setBounds(86, 32, 126, 21);
		desktopPane_5.add(textPane_13);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText("�������ڣ���/��/�գ�");
		textPane_14.setBounds(86, 66, 126, 21);
		desktopPane_5.add(textPane_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(222, 32, 126, 21);
		desktopPane_5.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(222, 66, 126, 21);
		desktopPane_5.add(textField_12);
		textField_12.setColumns(10);
		
		JButton button_4 = new JButton("��ѯ");
		button_4.setBounds(569, 96, 93, 23);
		desktopPane_5.add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(86, 141, 576, 250);
		desktopPane_5.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"�տ", "���"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JButton button_5 = new JButton("����");
		button_5.setBounds(676, 397, 93, 23);
		desktopPane_5.add(button_5);
		
		//�˻�����Ľ���
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("�˻�����", null, desktopPane_3, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(91, 80, 753, 465);
		desktopPane_3.add(tabbedPane_2);
		
		//�����˻��Ľ���
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_2.addTab("�����˻�", null, desktopPane_6, null);
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setText("�˺�");
		textPane_21.setBounds(80, 21, 32, 21);
		desktopPane_6.add(textPane_21);
		
		textField_18 = new JTextField();
		textField_18.setBounds(122, 21, 100, 21);
		desktopPane_6.add(textField_18);
		textField_18.setColumns(10);
		
		JTextPane textPane_22 = new JTextPane();
		textPane_22.setText("����");
		textPane_22.setBounds(264, 21, 32, 21);
		desktopPane_6.add(textPane_22);
		
		textField_19 = new JTextField();
		textField_19.setBounds(306, 21, 66, 21);
		desktopPane_6.add(textField_19);
		textField_19.setColumns(10);
		
		JTextPane textPane_23 = new JTextPane();
		textPane_23.setText("���");
		textPane_23.setBounds(416, 21, 32, 21);
		desktopPane_6.add(textPane_23);
		
		textField_20 = new JTextField();
		textField_20.setBounds(458, 21, 66, 21);
		desktopPane_6.add(textField_20);
		textField_20.setColumns(10);
		//����˻���Ϣ���¼�����
		JButton button_6 = new JButton("���");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_3.getRowCount();i++){
				    if(table_3.getValueAt(i, 0)==null&&table_3.getValueAt(i, 1)==null&&table_3.getValueAt(i, 2)==null){
				        table_3.setValueAt(textField_18.getText(), i, 0);
				        table_3.setValueAt(textField_19.getText(), i, 1);
				        table_3.setValueAt(textField_20.getText(), i, 2);
				        break;
				    }
				}
			}
		});
		button_6.setBounds(547, 52, 93, 23);
		desktopPane_6.add(button_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(80, 97, 560, 274);
		desktopPane_6.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
				 "�˺�", "����", "���"
			}
		));
		scrollPane_3.setViewportView(table_3);
		//�����˻���Ϣtable��һ�е��¼�����
		JButton button_7 = new JButton("����");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i = table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null||table_3.getValueAt(i, 1)!=null||table_3.getValueAt(i, 2)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_7.setBounds(122, 392, 93, 23);
		desktopPane_6.add(button_7);
		
		JButton button_8 = new JButton("�ύ");
		button_8.setBounds(547, 392, 93, 23);
		desktopPane_6.add(button_8);
		
		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(Color.WHITE);
		tabbedPane_2.addTab("�޸��˻���Ϣ", null, desktopPane_7, null);
		
		textField_21 = new JTextField();
		textField_21.setText("�����˺Ż����ƹؼ�������");
		textField_21.setBounds(164, 30, 299, 21);
		desktopPane_7.add(textField_21);
		textField_21.setColumns(10);
		
		JButton button_9 = new JButton("��ѯ");
		button_9.setBounds(496, 29, 93, 23);
		desktopPane_7.add(button_9);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(110, 89, 534, 284);
		desktopPane_7.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				 "�˺�", "����", "���", "����"
			}
		));
		scrollPane_4.setViewportView(table_4);
		//�����޸��˺���Ϣ���¼�����
		JButton button_10 = new JButton("����");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_4.getRowCount()-1;i>=0;i--){
					if(table_4.getValueAt(i, 0)!=null||table_4.getValueAt(i, 1)!=null||table_4.getValueAt(i, 2)!=null||table_4.getValueAt(i, 3)!=null){
						table_4.setValueAt(null, i, 0);
						table_4.setValueAt(null, i, 1);
						table_4.setValueAt(null, i, 2);
						table_4.setValueAt(null, i, 3);
						break;
					}
				}
			}
		});
		button_10.setBounds(147, 396, 93, 23);
		desktopPane_7.add(button_10);
		
		JButton button_11 = new JButton("�ύ");
		button_11.setBounds(496, 396, 93, 23);
		desktopPane_7.add(button_11);
		
		JDesktopPane desktopPane_8 = new JDesktopPane();
		desktopPane_8.setBackground(Color.WHITE);
		tabbedPane_2.addTab("ɾ���˻�", null, desktopPane_8, null);
		
		textField_22 = new JTextField();
		textField_22.setText("�����˺Ż����ƹؼ�������");
		textField_22.setBounds(161, 37, 286, 21);
		desktopPane_8.add(textField_22);
		textField_22.setColumns(10);
		
		JButton button_12 = new JButton("��ѯ");
		button_12.setBounds(493, 36, 93, 23);
		desktopPane_8.add(button_12);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(93, 91, 559, 280);
		desktopPane_8.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
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
				 "�˺�", "����", "���"
			}
		));
		scrollPane_5.setViewportView(table_5);
		//ɾ���˻���Ϣ���¼�����
		JButton button_13 = new JButton("ɾ��");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_5.getRowCount()-1;i>=0;i--){
					if(table_5.getValueAt(i, 0)!=null||table_5.getValueAt(i, 1)!=null||table_5.getValueAt(i, 2)!=null){
						table_5.setValueAt(null, i, 0);
						table_5.setValueAt(null, i, 1);
						table_5.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_13.setBounds(136, 393, 93, 23);
		desktopPane_8.add(button_13);
		
		JButton button_14 = new JButton("�ύ");
		button_14.setBounds(493, 393, 93, 23);
		desktopPane_8.add(button_14);
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.WHITE);
		tabbedPane_2.addTab("�����˻�", null, desktopPane_9, null);
		
		textField_23 = new JTextField();
		textField_23.setText("�����˺Ż����ƹؼ�������");
		textField_23.setBounds(140, 37, 299, 21);
		desktopPane_9.add(textField_23);
		textField_23.setColumns(10);
		
		JButton button_15 = new JButton("��ѯ");
		button_15.setBounds(489, 36, 93, 23);
		desktopPane_9.add(button_15);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(91, 88, 559, 289);
		desktopPane_9.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"�˺�", "����", "���"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		JButton button_16 = new JButton("ȷ��");
		button_16.setBounds(489, 387, 93, 23);
		desktopPane_9.add(button_16);
		
		textField_17 = new JTextField();
		textField_17.setText("  ������Ա��");
		textField_17.setBounds(91, 0, 753, 21);
		desktopPane_3.add(textField_17);
		textField_17.setColumns(10);
	}
}
