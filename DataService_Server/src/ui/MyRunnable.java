package ui;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MyRunnable implements Runnable{ 
	administrator aad = new administrator();
	
	//ʵ��Runnable�ӿ�
	public void run() { 
		//�߳�ִ�еķ��� 
		while(true){  
			try{  
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ

				
				//��ӡ��ǰʱ�� 
				Thread.sleep(1000);
				//����1���� 
				}
				catch(Throwable t){  
					t.printStackTrace();   
					}  
			} 
		} 
}
	