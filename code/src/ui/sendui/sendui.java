package ui.sendui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bill.OrderBillPO;
import bl.send.Impl.SendController;
import bl.send.Service.SendBLService;

public class sendui extends JDesktopPane{
	
	public sendui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_32 = new JLabel();
		label_32.setBounds(282, 0, 436, 21);
		this.add(label_32);
		
		
		JLabel labelofsenderinfo = new JLabel("�ļ�����Ϣ");
		labelofsenderinfo.setBounds(99, 73, 68, 15);
		this.add(labelofsenderinfo);
		
		JLabel labelofordernumber = new JLabel("�����������");
		labelofordernumber.setBounds(672, 73, 83, 15);
		this.add(labelofordernumber);
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setColumns(10);
		textFieldofordernumber.setBounds(654, 98, 121, 21);
		this.add(textFieldofordernumber);
		
		JLabel labelofsendername = new JLabel("����");
		labelofsendername.setBounds(162, 243, 54, 15);
		this.add(labelofsendername);
		
		JTextField textFieldofsendername = new JTextField();
		textFieldofsendername.setBounds(200, 98, 66, 21);
		this.add(textFieldofsendername);
		textFieldofsendername.setColumns(10);

		JLabel labelofsenderphone = new JLabel("�绰");
		labelofsenderphone.setBounds(300, 101, 54, 15);
		this.add(labelofsenderphone);
		
		JTextField textFieldofsenderphone = new JTextField();
		textFieldofsenderphone.setBounds(341, 98, 92, 21);
		this.add(textFieldofsenderphone);
		textFieldofsenderphone.setColumns(10);
		
		JLabel labelofsendermobile = new JLabel("�ֻ�");
		labelofsendermobile.setBounds(458, 101, 54, 15);
		this.add(labelofsendermobile);
		
		JTextField textFieldofsendermobile = new JTextField();
		textFieldofsendermobile.setBounds(493, 98, 83, 21);
		this.add(textFieldofsendermobile);
		textFieldofsendermobile.setColumns(10);
		
		JLabel labelofsenderunit = new JLabel("��λ");
		labelofsenderunit.setBounds(162, 140, 54, 15);
		this.add(labelofsenderunit);
		
		JTextField textFieldofsenderunit = new JTextField();
		textFieldofsenderunit.setBounds(200, 137, 376, 21);
		this.add(textFieldofsenderunit);
		textFieldofsenderunit.setColumns(10);
		
		JLabel labelofsenderaddress = new JLabel("��ַ");
		labelofsenderaddress.setBounds(162, 183, 54, 15);
		this.add(labelofsenderaddress);
		
		JTextField textFieldofsenderaddress = new JTextField();
		textFieldofsenderaddress.setBounds(200, 180, 376, 21);
		this.add(textFieldofsenderaddress);
		textFieldofsenderaddress.setColumns(10);
		
		JLabel labelofconsigneeinfo = new JLabel("�ռ�����Ϣ");
		labelofconsigneeinfo.setBounds(99, 214, 68, 15);
		this.add(labelofconsigneeinfo);
		
		JLabel labelofconsigneename = new JLabel("����");
		labelofconsigneename.setBounds(162, 101, 54, 15);
		this.add(labelofconsigneename);
		
		JTextField textFieldofconsigneename = new JTextField();
		textFieldofconsigneename.setColumns(10);
		textFieldofconsigneename.setBounds(200, 240, 66, 21);
		this.add(textFieldofconsigneename);
		
		JLabel labelofconsigneephone = new JLabel("�绰");
		labelofconsigneephone.setBounds(300, 243, 54, 15);
		this.add(labelofconsigneephone);
		
		JTextField textFieldofconsigneephone = new JTextField();
		textFieldofconsigneephone.setColumns(10);
		textFieldofconsigneephone.setBounds(341, 240, 92, 21);
		this.add(textFieldofconsigneephone);
		
		JLabel labelofconsigneemobile = new JLabel("�ֻ�");
		labelofconsigneemobile.setBounds(458, 243, 54, 15);
		this.add(labelofconsigneemobile);
		
		JTextField textFieldofconsigneemobile = new JTextField();
		textFieldofconsigneemobile.setColumns(10);
		textFieldofconsigneemobile.setBounds(493, 240, 83, 21);
		this.add(textFieldofconsigneemobile);
		
		JLabel labelofconsigneeunit = new JLabel("��λ");
		labelofconsigneeunit.setBounds(162, 278, 54, 15);
		this.add(labelofconsigneeunit);
		
		JTextField textFieldofconsigneeunit = new JTextField();
		textFieldofconsigneeunit.setColumns(10);
		textFieldofconsigneeunit.setBounds(200, 275, 376, 21);
		this.add(textFieldofconsigneeunit);
		
		JTextField textFieldofconsigneeaddress = new JTextField();
		textFieldofconsigneeaddress.setColumns(10);
		textFieldofconsigneeaddress.setBounds(200, 318, 376, 21);
		this.add(textFieldofconsigneeaddress);
		
		JLabel labelofconsigneeaddress = new JLabel("��ַ");
		labelofconsigneeaddress.setBounds(162, 321, 54, 15);
		this.add(labelofconsigneeaddress);
		
		JLabel labelofcargoinfo = new JLabel("������Ϣ");
		labelofcargoinfo.setBounds(113, 355, 54, 15);
		this.add(labelofcargoinfo);
		
		JLabel labelofnumber = new JLabel("ԭ����������");
		labelofnumber.setBounds(162, 380, 83, 15);
		this.add(labelofnumber);
		
		JTextField textFieldofnumber = new JTextField();
		textFieldofnumber.setBounds(246, 377, 66, 21);
		this.add(textFieldofnumber);
		textFieldofnumber.setColumns(10);
		
		JLabel labelofweight = new JLabel("ʵ��������kg��");
		labelofweight.setBounds(379, 380, 92, 15);
		this.add(labelofweight);
		
		JTextField textFieldofweight = new JTextField();
		textFieldofweight.setBounds(493, 377, 66, 21);
		this.add(textFieldofweight);
		textFieldofweight.setColumns(10);
		
		JLabel labelofsize = new JLabel("�ߴ磨��*��*�ߣ�");
		labelofsize.setBounds(162, 413, 104, 15);
		this.add(labelofsize);
		
		JTextField textFieldoflength = new JTextField();
		textFieldoflength.setBounds(256, 410, 34, 21);
		this.add(textFieldoflength);
		textFieldoflength.setColumns(10);
		
		JTextField textFieldofwidth = new JTextField();
		textFieldofwidth.setColumns(10);
		textFieldofwidth.setBounds(300, 410, 34, 21);
		this.add(textFieldofwidth);
		
		JTextField textFieldofheight = new JTextField();
		textFieldofheight.setColumns(10);
		textFieldofheight.setBounds(345, 410, 34, 21);
		this.add(textFieldofheight);
		
		JLabel labelofcargoname = new JLabel("�ڼ�Ʒ��");
		labelofcargoname.setBounds(162, 447, 54, 15);
		this.add(labelofcargoname);
		
		JTextField textFieldofcargoname = new JTextField();
		textFieldofcargoname.setBounds(226, 444, 66, 21);
		this.add(textFieldofcargoname);
		textFieldofcargoname.setColumns(10);
		
		JLabel labelofvolume = new JLabel("�����L��");
		labelofvolume.setBounds(379, 447, 68, 15);
		this.add(labelofvolume);
		
		JTextField textFieldofvolume = new JTextField();
		textFieldofvolume.setBounds(493, 444, 66, 21);
		this.add(textFieldofvolume);
		textFieldofvolume.setColumns(10);
		
		JLabel labeloforderinfo = new JLabel("�����Ϣ");
		labeloforderinfo.setBounds(113, 486, 54, 15);
		this.add(labeloforderinfo);
		
		JLabel labelofpackingexpense = new JLabel("��װ��");
		labelofpackingexpense.setBounds(162, 511, 54, 15);
		this.add(labelofpackingexpense);
		
		JComboBox comboBoxofpackingexpense = new JComboBox();
		comboBoxofpackingexpense.setModel(new DefaultComboBoxModel(new String[] {"\u7EB8\u7BB1\uFF085\u5143\uFF09"}));
		comboBoxofpackingexpense.setBounds(226, 508, 108, 21);
		this.add(comboBoxofpackingexpense);
		
		JLabel labelofordertype = new JLabel("�������");
		labelofordertype.setBounds(379, 511, 54, 15);
		this.add(labelofordertype);
		
		JComboBox comboBoxofordertype = new JComboBox();
		comboBoxofordertype.setBounds(493, 508, 66, 21);
		this.add(comboBoxofordertype);
		
		JLabel labelofkind = new JLabel("����");
		labelofkind.setBounds(162, 546, 54, 15);
		this.add(labelofkind);
		
		JTextField textFieldofkind = new JTextField();
		textFieldofkind.setBounds(226, 543, 66, 21);
		this.add(textFieldofkind);
		textFieldofkind.setColumns(10);
		
		JLabel labelofexpense = new JLabel("���úϼƣ�");
		labelofexpense.setBounds(654, 486, 68, 15);
		this.add(labelofexpense);
		
		JButton buttonofack = new JButton("ȷ��");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		buttonofack.setBounds(654, 507, 68, 23);
		this.add(buttonofack);
		
		JLabel labeloftotalexpense = new JLabel("");
		labeloftotalexpense.setBounds(738, 486, 54, 15);
		this.add(labeloftotalexpense);
		
		JButton buttonofsubmit = new JButton("�ύ");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//�������ڸ�ʽ
				OrderBillPO order = new OrderBillPO(textFieldofconsigneename.getText(),textFieldofsenderphone.getText(),textFieldofsendermobile.getText(),
						textFieldofsenderunit.getText(),textFieldofsenderaddress.getText(),textFieldofconsigneename.getText(),textFieldofconsigneephone.getText(),
						textFieldofconsigneemobile.getText(),textFieldofconsigneeunit.getText(),textFieldofconsigneeaddress.getText(),textFieldofnumber.getText(),
						textFieldofweight.getText(),textFieldoflength.getText(),textFieldofwidth.getText(),textFieldofheight.getText(),
						textFieldofcargoname.getText(),textFieldofvolume.getText(),comboBoxofpackingexpense.getSelectedItem().toString(),
						comboBoxofordertype.getSelectedItem().toString(),textFieldofkind.getText(),df.format(new Date()),
					    Double.parseDouble(labeloftotalexpense.getText()),textFieldofordernumber.getText());
				SendBLService send = new SendController();
				boolean istrue=send.push(order);
				if(istrue==false){
					
				}else{
					textFieldofconsigneename.setText(null);
					textFieldofconsigneename.setText(null);
					textFieldofsenderphone.setText(null);
					textFieldofsendermobile.setText(null);
					textFieldofsenderunit.setText(null);
					textFieldofsenderaddress.setText(null);
					textFieldofconsigneename.setText(null);
					textFieldofconsigneephone.setText(null);
					textFieldofconsigneemobile.setText(null);
					textFieldofconsigneeunit.setText(null);
					textFieldofconsigneeaddress.setText(null);
					textFieldofnumber.setText(null);
					textFieldofweight.setText(null);
					textFieldoflength.setText(null);
					textFieldofwidth.setText(null);
					textFieldofheight.setText(null);
					textFieldofcargoname.setText(null);
					textFieldofvolume.setText(null);
					comboBoxofpackingexpense.setSelectedIndex(0);
					comboBoxofordertype.setSelectedIndex(0);
					textFieldofkind.setText(null);
				}
			}
		});
		buttonofsubmit.setBounds(740, 507, 68, 23);
		this.add(buttonofsubmit);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
						label_32.setText(df.format(new Date()));//��ʾ��ǰʱ��
						Thread.sleep(1000);//��ͣһ��                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}
}
