package ui.informationui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.TransportBill_Plane;
import bl.shipment.Impl.AirTransportController;
import bl.shipment.Service.AirTransportBLService;
import ui.shipmentui.airtransportui;
import ui.shipmentui.traintransportui;
import ui.shipmentui.transportandreceiveui;
import ui.shipmentui.trucktransportmanageui;

public class ShipPanel extends JPanel {
	private JTable table_Transport;
	private JTable table_airTransport;
	private JTextField textField_departure;
	private JTextField textField_supervisor;
	private JTextField textField_year;
	private JTextField textField_transfer_order;
	private JTextField textField_planeNumber;
	private JTextField textField_destination;
	private JTextField textField_containerNumber;
	private JTextField textField_orderNumber;
	private JButton button;
	private JTextField textField_month;
	private JTextField textField_day;

	public ShipPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		
		final JLabel textPane_1 = new JLabel();
		textPane_1.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		textPane_1.setBounds(280, 0, 700, 21);
		this.add(textPane_1);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 210, 700, 320);
		this.add(scrollPane);
		
		table_airTransport = new JTable();
		table_airTransport.setModel(new DefaultTableModel(
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
		table_airTransport.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane.setViewportView(table_airTransport);
		
		JLabel textPane_2 = new JLabel();
		textPane_2.setText("������");
		textPane_2.setBounds(150, 80, 50, 21);
		this.add(textPane_2);
		
		textField_departure = new JTextField();
		textField_departure.setBounds(200, 80, 200, 21);
		this.add(textField_departure);
		textField_departure.setColumns(10);
		
		JLabel textPane_3 = new JLabel();
		textPane_3.setText("��װԱ");
		textPane_3.setBounds(150, 110, 50, 21);
		this.add(textPane_3);
		
		textField_supervisor = new JTextField();
		textField_supervisor.setBounds(200, 110, 200, 21);
		this.add(textField_supervisor);
		textField_supervisor.setColumns(10);
		
		JLabel textPane = new JLabel();
		textPane.setText("����(��/��/�գ�");
		textPane.setBounds(150, 49, 102, 21);
		this.add(textPane);
		
		textField_year = new JTextField();
		textField_year.setBounds(260, 49, 40, 21);
		this.add(textField_year);
		textField_year.setColumns(10);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setText("��ת������ת�����");
		textPane_6.setBounds(150, 142, 126, 26);
		this.add(textPane_6);
		
		textField_transfer_order = new JTextField();
		textField_transfer_order.setBounds(276, 142, 212, 21);
		this.add(textField_transfer_order);
		textField_transfer_order.setColumns(10);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setText("�����");
		textPane_7.setBounds(504, 49, 45, 21);
		this.add(textPane_7);
		
		textField_planeNumber = new JTextField();
		textField_planeNumber.setBounds(559, 49, 196, 21);
		this.add(textField_planeNumber);
		textField_planeNumber.setColumns(10);
		
		JLabel textPane_8 = new JLabel();
		textPane_8.setText("�����");
		textPane_8.setBounds(504, 80, 50, 21);
		this.add(textPane_8);
		
		textField_destination = new JTextField();
		textField_destination.setBounds(559, 80, 196, 21);
		this.add(textField_destination);
		textField_destination.setColumns(10);
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setText("�����");
		textPane_9.setBounds(504, 110, 50, 21);
		this.add(textPane_9);
		
		textField_containerNumber = new JTextField();
		textField_containerNumber.setBounds(559, 110, 196, 21);
		this.add(textField_containerNumber);
		textField_containerNumber.setColumns(10);
		
		JLabel textPane_10 = new JLabel();
		textPane_10.setText("��ת����ҵ��Ա");
		textPane_10.setBounds(150, 180, 100, 26);
		this.add(textPane_10);
		
		JLabel textPane_11 = new JLabel();
		textPane_11.setText("������");
		textPane_11.setBounds(290, 180, 50, 21);
		this.add(textPane_11);
		
		textField_orderNumber = new JTextField();
		textField_orderNumber.setBounds(350, 179, 140, 21);
		this.add(textField_orderNumber);
		textField_orderNumber.setColumns(10);
		//���ӷɻ�װ�˵����¼�����
		button = new JButton("����");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_airTransport.getRowCount();i++){
					if(table_airTransport.getValueAt(i, 0)==null&&table_airTransport.getValueAt(i, 1)==null){
						table_airTransport.setValueAt(textField_orderNumber.getText(), i, 0);
						table_airTransport.setValueAt(textField_transfer_order.getText(), i, 1);
						break;
					}
				}
			}
		});
		button.setBounds(750, 170, 93, 23);
		this.add(button);
		
		//�����ɻ�װ�˵�һ�е��¼�����
		JButton button_1 = new JButton("����");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_airTransport.getRowCount()-1;i>=0;i--){
					if(table_airTransport.getValueAt(i, 0)!=null||table_airTransport.getValueAt(i, 1)!=null){
						table_airTransport.setValueAt(null, i, 0);
						table_airTransport.setValueAt(null, i, 1);
						break;
					}
				}
			}
		});
		button_1.setBounds(200, 540, 93, 23);
		this.add(button_1);
		
		//�ύ�ɻ�װ�˵����¼�����
		JButton button_2 = new JButton("�ύ");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TransportBill_Plane plane = new TransportBill_Plane();
				AirTransportBLService airTransport=new AirTransportController();
				for(int i=0;i<table_airTransport.getRowCount();i++){
					if(table_airTransport.getValueAt(i, 0)!=null){
				        plane.transBillID=table_airTransport.getValueAt(i, 0).toString();
					}
				}
				double airBill=airTransport.submitBills(plane);
				if(airBill==0){
					textPane_1.setText("�ύʧ�ܣ�");
				}else{
					for(int i=0;i<table_airTransport.getRowCount();i++){
						table_airTransport.setValueAt(null, i, 0);
						table_airTransport.setValueAt(null, i, 1);
					}
					textPane_1.setText("�ύ�ɹ���");
				}
			}
		});
		
		button_2.setBounds(750, 540, 93, 23);
		this.add(button_2);
		
		textField_month = new JTextField();
		textField_month.setBounds(312, 49, 30, 21);
		this.add(textField_month);
		textField_month.setColumns(10);
		
		textField_day = new JTextField();
		textField_day.setBounds(352, 49, 30, 21);
		this.add(textField_day);
		textField_day.setColumns(10);
		
		
	
	}


	
		
}