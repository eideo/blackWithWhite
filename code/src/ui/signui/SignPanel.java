package ui.signui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import bl.staff.Impl.LoginController;
import bl.staff.service.LoginService;
import ui.commodityui.indepotui;
import ui.informationui.AddDriverPanel;
import ui.informationui.AddStaffPanel;
import ui.informationui.AddTrunckPanel;
import ui.informationui.FunctionPanel;
import ui.informationui.StartFrame;
import ui.informationui.StartPanel;
import ui.informationui.UserManagePanel;
import ui.judgementui.judgementui;
import ui.sendui.getsendui;
import vo.StaffVO;

public class SignPanel extends JPanel{
	StartFrame belongsTO;
	JLabel WrongMess;
	JLabel name;
	JLabel passwords;
	JTextField userName;
	JPasswordField userPasswords;
	JButton enter;
	JButton back;
	JLabel welcome;
	JLabel attention1;
	JLabel attention2;
	JLabel attention3;
	public SignPanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setBounds(0, 0, 1200, 675);
		this.setLayout(null);
		
		WrongMess=new JLabel();
		WrongMess.setForeground(Color.YELLOW);
		WrongMess.setFont(new Font("΢���ź�",Font.PLAIN,12));
		WrongMess.setBounds(500, 260, 200, 30);
		
		name=new JLabel();
		name.setFont(new Font("΢���ź�",Font.BOLD,14));
		name.setText("�û�����");
		name.setBounds(500, 290, 60, 30);
		
		this.userName=new JTextField();
		userName.setFont(new Font("΢���ź� Light",Font.PLAIN,24));
		userName.setBounds(500, 325, 200, 30);
		userName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 138, 255)));
		
		passwords=new JLabel();
		passwords.setFont(new Font("΢���ź�",Font.BOLD,14));
		passwords.setText("���룺");
		passwords.setBounds(505, 360, 60, 30);
		
		this.userPasswords=new JPasswordField();
		userPasswords.setFont(new Font("΢���ź� Light",Font.PLAIN,24));
		userPasswords.setBounds(500, 395, 200, 30);
		userPasswords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 138, 255)));
		
		this.enter=new JButton();
		enter.setIcon(new ImageIcon("pic/��½.png"));
		enter.setBounds(550, 450, 93, 30);
		enter.addActionListener(new SignListener());
		
		back=new JButton();
		back.setIcon(new ImageIcon("pic/���ذ�ť.png"));
		back.setBounds(1150, 10,32, 32);
		back.setBorder(null);
		back.setFocusPainted(false);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		
		attention1=new JLabel();
		attention1.setFont(new Font("΢���ź�",Font.BOLD,16));
		attention1.setForeground(Color.WHITE);
		attention1.setText("ע�����");
		attention1.setBounds(820, 550, 100, 30);
		attention2=new JLabel();
		attention2.setFont(new Font("΢���ź�",Font.BOLD,12));
		attention2.setForeground(Color.WHITE);
		attention2.setText("1.������˾Ա�����Ե�¼");
		attention2.setBounds(850, 580, 300, 20);
		attention3=new JLabel();
		attention3.setFont(new Font("΢���ź�",Font.BOLD,12));
		attention3.setForeground(Color.WHITE);
		attention3.setText("2.������ڵ�½���������⣬����ѯ����Ա��025-8968511");
		attention3.setBounds(850, 600, 350, 20);
		
		welcome=new JLabel();
		welcome.setFont(new Font("΢���ź�",Font.BOLD,16));
		welcome.setForeground(Color.GRAY);
		welcome.setText("��ӭ�������Ӵ˿�ʼ�����µ�һ��");
		welcome.setBounds(485, 200, 260, 40);
		
		this.add(name);
		this.add(userName);
		this.add(passwords);
		this.add(userPasswords);
		this.add(enter);
		this.add(attention1);
		this.add(attention2);
		this.add(attention3);
		this.add(welcome);
		this.add(back);
		this.add(WrongMess);
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        Image icon;
        try {
            image = ImageIO.read(new File("pic/����2.png"));
            g.drawImage(image, 0, 0, this);
            icon= ImageIO.read(new File("pic/logoMini.png"));
            g.drawImage(icon, 565, 80, this);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        g.setColor(Color.gray);
        g.drawRect(450, 250, 300, 260);

    }
	
	
	class SignListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
		
			String signname=userName.getText();
			String signpasswod=String.valueOf(userPasswords.getPassword());
			
			
			
			
			
			
			
			JButton[] buttons=new JButton[3];
			
			buttons[0]=new JButton();
			buttons[0].setFont(new Font("΢���ź�",Font.BOLD,16));
			buttons[0].setText("����Ա��");
			
			buttons[1]=new JButton();
			buttons[1].setFont(new Font("΢���ź�",Font.BOLD,16));
			buttons[1].setText("����˾��");
			
			buttons[2]=new JButton();
			buttons[2].setFont(new Font("΢���ź�",Font.BOLD,16));
			buttons[2].setText("���ӳ�����Ϣ");
			
			JPanel[] panels=new JPanel[3];
			panels[0]=new AddStaffPanel(belongsTO); 
			panels[1]=new AddDriverPanel(belongsTO);
			panels[2]=new AddTrunckPanel(belongsTO);
			
			
			FunctionPanel tool=new FunctionPanel(belongsTO,buttons,panels);
			belongsTO.addToolBar(tool);
			
			StartPanel start=new StartPanel(belongsTO);
			belongsTO.changePanel(start);
			belongsTO.addTimePanel();
			
			
			
			
			
/*			JButton[] buttons=new JButton[1];
			
			buttons[0]=new JButton();
			buttons[0].setFont(new Font("΢���ź�",Font.BOLD,16));
			buttons[0].setText("�û�����");
			
			JPanel[] panels=new JPanel[1];
			panels[0]=new UserManagePanel(belongsTO); 
			
			FunctionPanel tool=new FunctionPanel(belongsTO,buttons,panels);
			belongsTO.addToolBar(tool);
			
			StartPanel start=new StartPanel(belongsTO);
			belongsTO.changePanel(start);
			belongsTO.addTimePanel();*/
			
			/*LoginService login = new LoginController();
			StaffVO staff=login.validUser(signname,signpasswod);
			if(staff==null){
				WrongMess.setText("�˺Ż��������������!");
				repaint();
			}
			else if(staff.pos.equals("��ת���Ĳֿ������Ա")){
			
			    indepotui.main();
			}else if(staff.pos.equals("���Ա")){
			
				getsendui.main();
			}else if(staff.pos.equals("������Ա")){
				
			    //account.main();
			}else if(staff.pos.equals("�ܾ���")){
				 
				  judgementui.main();
			}else if(staff.pos.equals("����Ա")){
				JButton[] buttons=new JButton[1];
				
				buttons[0]=new JButton();
				buttons[0].setFont(new Font("΢���ź�",Font.BOLD,16));
				buttons[0].setText("�û�����");
				
				JPanel[] panels=new JPanel[1];
				panels[0]=new UserManagePanel(belongsTO); 
				
				FunctionPanel tool=new FunctionPanel(belongsTO,buttons,panels);
				belongsTO.addToolBar(tool);
				
				StartPanel start=new StartPanel(belongsTO);
				belongsTO.changePanel(start);
				belongsTO.addTimePanel();
			}else if(staff.pos.equals("��ת����ҵ��Ա")){
				
				//transitCenterClerk.main();
			}else if(staff.pos.equals("Ӫҵ��ҵ��Ա")){
			
				//businessHall.main();
			}		*/
		  }
		}
		
	

}
