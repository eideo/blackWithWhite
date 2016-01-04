package ui.commodityui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import bill.AllocateBill;
import bill.StockBill_In;
import bill.StockBill_Out;
import bl.commoditybl.Impl.OutDepotController;
import bl.receivement.Impl.DistributionController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;
import vo.ReceiveInformationVO;

public class OutDepotPanel extends JPanel {
	
	JTextField textFieldofordernumber ;
	JComboBox comboBoxofshipment ;
	private JTable table;
	JScrollPane scrollPane;
	StockBill_Out outdepot;
	JButton okButton;
	JTextField textFieldofoutdepotnumber;
	JTextField textFieldofyear;
	JTextField textFieldofmonth;
	JTextField textFieldofday;
	JTextField textFieldoftransport;
	JTextField textFieldofdestination;

	public OutDepotPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		
		JLabel labelofoutdepotnumber = new NLabel("���ⵥ��");
		labelofoutdepotnumber.setBounds(120, 50, 80, 30);
		this.add(labelofoutdepotnumber);
		
		textFieldofoutdepotnumber = new NTextField();
		textFieldofoutdepotnumber.setBounds(250, 50, 160, 30);
		this.add(textFieldofoutdepotnumber);
		textFieldofoutdepotnumber.setColumns(10);
		
		JLabel labelofdate = new NLabel("��������");
		labelofdate.setBounds(580, 50, 70, 30);
		this.add(labelofdate);
		
		textFieldofyear = new NTextField();
		textFieldofyear.setBounds(660, 50, 50, 30);
		this.add(textFieldofyear);
		textFieldofyear.setColumns(10);
		
		JLabel labelofyear = new NLabel("��");
		labelofyear.setBounds(715, 50, 20, 30);
		this.add(labelofyear);
		
		textFieldofmonth = new NTextField();
		textFieldofmonth.setBounds(740, 50, 50, 30);
		this.add(textFieldofmonth);
		textFieldofmonth.setColumns(10);
		
		JLabel labelofmonth = new NLabel("��");
		labelofmonth.setBounds(795, 50, 20, 30);
		this.add(labelofmonth);
		
		textFieldofday = new NTextField();
		textFieldofday.setBounds(820, 50, 50, 30);
		this.add(textFieldofday);
		textFieldofday.setColumns(10);
		
		JLabel labelofday = new NLabel("��");
		labelofday.setBounds(875, 50, 20, 30);
		this.add(labelofday);
		
		JLabel labelofdestination = new NLabel("Ŀ�ĵ�");
		labelofdestination.setBounds(120, 110, 60, 30);
		this.add(labelofdestination);
		
		textFieldofdestination = new NTextField();
		textFieldofdestination.setBounds(250, 110, 160, 30);
		this.add(textFieldofdestination);
		textFieldofdestination.setColumns(10);
		
		JLabel labelofshipment = new NLabel("װ����ʽ");
		labelofshipment.setBounds(580, 110, 80, 30);
		this.add(labelofshipment);
		
		comboBoxofshipment = new JComboBox();
		comboBoxofshipment.setFont(new Font("΢���ź�",Font.BOLD,16));
		comboBoxofshipment.addItem("�ɻ�");
		comboBoxofshipment.addItem("��");
		comboBoxofshipment.addItem("����");
		comboBoxofshipment.setBounds(700, 110, 60, 30);
		this.add(comboBoxofshipment);
		
		JLabel labeloftransport = new NLabel("���˱��");
		labeloftransport.setBounds(120, 170, 80, 30);
		this.add(labeloftransport);
		
		textFieldoftransport = new NTextField();
		textFieldoftransport.setBounds(250, 170, 160, 30);
		this.add(textFieldoftransport);
		textFieldoftransport.setColumns(10);
		
		JLabel labelofordernumber = new NLabel("������");
		labelofordernumber.setBounds(580, 170, 70, 30);
		this.add(labelofordernumber);
		
		textFieldofordernumber = new NTextField();
		textFieldofordernumber.setBounds(700, 170, 160, 30);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setColumns(10);
		
		
		JButton addButton = new JButton("���");
		addButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(outdepot==null){
					String billID=textFieldofoutdepotnumber.getText();
					String thisID=textFieldofordernumber.getText();
					String thisForm=comboBoxofshipment.getSelectedItem().toString();
					String thisDate=TimeHelper.adjustTime(textFieldofyear.getText(), 4)+
							TimeHelper.adjustTime(textFieldofmonth.getText(),2)+
							TimeHelper.adjustTime(textFieldofday.getText(),2);
					String thisTransport=textFieldoftransport.getText();
					String thisDestination=textFieldofdestination.getText();
					boolean result=true;
					result=result&&VaildHelper.checkIsValidID(thisID, 10);
					result=result&&VaildHelper.checkIsValidID(thisDate,8);
					if(result){
						outdepot = new StockBill_Out();
						outdepot.add(billID,thisID,thisDate,thisDestination,thisForm,thisTransport);
						textFieldofordernumber.setText("");
						buildTable(outdepot);
						repaint();
					    }
					}else if(outdepot!=null&&(!textFieldofoutdepotnumber.getText().equals(outdepot.ID))
							){
						TimePanel.makeWords("�����޸ĳ��ⵥ��ţ�");
					}else if(outdepot!=null&&(!(TimeHelper.adjustTime(textFieldofyear.getText(), 4)+
							TimeHelper.adjustTime(textFieldofmonth.getText(),2)+
							TimeHelper.adjustTime(textFieldofday.getText(),2)).equals(outdepot.list.get(0).date))){
						TimePanel.makeWords("�����޸ĳ������ڣ�");
					}else if(outdepot!=null&&(!comboBoxofshipment.getSelectedItem().toString().equals(outdepot.list.get(0).form))){
						TimePanel.makeWords("�����޸�װ����ʽ��");
					}else if(outdepot!=null&&(!textFieldoftransport.getText().equals(outdepot.list.get(0).ListID))){
						TimePanel.makeWords("�����޸Ļ��˱�ţ�");
					}else if(outdepot!=null&&(!textFieldofdestination.getText().equals(outdepot.list.get(0).destination))){
						TimePanel.makeWords("�����޸�Ŀ�ĵأ�");
					}else{
						String thisID1=textFieldofordernumber.getText();
						boolean result1=true;
						result1=result1&&VaildHelper.checkIsValidID(thisID1, 10);
						if(result1){
							outdepot.add(outdepot.ID,thisID1,outdepot.list.get(0).date,outdepot.list.get(0).destination,
									outdepot.list.get(0).form,outdepot.list.get(0).ListID);
							textFieldofordernumber.setText("");
							buildTable(outdepot);
							repaint();
						}
				}
			}
			
		});
		addButton.setBounds(815, 230, 80, 30);
		this.add(addButton);
		
		okButton=new JButton();
		okButton.setIcon(new ImageIcon("pic/ok40.png"));
		okButton.setBounds(800, 560, 40, 40);
		okButton.setBorder(null);
		okButton.setFocusPainted(false);
		okButton.setBorderPainted(false);
		okButton.setContentAreaFilled(false);
		okButton.addActionListener(new PushListener());
		this.add(okButton);
		
		}
		
		public void buildTable(StockBill_Out outdepot){
			if(this.scrollPane!=null)
				this.remove(scrollPane);
			int size=outdepot.list.size();
			
			Object[][] tableData=new Object[size][5];
			for(int i=0;i<size;i++){
				
				tableData[i]=new Object[]{outdepot.list.get(i).ID,outdepot.list.get(i).date,outdepot.list.get(i).form,
						outdepot.list.get(i).ListID,outdepot.list.get(i).destination};
			}
			Object[] columnTitle = {"������" ,"��������","װ����ʽ","���˱��","Ŀ�ĵ�"};  
			table=new NTable(tableData,columnTitle);
			int height=table.getRowHeight()*(size+1)+13;
			int ValidMaxHeight=250;
			if(height>=400)
				height=ValidMaxHeight;
			//table.setBounds(200, 50, 600, height);
			table.setOpaque(false); 
			table.setRowSelectionAllowed(true);
			scrollPane = new JScrollPane();
			scrollPane.setBounds(140, 270, 658, height);
			scrollPane.setOpaque(false);
			this.add(scrollPane);
			scrollPane.setViewportView(table);
			
		}
		
		public void removeTable(){
			if(scrollPane!=null)
				this.remove(scrollPane);
		}
		
		class PushListener implements ActionListener{	
			public void actionPerformed(ActionEvent arg0) {
				OutDepotController Outdepot=new OutDepotController();
				boolean result=Outdepot.outDepot(outdepot);
				if(result){
					textFieldofoutdepotnumber.setText("");
					textFieldofordernumber.setText("");
					comboBoxofshipment.setSelectedIndex(0);
					textFieldofyear.setText("");
					textFieldofmonth.setText("");
					textFieldofday.setText("");
					textFieldoftransport.setText("");
					textFieldofdestination.setText("");
					TimePanel.makeWords("�ύ�ɹ���");
					removeTable();
				}else{
					TimePanel.change=true;
					TimePanel.text="�ύʧ�ܣ������ԣ�";
				}
			}
			
		}

}
