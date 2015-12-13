package ui.sendui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import ui.receivementui.transportfinishedui;

public class getsendui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getsendui window = new getsendui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public getsendui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("������Ϣ��ѯ", null, desktopPane, null);
		
		JLabel label_29 = new JLabel();
		label_29.setBounds(282, 0, 436, 21);
		desktopPane.add(label_29);
		
		
		
		JTextField textField_27 = new JTextField();
		textField_27.setBounds(307, 163, 211, 21);
		desktopPane.add(textField_27);
		textField_27.setColumns(10);
		
		/*
		 * ������ѯ
		 */
		JButton button_6 = new JButton("\u67E5\u8BE2");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_6.setBounds(576, 162, 93, 23);
		desktopPane.add(button_6);
		
		predicttimeandmoneyui t = new predicttimeandmoneyui();
		tabbedPane.addTab("���ۺ�ʱ�����", null, t, null);
		
		transportfinishedui t1 = new transportfinishedui();
		tabbedPane.addTab("�ռ���Ϣ����", null, t1, null);
		
		sendui t2 = new sendui();
		tabbedPane.addTab("�ļ���Ϣ����", null, t2, null);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {       
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
						label_29.setText(df.format(new Date()));//��ʾ��ǰʱ��      
						Thread.sleep(1000);//��ͣһ��                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
