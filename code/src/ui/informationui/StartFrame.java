package ui.informationui;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import ui.NSwing.FunctionPanel;

public class StartFrame extends JFrame{
	public  TimePanel info;
	public  JPanel contentPanel;
	public  JPanel toolBar;
	public  Stack<JPanel> lastPanel ;
	
	public StartFrame(){
		this.setUndecorated(true); 
		//this.setTitle("����ޱ��ݹ�˾");
		this.setBounds(50, 50, 1200,675);
		this.setLayout(null);
		this.setContentPane(new JPanel());
		this.setResizable(false);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	
		lastPanel=new Stack<JPanel>();
		JPanel myPanel=(JPanel) this.getContentPane();
		
		myPanel.setLayout(null);
		
		
		contentPanel=new InformationPanel(this);
		
		
		myPanel.add(contentPanel);
		repaint();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void mini(){
		this.setState(Frame.ICONIFIED);
	}
	public void addToolBar(FunctionPanel tools){
		toolBar=tools;
		this.add(toolBar);
		repaint();
	}
	public void removeToolBar(){
		this.remove(toolBar);
		repaint();
	}
	public void addTimePanel(){
		info=new TimePanel(this);
		MouseEventListener mouseListener = new MouseEventListener(this);
		info.addMouseListener(mouseListener);
		info.addMouseMotionListener(mouseListener);
		this.add(info);
		repaint();
	}
	public void removeTimePanel(){
		this.remove(info);
		repaint();
	}
	public void changePanel(JPanel panel){
		lastPanel.push(contentPanel);
		this.remove(contentPanel);
		contentPanel=panel;
		this.add(contentPanel);
		repaint();		
	}
	
	public void changePanelInner(JPanel panel){
		this.remove(contentPanel);
		contentPanel=panel;
		this.add(contentPanel);
		repaint();		
	}
	
	public void backLastPanel(){
		JPanel panel=lastPanel.pop();
		this.remove(contentPanel);
		contentPanel=panel;
		this.add(contentPanel);
		repaint();		
	}
	public static void main(String[] args){
		StartFrame a=new StartFrame();
		
	}
	
	
	 class MouseEventListener implements MouseInputListener {
         
         Point origin;
		 //�����ק��Ҫ�ƶ���Ŀ�����
         StartFrame frame;
		          
		 public MouseEventListener(StartFrame frame) {
		      this.frame = frame;
		      origin = new Point();
		 }
	        
		        
		 public void mouseClicked(MouseEvent e) {}
		 
		         /**
		          * ��¼��갴��ʱ�ĵ�
		          */
		          @Override
		      public void mousePressed(MouseEvent e) {
		               origin.x = e.getX();  
		               origin.y = e.getY();
		         }
		 
		          @Override
		      public void mouseReleased(MouseEvent e) {}
		 
		          /**
		           * ����ƽ�������ʱ���������ͼ��Ϊ�ƶ�ͼ��
		           */
		          @Override
		          public void mouseEntered(MouseEvent e) {
		              this.frame.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		          }
		          
		          /**
		           * ����Ƴ�������ʱ���������ͼ��ΪĬ��ָ��
		           */
		          @Override
		          public void mouseExited(MouseEvent e) {
		              this.frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		          }
		 
		          /**
		          * ����ڱ�������קʱ�����ô��ڵ�����λ��
		           * �����µ�����λ��  = �ƶ�ǰ����λ��+�����ָ�뵱ǰ����-��갴��ʱָ���λ�ã�
		           */
		         @Override
		         public void mouseDragged(MouseEvent e) {
		             Point p = this.frame.getLocation();
		             this.frame.setLocation(
		                  p.x + (e.getX() - origin.x), 
		                  p.y + (e.getY() - origin.y));  
		          }
		 
		         @Override
		         public void mouseMoved(MouseEvent e){
		        	 
		         }
 
		     }
		  
		
		
}
