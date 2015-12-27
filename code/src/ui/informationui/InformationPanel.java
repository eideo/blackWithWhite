package ui.informationui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import bill.TransMesgPO;
import bl.information.Impl.InformationController;
import ui.signui.SignPanel;
import vo.PackageVO;

public class InformationPanel extends JPanel{
	StartFrame belongsTO;
	JButton okButton;
	JButton sign; 
	JButton shut;
	JTextField getTransID;
	JLabel LOGO;
	JLabel bussinessMess2;
	JLabel wrongMess;
	JLabel bussinessMess;
	JLabel[] labels;//������ʾλ��
	JTable table;
	public InformationPanel(StartFrame frame){
		belongsTO=frame;
		this.setLayout(null);
		this.setBounds(0, 0,1200, 675);
		
		
		getTransID=new JTextField();
		getTransID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 138, 255)));
		getTransID.setForeground(Color.gray);
		getTransID.setFont(new Font("΢���ź� ",Font.BOLD,12));
		getTransID.setText("���ڴ˴��������Ķ����š���");
		getTransID.setBounds(450, 200, 260, 40);
		
		LOGO=new JLabel();
		LOGO.setForeground(Color.WHITE);
		LOGO.setText("POWERED BY BALCK&&WHITE");
		LOGO.setBounds(1000, 635, 200, 20);
		
		/*bussinessMess2=new JLabel();
		bussinessMess2.setForeground(Color.WHITE);
		bussinessMess2.setFont(new Font("΢���ź� Light",Font.PLAIN,14));
		bussinessMess2.setText("����ޱ");
		bussinessMess2.setBounds(1060, 615,60,20);*/
		
		bussinessMess=new JLabel();
		bussinessMess.setForeground(Color.GRAY);
		bussinessMess.setFont(new Font("΢���ź� Light",Font.PLAIN,12));
		bussinessMess.setText("- - - - - - - - - - - - - - - - - CopyRight(C) 2015-2016, ����ޱ��ݹ�˾ - - - - - - - - - - - - - - - - - ");
		bussinessMess.setBounds(280, 610,640,30);
		
		okButton=new JButton();
		okButton.setIcon(new ImageIcon("pic/������ť.png"));
		okButton.setBounds(730,200, 40, 40);
		okButton.addActionListener(new SearchListener());
		
		shut=new JButton();
		shut.setIcon(new ImageIcon("pic/�رհ�ť3.png"));
		shut.setBounds(1060,0, 54, 40);
		shut.addActionListener(new SearchListener());
		shut.setBorder(null);
		shut.setFocusPainted(false);
		shut.setBorderPainted(false);
		shut.setContentAreaFilled(false);
		
		sign=new JButton();
		sign.setIcon(new ImageIcon("pic/sign80%.png"));
		sign.setBounds(1131, 0, 69, 34);
		sign.addActionListener(new SignListener());
		
		
		
		this.add(okButton);
		this.add(getTransID);
		this.add(LOGO);
		this.add(sign);
		this.add(bussinessMess);
		this.add(shut);
		/*this.add(bussinessMess2);*/
		this.setVisible(true);
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        Image icon;
        Image beiban;
        try {
            image = ImageIO.read(new File("pic/����1.png"));
            g.drawImage(image, 0, 0, this);
            icon = ImageIO.read(new File("pic/logo60%С.png"));
            g.drawImage(icon, 1005, 450, this);
/*            beiban = ImageIO.read(new File("pic/����.png"));
            g.drawImage(beiban, 1000, 0, this);*/
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
	
	protected void buildTable(PackageVO pack){
		ArrayList<TransMesgPO> messages=pack.getState();
		int size=messages.size();
		labels=new JLabel[size];
		int x=400;
		int y=250;
		int length=150;
		int wight=100;
		for(int i=0;i<size;i++){
			TransMesgPO mess=messages.get(i);
			labels[i]=new JLabel();
			labels[i].setText(mess.time+"        "+mess.location);
			labels[i].setBounds(x,y,length,wight);
			this.add(labels[i]);
			y+=25;
		}
		repaint();
		
		
		
/*		Object[][] tableData=new Object[size][2];
		for(int i=0;i<size;i++){
			TransMesgPO mess=messages.get(i);
			tableData[i]=new Object[]{mess.time,mess.location};
		}
		Object[] columnTitle = {"ʱ��" , "��̬"};  
		table=new JTable(tableData,columnTitle);
		table.setBounds(500, 300, 150, 100);
		*/
/*		JTextArea area=new JTextArea(size,2);
		area.setOpaque(false);
		area.setBounds(500, 300, 150, 100);
		*/
		/*table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);   
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
		table.setIntercellSpacing(new Dimension(0, 0)); 
		table.setRowHeight(20);
		table.setOpaque(false);  
	    DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
	    render.setOpaque(false); //����Ⱦ������Ϊ͸��   
	        //�������Ⱦ�����õ�fileTable�  
	        //���������û������ר�Ŷ�column���õ��������Ч  
	        //�����ĳ��column����ָ������Ⱦ������������column������������render��Ⱦ��  
	        //���Ϊ�˱�֤͸����������column����ָ������Ⱦ������ô�ڶ������Ⱦ����ҲӦ������͸��  
	    table.setDefaultRenderer(Object.class,render);  
	        //������ʾ��Χ  
	    Dimension viewSize = new Dimension();   
	    viewSize.width = table.getColumnModel().getTotalColumnWidth(); ;   
	    viewSize.height = 10 * table.getRowHeight();   
	    table.setPreferredScrollableViewportSize(viewSize);   
	        //����ͷ��͸��  
	        //ͷ��ʵ����Ҳ��һ��JTABLE��ֻ��һ�ж��ѡ�  
	    JTableHeader header = table.getTableHeader();//��ȡͷ��   
	    header.setPreferredSize(new Dimension(30, 26));   
	    header.setOpaque(false);//����ͷ��Ϊ͸��  
	    header.getTable().setOpaque(false);//����ͷ������ı��͸��  
	          
	         
	         * ͷ���ı��Ҳ��ǰ��ı������һ��������Ҫ������ĵ�Ԫ������Ϊ͸�� 
	         * ���ͬ����Ҫ��ͷ����Ԫ�����͸�������ã����ﻹ������Ⱦ���� 
	           
	        header.setDefaultRenderer(render);  
	        TableCellRenderer headerRenderer = header.getDefaultRenderer();   
	        if (headerRenderer instanceof JLabel)   
	        {  
	            ((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER);   
	            ((JLabel) headerRenderer).setOpaque(false);   
	        }  
	    }  
		
		
		JScrollPane scrollPane = new JScrollPane();  
		scrollPane.getViewport().setOpaque(false);//��JScrollPane����Ϊ͸��  
        scrollPane.setOpaque(false);//���м��viewport����Ϊ͸��  
        scrollPane.setViewportView(table);//װ�ر��  
        scrollPane.setColumnHeaderView(table.getTableHeader());//����ͷ����HeaderView���֣�  
        scrollPane.getColumnHeader().setOpaque(false);//��ȡ��ͷ����������Ϊ͸��  
        scrollPane.setBounds(x, y, width, height);
       add(scrollPane);  
		
		
		this.add(table);  
		this.repaint();
		*/
		
	}
	class SearchListener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			String TransID=getTransID.getText();
			
			InformationController infomation=new InformationController();
			PackageVO pack=infomation.inquireTransMesg(TransID);
			
/*			ArrayList<TransMesgPO> messages=new ArrayList<TransMesgPO>();
			TransMesgPO E=new TransMesgPO("12345","2015","����");
			TransMesgPO F=new TransMesgPO("12345","2015","�Ϻ�");
			TransMesgPO G=new TransMesgPO("12345","2015","�Ͼ�");
			messages.add(E);
			messages.add(F);
			messages.add(G);
			PackageVO pack=new PackageVO("12345",messages);*/
			if(pack==null){
				
			}else{
				buildTable(pack);	
			}
			
		}
		
	}
	
	class SignListener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			SignPanel signPanel=new SignPanel(belongsTO);
			belongsTO.changePanel(signPanel);
		}
		
	}
}
