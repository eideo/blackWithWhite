package ui;
/**
 * Ӫҵ��ҵ��Ա��������װ������Ӫҵ�����ﵥ���ɼ������տ��д��˾���ͳ�����Ϣ����
 * @author ���
 * 2015.12.02
 * 
 * 
 * 
 * **/

import java.awt.EventQueue;

import javax.imageio.ImageIO;
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

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JCheckBox;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import bill.DriverPO;
import bill.TruckPO;
import bl.staff.Impl.DriverManage;
import bl.staff.Impl.DriverManageCotroller;
import bl.staff.Impl.TruckManage;
import bl.staff.Impl.TruckManageController;

public class businessHall {

	protected static final String ID = null;
	private JFrame frame;
	private JTextField textField_8;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JTextField textField_14;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table_1;
	private JTextField textField_20;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTable table_2;
	private JTextField textField_27;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTable table_3;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField;
	private JTable table_4;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTable table_5;
	private JTextField textField_39;
	private JTable table_6;
	private JTextField textField_40;
	private JTable table_7;
	private JTextField textField_41;
	private JTable table_8;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTable table_9;
	private JTextField textField_47;
	private JTable table_10;
	private JTextField textField_48;
	private JTable table_11;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					businessHall window = new businessHall();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public businessHall() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		//frame.setIconImage(new ImageIcon("/����3.png").getImage());
		frame.setBounds(200, 80, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����װ���������
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane_4 =new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane.addTab("����װ������", null, desktopPane_4, null);
		
		JLabel textPane_19 = new JLabel();
		textPane_19.setBackground(Color.WHITE);
		textPane_19.setText("װ�����ڣ���/��/�գ�");
		textPane_19.setBounds(150, 30, 126, 21);
		desktopPane_4.add(textPane_19);
		
		textField_27 = new JTextField();
		textField_27.setBounds(285, 30, 40, 21);
		desktopPane_4.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel textPane_20 = new JLabel();
		textPane_20.setBackground(Color.WHITE);
		textPane_20.setText("���˱��");
		textPane_20.setBounds(150, 60, 54, 21);
		desktopPane_4.add(textPane_20);
		
		JLabel textPane_21 = new JLabel();
		textPane_21.setBackground(Color.WHITE);
		textPane_21.setText("Ӫҵ�����");
		textPane_21.setBounds(150, 93, 75, 21);
		desktopPane_4.add(textPane_21);
		
		textField_30 = new JTextField();
		textField_30.setBounds(285, 60, 120, 21);
		desktopPane_4.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(285, 93, 120, 21);
		desktopPane_4.add(textField_31);
		textField_31.setColumns(10);
		
		JLabel textPane_22 = new JLabel();
		textPane_22.setBackground(Color.WHITE);
		textPane_22.setText("�����");
		textPane_22.setBounds(500, 30, 42, 21);
		desktopPane_4.add(textPane_22);
		
		JLabel textPane_23 = new JLabel();
		textPane_23.setBackground(Color.WHITE);
		textPane_23.setText("Ѻ��Ա");
		textPane_23.setBounds(499, 62, 42, 21);
		desktopPane_4.add(textPane_23);
		
		JLabel textPane_24 = new JLabel();
		textPane_24.setBackground(Color.WHITE);
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
		
		JLabel textPane_25 = new JLabel();
		textPane_25.setBackground(Color.WHITE);
		textPane_25.setText("������");
		textPane_25.setBounds(500, 151, 42, 21);
		desktopPane_4.add(textPane_25);
		
		textField_35 = new JTextField();
		textField_35.setBounds(551, 151, 155, 21);
		desktopPane_4.add(textField_35);
		textField_35.setColumns(10);
		
		final JButton button_13 = new JButton("���");
		button_13.setBackground(Color.GRAY);
		//���װ�������¼�����
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_3.getRowCount();i++){
					if(table_3.getValueAt(i, 0)==null&&table_3.getValueAt(i, 1)==null&&table_3.getValueAt(i, 2)==null&&table_3.getValueAt(i, 3)==null
							&&table_3.getValueAt(i, 4)==null&&table_3.getValueAt(i, 5)==null&&table_3.getValueAt(i, 6)==null&&table_3.getValueAt(i, 7)==null){
				        table_3.setValueAt(textField_35.getText(),i,0);
				        table_3.setValueAt(textField_27.getText()+textField_10.getText()+textField_15.getText(), i, 1);
				        table_3.setValueAt(textField_32.getText(), i, 2);
				        table_3.setValueAt(textField_30.getText(), i, 3);
		                table_3.setValueAt(textField_9.getText(), i, 4);
				        table_3.setValueAt(textField_33.getText(), i, 5);
				        table_3.setValueAt(textField_31.getText(), i, 6);
				        table_3.setValueAt(textField_34.getText(), i, 7);
				        break;
					}
				}
			}
			
		});
		
		button_13.setBounds(728, 150, 93, 23);
		desktopPane_4.add(button_13);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(150, 190, 700, 325);
		desktopPane_4.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setForeground(Color.BLACK);
		table_3.setBackground(new Color(255, 255, 255));
		table_3.setFont(new Font("SimSun", Font.PLAIN, 12));
		
		table_3.setModel(new DefaultTableModel(
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
				"������", "װ������", "�����", "��������", "���˱��", "Ѻ��Ա", "Ӫҵ�����", "��װԱ"
			}
		));
		scrollPane_3.setViewportView(table_3);
		//����װ����table��һ�е��¼�����
		JButton button_14 = new JButton("����");
		button_14.setBackground(Color.GRAY);
		button_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null||table_3.getValueAt(i, 1)!=null||table_3.getValueAt(i, 2)!=null||table_3.getValueAt(i, 3)!=null||
							table_3.getValueAt(i, 4)!=null||table_3.getValueAt(i, 5)!=null||table_3.getValueAt(i, 6)!=null||table_3.getValueAt(i, 7)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
						table_3.setValueAt(null, i, 3);
						table_3.setValueAt(null, i, 4);
						table_3.setValueAt(null, i, 5);
						table_3.setValueAt(null, i, 6);
						table_3.setValueAt(null, i, 7);
						break;
					}
				}
			}
		});
		
		button_14.setBounds(200, 536, 93, 23);
		desktopPane_4.add(button_14);
		
		//�ύһ��table���¼�����
		JButton button_16 = new JButton("�ύ");
		button_16.setBackground(Color.GRAY);
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_16.setBounds(757, 536, 93, 23);
		desktopPane_4.add(button_16);
		
		JLabel textPane_42 = new JLabel();
		textPane_42.setBackground(Color.WHITE);
		textPane_42.setText("��������");
		textPane_42.setBounds(150, 124, 54, 21);
		desktopPane_4.add(textPane_42);
		
		textField_9 = new JTextField();
		textField_9.setBounds(285, 128, 120, 21);
		desktopPane_4.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(335, 30, 30, 21);
		desktopPane_4.add(textField_10);
		textField_10.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(375, 30, 30, 21);
		desktopPane_4.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel textPane_34 = new JLabel();
		textPane_34.setBackground(Color.WHITE);
		textPane_34.setText("Ӫҵ��ҵ��Ա��");
		textPane_34.setBounds(280, 0, 700, 21);
		desktopPane_4.add(textPane_34);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		textPane_34.setText(df.format(new Date()));
		
		//Ӫҵ�����ﵥ�Ľ���
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("Ӫҵ�����ﵥ", null, desktopPane_1, null);
		
		JLabel textPane_8 = new JLabel();
		textPane_8.setText("��������");
		textPane_8.setBounds(150, 58, 54, 21);
		desktopPane_1.add(textPane_8);
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setText("����/��/�գ�");
		textPane_9.setBounds(200, 58, 78, 21);
		desktopPane_1.add(textPane_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(290, 58, 40, 21);
		desktopPane_1.add(textField_8);
		textField_8.setColumns(10);
		
		final JList list = new JList();
		list.setBounds(314, 212, 36, -40);
		desktopPane_1.add(list);
		
		JLabel textPane_10 = new JLabel();
		textPane_10.setText("������");
		textPane_10.setBounds(150, 89, 44, 21);
		desktopPane_1.add(textPane_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(290, 89, 120, 21);
		desktopPane_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel textPane_11 = new JLabel();
		textPane_11.setText("�������");
		textPane_11.setBounds(467, 132, 54, 21);
		desktopPane_1.add(textPane_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(540, 132, 126, 21);
		desktopPane_1.add(textField_12);
		textField_12.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"���ﵽ��״̬", "����", "����"}));
		comboBox.setBounds(540, 58, 126, 21);
		desktopPane_1.add(comboBox);
		//���Ӫҵ�����ﵥ���¼�����
		JButton button_4 = new JButton("���");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table.getRowCount();i++){
					if(table.getValueAt(i, 0)==null&&table.getValueAt(i, 1)==null&&table.getValueAt(i, 2)==null&&table.getValueAt(i, 3)==null){
				          table.setValueAt(textField_12.getText(), i, 0);
				          table.setValueAt(textField_8.getText()+textField_16.getText()+textField_21.getText(), i, 1);
				          table.setValueAt(textField_11.getText(), i, 2);
				          table.setValueAt(comboBox.getSelectedItem(), i, 3);
				          break;
					}
				}
			}
		});
		button_4.setBounds(708, 130, 93, 23);
		desktopPane_1.add(button_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 190, 700, 325);
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
				"�������", "��������", "������", "���ﵽ��״̬"
			}
		));
		scrollPane.setViewportView(table);
		
		//����Ӫҵ�����ﵥtable�е�һ�е��¼�����
		JButton button_5 = new JButton("����");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table.getRowCount()-1;i>=0;i--){
					if(table.getValueAt(i, 0)!=null||table.getValueAt(i, 1)!=null||table.getValueAt(i, 2)!=null||table.getValueAt(i, 3)!=null){
						table.setValueAt(null, i, 0);
						table.setValueAt(null, i, 1);
						table.setValueAt(null, i, 2);
						table.setValueAt(null, i, 3);
						break;
					}
				}
			}
		});
		button_5.setBounds(259, 528, 93, 23);
		desktopPane_1.add(button_5);
		
		JButton button_6 = new JButton("�ύ");
		button_6.setBounds(708, 528, 93, 23);
		desktopPane_1.add(button_6);
		
		//�ɼ����Ľ���
		textField_16 = new JTextField();
		textField_16.setBounds(340, 58, 30, 21);
		desktopPane_1.add(textField_16);
		textField_16.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(380, 58, 30, 21);
		desktopPane_1.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel textPane_35 = new JLabel();
		textPane_35.setText("Ӫҵ��ҵ��Ա��");
		textPane_35.setBounds(280, 0, 700, 21);
		desktopPane_1.add(textPane_35);
		textPane_35.setText(df.format(new Date()));
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("�ɼ���", null, desktopPane_2, null);
		
		JLabel textPane_12 = new JLabel();
		textPane_12.setText("�������ڣ���/��/�գ�");
		textPane_12.setBounds(150, 46, 126, 21);
		desktopPane_2.add(textPane_12);
		
		textField_14 = new JTextField();
		textField_14.setBounds(286, 46, 40, 21);
		desktopPane_2.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel textPane_13 = new JLabel();
		textPane_13.setText("����Ա");
		textPane_13.setBounds(500, 46, 45, 21);
		desktopPane_2.add(textPane_13);
		
		textField_17 = new JTextField();
		textField_17.setBounds(555, 46, 85, 21);
		desktopPane_2.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel textPane_14 = new JLabel();
		textPane_14.setText("�������");
		textPane_14.setBounds(425, 100, 54, 21);
		desktopPane_2.add(textPane_14);
		
		textField_18 = new JTextField();
		textField_18.setBounds(500, 100, 140, 21);
		desktopPane_2.add(textField_18);
		textField_18.setColumns(10);
		//����ɼ������¼�����
		JButton button_7 = new JButton("���");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null){
				        table_1.setValueAt(textField_18.getText(), i, 0);
				        table_1.setValueAt(textField_14.getText()+textField_22.getText()+textField_49.getText(), i, 1);
				        table_1.setValueAt(textField_17.getText(), i, 2);
				        break;
					}
				}
			}
		});
		button_7.setBounds(693, 99, 93, 23);
		desktopPane_2.add(button_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 190, 700, 325);
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
				"�������", "��������", "����Ա"
			}
		));
		scrollPane_1.setViewportView(table_1);
		//�����ɼ���table�е�һ�е��¼�����
		JButton button_8 = new JButton("����");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 0)!=null||table_1.getValueAt(i, 1)!=null||table_1.getValueAt(i, 2)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_8.setBounds(200, 522, 93, 23);
		desktopPane_2.add(button_8);
		
		JButton button_9 = new JButton("�ύ");
		button_9.setBounds(693, 522, 93, 23);
		desktopPane_2.add(button_9);
		
		//�տ��д�Ľ���
		textField_22 = new JTextField();
		textField_22.setBounds(336, 46, 30, 21);
		desktopPane_2.add(textField_22);
		textField_22.setColumns(10);
		
		textField_49 = new JTextField();
		textField_49.setBounds(376, 46, 30, 21);
		desktopPane_2.add(textField_49);
		textField_49.setColumns(10);
		
		JLabel textPane_36 = new JLabel();
		textPane_36.setText("Ӫҵ��ҵ��Ա��");
		textPane_36.setBounds(280, 0, 700, 21);
		desktopPane_2.add(textPane_36);
		textPane_36.setText(df.format(new Date()));
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("�տ��д", null, desktopPane_3, null);
		
		JLabel textPane_15 = new JLabel();
		textPane_15.setText("�տ����ڣ���/��/�գ�");
		textPane_15.setBounds(150, 45, 126, 21);
		desktopPane_3.add(textPane_15);
		
		textField_20 = new JTextField();
		textField_20.setBounds(286, 45, 40, 21);
		desktopPane_3.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel textPane_16 = new JLabel();
		textPane_16.setText("�տ���Ա");
		textPane_16.setBounds(512, 45, 66, 21);
		desktopPane_3.add(textPane_16);
		
		textField_23 = new JTextField();
		textField_23.setBounds(588, 45, 90, 21);
		desktopPane_3.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel textPane_17 = new JLabel();
		textPane_17.setText("�տ���");
		textPane_17.setBounds(179, 76, 54, 21);
		desktopPane_3.add(textPane_17);
		
		textField_24 = new JTextField();
		textField_24.setBounds(286, 76, 123, 21);
		desktopPane_3.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel textPane_18 = new JLabel();
		textPane_18.setText("�������");
		textPane_18.setBounds(443, 131, 54, 21);
		desktopPane_3.add(textPane_18);
		
		textField_25 = new JTextField();
		textField_25.setBounds(512, 131, 166, 21);
		desktopPane_3.add(textField_25);
		textField_25.setColumns(10);
		//����տ���¼�����
		JButton button_10 = new JButton("���");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_2.getRowCount();i++){
					if(table_2.getValueAt(i, 0)==null&&table_2.getValueAt(i, 1)==null&&table_2.getValueAt(i, 3)==null){
				        table_2.setValueAt(textField_20.getText()+textField_50.getText()+textField_51.getText(), i, 0);
				        table_2.setValueAt(textField_23.getText(), i, 1);
				        table_2.setValueAt(textField_24.getText(), i, 2);
				        table_2.setValueAt(textField_25.getText(), i, 3);
				        break;
					}
				}
			}
		});
		button_10.setBounds(739, 131, 93, 23);
		desktopPane_3.add(button_10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(150, 190, 700, 325);
		desktopPane_3.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
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
			    "�տ�����", "�տ���Ա", "�տ���", "�������"
			}
		));
		scrollPane_2.setViewportView(table_2);
		//�����տtable��һ�е��¼�����
		JButton button_11 = new JButton("����");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_2.getRowCount()-1;i>=0;i--){
					if(table_2.getValueAt(i, 0)!=null||table_2.getValueAt(i, 1)!=null||table_2.getValueAt(i, 2)!=null||table_2.getValueAt(i, 3)!=null){
						table_2.setValueAt(null, i, 0);
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						break;
					}
				}
			}
		});
		button_11.setBounds(200, 524, 93, 23);
		desktopPane_3.add(button_11);
		
		JButton button_12 = new JButton("�ύ");
		button_12.setBounds(739, 524, 93, 23);
		desktopPane_3.add(button_12);
		
		textField_50 = new JTextField();
		textField_50.setBounds(336, 45, 30, 21);
		desktopPane_3.add(textField_50);
		textField_50.setColumns(10);
		
		textField_51 = new JTextField();
		textField_51.setBounds(376, 45, 30, 21);
		desktopPane_3.add(textField_51);
		textField_51.setColumns(10);
		
		JLabel textPane_37 = new JLabel();
		textPane_37.setText("Ӫҵ��ҵ��Ա��");
		textPane_37.setBounds(280, 0, 700, 21);
		desktopPane_3.add(textPane_37);
		textPane_37.setText(df.format(new Date()));
		
		//˾����Ϣ����Ľ���
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("˾����Ϣ����", null, desktopPane, null);
		
		final JLabel textPane_38 = new JLabel();
		textPane_38.setText("Ӫҵ��ҵ��Ա��");
		textPane_38.setBounds(280, 0, 700, 21);
		desktopPane.add(textPane_38);
		textPane_38.setText(df.format(new Date()));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(55, 40, 856, 509);
		desktopPane.add(tabbedPane_1);
		
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_1.addTab("����˾����Ϣ", null, desktopPane_6, null);
		
		JLabel textPane = new JLabel();
		textPane.setText("˾�����");
		textPane.setBounds(100, 96, 54, 21);
		desktopPane_6.add(textPane);
		
		textField = new JTextField();
		textField.setBounds(176, 96, 130, 21);
		desktopPane_6.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(80, 210, 700, 45);
		desktopPane_6.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"˾�����", "����", "�Ա�", "���֤��", "��������", "��ʻ֤����", "�ֻ�"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		//����˾����Ϣ���¼�����
		JButton button = new JButton("����");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField.getText());
				if(dp==null){
					textPane_38.setText("δ���ҵ��κ�˾����Ϣ��");
					Timer time=new Timer();
					
				}else{
					table_4.setValueAt(dp.ID, 0, 0);
					table_4.setValueAt(dp.name, 0, 1);
					table_4.setValueAt(dp.isBoy, 0, 2);
					table_4.setValueAt(dp.IDNumber, 0, 3);
					table_4.setValueAt(dp.birthday, 0, 4);
					table_4.setValueAt(dp.validData, 0, 5);
					table_4.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button.setBounds(485, 95, 93, 23);
		desktopPane_6.add(button);
		
		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(Color.WHITE);
		tabbedPane_1.addTab("�����µ�˾����Ϣ", null, desktopPane_7, null);
		
		JLabel textPane_1 = new JLabel();
		textPane_1.setText("˾�����");
		textPane_1.setBounds(63, 10, 54, 21);
		desktopPane_7.add(textPane_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 10, 66, 21);
		desktopPane_7.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel textPane_2 = new JLabel();
		textPane_2.setText("����");
		textPane_2.setBounds(258, 10, 30, 21);
		desktopPane_7.add(textPane_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(297, 10, 66, 21);
		desktopPane_7.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel textPane_3 = new JLabel();
		textPane_3.setText("���֤��");
		textPane_3.setBounds(426, 10, 54, 21);
		desktopPane_7.add(textPane_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(490, 10, 164, 21);
		desktopPane_7.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel textPane_4 = new JLabel();
		textPane_4.setText("��������");
		textPane_4.setBounds(426, 41, 54, 21);
		desktopPane_7.add(textPane_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(490, 41, 45, 21);
		desktopPane_7.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(545, 41, 30, 21);
		desktopPane_7.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(585, 41, 30, 21);
		desktopPane_7.add(textField_6);
		textField_6.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(127, 41, 66, 21);
		desktopPane_7.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel textPane_5 = new JLabel();
		textPane_5.setText("�ֻ�����");
		textPane_5.setBounds(63, 41, 54, 21);
		desktopPane_7.add(textPane_5);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setText("�Ա�");
		textPane_6.setBounds(258, 41, 30, 21);
		desktopPane_7.add(textPane_6);
		
		textField_29 = new JTextField();
		textField_29.setBounds(297, 41, 66, 21);
		desktopPane_7.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setText("��ʻ֤����");
		textPane_7.setBounds(63, 72, 66, 21);
		desktopPane_7.add(textPane_7);
		
		textField_36 = new JTextField();
		textField_36.setBounds(137, 72, 45, 21);
		desktopPane_7.add(textField_36);
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		textField_37.setBounds(192, 72, 30, 21);
		desktopPane_7.add(textField_37);
		textField_37.setColumns(10);
		
		textField_38 = new JTextField();
		textField_38.setBounds(232, 72, 30, 21);
		desktopPane_7.add(textField_38);
		textField_38.setColumns(10);
		//���˾����Ϣ���¼�����
		JButton button_1 = new JButton("���");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_5.getRowCount();i++){
					if(table_5.getValueAt(i, 0)==null&&table_5.getValueAt(i, 1)==null&&table_5.getValueAt(i, 2)==null&&table_5.getValueAt(i, 3)==null&&
							table_5.getValueAt(i, 4)==null&&table_5.getValueAt(i, 5)==null&&table_5.getValueAt(i, 6)==null){
						table_5.setValueAt(textField_1.getText(), i, 0);
						table_5.setValueAt(textField_2.getText(), i, 1);
						table_5.setValueAt(textField_29.getText(), i, 2);
						table_5.setValueAt(textField_3.getText(), i, 3);
						table_5.setValueAt(textField_4.getText()+textField_5.getText()+textField_6.getText(), i, 4);
						table_5.setValueAt(textField_36.getText()+textField_37.getText()+textField_38.getText(), i, 5);
						table_5.setValueAt(textField_28.getText(), i, 6);
						break;
					}
				}
			}
		});
		button_1.setBounds(63, 103, 93, 23);
		desktopPane_7.add(button_1);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(63, 150, 700, 256);
		desktopPane_7.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"˾�����", "����", "�Ա�", "���֤��", "��������", "��ʻ֤����", "�ֻ�"
			}
		));
		scrollPane_5.setViewportView(table_5);
		
		JButton button_2 = new JButton("�ύ");
		button_2.setBounds(670, 435, 93, 23);
		desktopPane_7.add(button_2);
		//����˾����Ϣtable��һ�е��¼�����
		JButton button_27 = new JButton("����");
		button_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_5.getRowCount()-1;i>=0;i--){
					if(table_5.getValueAt(i, 0)!=null||table_5.getValueAt(i, 1)!=null||table_5.getValueAt(i, 2)!=null||table_5.getValueAt(i, 3)!=null||
							table_5.getValueAt(i, 4)!=null||table_5.getValueAt(i, 5)!=null||table_5.getValueAt(i, 6)!=null){
						table_5.setValueAt(null, i, 0);
						table_5.setValueAt(null, i, 1);
						table_5.setValueAt(null, i, 2);
						table_5.setValueAt(null, i, 3);
						table_5.setValueAt(null, i, 4);
						table_5.setValueAt(null, i, 5);
						table_5.setValueAt(null, i, 6);
						break;
					}
				}
			}
		});
		button_27.setBounds(63, 435, 93, 23);
		desktopPane_7.add(button_27);
		
		JDesktopPane desktopPane_8 = new JDesktopPane();
		desktopPane_8.setBackground(Color.WHITE);
		tabbedPane_1.addTab("ɾ������˾����Ϣ", null, desktopPane_8, null);
		
		JLabel textPane_26 = new JLabel();
		textPane_26.setText("˾�����");
		textPane_26.setBounds(100, 96, 54, 21);
		desktopPane_8.add(textPane_26);
		
		textField_39 = new JTextField();
		textField_39.setBounds(176, 96, 130, 21);
		desktopPane_8.add(textField_39);
		textField_39.setColumns(10);
		
		//����˾����Ϣ���¼�����
		JButton button_3 = new JButton("����");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField.getText());
				if(dp==null){
					textPane_38.setText("δ���ҵ��κ�˾����Ϣ��");
				}else{
					table_4.setValueAt(dp.ID, 0, 0);
					table_4.setValueAt(dp.name, 0, 1);
					table_4.setValueAt(dp.isBoy, 0, 2);
					table_4.setValueAt(dp.IDNumber, 0, 3);
					table_4.setValueAt(dp.birthday, 0, 4);
					table_4.setValueAt(dp.validData, 0, 5);
					table_4.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button_3.setBounds(485, 95, 93, 23);
		desktopPane_8.add(button_3);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(80, 210, 700, 45);
		desktopPane_8.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"˾�����", "����", "�Ա�", "���֤��", "��������", "��ʻ֤����", "�ֻ�"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		//ɾ��˾����Ϣ���¼�����
		JButton button_17 = new JButton("ɾ��˾����Ϣ");
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverManageCotroller dmc=new DriverManageCotroller();
				dmc.deleteDriver(null);
			}
		});
		button_17.setBounds(580, 330, 121, 23);
		desktopPane_8.add(button_17);
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.WHITE);
		tabbedPane_1.addTab("�޸�˾����Ϣ", null, desktopPane_9, null);
		
		JLabel textPane_27 = new JLabel();
		textPane_27.setText("˾�����");
		textPane_27.setBounds(100, 96, 54, 21);
		desktopPane_9.add(textPane_27);
		
		textField_40 = new JTextField();
		textField_40.setBounds(176, 96, 130, 21);
		desktopPane_9.add(textField_40);
		textField_40.setColumns(10);
		
		//����˾����Ϣ���¼�����
		JButton button_18 = new JButton("����");
		button_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField.getText());
				if(dp==null){
					textPane_38.setText("δ���ҵ��κ�˾����Ϣ��");
				}else{
					table_4.setValueAt(dp.ID, 0, 0);
					table_4.setValueAt(dp.name, 0, 1);
					table_4.setValueAt(dp.isBoy, 0, 2);
					table_4.setValueAt(dp.IDNumber, 0, 3);
					table_4.setValueAt(dp.birthday, 0, 4);
					table_4.setValueAt(dp.validData, 0, 5);
					table_4.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button_18.setBounds(485, 95, 93, 23);
		desktopPane_9.add(button_18);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(80, 210, 700, 45);
		desktopPane_9.add(scrollPane_7);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"˾�����", "����", "�Ա�", "���֤��", "��������", "��ʻ֤����", "�ֻ�"
			}
		));
		scrollPane_7.setViewportView(table_7);
		
		//�޸�˾����Ϣ���¼�����
		JButton button_19 = new JButton("�޸�˾����Ϣ");
		button_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverManageCotroller dmc=new DriverManageCotroller();
				dmc.ChangeDriverInfo(null, null, null, null, null, null, null);
			}
		});
		button_19.setBounds(580, 330, 121, 23);
		desktopPane_9.add(button_19);
		
		//������Ϣ����Ľ���
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(Color.WHITE);
		tabbedPane.addTab("������Ϣ����", null, desktopPane_5, null);
		
		final JLabel textPane_39 = new JLabel();
		textPane_39.setText("Ӫҵ��ҵ��Ա��");
		textPane_39.setBounds(280, 0, 700, 21);
		desktopPane_5.add(textPane_39);
		textPane_39.setText(df.format(new Date()));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(55, 40, 856, 504);
		desktopPane_5.add(tabbedPane_2);
		
		JDesktopPane desktopPane_10 = new JDesktopPane();
		desktopPane_10.setBackground(Color.WHITE);
		tabbedPane_2.addTab("���ҳ�����Ϣ", null, desktopPane_10, null);
		
		JLabel textPane_28 = new JLabel();
		textPane_28.setText("��������");
		textPane_28.setBounds(100, 90, 54, 21);
		desktopPane_10.add(textPane_28);
		
		textField_41 = new JTextField();
		textField_41.setBounds(170, 90, 130, 21);
		desktopPane_10.add(textField_41);
		textField_41.setColumns(10);
		
		//���ҳ�����Ϣ���¼�����
		JButton button_20 = new JButton("����");
		button_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TruckPO truck;
				TruckManageController tmc=new TruckManageController();
				truck=tmc.getTruck(textField_41.getText());
				if(truck==null){
					textPane_39.setText("δ���ҵ��κγ�����Ϣ��");
				}else{
					table_8.setValueAt(truck.vehicleCode, 0, 0);
					table_8.setValueAt(truck.licensePlate, 0, 1);
					table_8.setValueAt(truck.serviceTime, 0, 2);
				}
			}
		});
		button_20.setBounds(485, 90, 93, 23);
		desktopPane_10.add(button_20);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(80, 210, 700, 45);
		desktopPane_10.add(scrollPane_8);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"��������", "���ƺ�", "����ʱ��"
			}
		));
		scrollPane_8.setViewportView(table_8);
		
		JDesktopPane desktopPane_11 = new JDesktopPane();
		desktopPane_11.setBackground(Color.WHITE);
		tabbedPane_2.addTab("���ӳ�����Ϣ", null, desktopPane_11, null);
		
		JLabel textPane_29 = new JLabel();
		textPane_29.setText("��������");
		textPane_29.setBounds(63, 20, 54, 21);
		desktopPane_11.add(textPane_29);
		
		textField_42 = new JTextField();
		textField_42.setBounds(127, 20, 66, 21);
		desktopPane_11.add(textField_42);
		textField_42.setColumns(10);
		
		JLabel textPane_30 = new JLabel();
		textPane_30.setText("���ƺ�");
		textPane_30.setBounds(255, 20, 42, 21);
		desktopPane_11.add(textPane_30);
		
		textField_43 = new JTextField();
		textField_43.setBounds(307, 20, 126, 21);
		desktopPane_11.add(textField_43);
		textField_43.setColumns(10);
		
		JLabel textPane_31 = new JLabel();
		textPane_31.setText("����ʱ��");
		textPane_31.setBounds(493, 20, 54, 21);
		desktopPane_11.add(textPane_31);
		
		textField_44 = new JTextField();
		textField_44.setBounds(557, 20, 42, 21);
		desktopPane_11.add(textField_44);
		textField_44.setColumns(10);
		
		textField_45 = new JTextField();
		textField_45.setBounds(609, 20, 32, 21);
		desktopPane_11.add(textField_45);
		textField_45.setColumns(10);
		
		textField_46 = new JTextField();
		textField_46.setBounds(651, 20, 32, 21);
		desktopPane_11.add(textField_46);
		textField_46.setColumns(10);
		//��ӳ�����Ϣ���¼�����
		JButton button_21 = new JButton("���");
		button_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_9.getRowCount();i++){
					if(table_9.getValueAt(i, 0)==null&&table_9.getValueAt(i, 1)==null&&table_9.getValueAt(i, 2)==null){
						table_9.setValueAt(textField_42.getText(), i, 0);
						table_9.setValueAt(textField_43.getText(), i, 1);
						table_9.setValueAt(textField_44.getText()+textField_45.getText()+textField_46.getText(), i, 2);
						break;
					}
				}
			}
		});
		button_21.setBounds(590, 69, 93, 23);
		desktopPane_11.add(button_21);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(63, 122, 657, 279);
		desktopPane_11.add(scrollPane_9);
		
		table_9 = new JTable();
		table_9.setModel(new DefaultTableModel(
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
				"��������", "���ƺ�", "����ʱ��"
			}
		));
		scrollPane_9.setViewportView(table_9);
		
		JButton button_22 = new JButton("�ύ");
		button_22.setBounds(590, 430, 93, 23);
		desktopPane_11.add(button_22);
		//����������Ϣtable��һ�е��¼�����
		JButton button_28 = new JButton("����");
		button_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_9.getRowCount()-1;i>=0;i--){
					if(table_9.getValueAt(i, 0)!=null||table_9.getValueAt(i, 1)!=null||table_9.getValueAt(i, 2)!=null){
						table_9.setValueAt(null, i, 0);
						table_9.setValueAt(null, i, 1);
						table_9.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_28.setBounds(63, 430, 93, 23);
		desktopPane_11.add(button_28);
		
		JDesktopPane desktopPane_12 = new JDesktopPane();
		desktopPane_12.setBackground(Color.WHITE);
		tabbedPane_2.addTab("ɾ��������Ϣ", null, desktopPane_12, null);
		
		JLabel textPane_32 = new JLabel();
		textPane_32.setText("��������");
		textPane_32.setBounds(100, 90, 54, 21);
		desktopPane_12.add(textPane_32);
		
		textField_47 = new JTextField();
		textField_47.setBounds(170, 90, 130, 21);
		desktopPane_12.add(textField_47);
		textField_47.setColumns(10);
		
		JButton button_23 = new JButton("����");
		button_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TruckPO truck;
				TruckManageController tmc=new TruckManageController();
				truck=tmc.getTruck(textField_41.getText());
				if(truck==null){
					textPane_39.setText("δ���ҵ��κγ�����Ϣ��");
				}else{
					table_8.setValueAt(truck.vehicleCode, 0, 0);
					table_8.setValueAt(truck.licensePlate, 0, 1);
					table_8.setValueAt(truck.serviceTime, 0, 2);
				}
			}
		});
		button_23.setBounds(485, 90, 93, 23);
		desktopPane_12.add(button_23);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(80, 210, 700, 45);
		desktopPane_12.add(scrollPane_10);
		
		table_10 = new JTable();
		table_10.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
					"��������", "���ƺ�", "����ʱ��"
			}
		));
		scrollPane_10.setViewportView(table_10);
		
		//ɾ��������Ϣ���¼�����
		JButton button_24 = new JButton("ɾ��������Ϣ");
		button_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TruckManageController tmc=new TruckManageController();
				tmc.deleteTruck(null);
			}
		});
		button_24.setBounds(580, 330, 121, 23);
		desktopPane_12.add(button_24);
		
		JDesktopPane desktopPane_13 = new JDesktopPane();
		desktopPane_13.setBackground(Color.WHITE);
		tabbedPane_2.addTab("�޸ĳ�����Ϣ", null, desktopPane_13, null);
		
		JLabel textPane_33 = new JLabel();
		textPane_33.setText("��������");
		textPane_33.setBounds(100, 90, 54, 21);
		desktopPane_13.add(textPane_33);
		
		textField_48 = new JTextField();
		textField_48.setBounds(170, 90, 130, 21);
		desktopPane_13.add(textField_48);
		textField_48.setColumns(10);
		
		JButton button_25 = new JButton("����");
		button_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TruckPO truck;
				TruckManageController tmc=new TruckManageController();
				truck=tmc.getTruck(textField_41.getText());
				if(truck==null){
					textPane_39.setText("δ���ҵ��κγ�����Ϣ��");
				}else{
					table_8.setValueAt(truck.vehicleCode, 0, 0);
					table_8.setValueAt(truck.licensePlate, 0, 1);
					table_8.setValueAt(truck.serviceTime, 0, 2);
				}
			}
		});
		button_25.setBounds(485, 90, 93, 23);
		desktopPane_13.add(button_25);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(80, 210, 700, 45);
		desktopPane_13.add(scrollPane_11);
		
		table_11 = new JTable();
		table_11.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
					"��������", "���ƺ�", "����ʱ��"
			}
		));
		scrollPane_11.setViewportView(table_11);
		
		//�޸ĳ�����Ϣ���¼�����
		JButton button_26 = new JButton("�޸ĳ�����Ϣ");
		button_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TruckManageController tmc=new TruckManageController();
				tmc.ChangeTruckInfo(null, null, null);
			}
		});
		button_26.setBounds(580, 330, 121, 23);
		desktopPane_13.add(button_26);
	}
}

