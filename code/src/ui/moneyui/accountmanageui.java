 package ui.moneyui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.Account;
import bl.money.Impl.AccountManageController;
import bl.money.Service.AccountManageBLService;

public class accountmanageui extends JDesktopPane{
	
	private JTextField textField_accountNumber;
	private JTextField textField_name;
	private JTextField textField_money;
	private JTable table_addAccount;
	private JTextField textField_messageOfAccount;
	private JTable table_findAccount;
	//private JTextField textField_22;
	private JTable table_deleteAccount;
	//private JTextField textField_23;
	private JTable table_changeAccount;
	
	public accountmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		final JLabel textPane_2 = new JLabel();
		textPane_2.setText("������Ա��");
		textPane_2.setBounds(280, 0, 700, 21);
		this.add(textPane_2);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		textPane_2.setText(df.format(new Date()));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(91, 80, 753, 465);
		this.add(tabbedPane_2);
		
		//�����˻��Ľ���
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_2.addTab("�����˻�", null, desktopPane_6, null);
		
		JLabel textPane_21 = new JLabel();
		textPane_21.setText("�˺�");
		textPane_21.setBounds(80, 21, 32, 21);
		desktopPane_6.add(textPane_21);
		
		textField_accountNumber = new JTextField();
		textField_accountNumber.setBounds(122, 21, 100, 21);
		desktopPane_6.add(textField_accountNumber);
		textField_accountNumber.setColumns(10);
		
		JLabel textPane_22 = new JLabel();
		textPane_22.setText("����");
		textPane_22.setBounds(264, 21, 32, 21);
		desktopPane_6.add(textPane_22);
		
		textField_name = new JTextField();
		textField_name.setBounds(306, 21, 66, 21);
		desktopPane_6.add(textField_name);
		textField_name.setColumns(10);
		
		JLabel textPane_23 = new JLabel();
		textPane_23.setText("���");
		textPane_23.setBounds(416, 21, 32, 21);
		desktopPane_6.add(textPane_23);
		
		textField_money = new JTextField();
		textField_money.setBounds(458, 21, 66, 21);
		desktopPane_6.add(textField_money);
		textField_money.setColumns(10);
		//����˻���Ϣ���¼�����
		JButton button_6 = new JButton("���");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_addAccount.getRowCount();i++){
				    if(table_addAccount.getValueAt(i, 0)==null&&table_addAccount.getValueAt(i, 1)==null&&table_addAccount.getValueAt(i, 2)==null){
				        table_addAccount.setValueAt(textField_accountNumber.getText(), i, 0);
				        table_addAccount.setValueAt(textField_name.getText(), i, 1);
				        table_addAccount.setValueAt(textField_money.getText(), i, 2);
				        break;
				    }
				}
			}
		});
		button_6.setBounds(547, 52, 93, 23);
		desktopPane_6.add(button_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(80, 100, 560, 275);
		desktopPane_6.add(scrollPane_3);
		
		table_addAccount = new JTable();
		table_addAccount.setModel(new DefaultTableModel(
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
		scrollPane_3.setViewportView(table_addAccount);
		//�����˻���Ϣtable��һ�е��¼�����
		JButton button_7 = new JButton("����");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i = table_addAccount.getRowCount()-1;i>=0;i--){
					if(table_addAccount.getValueAt(i, 0)!=null||table_addAccount.getValueAt(i, 1)!=null||table_addAccount.getValueAt(i, 2)!=null){
						table_addAccount.setValueAt(null, i, 0);
						table_addAccount.setValueAt(null, i, 1);
						table_addAccount.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_7.setBounds(122, 392, 93, 23);
		desktopPane_6.add(button_7);
		
		//�ύ�˻���Ϣ���¼�����
		JButton button_8 = new JButton("�ύ");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String account = null;
				for(int i=0;i<table_addAccount.getRowCount();i++){
					account=table_addAccount.getValueAt(i, 0).toString();
				}
				AccountManageBLService accountManage=new AccountManageController();
			    ArrayList<Account> arrayList=accountManage.getAccount(account);
			    if(arrayList==null){
			    	textPane_2.setText("�ύʧ�ܣ�");
			    }else{
			    	for(int i=0;i<table_addAccount.getRowCount();i++){
			    		table_addAccount.setValueAt(null, i, 0);
			    		table_addAccount.setValueAt(null, i, 1);
			    		table_addAccount.setValueAt(null, i, 2);
			    	}
			    }
			}
		});
		button_8.setBounds(547, 392, 93, 23);
		desktopPane_6.add(button_8);
		
		//�޸��˻���Ϣ�Ľ���
		final JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(Color.WHITE);
		tabbedPane_2.addTab("�޸��˻���Ϣ", null, desktopPane_7, null);
		
		textField_messageOfAccount = new JTextField();
		textField_messageOfAccount.setText("�����˺Ż����ƹؼ�������");
		textField_messageOfAccount.setBounds(140, 40, 300, 21);
		desktopPane_7.add(textField_messageOfAccount);
		textField_messageOfAccount.setColumns(10);
		
		//��ѯ�˻���Ϣ���¼�����
		JButton button_9 = new JButton("��ѯ");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Account> account;
				AccountManageController amc=new AccountManageController();
				account = amc.getAccount(textField_messageOfAccount.getText());
				if(account==null){
					textPane_2.setText("δ���ҵ��κ��˻���Ϣ��");
				}else{
					for(int i=0;i<account.size();i++){
					    table_findAccount.setValueAt(account.get(i), i/table_findAccount.getColumnCount(), i%table_findAccount.getColumnCount());
					}
				}
			}
		});
		button_9.setBounds(496, 40, 93, 23);
		desktopPane_7.add(button_9);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(80, 100, 560, 275);
		desktopPane_7.add(scrollPane_4);
		
		table_findAccount = new JTable();
		table_findAccount.setModel(new DefaultTableModel(
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
		scrollPane_4.setViewportView(table_findAccount);
		//�����޸��˺���Ϣ���¼�����
		JButton button_10 = new JButton("����");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_findAccount.getRowCount()-1;i>=0;i--){
					if(table_findAccount.getValueAt(i, 0)!=null||table_findAccount.getValueAt(i, 1)!=null||table_findAccount.getValueAt(i, 2)!=null||table_findAccount.getValueAt(i, 3)!=null){
						table_findAccount.setValueAt(null, i, 0);
						table_findAccount.setValueAt(null, i, 1);
						table_findAccount.setValueAt(null, i, 2);
						table_findAccount.setValueAt(null, i, 3);
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
		
		textField_messageOfAccount = new JTextField();
		textField_messageOfAccount.setText("�����˺Ż����ƹؼ�������");
		textField_messageOfAccount.setBounds(140, 40, 300, 21);
		desktopPane_8.add(textField_messageOfAccount);
		textField_messageOfAccount.setColumns(10);
		
		//ɾ���˻���Ϣ���¼�����
		JButton button_12 = new JButton("��ѯ");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Account> account;
				AccountManageController amc=new AccountManageController();
				account = amc.getAccount(textField_messageOfAccount.getText());
				if(account==null){
					textPane_2.setText("δ���ҵ��κ��˻���Ϣ��");
				}else{
					for(int i=0;i<account.size();i++){
					    table_findAccount.setValueAt(account.get(i), i/table_findAccount.getColumnCount(), i%table_findAccount.getColumnCount());
					}
				}
			}
		});
		button_12.setBounds(496, 40, 93, 23);
		desktopPane_8.add(button_12);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(80, 100, 560, 275);
		desktopPane_8.add(scrollPane_5);
		
		table_deleteAccount = new JTable();
		table_deleteAccount.setModel(new DefaultTableModel(
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
		scrollPane_5.setViewportView(table_deleteAccount);
		//ɾ���˻���Ϣ���¼�����
		JButton button_13 = new JButton("ɾ��");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_deleteAccount.getRowCount()-1;i>=0;i--){
					if(table_deleteAccount.getValueAt(i, 0)!=null||table_deleteAccount.getValueAt(i, 1)!=null||table_deleteAccount.getValueAt(i, 2)!=null){
						table_deleteAccount.setValueAt(null, i, 0);
						table_deleteAccount.setValueAt(null, i, 1);
						table_deleteAccount.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_13.setBounds(136, 393, 93, 23);
		desktopPane_8.add(button_13);
		
		/*JButton button_14 = new JButton("�ύ");
		button_14.setBounds(496, 393, 93, 23);
		desktopPane_8.add(button_14);*/
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.WHITE);
		tabbedPane_2.addTab("�����˻�", null, desktopPane_9, null);
		
		textField_messageOfAccount = new JTextField();
		textField_messageOfAccount.setText("�����˺Ż����ƹؼ�������");
		textField_messageOfAccount.setBounds(140, 40, 300, 21);
		desktopPane_9.add(textField_messageOfAccount);
		textField_messageOfAccount.setColumns(10);
		
		//��ѯ�˻���Ϣ���¼�����
		JButton button_15 = new JButton("��ѯ");
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Account> account;
				AccountManageController amc=new AccountManageController();
				account = amc.getAccount(textField_messageOfAccount.getText());
				if(account==null){
					textPane_2.setText("δ���ҵ��κ��˻���Ϣ��");
				}else{
					for(int i=0;i<account.size();i++){
					    table_findAccount.setValueAt(account.get(i), i/table_findAccount.getColumnCount(), i%table_findAccount.getColumnCount());
					}
				}
			}
		});
		button_15.setBounds(496, 40, 93, 23);
		desktopPane_9.add(button_15);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(80, 100, 560, 275);
		desktopPane_9.add(scrollPane_6);
		
		table_changeAccount = new JTable();
		table_changeAccount.setModel(new DefaultTableModel(
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
		scrollPane_6.setViewportView(table_changeAccount);
		
		JButton button_16 = new JButton("ȷ��");
		button_16.setBounds(496, 388, 93, 23);
		desktopPane_9.add(button_16);
		
	}

}
