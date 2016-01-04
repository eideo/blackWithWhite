package ui.staff;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import bl.staff.Impl.StaffManageController;
import bl.staff.Impl.UserManageController;
import settings.BussinessHall;
import settings.CompanySettingsController;
import settings.TransportCenter;
import ui.NSwing.NButton;
import ui.NSwing.NTable;
import ui.NSwing.NTableModel;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;
import vo.StaffVO;

public class AddStaffPanel extends JPanel{
	JLabel id;
	JLabel pass;
	JLabel name;
	JLabel sex;
	JLabel age;
	JLabel pos;
	JLabel department;
	JLabel city;
	JComboBox usercity;
	NTextField userid;
	NTextField userpass;
	NTextField username;
	NTextField userage;
	JComboBox usersex; 
    JComboBox userpos;  
    JComboBox userdepartment;
    NButton okButton;
    NTable table;
    JScrollPane scrollPane;
	public AddStaffPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		name=new JLabel();
		name.setFont(new Font("΢���ź�",Font.BOLD,16));
		name.setBounds(50,50,40,30);
		name.setText("����");
		
		username=new NTextField();
		username.setFont(new Font("΢���ź�",Font.BOLD,16));
		username.setBounds(100,50,80,30);
		
		sex=new JLabel();
		sex.setFont(new Font("΢���ź�",Font.BOLD,16));
		sex.setBounds(240,50,40,30);
		sex.setText("�Ա�");
		
		usersex=new JComboBox();
		usersex.setFont(new Font("΢���ź�",Font.BOLD,16));
		usersex.addItem("��");
		usersex.addItem("Ů");
		usersex.setBounds(290,50,60,30);
		
		age=new JLabel();
		age.setFont(new Font("΢���ź�",Font.BOLD,16));
		age.setBounds(420,50,40,30);
		age.setText("����");
		
		userage=new NTextField();
		userage.setFont(new Font("΢���ź�",Font.BOLD,16));
		userage.setBounds(470,50,60,30);
		age.addFocusListener(new AgeListener());
		
		pos=new JLabel();
		pos.setFont(new Font("΢���ź�",Font.BOLD,16));
		pos.setBounds(590,50,40,30);
		pos.setText("ְλ");
		
		userpos=new JComboBox();
		userpos.setFont(new Font("΢���ź�",Font.BOLD,16));
		userpos.addItem("���Ա");
		userpos.addItem("Ӫҵ��ҵ��Ա");
		userpos.addItem("��ת����ҵ��Ա");
		userpos.addItem("��ת���Ĳֿ������Ա");
		userpos.addItem("�ܾ���");
		userpos.addItem("������Ա");
		userpos.addItem("����Ա");
		userpos.addFocusListener(new PosListener());
		userpos.setBounds(650,50,180,30);
		
		city=new JLabel();
		city.setFont(new Font("΢���ź�",Font.BOLD,16));
		city.setBounds(50,110,40,30);
		city.setText("����");
		
		usercity=new JComboBox();
		usercity.setFont(new Font("΢���ź�",Font.BOLD,16));
		usercity.addFocusListener(new SelectListener());
		usercity.setBounds(100,110,80,30);
		
		department=new JLabel();
		department.setFont(new Font("΢���ź�",Font.BOLD,16));
		department.setBounds(240,110,40,30);
		department.setText("����");
		
		userdepartment=new JComboBox();
		userdepartment.setFont(new Font("΢���ź�",Font.BOLD,16));
		userdepartment.setBounds(290,110,280,30);
		
		id=new JLabel();
		id.setFont(new Font("΢���ź�",Font.BOLD,16));
		id.setBounds(50,170,60,30);
		id.setText("�û���");
		
		userid=new NTextField();
		userid.setFont(new Font("΢���ź�",Font.BOLD,16));
		userid.setBounds(100,170,200,30);
		
		pass=new JLabel();
		pass.setFont(new Font("΢���ź�",Font.BOLD,16));
		pass.setBounds(420,170,40,30);
		pass.setText("����");
		
		userpass=new NTextField();
		userpass.setFont(new Font("΢���ź�",Font.BOLD,16));
		userpass.setBounds(470,170,200,30);

		
		okButton=new NButton("ok");
		okButton.setBounds(640, 210, 40, 40);
		okButton.setBorder(null);
		okButton.setFocusPainted(false);
		okButton.setBorderPainted(false);
		okButton.setContentAreaFilled(false);
		okButton.addActionListener(new PushListener());
		
		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
	
		buildTable(staffs);
				
		
		this.add(age);
		this.add(userage);
		this.add(name);
		this.add(username);
		this.add(sex);
		this.add(usersex);
		this.add(pos);
		this.add(userpos);
		this.add(department);
		this.add(userdepartment);
		this.add(id);
		this.add(userid);
		this.add(pass);
		this.add(userpass);
		this.add(city);
		this.add(usercity);
		this.add(okButton);
	}
	
	public void buildTable(ArrayList<StaffVO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][6];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.ID,mess.name,mess.age,mess.passwords,mess.pos,mess.department};
		}
		Object[] columnTitle = {"�û���" ,"����","����","����","ְλ","����"};  
		TableModel tableModel=new DefaultTableModel(tableData,columnTitle);
		table=new NTable(tableModel);
		int height=table.getRowHeight()*(size+1)+13;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	 class PushListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String id=userid.getText();
			String pass=userpass.getText();
			String name=username.getText();
			String age=userage.getText();
			String sex=(String)usersex.getSelectedItem();
			String pos=(String)userpos.getSelectedItem();
			String department=(String)userdepartment.getSelectedItem();
			
			if(id!=null&&pass!=null&&name!=null&&age!=null&&sex!=null&&pos!=null&&department!=null){
				boolean isBoy=true;
				if(sex.equals("Ů"))
					isBoy=false;
				
				StaffVO staff=new StaffVO(id,name,age,pos,department,isBoy,pass);
				StaffVO[] staffs=new StaffVO[1];
				staffs[0]=staff;
				StaffManageController user=new StaffManageController();			
				boolean result=true;
				result=result&user.addNewStaff(staffs);
				if(result){
					TimePanel.change=true;
					TimePanel.text="���ѳɹ����Ӹ�Ա����";
					ArrayList<StaffVO> staffsNew=user.getAllStaff("");
					removeTable();
					buildTable(staffsNew);
					repaint();
				}else{
					TimePanel.change=true;
					TimePanel.text="���Ա��ʧ�ܣ����ܴ���������ϣ�";
				}
			}else{
				TimePanel.change=true;
				TimePanel.text="�����������룡";
			}
		}
		 
	 }
	 
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
	 class AgeListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		 
	 }
	 
	 class PosListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			switch((String)userpos.getSelectedItem()){
			case "�ܾ���":
				usercity.removeAllItems();
				usercity.addItem("�ܲ�");
				repaint();
				break;
			case "������Ա":
				usercity.removeAllItems();
				usercity.addItem("�ܲ�");
				repaint();
				break;
			case "����Ա":
				usercity.removeAllItems();
				usercity.addItem("�ܲ�");
				repaint();
				break;
			default:
				usercity.removeAllItems();
				CompanySettingsController csc=new CompanySettingsController();
				String[] names=csc.getCityName();
				for(int i=0;i<names.length;i++){
					usercity.addItem((String)names[i]);
				}
				repaint();
				break;
			}
		}
		 
	 }
	 class SelectListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			switch((String)userpos.getSelectedItem()){
			case "�ܾ���":
				userdepartment.removeAllItems();
				userdepartment.addItem("ִ�в�");
				repaint();
				break;
			case "������Ա":
				userdepartment.removeAllItems();
				userdepartment.addItem("����");
				repaint();
				break;
			case "����Ա":
				userdepartment.removeAllItems();
				userdepartment.addItem("������");
				repaint();
				break;		
			case "��ת����ҵ��Ա":
				userdepartment.removeAllItems();
				CompanySettingsController csc=new CompanySettingsController();
				TransportCenter[] names=csc.getTransportCenters((String)usercity.getSelectedItem());
				for(int i=0;i<names.length;i++){
					userdepartment.addItem((String)names[i].getName());
				}
				repaint();
				break;	
			case "��ת���Ĳֿ������Ա":
				userdepartment.removeAllItems();
				CompanySettingsController csc2=new CompanySettingsController();
				TransportCenter[] names2=csc2.getTransportCenters((String)usercity.getSelectedItem());
				for(int i=0;i<names2.length;i++){
					userdepartment.addItem((String)names2[i].getName());
				}
				repaint();
				break;
			default:
				userdepartment.removeAllItems();
				CompanySettingsController csc3=new CompanySettingsController();
				BussinessHall[] names3=csc3.getBussinessHalls((String)usercity.getSelectedItem());
				for(int i=0;i<names3.length;i++){
					userdepartment.addItem((String)names3[i].name);
				}
				repaint();
				break;
			
			}
		}
		 
	 }
}
