package ui.shipmentui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import bill.TransportBill_Plane;
import bill.TransportBill_Train;
import bl.shipment.Impl.AirTransportController;
import bl.shipment.Impl.TrainTransportController;
import bl.shipment.Service.AirTransportBLService;
import bl.shipment.Service.TrainTransportBLService;

public class traintransportui extends JDesktopPane{
	
	
	private JTable trainTable;
	private JTextField textField_year;
	private JTextField textField_startplace;
	private JTextField textField_supervisor;
	private JTextField textField_transfer_order;
	private JTextField textField_order_number;
	private JTextField textField_train_number;
	private JTextField textField_destination;
	private JTextField textField_car_number;
	private JTextField textField_month;
	private JTextField textField_day;
	
	public traintransportui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		       //��װ�˹���Ľ���
		       final JLabel timeLabel = new JLabel();
		       timeLabel.setText("��ת����ҵ��Ա");
		       timeLabel.setBounds(280, 0, 700, 21);
		       this.add(timeLabel);
		       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		       timeLabel.setText(df.format(new Date()));
		
				this.setBackground(Color.WHITE);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(150, 210, 700, 320);
				this.add(scrollPane_1);
				
				trainTable = new JTable();
				trainTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
					},
					new String[] {
						"������", "��ת������ת�����"
					}
				));
				trainTable.getColumnModel().getColumn(0).setPreferredWidth(30);
				scrollPane_1.setViewportView(trainTable);
				
				JLabel textPane_13 = new JLabel();
				textPane_13.setText("���ڣ���/��/�գ�");
				textPane_13.setBounds(150, 49, 102, 21);
				this.add(textPane_13);
				
				textField_year = new JTextField();
				textField_year.setBounds(262, 49, 40, 21);
				this.add(textField_year);
				textField_year.setColumns(10);
				
				JLabel textPane_17 = new JLabel();
				textPane_17.setText("������");
				textPane_17.setBounds(150, 80, 45, 21);
				this.add(textPane_17);
				
				textField_startplace = new JTextField();
				textField_startplace.setBounds(200, 80, 200, 21);
				this.add(textField_startplace);
				textField_startplace.setColumns(10);
				
				JLabel textPane_18 = new JLabel();
				textPane_18.setText("��װԱ");
				textPane_18.setBounds(150, 110, 45, 21);
				this.add(textPane_18);
				
				textField_supervisor = new JTextField();
				textField_supervisor.setBounds(200, 110, 200, 21);
				this.add(textField_supervisor);
				textField_supervisor.setColumns(10);
				
				JLabel textPane_19 = new JLabel();
				textPane_19.setText("��ת������ת�����");
				textPane_19.setBounds(150, 142, 126, 21);
				this.add(textPane_19);
				
				textField_transfer_order = new JTextField();
				textField_transfer_order.setBounds(276, 142, 212, 21);
				this.add(textField_transfer_order);
				textField_transfer_order.setColumns(10);
				
				JLabel textPane_20 = new JLabel();
				textPane_20.setText("���������Ǽ�");
				textPane_20.setBounds(150, 180, 100, 21);
				this.add(textPane_20);
				
				JLabel textPane_21 = new JLabel();
				textPane_21.setText("������");
				textPane_21.setBounds(290, 180, 45, 21);
				this.add(textPane_21);
				
				textField_order_number = new JTextField();
				textField_order_number.setBounds(345, 179, 143, 21);
				this.add(textField_order_number);
				textField_order_number.setColumns(10);
				
				JLabel textPane_22 = new JLabel();
				textPane_22.setText("���κ�");
				textPane_22.setBounds(504, 49, 45, 21);
				this.add(textPane_22);
				
				JLabel textPane_23 = new JLabel();
				textPane_23.setText("�����");
				textPane_23.setBounds(504, 80, 45, 21);
				this.add(textPane_23);
				
				JLabel textPane_24 = new JLabel();
				textPane_24.setText("�����");
				textPane_24.setBounds(504, 110, 45, 21);
				this.add(textPane_24);
				
				textField_train_number = new JTextField();
				textField_train_number.setBounds(559, 49, 196, 21);
				this.add(textField_train_number);
				textField_train_number.setColumns(10);
				
				textField_destination = new JTextField();
				textField_destination.setBounds(559, 80, 196, 21);
				this.add(textField_destination);
				textField_destination.setColumns(10);
				
				textField_car_number = new JTextField();
				textField_car_number.setBounds(559, 110, 196, 21);
				this.add(textField_car_number);
				textField_car_number.setColumns(10);
				//��ӻ�װ�˵��ŵ��¼�����
				JButton button_3 = new JButton("���");
				button_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<trainTable.getRowCount();i++){
							if(trainTable.getValueAt(i, 0)==null&&trainTable.getValueAt(i, 1)==null){
								trainTable.setValueAt(textField_order_number.getText(), i, 0);
								trainTable.setValueAt(textField_transfer_order.getText(), i, 1);
								break;
							}
						}
					}
				});
				button_3.setBounds(750, 170, 93, 23);
				this.add(button_3);
				
				//������װ�˵���һ�е��¼�����
				JButton button_4 = new JButton("����");
				button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=trainTable.getRowCount()-1;i>=0;i--){
							if(trainTable.getValueAt(i, 0)!=null||trainTable.getValueAt(i, 1)!=null){
								trainTable.setValueAt(null, i, 0);
								trainTable.setValueAt(null, i, 1);
								break;
							}
						}
					}
				});
				button_4.setBounds(200, 540, 93, 23);
				this.add(button_4);
				
				textField_month = new JTextField();
				textField_month.setBounds(312, 49, 30, 21);
				this.add(textField_month);
				textField_month.setColumns(10);
				
				textField_day = new JTextField();
				textField_day.setBounds(352, 49, 30, 21);
				this.add(textField_day);
				textField_day.setColumns(10);
				
				//�ύ��װ�˵����¼�����
				JButton button_5 = new JButton("�ύ");
				button_5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TransportBill_Train train = new TransportBill_Train();
						TrainTransportBLService trainTransport=new TrainTransportController();
						for(int i=0;i<trainTable.getRowCount();i++){
							if(trainTable.getValueAt(i, 0)!=null){
						        train.transBillID=trainTable.getValueAt(i, 0).toString();
							}
						}
						double trainBill=trainTransport.submitBills(train);
						if(trainBill==0){
							timeLabel.setText("�ύʧ�ܣ�");
						}else{
							for(int i=0;i<trainTable.getRowCount();i++){
								trainTable.setValueAt(null, i, 0);
								trainTable.setValueAt(null, i, 1);
							}
							timeLabel.setText("�ύ�ɹ���");
						}
					}
				});
				button_5.setBounds(750, 540, 93, 23);
				this.add(button_5);
	}

}
