package TransitView;
/**
 * ��ת����ҵ��Ա�������������𳵡��ɻ�װ�˹�����ת���ĵ��ﵥ
 * @author ���
 * 2015.12.02
 * 
*/
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class flight {

	private JFrame frame;
	private JTable table;
	private JTabbedPane tabbedPane;
	private JDesktopPane desktopPane;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextPane textPane;
	private JTextField textField;
	private JTextPane textPane_6;
	private JTextField textField_6;
	private JTextPane textPane_7;
	private JTextField textField_7;
	private JTextPane textPane_8;
	private JTextField textField_8;
	private JTextPane textPane_9;
	private JTextField textField_9;
	private JTextPane textPane_10;
	private JTextPane textPane_11;
	private JTextField textField_10;
	private JButton button;
	private JTextPane textPane_12;
	private JTable table_2;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTable table_3;
	private JTextPane textPane_26;
	private JTextField textField_22;
	private JTextField textField_25;
	private JTextPane textPane_30;
	private JTextPane textPane_31;
	private JTextPane textPane_32;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextPane textPane_33;
	private JTextPane textPane_34;
	private JTextPane textPane_35;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextPane textPane_36;
	private JTextPane textPane_37;
	private JTextPane textPane_38;
	private JTextField textField_32;
	private JButton button_6;
	private JTextPane textPane_39;
	private JTextPane textPane_40;
	private JTable table_5;
	private JTable table_4;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JCheckBox chckbxNewCheckBox;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_35;
	private JTextField textField_36;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flight window = new flight();
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
	public flight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 80, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		frame.getContentPane().add(table, BorderLayout.WEST);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		//�ɻ�װ�˹���Ľ���
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("�ɻ�װ��", null, desktopPane, null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(117, 209, 765, 316);
		desktopPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
				"������", "��ת������ת�����"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane.setViewportView(table_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("������");
		textPane_2.setBounds(117, 80, 50, 21);
		desktopPane.add(textPane_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(226, 80, 133, 21);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("��װԱ");
		textPane_3.setBounds(117, 111, 50, 21);
		desktopPane.add(textPane_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(226, 111, 133, 21);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("  ��ת����ҵ��Ա��");
		textField_5.setBounds(117, 0, 765, 21);
		desktopPane.add(textField_5);
		textField_5.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setText("����(��/��/�գ�");
		textPane.setBounds(117, 49, 102, 21);
		desktopPane.add(textPane);
		
		textField = new JTextField();
		textField.setBounds(226, 49, 40, 21);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		textPane_6 = new JTextPane();
		textPane_6.setText("��ת������ת�����");
		textPane_6.setBounds(117, 142, 118, 26);
		desktopPane.add(textPane_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(245, 147, 212, 21);
		desktopPane.add(textField_6);
		textField_6.setColumns(10);
		
		textPane_7 = new JTextPane();
		textPane_7.setText("�����");
		textPane_7.setBounds(504, 49, 60, 21);
		desktopPane.add(textPane_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(569, 49, 196, 21);
		desktopPane.add(textField_7);
		textField_7.setColumns(10);
		
		textPane_8 = new JTextPane();
		textPane_8.setText("�����");
		textPane_8.setBounds(504, 80, 50, 21);
		desktopPane.add(textPane_8);
		
		textField_8 = new JTextField();
		textField_8.setBounds(569, 80, 196, 21);
		desktopPane.add(textField_8);
		textField_8.setColumns(10);
		
		textPane_9 = new JTextPane();
		textPane_9.setText("�����");
		textPane_9.setBounds(504, 110, 50, 21);
		desktopPane.add(textPane_9);
		
		textField_9 = new JTextField();
		textField_9.setBounds(569, 110, 196, 21);
		desktopPane.add(textField_9);
		textField_9.setColumns(10);
		
		textPane_10 = new JTextPane();
		textPane_10.setText("���������Ǽ�");
		textPane_10.setBounds(117, 173, 102, 26);
		desktopPane.add(textPane_10);
		
		textPane_11 = new JTextPane();
		textPane_11.setText("������");
		textPane_11.setBounds(226, 173, 60, 21);
		desktopPane.add(textPane_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(296, 173, 161, 21);
		desktopPane.add(textField_10);
		textField_10.setColumns(10);
		//��ӷɻ�װ�˵����¼�����
		button = new JButton("���");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null){
						table_1.setValueAt(textField_10.getText(), i, 0);
						table_1.setValueAt(textField_6.getText(), i, 1);
						break;
					}
				}
			}
		});
		button.setBounds(752, 173, 93, 23);
		desktopPane.add(button);
		
		textPane_12 = new JTextPane();
		textPane_12.setText("�˷ѣ�");
		textPane_12.setBounds(768, 146, 60, 21);
		desktopPane.add(textPane_12);
		
		//�����ɻ�װ�˵�һ�е��¼�����
		JButton button_1 = new JButton("����");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 0)!=null||table_1.getValueAt(i, 1)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						break;
					}
				}
			}
		});
		button_1.setBounds(230, 541, 93, 23);
		desktopPane.add(button_1);
		
		JButton button_2 = new JButton("�ύ");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(787, 541, 93, 23);
		desktopPane.add(button_2);
		
		textField_35 = new JTextField();
		textField_35.setBounds(276, 49, 30, 21);
		desktopPane.add(textField_35);
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		textField_36.setBounds(316, 49, 30, 21);
		desktopPane.add(textField_36);
		textField_36.setColumns(10);
		
		//��װ�˹���Ľ���
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("��װ��", null, desktopPane_1, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(116, 213, 744, 281);
		desktopPane_1.add(scrollPane_1);
		
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
				"������", "��ת������ת�����"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(30);
		scrollPane_1.setViewportView(table_2);
		
		textField_11 = new JTextField();
		textField_11.setText("  ��ת����ҵ��Ա��");
		textField_11.setBounds(116, 0, 744, 21);
		desktopPane_1.add(textField_11);
		textField_11.setColumns(10);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText("���ڣ���/��/�գ�");
		textPane_13.setBounds(116, 41, 102, 21);
		desktopPane_1.add(textPane_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(228, 41, 43, 21);
		desktopPane_1.add(textField_12);
		textField_12.setColumns(10);
		
		JTextPane textPane_17 = new JTextPane();
		textPane_17.setText("������");
		textPane_17.setBounds(116, 72, 45, 21);
		desktopPane_1.add(textPane_17);
		
		textField_15 = new JTextField();
		textField_15.setBounds(166, 72, 199, 21);
		desktopPane_1.add(textField_15);
		textField_15.setColumns(10);
		
		JTextPane textPane_18 = new JTextPane();
		textPane_18.setText("��װԱ");
		textPane_18.setBounds(116, 103, 45, 21);
		desktopPane_1.add(textPane_18);
		
		textField_16 = new JTextField();
		textField_16.setBounds(166, 103, 199, 21);
		desktopPane_1.add(textField_16);
		textField_16.setColumns(10);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setText("��ת������ת�����");
		textPane_19.setBounds(116, 134, 115, 21);
		desktopPane_1.add(textPane_19);
		
		textField_17 = new JTextField();
		textField_17.setBounds(236, 134, 129, 21);
		desktopPane_1.add(textField_17);
		textField_17.setColumns(10);
		
		JTextPane textPane_20 = new JTextPane();
		textPane_20.setText("���������Ǽ�");
		textPane_20.setBounds(116, 172, 100, 21);
		desktopPane_1.add(textPane_20);
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setText("������");
		textPane_21.setBounds(226, 172, 45, 21);
		desktopPane_1.add(textPane_21);
		
		textField_18 = new JTextField();
		textField_18.setBounds(281, 172, 129, 21);
		desktopPane_1.add(textField_18);
		textField_18.setColumns(10);
		
		JTextPane textPane_22 = new JTextPane();
		textPane_22.setText("���κ�");
		textPane_22.setBounds(436, 41, 45, 21);
		desktopPane_1.add(textPane_22);
		
		JTextPane textPane_23 = new JTextPane();
		textPane_23.setText("�����");
		textPane_23.setBounds(436, 72, 45, 21);
		desktopPane_1.add(textPane_23);
		
		JTextPane textPane_24 = new JTextPane();
		textPane_24.setText("�����");
		textPane_24.setBounds(436, 103, 45, 21);
		desktopPane_1.add(textPane_24);
		
		textField_19 = new JTextField();
		textField_19.setBounds(491, 41, 226, 21);
		desktopPane_1.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(491, 72, 226, 21);
		desktopPane_1.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(491, 103, 226, 21);
		desktopPane_1.add(textField_21);
		textField_21.setColumns(10);
		//��ӻ�װ�˵��ŵ��¼�����
		JButton button_3 = new JButton("���");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_2.getRowCount();i++){
					if(table_2.getValueAt(i, 0)==null&&table_2.getValueAt(i, 1)==null){
						table_2.setValueAt(textField_18.getText(), i, 0);
						table_2.setValueAt(textField_17.getText(), i, 1);
						break;
					}
				}
			}
		});
		button_3.setBounds(723, 172, 93, 23);
		desktopPane_1.add(button_3);
		
		JTextPane textPane_25 = new JTextPane();
		textPane_25.setText("�˷ѣ�");
		textPane_25.setBounds(723, 134, 45, 21);
		desktopPane_1.add(textPane_25);
		
		//������װ�˵���һ�е��¼�����
		JButton button_4 = new JButton("����");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_2.getRowCount()-1;i>=0;i--){
					if(table_2.getValueAt(i, 0)!=null||table_2.getValueAt(i, 1)!=null){
						table_2.setValueAt(null, i, 0);
						table_2.setValueAt(null, i, 1);
						break;
					}
				}
			}
		});
		button_4.setBounds(204, 519, 93, 23);
		desktopPane_1.add(button_4);
		
		JButton button_5 = new JButton("�ύ");
		button_5.setBounds(778, 519, 93, 23);
		desktopPane_1.add(button_5);
		
		textField_23 = new JTextField();
		textField_23.setBounds(281, 41, 30, 21);
		desktopPane_1.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(321, 41, 30, 21);
		desktopPane_1.add(textField_24);
		textField_24.setColumns(10);
		
		//����װ�˹���Ľ���
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("����װ��", null, desktopPane_2, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(117, 215, 720, 285);
		desktopPane_2.add(scrollPane_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
				"������", "��ת������ת�����"
			}
		));
		scrollPane_2.setViewportView(table_3);
		
		textPane_26 = new JTextPane();
		textPane_26.setText("���ڣ���/��/�գ�");
		textPane_26.setBounds(117, 44, 30, 21);
		desktopPane_2.add(textPane_26);
		
		textField_22 = new JTextField();
		textField_22.setBounds(172, 44, 40, 21);
		desktopPane_2.add(textField_22);
		textField_22.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setText("  ��ת����ҵ��Ա��");
		textField_25.setBounds(117, 0, 720, 21);
		desktopPane_2.add(textField_25);
		textField_25.setColumns(10);
		
		textPane_30 = new JTextPane();
		textPane_30.setText("������");
		textPane_30.setBounds(117, 75, 45, 21);
		desktopPane_2.add(textPane_30);
		
		textPane_31 = new JTextPane();
		textPane_31.setText("��װԱ");
		textPane_31.setBounds(117, 106, 45, 21);
		desktopPane_2.add(textPane_31);
		
		textPane_32 = new JTextPane();
		textPane_32.setText("��ת������ת�����");
		textPane_32.setBounds(117, 137, 120, 21);
		desktopPane_2.add(textPane_32);
		
		textField_26 = new JTextField();
		textField_26.setBounds(172, 75, 191, 21);
		desktopPane_2.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(172, 106, 191, 21);
		desktopPane_2.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(247, 137, 116, 21);
		desktopPane_2.add(textField_28);
		textField_28.setColumns(10);
		
		textPane_33 = new JTextPane();
		textPane_33.setText("���κ�");
		textPane_33.setBounds(470, 44, 45, 21);
		desktopPane_2.add(textPane_33);
		
		textPane_34 = new JTextPane();
		textPane_34.setText("�����");
		textPane_34.setBounds(470, 75, 45, 21);
		desktopPane_2.add(textPane_34);
		
		textPane_35 = new JTextPane();
		textPane_35.setText("Ѻ��Ա");
		textPane_35.setBounds(470, 106, 45, 21);
		desktopPane_2.add(textPane_35);
		
		textField_29 = new JTextField();
		textField_29.setBounds(525, 44, 166, 21);
		desktopPane_2.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(524, 75, 167, 21);
		desktopPane_2.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(525, 106, 166, 21);
		desktopPane_2.add(textField_31);
		textField_31.setColumns(10);
		
		textPane_36 = new JTextPane();
		textPane_36.setText("��������Ǽ�");
		textPane_36.setBounds(117, 176, 82, 21);
		desktopPane_2.add(textPane_36);
		
		textPane_37 = new JTextPane();
		textPane_37.setBounds(172, 184, 6, 21);
		desktopPane_2.add(textPane_37);
		
		textPane_38 = new JTextPane();
		textPane_38.setText("������");
		textPane_38.setBounds(202, 176, 45, 21);
		desktopPane_2.add(textPane_38);
		
		textField_32 = new JTextField();
		textField_32.setBounds(257, 176, 106, 21);
		desktopPane_2.add(textField_32);
		textField_32.setColumns(10);
		//�������װ�˵����¼�����
		button_6 = new JButton("���");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_3.getRowCount();i++){
					if(table_3.getValueAt(i, 0)==null&&table_3.getValueAt(i, 1)==null){
						table_3.setValueAt(textField_32.getText(), i, 0);
						table_3.setValueAt(textField_28.getText(), i, 1);
						break;
					}
				}
			}
		});
		button_6.setBounds(666, 174, 96, 23);
		desktopPane_2.add(button_6);
		
		textPane_39 = new JTextPane();
		textPane_39.setText("�˷ѣ�");
		textPane_39.setBounds(669, 137, 45, 21);
		desktopPane_2.add(textPane_39);
		
		textPane_40 = new JTextPane();
		textPane_40.setText("��������");
		textPane_40.setBounds(708, 44, 54, 21);
		desktopPane_2.add(textPane_40);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"��ת��", "װ����"}));
		comboBox_1.setBounds(772, 44, 65, 21);
		desktopPane_2.add(comboBox_1);
		
		//��������װ�˵���һ�е��¼�����
		JButton button_10 = new JButton("����");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null||table_3.getValueAt(i, 1)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						break;
					}
				}
			}
		});
		button_10.setBounds(119, 530, 93, 23);
		desktopPane_2.add(button_10);
		
		JButton button_11 = new JButton("�ύ");
		button_11.setBounds(669, 530, 93, 23);
		desktopPane_2.add(button_11);
		
		textField_13 = new JTextField();
		textField_13.setBounds(222, 44, 30, 21);
		desktopPane_2.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(262, 44, 30, 21);
		desktopPane_2.add(textField_14);
		textField_14.setColumns(10);
		
		//��ת���ĵ��ﵥ�Ľ���
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("��ת���ĵ��ﵥ", null, desktopPane_3, null);
		
		table_5 = new JTable();
		table_5.setBounds(446, 366, 1, 1);
		desktopPane_3.add(table_5);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(116, 212, 735, 294);
		desktopPane_3.add(scrollPane_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				 "������", "����״̬"
			}
		));
		scrollPane_3.setViewportView(table_4);
		
		textField_33 = new JTextField();
		textField_33.setText("  ��ת����ҵ��Ա��");
		textField_33.setBounds(116, 0, 735, 21);
		desktopPane_3.add(textField_33);
		textField_33.setColumns(10);
		
		JTextPane textPane_41 = new JTextPane();
		textPane_41.setText("���ڣ���/��/�գ�");
		textPane_41.setBounds(116, 31, 103, 21);
		desktopPane_3.add(textPane_41);
		
		textField_34 = new JTextField();
		textField_34.setBounds(229, 31, 39, 21);
		desktopPane_3.add(textField_34);
		textField_34.setColumns(10);
		
		JTextPane textPane_45 = new JTextPane();
		textPane_45.setText("������");
		textPane_45.setBounds(116, 62, 45, 21);
		desktopPane_3.add(textPane_45);
		
		textField_37 = new JTextField();
		textField_37.setBounds(166, 62, 199, 21);
		desktopPane_3.add(textField_37);
		textField_37.setColumns(10);
		
		JTextPane textPane_46 = new JTextPane();
		textPane_46.setText("װ������");
		textPane_46.setBounds(446, 31, 55, 21);
		desktopPane_3.add(textPane_46);
		
		textField_38 = new JTextField();
		textField_38.setBounds(511, 31, 145, 21);
		desktopPane_3.add(textField_38);
		textField_38.setColumns(10);
		
		JTextPane textPane_47 = new JTextPane();
		textPane_47.setText("��ת���ı��");
		textPane_47.setBounds(446, 62, 78, 21);
		desktopPane_3.add(textPane_47);
		
		textField_39 = new JTextField();
		textField_39.setBounds(534, 62, 122, 21);
		desktopPane_3.add(textField_39);
		textField_39.setColumns(10);
		
		JTextPane textPane_48 = new JTextPane();
		textPane_48.setText("�����쳣����״̬�Ǽ�");
		textPane_48.setBounds(116, 111, 126, 21);
		desktopPane_3.add(textPane_48);
		
		JTextPane textPane_49 = new JTextPane();
		textPane_49.setText("������");
		textPane_49.setBounds(166, 148, 45, 21);
		desktopPane_3.add(textPane_49);
		
		textField_40 = new JTextField();
		textField_40.setBounds(211, 148, 154, 21);
		desktopPane_3.add(textField_40);
		textField_40.setColumns(10);
		
		JTextPane textPane_50 = new JTextPane();
		textPane_50.setText("����״̬");
		textPane_50.setBounds(446, 148, 55, 21);
		desktopPane_3.add(textPane_50);
		//�����ת���ĵ��ﵥ���¼�����
		JButton button_7 = new JButton("���");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_4.getRowCount();i++){
					if(table_4.getValueAt(i, 0)==null&&table_4.getValueAt(i, 1)==null){
						table_4.setValueAt(textField_40.getText(), i, 0);
						table_4.setValueAt(comboBox.getSelectedItem(), i, 1);
						break;
					}
				}
			}
		});
		button_7.setBounds(687, 168, 93, 23);
		desktopPane_3.add(button_7);
		
		//������ת���ĵ��ﵥtable��һ�е��¼�����
		JButton button_8 = new JButton("����");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_4.getRowCount()-1;i>=0;i--){
					if(table_4.getValueAt(i, 0)!=null||table_4.getValueAt(i, 1)!=null){
						table_4.setValueAt(null, i, 0);
						table_4.setValueAt(null, i, 1);
						break;
					}
				}
			}
		});
		button_8.setBounds(166, 533, 93, 23);
		desktopPane_3.add(button_8);
		
		JButton button_9 = new JButton("�ύ");
		button_9.setBounds(687, 533, 93, 23);
		desktopPane_3.add(button_9);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"��ʧ", "����"}));
		comboBox.setBounds(511, 148, 78, 21);
		desktopPane_3.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(278, 31, 30, 21);
		desktopPane_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(318, 31, 30, 21);
		desktopPane_3.add(textField_2);
		textField_2.setColumns(10);
	}
}
