package ui.reportui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.report.impl.ProfitSheetController;
import bl.report.service.ProfitSheetBLService;
import vo.ProfitSheetVO;

public class profitsheetui extends JDesktopPane{
	
	JTable tableofprofitsheet;
	ProfitSheetBLService profitsheet = new ProfitSheetController();
	/**
	 * Create the application.
	 */
	public profitsheetui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_20 = new JLabel();
		label_20.setBounds(282, 0, 436, 21);
		this.add(label_20);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(46, 36, 881, 536);
		this.add(tabbedPane_3);
		
		JDesktopPane desktopPane_17 = new JDesktopPane();
		desktopPane_17.setBackground(Color.WHITE);
		tabbedPane_3.addTab("�ɱ������", null, desktopPane_17, null);
		
		JLabel labelofdate = new JLabel("ϵͳ��ǰ���ڣ�");
		labelofdate.setBounds(235, 98, 89, 15);
		desktopPane_17.add(labelofdate);
		
		/*
		 * �鿴�ɱ������
		 */
		JButton btnNewButton = new JButton("��ѯ");
		btnNewButton.setBounds(519, 153, 93, 23);
		desktopPane_17.add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ProfitSheetVO profitSheet = profitsheet.show();
				tableofprofitsheet.setValueAt(profitSheet.totalGet, 0, 0);
				tableofprofitsheet.setValueAt(profitSheet.totalPay, 0, 1);
				tableofprofitsheet.setValueAt(profitSheet.profit, 0, 2);
				tableofprofitsheet.setValueAt(profitSheet.time, 0, 3);
			}
		});
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(235, 247, 377, 44);
		desktopPane_17.add(scrollPane_5);
		
		tableofprofitsheet = new JTable();
		tableofprofitsheet.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"������", "��֧��", "������", "��ֹ����"
			}
		));
		scrollPane_5.setViewportView(tableofprofitsheet);
		
		/*
		 * �����ɱ������
		 */
		JButton buttonofexport = new JButton("����");
		buttonofexport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean istrue=profitsheet.export();
				if(istrue){
					tableofprofitsheet.setValueAt(null, 0, 0);
					tableofprofitsheet.setValueAt(null, 0, 1);
					tableofprofitsheet.setValueAt(null, 0, 2);
					tableofprofitsheet.setValueAt(null, 0, 3);
				}else{
					
				}
			}
		});
		buttonofexport.setBounds(636, 360, 93, 23);
		desktopPane_17.add(buttonofexport);
		
		JLabel labelofdate_1 = new JLabel("");
		labelofdate_1.setBounds(349, 98, 165, 15);
		desktopPane_17.add(labelofdate_1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ
		labelofdate_1.setText(df.format(new Date()));//��ʾ��ǰʱ��
		
		bussinesssheetui t1 = new bussinesssheetui();
		tabbedPane_3.addTab("�����ѯ", null, t1, null);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
						label_20.setText(df.format(new Date()));//��ʾ��ǰʱ��
						
						Thread.sleep(1000);//��ͣһ��                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}
}
