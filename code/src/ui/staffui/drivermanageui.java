package ui.staffui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.DriverPO;
import bl.staff.Impl.DriverManageCotroller;
import bl.staff.service.DriverManageBLService;

public class drivermanageui extends JDesktopPane{
	
	private JTextField textField_driverNumber;
	private JTable table_findDriver;
	private JTextField textField_driverID;
	private JTextField textField_name;
	private JTextField textField_IDnumber;
	private JTextField textField_birthday_year;
	private JTextField textField_birthday_month;
	private JTextField textField_birthday_day;
	private JTextField textField_Tel;
	private JTextField textField_isBoy;
	private JTextField textField_validDate_year;
	private JTextField textField_validDate_month;
	private JTextField textField_validDate_day;
	private JTable table_addDriver;
	//private JTextField textField_39;
	private JTable table_deleteDriver;
	//private JTextField textField_40;
	private JTable table_changeDriver;
	
	public drivermanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);

		
		final JLabel textPane_38 = new JLabel();
		textPane_38.setText("Ӫҵ��ҵ��Ա��");
		textPane_38.setBounds(280, 0, 700, 21);
		this.add(textPane_38);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		textPane_38.setText(df.format(new Date()));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(55, 40, 856, 509);
		this.add(tabbedPane_1);
		
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_1.addTab("����˾����Ϣ", null, desktopPane_6, null);
		
		JLabel textPane = new JLabel();
		textPane.setText("˾�����");
		textPane.setBounds(100, 96, 54, 21);
		desktopPane_6.add(textPane);
		
		textField_driverNumber = new JTextField();
		textField_driverNumber.setBounds(176, 96, 130, 21);
		desktopPane_6.add(textField_driverNumber);
		textField_driverNumber.setColumns(10);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(80, 210, 700, 45);
		desktopPane_6.add(scrollPane_4);
		
		table_findDriver = new JTable();
		table_findDriver.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"˾�����", "����", "�Ա�", "���֤��", "��������", "��ʻ֤����", "�ֻ�"
			}
		));
		scrollPane_4.setViewportView(table_findDriver);
		
		//����˾����Ϣ���¼�����
		JButton button = new JButton("����");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField_driverNumber.getText());
				if(dp==null){
					textPane_38.setText("δ���ҵ��κ�˾����Ϣ��");
					
				}else{
					table_findDriver.setValueAt(dp.ID, 0, 0);
					table_findDriver.setValueAt(dp.name, 0, 1);
					table_findDriver.setValueAt(dp.isBoy, 0, 2);
					table_findDriver.setValueAt(dp.IDNumber, 0, 3);
					table_findDriver.setValueAt(dp.birthday, 0, 4);
					table_findDriver.setValueAt(dp.validData, 0, 5);
					table_findDriver.setValueAt(dp.tel, 0, 6);
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
		
		textField_driverID = new JTextField();
		textField_driverID.setBounds(127, 10, 66, 21);
		desktopPane_7.add(textField_driverID);
		textField_driverID.setColumns(10);
		
		JLabel textPane_2 = new JLabel();
		textPane_2.setText("����");
		textPane_2.setBounds(258, 10, 30, 21);
		desktopPane_7.add(textPane_2);
		
		textField_name = new JTextField();
		textField_name.setBounds(297, 10, 66, 21);
		desktopPane_7.add(textField_name);
		textField_name.setColumns(10);
		
		JLabel textPane_3 = new JLabel();
		textPane_3.setText("���֤��");
		textPane_3.setBounds(426, 10, 54, 21);
		desktopPane_7.add(textPane_3);
		
		textField_IDnumber = new JTextField();
		textField_IDnumber.setBounds(490, 10, 164, 21);
		desktopPane_7.add(textField_IDnumber);
		textField_IDnumber.setColumns(10);
		
		JLabel textPane_4 = new JLabel();
		textPane_4.setText("��������");
		textPane_4.setBounds(426, 41, 54, 21);
		desktopPane_7.add(textPane_4);
		
		textField_birthday_year = new JTextField();
		textField_birthday_year.setBounds(490, 41, 45, 21);
		desktopPane_7.add(textField_birthday_year);
		textField_birthday_year.setColumns(10);
		
		textField_birthday_month = new JTextField();
		textField_birthday_month.setBounds(545, 41, 30, 21);
		desktopPane_7.add(textField_birthday_month);
		textField_birthday_month.setColumns(10);
		
		textField_birthday_day = new JTextField();
		textField_birthday_day.setBounds(585, 41, 30, 21);
		desktopPane_7.add(textField_birthday_day);
		textField_birthday_day.setColumns(10);
		
		textField_Tel = new JTextField();
		textField_Tel.setBounds(127, 41, 66, 21);
		desktopPane_7.add(textField_Tel);
		textField_Tel.setColumns(10);
		
		JLabel textPane_5 = new JLabel();
		textPane_5.setText("�ֻ�����");
		textPane_5.setBounds(63, 41, 54, 21);
		desktopPane_7.add(textPane_5);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setText("�Ա�");
		textPane_6.setBounds(258, 41, 30, 21);
		desktopPane_7.add(textPane_6);
		
		textField_isBoy = new JTextField();
		textField_isBoy.setBounds(297, 41, 66, 21);
		desktopPane_7.add(textField_isBoy);
		textField_isBoy.setColumns(10);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setText("��ʻ֤����");
		textPane_7.setBounds(63, 72, 66, 21);
		desktopPane_7.add(textPane_7);
		
		textField_validDate_year = new JTextField();
		textField_validDate_year.setBounds(137, 72, 45, 21);
		desktopPane_7.add(textField_validDate_year);
		textField_validDate_year.setColumns(10);
		
		textField_validDate_month = new JTextField();
		textField_validDate_month.setBounds(192, 72, 30, 21);
		desktopPane_7.add(textField_validDate_month);
		textField_validDate_month.setColumns(10);
		
		textField_validDate_day = new JTextField();
		textField_validDate_day.setBounds(232, 72, 30, 21);
		desktopPane_7.add(textField_validDate_day);
		textField_validDate_day.setColumns(10);
		//���˾����Ϣ���¼�����
		JButton button_1 = new JButton("���");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_addDriver.getRowCount();i++){
					if(table_addDriver.getValueAt(i, 0)==null&&table_addDriver.getValueAt(i, 1)==null&&table_addDriver.getValueAt(i, 2)==null&&table_addDriver.getValueAt(i, 3)==null&&
							table_addDriver.getValueAt(i, 4)==null&&table_addDriver.getValueAt(i, 5)==null&&table_addDriver.getValueAt(i, 6)==null){
						table_addDriver.setValueAt(textField_driverID.getText(), i, 0);
						table_addDriver.setValueAt(textField_name.getText(), i, 1);
						table_addDriver.setValueAt(textField_isBoy.getText(), i, 2);
						table_addDriver.setValueAt(textField_IDnumber.getText(), i, 3);
						table_addDriver.setValueAt(textField_birthday_year.getText()+textField_birthday_month.getText()+textField_birthday_day.getText(), i, 4);
						table_addDriver.setValueAt(textField_validDate_year.getText()+textField_validDate_month.getText()+textField_validDate_day.getText(), i, 5);
						table_addDriver.setValueAt(textField_Tel.getText(), i, 6);
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
		
		table_addDriver = new JTable();
		table_addDriver.setModel(new DefaultTableModel(
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
		scrollPane_5.setViewportView(table_addDriver);
		
		JButton button_2 = new JButton("�ύ");
		button_2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				DriverPO[] driver = null;
				boolean isBoy=true;
				for(int i=0;i<table_addDriver.getRowCount();i++){
					DriverPO driverPo=new DriverPO(table_addDriver.getValueAt(i, 0).toString(), table_addDriver.getValueAt(i, 1).toString(),table_addDriver.getValueAt(i, 2).toString(),
							 table_addDriver.getValueAt(i, 3).toString(), table_addDriver.getValueAt(i, 4).equals(isBoy), table_addDriver.getValueAt(i, 5).toString(), (String) table_addDriver.getValueAt(i, 6));
					driver[i]=driverPo;
				}
				DriverManageBLService driverManage=new DriverManageCotroller();
				boolean istrue=driverManage.addNewDiver(driver);
				if(istrue=true){
					for(int i=0;i<table_addDriver.getRowCount();i++){
						table_addDriver.setValueAt(null, i, 0);
						table_addDriver.setValueAt(null, i, 1);
						table_addDriver.setValueAt(null, i, 2);
						table_addDriver.setValueAt(null, i, 3);
						table_addDriver.setValueAt(null, i, 4);
						table_addDriver.setValueAt(null, i, 5);
						table_addDriver.setValueAt(null, i, 6);
					}
				}else{
					textPane_38.setText("�ύʧ�ܣ�");
				}
			}
		});
		button_2.setBounds(670, 435, 93, 23);
		desktopPane_7.add(button_2);
		
		//����˾����Ϣtable��һ�е��¼�����
		JButton button_27 = new JButton("����");
		button_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_addDriver.getRowCount()-1;i>=0;i--){
					if(table_addDriver.getValueAt(i, 0)!=null||table_addDriver.getValueAt(i, 1)!=null||table_addDriver.getValueAt(i, 2)!=null||table_addDriver.getValueAt(i, 3)!=null||
							table_addDriver.getValueAt(i, 4)!=null||table_addDriver.getValueAt(i, 5)!=null||table_addDriver.getValueAt(i, 6)!=null){
						table_addDriver.setValueAt(null, i, 0);
						table_addDriver.setValueAt(null, i, 1);
						table_addDriver.setValueAt(null, i, 2);
						table_addDriver.setValueAt(null, i, 3);
						table_addDriver.setValueAt(null, i, 4);
						table_addDriver.setValueAt(null, i, 5);
						table_addDriver.setValueAt(null, i, 6);
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
		
		final JTextField textField_driverNumber = new JTextField();
		textField_driverNumber.setBounds(176, 96, 130, 21);
		desktopPane_8.add(textField_driverNumber);
		textField_driverNumber.setColumns(10);
		
		//����˾����Ϣ���¼�����
		JButton button_3 = new JButton("����");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField_driverNumber.getText());
				if(dp==null){
					textPane_38.setText("δ���ҵ��κ�˾����Ϣ��");
				}else{
					table_findDriver.setValueAt(dp.ID, 0, 0);
					table_findDriver.setValueAt(dp.name, 0, 1);
					table_findDriver.setValueAt(dp.isBoy, 0, 2);
					table_findDriver.setValueAt(dp.IDNumber, 0, 3);
					table_findDriver.setValueAt(dp.birthday, 0, 4);
					table_findDriver.setValueAt(dp.validData, 0, 5);
					table_findDriver.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button_3.setBounds(485, 95, 93, 23);
		desktopPane_8.add(button_3);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(80, 210, 700, 45);
		desktopPane_8.add(scrollPane_6);
		
		table_deleteDriver = new JTable();
		table_deleteDriver.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"˾�����", "����", "�Ա�", "���֤��", "��������", "��ʻ֤����", "�ֻ�"
			}
		));
		scrollPane_6.setViewportView(table_deleteDriver);
		
		//ɾ��˾����Ϣ���¼�����
		JButton button_17 = new JButton("ɾ��˾����Ϣ");
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverManageCotroller dmc=new DriverManageCotroller();
				String[] driverID = null;
				for(int i=0;i<table_findDriver.getRowCount();i++){
					driverID=(String[]) table_findDriver.getValueAt(i, 0);
				}
				Boolean istrue=dmc.deleteDriver(driverID);
				if(istrue==true){
					for(int j=0;j<table_findDriver.getRowCount();j++){
						table_findDriver.setValueAt(null, j, 0);
						table_findDriver.setValueAt(null, j, 1);
						table_findDriver.setValueAt(null, j, 2);
						table_findDriver.setValueAt(null, j, 3);
						table_findDriver.setValueAt(null, j, 4);
						table_findDriver.setValueAt(null, j, 5);
						table_findDriver.setValueAt(null, j, 6);
					}
				}else{
					textPane_38.setText("ɾ��ʧ�ܣ�");
				}
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
		
		textField_driverID = new JTextField();
		textField_driverID.setBounds(176, 96, 130, 21);
		desktopPane_9.add(textField_driverID);
		textField_driverID.setColumns(10);
		
		//����˾����Ϣ���¼�����
		JButton button_18 = new JButton("����");
		button_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField_driverNumber.getText());
				if(dp==null){
					textPane_38.setText("δ���ҵ��κ�˾����Ϣ��");
				}else{
					table_findDriver.setValueAt(dp.ID, 0, 0);
					table_findDriver.setValueAt(dp.name, 0, 1);
					table_findDriver.setValueAt(dp.isBoy, 0, 2);
					table_findDriver.setValueAt(dp.IDNumber, 0, 3);
					table_findDriver.setValueAt(dp.birthday, 0, 4);
					table_findDriver.setValueAt(dp.validData, 0, 5);
					table_findDriver.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button_18.setBounds(485, 95, 93, 23);
		desktopPane_9.add(button_18);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(80, 210, 700, 45);
		desktopPane_9.add(scrollPane_7);
		
		table_changeDriver = new JTable();
		table_changeDriver.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"˾�����", "����", "�Ա�", "���֤��", "��������", "��ʻ֤����", "�ֻ�"
			}
		));
		scrollPane_7.setViewportView(table_changeDriver);
		
		//�޸�˾����Ϣ���¼�����
		JButton button_19 = new JButton("�޸�˾����Ϣ");
		button_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] name={(String) table_changeDriver.getValueAt(0, 1)};
				String[] ID={(String) table_changeDriver.getValueAt(0, 0)};
				String[] IDCardNumber={(String) table_changeDriver.getValueAt(0, 3)};
				String[] birthday={(String) table_changeDriver.getValueAt(0, 4)};
				boolean[] isBoy={(Boolean) table_changeDriver.getValueAt(0, 2)};
				String[] TelNumber={(String) table_changeDriver.getValueAt(0, 6)};
				String[] ValiDate={(String) table_changeDriver.getValueAt(0, 5)};
				DriverManageCotroller dmc=new DriverManageCotroller();
				boolean istrue=dmc.ChangeDriverInfo(name, ID, IDCardNumber, birthday, isBoy, TelNumber, ValiDate);
				if(istrue==true){
					table_changeDriver.setValueAt(e, 0, 0);
					table_changeDriver.setValueAt(e, 0, 1);
					table_changeDriver.setValueAt(e, 0, 2);
					table_changeDriver.setValueAt(e, 0, 3);
					table_changeDriver.setValueAt(e, 0, 4);
					table_changeDriver.setValueAt(e, 0, 5);
					table_changeDriver.setValueAt(e, 0, 6);
				}else{
					textPane_38.setText("�޸�˾����Ϣʧ�ܣ�");
				}
			}
		});
		button_19.setBounds(580, 330, 121, 23);
		desktopPane_9.add(button_19);
	}

}
