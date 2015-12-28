package ui.informationui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bill.OrderBillPO;
import bl.send.Impl.SendController;
import bl.send.Service.SendBLService;

public class SendPackagePanel extends JPanel {
	public SendPackagePanel(){
		this.setBounds(200,60,1000,615);
		this.setLayout(null);
		
		JLabel labelofsenderinfo = new JLabel();
		labelofsenderinfo.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofsenderinfo.setText("�ļ�����Ϣ");
		labelofsenderinfo.setBounds(60, 65, 100, 30);
		this.add(labelofsenderinfo);
		
		
		JLabel labelofordernumber = new JLabel();
		labelofordernumber.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofordernumber.setText("�����������");
		labelofordernumber.setBounds(730, 70, 180, 30);
		this.add(labelofordernumber);
		
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setColumns(10);
		textFieldofordernumber.setBounds(730, 120, 180, 30);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsendername = new JLabel();
		labelofsendername.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofsendername.setText("����");
		labelofsendername.setBounds(162, 100, 40, 30);
		this.add(labelofsendername);
		
		
		JTextField textFieldofsendername = new JTextField();
		textFieldofsendername.setBounds(220, 100, 60, 30);
		this.add(textFieldofsendername);
		textFieldofsendername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));

		JLabel labelofsenderphone = new JLabel();
		labelofsenderphone.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofsenderphone.setText("�绰");
		labelofsenderphone.setBounds(300, 100, 40, 30);
		this.add(labelofsenderphone);
		
		
		JTextField textFieldofsenderphone = new JTextField();
		textFieldofsenderphone.setBounds(361, 100, 90, 30);
		this.add(textFieldofsenderphone);
		textFieldofsenderphone.setColumns(10);
		textFieldofsenderphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsendermobile = new JLabel();
		labelofsendermobile.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofsendermobile.setText("�ֻ�");
		labelofsendermobile.setBounds(475, 100, 40, 30);
		this.add(labelofsendermobile);
		
		
		JTextField textFieldofsendermobile = new JTextField();
		textFieldofsendermobile.setBounds(530, 100, 140, 30);
		this.add(textFieldofsendermobile);
		textFieldofsendermobile.setColumns(10);
		textFieldofsendermobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsenderunit = new JLabel();
		labelofsenderunit.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofsenderunit.setText("��λ");
		labelofsenderunit.setBounds(162, 140, 40, 30);
		this.add(labelofsenderunit);
	
		
		JTextField textFieldofsenderunit = new JTextField();
		textFieldofsenderunit.setBounds(220, 140, 450, 30);
		this.add(textFieldofsenderunit);
		textFieldofsenderunit.setColumns(10);
		textFieldofsenderunit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsenderaddress = new JLabel();
		labelofsenderaddress.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofsenderaddress.setText("��ַ");
		labelofsenderaddress.setBounds(162, 180, 40, 30);
		this.add(labelofsenderaddress);
		
		
		JTextField textFieldofsenderaddress = new JTextField();
		textFieldofsenderaddress.setBounds(220, 180, 450, 30);
		this.add(textFieldofsenderaddress);
		textFieldofsenderaddress.setColumns(10);
		textFieldofsenderaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneeinfo = new JLabel();
		labelofconsigneeinfo.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofconsigneeinfo.setText("�ռ�����Ϣ");
		labelofconsigneeinfo.setBounds(60, 220, 100, 30);
		this.add(labelofconsigneeinfo);

		
		JLabel labelofconsigneename = new JLabel();
		labelofconsigneename.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofconsigneename.setText("����");
		labelofconsigneename.setBounds(162, 260, 40, 30);
		this.add(labelofconsigneename);
		
		
		JTextField textFieldofconsigneename = new JTextField();
		textFieldofconsigneename.setColumns(10);
		textFieldofconsigneename.setBounds(220, 260, 60, 30);
		this.add(textFieldofconsigneename);
		textFieldofconsigneename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneephone = new JLabel();
		labelofconsigneephone.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofconsigneephone.setText("�绰");
		labelofconsigneephone.setBounds(300, 260, 40, 30);
		this.add(labelofconsigneephone);
	
		
		JTextField textFieldofconsigneephone = new JTextField();
		textFieldofconsigneephone.setColumns(10);
		textFieldofconsigneephone.setBounds(361, 260, 92, 30);
		this.add(textFieldofconsigneephone);
		textFieldofconsigneephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneemobile = new JLabel();
		labelofconsigneemobile.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofconsigneemobile.setText("�ֻ�");
		labelofconsigneemobile.setBounds(475, 260, 40, 30);
		this.add(labelofconsigneemobile);
		
		
		JTextField textFieldofconsigneemobile = new JTextField();
		textFieldofconsigneemobile.setColumns(10);
		textFieldofconsigneemobile.setBounds(530, 260, 140, 30);
		this.add(textFieldofconsigneemobile);
		textFieldofconsigneemobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneeunit = new JLabel();
		labelofconsigneeunit.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofconsigneeunit.setText("��λ");
		labelofconsigneeunit.setBounds(162, 300, 40, 30);
		this.add(labelofconsigneeunit);
	
		
		JTextField textFieldofconsigneeunit = new JTextField();
		textFieldofconsigneeunit.setColumns(10);
		textFieldofconsigneeunit.setBounds(220, 300, 450, 30);
		this.add(textFieldofconsigneeunit);
		textFieldofconsigneeunit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JTextField textFieldofconsigneeaddress = new JTextField();
		textFieldofconsigneeaddress.setColumns(10);
		textFieldofconsigneeaddress.setBounds(220, 340, 450, 30);
		this.add(textFieldofconsigneeaddress);
		textFieldofconsigneeaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneeaddress = new JLabel();
		labelofconsigneeaddress.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofconsigneeaddress.setText("��ַ");
		labelofconsigneeaddress.setBounds(162, 340, 40, 30);
		this.add(labelofconsigneeaddress);
		
		
		JLabel labelofcargoinfo = new JLabel();
		labelofcargoinfo.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofcargoinfo.setText("������Ϣ");
		labelofcargoinfo.setBounds(60, 380, 100, 30);
		this.add(labelofcargoinfo);
		
		
		JLabel labelofnumber = new JLabel();
		labelofnumber.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofnumber.setText("����");
		labelofnumber.setBounds(162, 420, 60, 30);
		this.add(labelofnumber);
		
		
		JTextField textFieldofnumber = new JTextField();
		textFieldofnumber.setBounds(220, 420, 60, 30);
		this.add(textFieldofnumber);
		textFieldofnumber.setColumns(10);
		textFieldofnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofweight = new JLabel();
		labelofweight.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofweight.setText("ʵ��������kg��");
		labelofweight.setBounds(300, 420, 120, 30);
		this.add(labelofweight);
	
		
		JTextField textFieldofweight = new JTextField();
		textFieldofweight.setBounds(430, 420, 60, 30);
		this.add(textFieldofweight);
		textFieldofweight.setColumns(10);
		textFieldofweight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofvolume = new JLabel();
		labelofvolume.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofvolume.setText("�����L��");
		labelofvolume.setBounds(520, 420, 80, 30);
		this.add(labelofvolume);
		
		
		JTextField textFieldofvolume = new JTextField();
		textFieldofvolume.setBounds(610, 420, 60, 30);
		this.add(textFieldofvolume);
		textFieldofvolume.setColumns(10);
		textFieldofvolume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsize = new JLabel();
		labelofsize.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofsize.setText("�ߴ磨��*��*�ߣ�");
		labelofsize.setBounds(162, 460, 140, 30);
		this.add(labelofsize);
		
		
		JTextField textFieldoflength = new JTextField();
		textFieldoflength.setBounds(316, 460, 34, 30);
		this.add(textFieldoflength);
		textFieldoflength.setColumns(10);
		textFieldoflength.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		
		JTextField textFieldofwidth = new JTextField();
		textFieldofwidth.setColumns(10);
		textFieldofwidth.setBounds(360, 460, 34, 30);
		this.add(textFieldofwidth);
		textFieldofwidth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JTextField textFieldofheight = new JTextField();
		textFieldofheight.setColumns(10);
		textFieldofheight.setBounds(405, 460, 34, 30);
		this.add(textFieldofheight);
		textFieldofheight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofcargoname = new JLabel();
		labelofcargoname.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofcargoname.setText("�ڼ�Ʒ��");
		labelofcargoname.setBounds(520, 460, 75, 30);
		this.add(labelofcargoname);
		
		
		JTextField textFieldofcargoname = new JTextField();
		textFieldofcargoname.setBounds(610,460, 60, 30);
		this.add(textFieldofcargoname);
		textFieldofcargoname.setColumns(10);
		textFieldofcargoname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		
		JLabel labeloforderinfo = new JLabel();
		labeloforderinfo .setFont(new Font("΢���ź�",Font.BOLD,16));
		labeloforderinfo .setText("�����Ϣ");
		labeloforderinfo.setBounds(60, 500, 100, 30);
		this.add(labeloforderinfo);
		
		
		JLabel labelofpackingexpense = new JLabel();
		labelofpackingexpense .setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofpackingexpense.setText("��װ��");
		labelofpackingexpense.setBounds(162, 540, 60, 30);
		this.add(labelofpackingexpense);
		
		
		JComboBox comboBoxofpackingexpense = new JComboBox();
		comboBoxofpackingexpense.setModel(new DefaultComboBoxModel(new String[] {"5Ԫ����װ����", "10Ԫ(ֽ��)", "15Ԫ��ľ�䣩"}));
		comboBoxofpackingexpense.setBounds(220, 540, 110, 30);
		this.add(comboBoxofpackingexpense);
		
		JLabel labelofordertype = new JLabel();
		labelofordertype.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofordertype.setText("�������");
		labelofordertype.setBounds(360, 540, 80, 30);
		this.add(labelofordertype);
	
		
		JComboBox comboBoxofordertype = new JComboBox();
		comboBoxofordertype.setModel(new DefaultComboBoxModel(new String[] {"���ÿ��", "��ͨ���","�ؿ���"}));
		comboBoxofordertype.setToolTipText("\u5FEB");
		comboBoxofordertype.setBounds(440, 540, 80, 30);
		this.add(comboBoxofordertype);
		
		JLabel labelofkind = new JLabel();
		 labelofkind.setFont(new Font("΢���ź�",Font.BOLD,16));
		 labelofkind.setText("����");
		labelofkind.setBounds(540, 540, 40, 30);
		this.add(labelofkind);
	
		
		JTextField textFieldofkind = new JTextField();
		textFieldofkind.setBounds(610, 540, 60, 30);
		this.add(textFieldofkind);
		textFieldofkind.setColumns(10);
		textFieldofkind.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofexpense = new JLabel();
		labelofexpense.setFont(new Font("΢���ź�",Font.BOLD,16));
		labelofexpense.setText("���úϼƣ�");
		labelofexpense.setBounds(730, 486, 100, 30);
		this.add(labelofexpense);
		
		
		JLabel labeloftotalexpense = new JLabel("");
		labeloftotalexpense.setBounds(816, 486, 40, 30);
		this.add(labeloftotalexpense);
		
		
		JButton buttonofack = new JButton("ȷ��");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labeloftotalexpense.setText("100");
			}
		});
		buttonofack.setBounds(730, 530, 68, 30);
		this.add(buttonofack);
		
		
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
					TimePanel.change=true;
					TimePanel.text="��δ�ܳɹ�¼��˼ļ����������ԣ�";
				}else{
					TimePanel.change=true;
					TimePanel.text="�ļ���¼��ɹ���";
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
		buttonofsubmit.setBounds(810, 530, 68, 30);
		this.add(buttonofsubmit);
	}
}
