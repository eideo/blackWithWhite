package ui.sendui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl.send.Impl.PredictTimeAndMonthController;
import bl.send.Service.PredictTimeAndMontyBLService;

public class predicttimeandmoneyui extends JDesktopPane{
	public predicttimeandmoneyui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_30 = new JLabel();
		label_30.setBounds(282, 0, 436, 21);
		this.add(label_30);
		
		
		JLabel labelofprice_1 = new JLabel("");
		labelofprice_1.setBounds(310, 223, 54, 15);
		this.add(labelofprice_1);
		
		JLabel labelofestimatedtime_1 = new JLabel("");
		labelofestimatedtime_1.setBounds(310, 266, 119, 15);
		this.add(labelofestimatedtime_1);
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setBounds(212, 135, 307, 22);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setColumns(10);
		
		JButton buttonofack = new JButton("ȷ��");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PredictTimeAndMontyBLService predictTimeAndMonthController=new PredictTimeAndMonthController();
				String[] timeandmoney=predictTimeAndMonthController.moneyAndTime(textFieldofordernumber.getText());
				if( timeandmoney.equals(null)){
					
				}else{
					labelofprice_1.setText(timeandmoney[0]);
					labelofestimatedtime_1.setText(timeandmoney[1]);
				}
			}
		});
		buttonofack.setBounds(580, 134, 93, 23);
		this.add(buttonofack);
		
		JLabel labelofprice = new JLabel("�۸�");
		labelofprice.setBounds(212, 223, 54, 15);
		this.add(labelofprice);
		
		JLabel labelofestimatedtime = new JLabel("Ԥ��ʱ�䣺");
		labelofestimatedtime.setBounds(212, 266, 72, 15);
		this.add(labelofestimatedtime);
		
		
		

		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ   
						label_30.setText(df.format(new Date()));//��ʾ��ǰʱ��
						Thread.sleep(1000);//��ͣһ��                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
