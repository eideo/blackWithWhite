package ui.receivementui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import vo.ReceiveInformationVO;
import bill.AllocateBill;
import bill.ArrivementBill;
import bill.ArrivementBill_Shop;
import bl.receivement.Impl.DistributionController;
import bl.receivement.Impl.TransportFinishedController;
import bl.receivement.Service.DistributionBLService;
import bl.receivement.Service.TransportFinishedBLService;

public class receiveui extends JDesktopPane{
	
	private JTextField textField_year;
	private JTextField textField_departure;
	private JTextField textField_order_number;
	private JTable table_arrivalOrder;
	private JTextField textField_month;
	private JTextField textField_day;
	
	public receiveui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//营业厅到达单的界面
				this.setBackground(Color.WHITE);
				
				final JLabel textPane_35 = new JLabel();
				textPane_35.setText("营业厅业务员：");
				textPane_35.setBounds(280, 0, 700, 21);
				this.add(textPane_35);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				textPane_35.setText(df.format(new Date()));
				
				JLabel textPane_8 = new JLabel();
				textPane_8.setText("到达日期");
				textPane_8.setBounds(150, 58, 54, 21);
				this.add(textPane_8);
				
				JLabel textPane_9 = new JLabel();
				textPane_9.setText("（年/月/日）");
				textPane_9.setBounds(200, 58, 78, 21);
				this.add(textPane_9);
				
				textField_year = new JTextField();
				textField_year.setBounds(290, 58, 40, 21);
				this.add(textField_year);
				textField_year.setColumns(10);
				
				final JList list = new JList();
				list.setBounds(314, 212, 36, -40);
				this.add(list);
				
				JLabel textPane_10 = new JLabel();
				textPane_10.setText("出发地");
				textPane_10.setBounds(150, 89, 44, 21);
				this.add(textPane_10);
				
				textField_departure = new JTextField();
				textField_departure.setBounds(290, 89, 120, 21);
				this.add(textField_departure);
				textField_departure.setColumns(10);
				
				JLabel textPane_11 = new JLabel();
				textPane_11.setText("订单编号");
				textPane_11.setBounds(467, 132, 54, 21);
				this.add(textPane_11);
				
				textField_order_number = new JTextField();
				textField_order_number.setBounds(540, 132, 126, 21);
				this.add(textField_order_number);
				textField_order_number.setColumns(10);
				
				final JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"货物到达状态", "完整", "破损"}));
				comboBox.setBounds(540, 58, 126, 21);
				this.add(comboBox);
				//添加营业厅到达单的事件监听
				JButton button_4 = new JButton("添加");
				button_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table_arrivalOrder.getRowCount();i++){
							if(table_arrivalOrder.getValueAt(i, 0)==null&&table_arrivalOrder.getValueAt(i, 1)==null&&table_arrivalOrder.getValueAt(i, 2)==null&&table_arrivalOrder.getValueAt(i, 3)==null){
						          table_arrivalOrder.setValueAt(textField_order_number.getText(), i, 0);
						          table_arrivalOrder.setValueAt(textField_year.getText()+textField_month.getText()+textField_day.getText(), i, 1);
						          table_arrivalOrder.setValueAt(textField_departure.getText(), i, 2);
						          table_arrivalOrder.setValueAt(comboBox.getSelectedItem(), i, 3);
						          break;
							}
						}
					}
				});
				button_4.setBounds(708, 130, 93, 23);
				this.add(button_4);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(150, 190, 700, 325);
				this.add(scrollPane);
				
				table_arrivalOrder = new JTable();
				table_arrivalOrder.setModel(new DefaultTableModel(
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
						"订单编号", "到达日期", "出发地", "货物到达状态"
					}
				));
				scrollPane.setViewportView(table_arrivalOrder);
				
				//撤消营业厅到达单table中的一行的事件监听
				JButton button_5 = new JButton("撤消");
				button_5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=table_arrivalOrder.getRowCount()-1;i>=0;i--){
							if(table_arrivalOrder.getValueAt(i, 0)!=null||table_arrivalOrder.getValueAt(i, 1)!=null||table_arrivalOrder.getValueAt(i, 2)!=null||table_arrivalOrder.getValueAt(i, 3)!=null){
								table_arrivalOrder.setValueAt(null, i, 0);
								table_arrivalOrder.setValueAt(null, i, 1);
								table_arrivalOrder.setValueAt(null, i, 2);
								table_arrivalOrder.setValueAt(null, i, 3);
								break;
							}
						}
					}
				});
				button_5.setBounds(259, 528, 93, 23);
				this.add(button_5);
				
				//提交营业厅到达单的事件监听
				JButton button_6 = new JButton("提交");
				button_6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ArrayList<ArrivementBill_Shop> arrivement = null;
						ArrivementBill_Shop ArrivementBill_Shop = new ArrivementBill_Shop();
						for(int i=0;i<table_arrivalOrder.getRowCount();i++){
							ArrivementBill_Shop.ID=(String) table_arrivalOrder.getValueAt(i, 0);
							ArrivementBill_Shop.date = (String[]) table_arrivalOrder.getValueAt(i, 1);
							ArrivementBill_Shop.placeOfDeparture = (String) table_arrivalOrder.getValueAt(i, 2);
						}
						arrivement.add(ArrivementBill_Shop);
						DistributionBLService distribution=new DistributionController();
						boolean istrue=distribution.receive(ArrivementBill_Shop);
						if(istrue=true){
							for(int i=0;i<table_arrivalOrder.getRowCount();i++){
								table_arrivalOrder.setValueAt(null, i, 0);
								table_arrivalOrder.setValueAt(null, i, 1);
								table_arrivalOrder.setValueAt(null, i, 2);
								table_arrivalOrder.setValueAt(null, i, 3);
							}
							textPane_35.setText("提交成功！");
						}else{
							textPane_35.setText("提交失败！");
						}
					}
				});
				button_6.setBounds(708, 528, 93, 23);
				this.add(button_6);
				
				textField_month = new JTextField();
				textField_month.setBounds(340, 58, 30, 21);
				this.add(textField_month);
				textField_month.setColumns(10);
				
				textField_day = new JTextField();
				textField_day.setBounds(380, 58, 30, 21);
				this.add(textField_day);
				textField_day.setColumns(10);
		
	}

}
