package ui.staffui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.staff.Impl.StaffManageController;
import bl.staff.service.StaffManageBLService;
import vo.StaffVO;

public class staffmanageui extends JDesktopPane{
	
	private JTextField textFieldofnewstaffname;
	private JTextField textFieldofnewstaffage;
	private JTable tableofaddnewstaff;
	private JTextField textFieldofstaffID;
	private JTable tableofdeleteoldstaff;
	private JTextField textFieldofstaffID_1;
	private JTable tableofstafftransfer;
	private JTextField textFieldofstaffID_2;
	private JTable tableofsalary;
	
	public staffmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		tableofaddnewstaff = new JTable();
		
		JLabel label_19 = new JLabel();
		label_19.setBounds(282, 0, 436, 21);
		this.add(label_19);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(46, 36, 881, 693);
		this.add(tabbedPane_2);
		
		JDesktopPane desktopPane_13 = new JDesktopPane();
		desktopPane_13.setBackground(Color.WHITE);
		tabbedPane_2.addTab("��Ӷ��Ա��", null, desktopPane_13, null);
		
		JLabel labelofnewstaffname = new JLabel("����");
		labelofnewstaffname.setBounds(60, 26, 54, 15);
		desktopPane_13.add(labelofnewstaffname);
		
		textFieldofnewstaffname = new JTextField();
		textFieldofnewstaffname.setBounds(101, 23, 66, 21);
		desktopPane_13.add(textFieldofnewstaffname);
		textFieldofnewstaffname.setColumns(10);
		
		JLabel labelofnewstaffage = new JLabel("����");
		labelofnewstaffage.setBounds(177, 26, 54, 15);
		desktopPane_13.add(labelofnewstaffage);
		
		textFieldofnewstaffage = new JTextField();
		textFieldofnewstaffage.setBounds(216, 23, 60, 21);
		desktopPane_13.add(textFieldofnewstaffage);
		textFieldofnewstaffage.setColumns(10);
		
		JLabel labelofnewstaffpos = new JLabel("ְλ");
		labelofnewstaffpos.setBounds(368, 26, 54, 15);
		desktopPane_13.add(labelofnewstaffpos);
		
		JComboBox comboBoxofnewstaffpos = new JComboBox();
		comboBoxofnewstaffpos.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB\u9012\u5458", "\u8425\u4E1A\u5385\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458", "\u8D22\u52A1\u4EBA\u5458", "\u7BA1\u7406\u5458"}));
		comboBoxofnewstaffpos.setBounds(406, 23, 132, 21);
		desktopPane_13.add(comboBoxofnewstaffpos);
		
		JLabel labelofnewstaffdepartment = new JLabel("��������");
		labelofnewstaffdepartment.setBounds(548, 26, 54, 15);
		desktopPane_13.add(labelofnewstaffdepartment);
		
		JComboBox comboBoxofnewstaffdepartment = new JComboBox();
		comboBoxofnewstaffdepartment.setModel(new DefaultComboBoxModel(new String[] {"\u5357\u4EAC\u5E02\u6816\u971E\u533A\u4ED9\u6797\u8857\u9053\u8425\u4E1A\u5385"}));
		comboBoxofnewstaffdepartment.setBounds(612, 23, 200, 21);
		desktopPane_13.add(comboBoxofnewstaffdepartment);
		
		JComboBox comboBoxofnewstaffsex = new JComboBox();
		comboBoxofnewstaffsex.setModel(new DefaultComboBoxModel(new String[] {"\u7537", "\u5973"}));
		comboBoxofnewstaffsex.setBounds(320, 23, 38, 21);
		desktopPane_13.add(comboBoxofnewstaffsex);
		
		/*
		 * ��Ӷ��Ա�����
		 */
		JButton buttonofaddnewstaff = new JButton("���");
		buttonofaddnewstaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<tableofaddnewstaff.getRowCount();i++){
					if(tableofaddnewstaff.getValueAt(i, 1)==null&&tableofaddnewstaff.getValueAt(i, 2)==null){
						tableofaddnewstaff.setValueAt(textFieldofnewstaffname.getText(), i, 1);
						tableofaddnewstaff.setValueAt(textFieldofnewstaffage.getText(), i, 2);
						tableofaddnewstaff.setValueAt(comboBoxofnewstaffsex.getSelectedItem(), i, 3);
						tableofaddnewstaff.setValueAt(comboBoxofnewstaffpos.getSelectedItem(), i, 4);
						tableofaddnewstaff.setValueAt(comboBoxofnewstaffdepartment.getSelectedItem(), i, 5);
						textFieldofnewstaffname.setText(null);
						textFieldofnewstaffage.setText(null);
						comboBoxofnewstaffpos.setToolTipText("���Ա");
						comboBoxofnewstaffdepartment.setToolTipText("�Ͼ�����ϼ�����ֵֽ�Ӫҵ��");
						break;
					}
				}
			}
		});
		buttonofaddnewstaff.setBounds(744, 66, 93, 23);
		desktopPane_13.add(buttonofaddnewstaff);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(70, 111, 767, 342);
		desktopPane_13.add(scrollPane_1);
		
		tableofaddnewstaff = new JTable();
		tableofaddnewstaff.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
			},
			new String[] {
				"�û�ID", "����", "����", "�Ա�","ְλ", "��������"
			}
		));
		scrollPane_1.setViewportView(tableofaddnewstaff);
		
		/*
		 * ��Ӷ��Ա����Ϣ����
		 */
		JButton buttonofcancelnewstaff = new JButton("����");
		buttonofcancelnewstaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=tableofaddnewstaff.getRowCount()-1;i>=0;i--){
					if(tableofaddnewstaff.getValueAt(i, 1)!=null&&tableofaddnewstaff.getValueAt(i, 2)!=null){
						tableofaddnewstaff.setValueAt(null, i, 0);
						tableofaddnewstaff.setValueAt(null, i, 1);
						tableofaddnewstaff.setValueAt(null, i, 2);
						tableofaddnewstaff.setValueAt(null, i, 3);
						tableofaddnewstaff.setValueAt(null, i, 4);
						tableofaddnewstaff.setValueAt(null, i, 5);
						
					}
				}
			}
		});
		
		buttonofcancelnewstaff.setBounds(74, 467, 93, 23);
		desktopPane_13.add(buttonofcancelnewstaff);
		
		/*
		 * ��Ӷ��Ա����Ϣ�ύ
		 */
		JButton buttonofsubmitnewstaff = new JButton("�ύ");
		buttonofsubmitnewstaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				StaffVO[] staff=new StaffVO[20];
				boolean isboy=false;
				int count=0;
				while(tableofaddnewstaff.getValueAt(count,1)!=null){
					++count;
				}
				for(int i=0;i<count;i++){
					//System.out.println(table_1.getValueAt(i, 3));
					if(tableofaddnewstaff.getValueAt(i, 3).equals("��")){
						isboy=true;
					}
					else{
						isboy=false;
					}
					StaffVO staffvo= new StaffVO(tableofaddnewstaff.getValueAt(i, 1).toString(),tableofaddnewstaff.getValueAt(i, 2).toString(),
						tableofaddnewstaff.getValueAt(i, 4).toString(),tableofaddnewstaff.getValueAt(i, 5).toString(),isboy);
					staff[i]=staffvo;
					System.out.println(staff[i].name+" "+staff[i].department);
				}
				StaffManageBLService addnewstaff = new StaffManageController();
				boolean istrue=addnewstaff.addNewStaff(staff);
				if(istrue==true){
					for(int i=0;i<tableofdeleteoldstaff.getRowCount();i++){
						tableofdeleteoldstaff.setValueAt(null, i, 0);	
						tableofdeleteoldstaff.setValueAt(null, i, 1);
						tableofdeleteoldstaff.setValueAt(null, i, 2);
						tableofdeleteoldstaff.setValueAt(null, i, 3);
						tableofdeleteoldstaff.setValueAt(null, i, 4);
//						table_2.setValueAt(null, i, 5);
					}
				}else{
					
				}
			}
		});
		buttonofsubmitnewstaff.setBounds(744, 467, 93, 23);
		desktopPane_13.add(buttonofsubmitnewstaff);
		
		JLabel labelofnewstaffsex = new JLabel("�Ա�");
		labelofnewstaffsex.setBounds(286, 26, 54, 15);
		desktopPane_13.add(labelofnewstaffsex);
		
		
		
		JDesktopPane desktopPane_14 = new JDesktopPane();
		desktopPane_14.setBackground(Color.WHITE);
		tabbedPane_2.addTab("���Ա��", null, desktopPane_14, null);
		
		JLabel labelofstaffID = new JLabel("Ա��ID");
		labelofstaffID.setBounds(210, 39, 54, 15);
		desktopPane_14.add(labelofstaffID);
		
		textFieldofstaffID = new JTextField();
		textFieldofstaffID.setBounds(274, 36, 123, 21);
		desktopPane_14.add(textFieldofstaffID);
		textFieldofstaffID.setColumns(10);
		
		/*
		 * ���Ա����Ϣ��ѯ
		 */
		JButton buttonofqueryoldstaff = new JButton("��ѯ");
		buttonofqueryoldstaff.setBounds(550, 65, 93, 23);
		desktopPane_14.add(buttonofqueryoldstaff);
        buttonofqueryoldstaff.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textFieldofstaffID.getText());
				if(staff.equals(null)){
			    	
			    }else{
			    	for(int i=0;i<tableofdeleteoldstaff.getRowCount();i++){
			    		if(tableofdeleteoldstaff.getValueAt(i, 0)==null){
			    			tableofdeleteoldstaff.setValueAt(staff.ID, i, 0);
			    			tableofdeleteoldstaff.setValueAt(staff.name, i, 1);
			    			tableofdeleteoldstaff.setValueAt(staff.age, i, 2);
			    			tableofdeleteoldstaff.setValueAt(staff.pos, i, 3);
			    			tableofdeleteoldstaff.setValueAt(staff.department, i, 4);
			    		}
			    	}
			    }
			}
			});
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(77, 115, 675, 334);
		desktopPane_14.add(scrollPane_2);
		
		tableofdeleteoldstaff = new JTable();
		tableofdeleteoldstaff.setModel(new DefaultTableModel(
			new Object[][] {
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
			},
			new String[] {
				 "�û�ID", "����", "����", "ְλ", "��������"
			}
		));
		scrollPane_2.setViewportView(tableofdeleteoldstaff);
		
		
		/*
		 * ���Ա����Ϣ����
		 */
		JButton buttonodcanceloldstaff = new JButton("����");
		buttonodcanceloldstaff.setBounds(104, 465, 93, 23);
		desktopPane_14.add(buttonodcanceloldstaff);
		buttonodcanceloldstaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=tableofdeleteoldstaff.getRowCount()-1;i>=0;i--){
					if(tableofdeleteoldstaff.getValueAt(i, 0)!=null&&tableofdeleteoldstaff.getValueAt(i, 1)!=null){
						tableofdeleteoldstaff.setValueAt(null, i, 0);
						tableofdeleteoldstaff.setValueAt(null, i, 1);
						tableofdeleteoldstaff.setValueAt(null, i, 2);
						tableofdeleteoldstaff.setValueAt(null, i, 3);
						tableofdeleteoldstaff.setValueAt(null, i, 4);
					}
				}
			}
		});
		
		/*
		 * ���Ա����Ϣ�ύ
		 */
		JButton buttonofsubmitoldstaff = new JButton("�ύ");
		buttonofsubmitoldstaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] staff=new String[tableofdeleteoldstaff.getRowCount()];
				for(int i=0;i<tableofdeleteoldstaff.getRowCount();i++){
					staff[i]=tableofdeleteoldstaff.getValueAt(i, 0).toString();
				}
				StaffManageBLService deletestaff = new StaffManageController();
				boolean istrue=deletestaff.deleteStaff(staff);
				if(istrue){
					for(int i=0;i<tableofdeleteoldstaff.getRowCount();i++){
						tableofdeleteoldstaff.setValueAt(null, i, 1);
						tableofdeleteoldstaff.setValueAt(null, i, 2);
						tableofdeleteoldstaff.setValueAt(null, i, 3);
						tableofdeleteoldstaff.setValueAt(null, i, 4);
						tableofdeleteoldstaff.setValueAt(null, i, 5);
					}
				}else{
					
				}
			}
		});
		buttonofsubmitoldstaff.setBounds(697, 465, 93, 23);
		desktopPane_14.add(buttonofsubmitoldstaff);
		
		JDesktopPane desktopPane_15 = new JDesktopPane();
		desktopPane_15.setBackground(Color.WHITE);
		tabbedPane_2.addTab("���µ���", null, desktopPane_15, null);
		
		JLabel labelofstaffID_1 = new JLabel("Ա��ID");
		labelofstaffID_1.setBounds(98, 51, 54, 15);
		desktopPane_15.add(labelofstaffID_1);
		
		textFieldofstaffID_1 = new JTextField();
		textFieldofstaffID_1.setBounds(150, 48, 101, 21);
		desktopPane_15.add(textFieldofstaffID_1);
		textFieldofstaffID_1.setColumns(10);
		
		JLabel labelofnewpos = new JLabel("��ְλ");
		labelofnewpos.setBounds(287, 51, 54, 15);
		desktopPane_15.add(labelofnewpos);
		
		JComboBox comboBoxofnewpos = new JComboBox();
		comboBoxofnewpos.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB\u9012\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458"}));
		comboBoxofnewpos.setBounds(340, 48, 138, 21);
		desktopPane_15.add(comboBoxofnewpos);
		
		JLabel labelofnewdepartment = new JLabel("�²���");
		labelofnewdepartment.setBounds(511, 51, 54, 15);
		desktopPane_15.add(labelofnewdepartment);
		
		JComboBox comboBoxofnewdepartment = new JComboBox();
		comboBoxofnewdepartment.setBounds(563, 48, 200, 21);
		desktopPane_15.add(comboBoxofnewdepartment);
		
		/*
		 * ���µ�����Ϣ��ѯ
		 */
		JButton buttonofquerystafftransfer = new JButton("��ѯ");
		buttonofquerystafftransfer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textFieldofstaffID_1.getText());
				if(staff.equals(null)){
			    	
			    }else{
			    	for(int i=0;i<tableofstafftransfer.getRowCount();i++){
			    		if(tableofstafftransfer.getValueAt(i, 0)==null){
			    			tableofstafftransfer.setValueAt(staff.ID, i, 0);
			    			tableofstafftransfer.setValueAt(staff.name, i, 1);
			    			tableofstafftransfer.setValueAt(staff.age, i, 2);
			    			tableofstafftransfer.setValueAt(staff.pos, i, 3);
			    			tableofstafftransfer.setValueAt(comboBoxofnewpos.getSelectedItem(), i, 4);
			    			tableofstafftransfer.setValueAt(staff.department, i, 5);
			    			tableofstafftransfer.setValueAt(comboBoxofnewdepartment.getSelectedItem(), i, 6);
			    		}
			    	}
			    }
			}
		});
		buttonofquerystafftransfer.setBounds(706, 79, 93, 23);
		desktopPane_15.add(buttonofquerystafftransfer);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(77, 115, 675, 334);
		desktopPane_15.add(scrollPane_3);
		
		tableofstafftransfer = new JTable();
		tableofstafftransfer.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"�û�ID", "����", "����", "ԭְλ", "ԭ��������", "��ְλ", "����������"
			}
		));
		scrollPane_3.setViewportView(tableofstafftransfer);
		
		/*
		 * ���µ�����Ϣ����
		 */
		JButton buttonofcancelstafftsansfer = new JButton("����");
		buttonofcancelstafftsansfer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=tableofstafftransfer.getRowCount()-1;i>=0;i--){
					if(tableofstafftransfer.getValueAt(i, 0)!=null&&tableofstafftransfer.getValueAt(i, 1)!=null){
						tableofstafftransfer.setValueAt(null, i, 0);
						tableofstafftransfer.setValueAt(null, i, 1);
						tableofstafftransfer.setValueAt(null, i, 2);
						tableofstafftransfer.setValueAt(null, i, 3);
						tableofstafftransfer.setValueAt(null, i, 4);
						tableofstafftransfer.setValueAt(null, i, 5);
						tableofstafftransfer.setValueAt(null, i, 6);
					}
				}
			}
		});
		buttonofcancelstafftsansfer.setBounds(77, 466, 93, 23);
		desktopPane_15.add(buttonofcancelstafftsansfer);
		
		/*
		 * ���µ�����Ϣ�ύ
		 */
		JButton buttonofsubmitstafftransfer = new JButton("�ύ");
		buttonofsubmitstafftransfer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[tableofstafftransfer.getRowCount()];
				String[] newPosition = new String[tableofstafftransfer.getRowCount()];
				String[] newDepartment = new String[tableofstafftransfer.getRowCount()];
				for(int i=0;i<tableofstafftransfer.getRowCount();i++){
					ID[i]=tableofstafftransfer.getValueAt(i, 1).toString();
					newPosition[i]=tableofstafftransfer.getValueAt(i, 6).toString();
					newDepartment[i]=tableofstafftransfer.getValueAt(i, 7).toString();
				}
				StaffManageBLService changeposition = new StaffManageController();
				boolean istrue=changeposition.changePosition(ID, newPosition, newDepartment);
				if(istrue){
					for(int i=0;i<tableofstafftransfer.getRowCount();i++){
						tableofstafftransfer.setValueAt(null, i, 0);
						tableofstafftransfer.setValueAt(null, i, 1);
						tableofstafftransfer.setValueAt(null, i, 2);
						tableofstafftransfer.setValueAt(null, i, 3);
						tableofstafftransfer.setValueAt(null, i, 4);
						tableofstafftransfer.setValueAt(null, i, 5);
						tableofstafftransfer.setValueAt(null, i, 6);
					}
				}else{
					
				}
			}
		});
		buttonofsubmitstafftransfer.setBounds(670, 466, 93, 23);
		desktopPane_15.add(buttonofsubmitstafftransfer);
		
		JDesktopPane desktopPane_16 = new JDesktopPane();
		desktopPane_16.setBackground(Color.WHITE);
		tabbedPane_2.addTab("нˮ�����趨", null, desktopPane_16, null);
		
		JLabel labelofstaffID_2 = new JLabel("�û�ID");
		labelofstaffID_2.setBounds(110, 49, 54, 15);
		desktopPane_16.add(labelofstaffID_2);
		
		textFieldofstaffID_2 = new JTextField();
		textFieldofstaffID_2.setBounds(170, 46, 109, 21);
		desktopPane_16.add(textFieldofstaffID_2);
		textFieldofstaffID_2.setColumns(10);
		
		JLabel labelofsalary = new JLabel("нˮ����");
		labelofsalary.setBounds(456, 49, 54, 15);
		desktopPane_16.add(labelofsalary);
		
		JComboBox comboBoxofsalary = new JComboBox();
		comboBoxofsalary.setModel(new DefaultComboBoxModel(new String[] {"\u6708\u85AA+\u63D0\u6210"}));
		comboBoxofsalary.setBounds(537, 46, 99, 21);
		desktopPane_16.add(comboBoxofsalary);
		
		/*
		 * нˮ������Ϣ��ѯ
		 */
		JButton buttonofquerysalary = new JButton("��ѯ");
		buttonofquerysalary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textFieldofstaffID_2.getText());
				if(staff.equals(null)){
			    	
			    }else{
			    	for(int i=0;i<tableofsalary.getRowCount();i++){
			    		if(tableofsalary.getValueAt(i, 0)==null){
			    			tableofsalary.setValueAt(staff.ID, i, 0);
			    			tableofsalary.setValueAt(staff.name, i, 1);
			    			tableofsalary.setValueAt(staff.age, i, 2);
			    			tableofsalary.setValueAt(staff.pos, i, 3);
			    			tableofsalary.setValueAt(staff.SalaryModel, i, 4);
			    			tableofsalary.setValueAt(comboBoxofsalary.getSelectedItem(), i, 5);
			    		}
			    	}
			    }
			}
		});
		buttonofquerysalary.setBounds(670, 76, 93, 23);
		desktopPane_16.add(buttonofquerysalary);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(77, 115, 675, 334);
		desktopPane_16.add(scrollPane_4);
		
		tableofsalary = new JTable();
		tableofsalary.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "\u804C\u4F4D", "\u539F\u85AA\u6C34\u7B56\u7565", "\u73B0\u85AA\u6C34\u7B56\u7565"
			}
		));
		scrollPane_4.setViewportView(tableofsalary);
		
		/*
		 * нˮ���Գ���
		 */
		JButton buttonofcancelsalary = new JButton("����");
		buttonofcancelsalary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=tableofsalary.getRowCount()-1;i>=0;i--){
					if(tableofsalary.getValueAt(i, 0)!=null&&tableofsalary.getValueAt(i, 1)!=null){
						tableofsalary.setValueAt(null, i, 0);
						tableofsalary.setValueAt(null, i, 1);
						tableofsalary.setValueAt(null, i, 2);
						tableofsalary.setValueAt(null, i, 3);
						tableofsalary.setValueAt(null, i, 4);
						tableofsalary.setValueAt(null, i, 5);
					}
				}
			}
		});
		buttonofcancelsalary.setBounds(77, 463, 93, 23);
		desktopPane_16.add(buttonofcancelsalary);
		
		/*
		 * нˮ�����ύ
		 */
		JButton buttonofsubmitsalary = new JButton("�ύ");
		buttonofsubmitsalary.setBounds(690, 463, 93, 23);
		desktopPane_16.add(buttonofsubmitsalary);
		buttonofsubmitstafftransfer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[tableofsalary.getRowCount()];
				String[] salaryModel = new String[tableofsalary.getRowCount()];
				for(int i=0;i<tableofsalary.getRowCount();i++){
					ID[i]=tableofsalary.getValueAt(i, 1).toString();
					salaryModel[i]=tableofsalary.getValueAt(i, 6).toString();
				}
				StaffManageBLService changeSalarymodel = new StaffManageController();
				boolean istrue=changeSalarymodel.changesalarymodel(ID, salaryModel);
				if(istrue==true){
					for(int i=0;i<tableofsalary.getRowCount();i++){
						tableofsalary.setValueAt(null, i, 1);
						tableofsalary.setValueAt(null, i, 2);
						tableofsalary.setValueAt(null, i, 3);
						tableofsalary.setValueAt(null, i, 4);
						tableofsalary.setValueAt(null, i, 5);
						tableofsalary.setValueAt(null, i, 6);
					}
				}else{
					
				}
			}
		});
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {           
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
						label_19.setText(df.format(new Date()));//��ʾ��ǰʱ��
						Thread.sleep(1000);//��ͣһ��                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
