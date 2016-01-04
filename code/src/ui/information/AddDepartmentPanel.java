package ui.information;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import settings.City;
import settings.CompanySettingsController;
import settings.TransportCenter;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;

public class AddDepartmentPanel extends JPanel{
	NLabel chooseType;
	JComboBox<String> chooseType1;
	
	NLabel addCityName;
	NTextField addCityName1;
	NLabel addCityCode;
	NTextField addCityCode1;
	NLabel[] addCityDistance;
	NTextField[] addCityDistance1;
	
	NLabel chooseCity;
	JComboBox<String> chooseCity1;
	NLabel chooseTrans;
	JComboBox<String> chooseTrans1;
	public AddDepartmentPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		chooseType=new NLabel("��ѡ����������");
		chooseType.setBounds(120, 50, 140, 30);
		this.add(chooseType);
		
		chooseType1=new JComboBox<String>();
		chooseType1.addItem("����");
		chooseType1.addItem("��ת����");
		chooseType1.addItem("Ӫҵ��");
		chooseType1.setBounds(300, 50, 100, 30);
		chooseType1.addFocusListener(new SelectListener());
		this.add(chooseType1);
		
		addCity();

	}
	public void addCity(){
		if(addCityName!=null){
			this.remove(addCityName);
			this.remove(addCityName1);
			this.remove(addCityCode);
			this.remove(addCityCode1);
			addCityName=null;
			addCityName1=null;
			addCityCode=null;
			addCityCode1=null;
		}
		if(chooseCity!=null){
			this.remove(chooseCity);
			this.remove(chooseCity1);
			chooseCity=null;
			chooseCity1=null;
		}
		if(chooseTrans!=null){
			this.remove(chooseTrans);
			this.remove(chooseTrans1);
			chooseTrans=null;
			chooseTrans1=null;
		}	
		
		addCityName=new NLabel("��������");
		addCityName.setBounds(120, 110, 140, 30);
		this.add(addCityName);
		
		addCityName1=new NTextField();
		addCityName1.setBounds(300, 110, 100, 30);
		this.add(addCityName1);
		
		addCityCode=new NLabel("���д���");
		addCityCode.setBounds(500, 110, 140, 30);
		this.add(addCityCode);
		
		addCityCode1=new NTextField();
		addCityCode1.setBounds(660, 110, 100, 30);
		this.add(addCityCode1);
		
		CompanySettingsController csc=new CompanySettingsController();
		ArrayList<City> citys=csc.ourCompany.citys;
		int size=citys.size();
		
		int a1=120;
		int a2=170;
		int b1=60;
		int b2=30;
		int c1=40;
		int c2=30;
		
		int d1=10;
		int d2=50;
		addCityDistance=new NLabel[size];
		addCityDistance1=new NTextField[size];
		for(int i=0;i<size;i++){
			addCityDistance[i]=new NLabel(citys.get(i).name);
			addCityDistance[i].setBounds(a1, a2, b1, b2);
			this.add(addCityDistance[i]);
			a1+=b1+d1;
			
			addCityDistance1[i]=new NTextField();
			addCityDistance1[i].setBounds(a1, a2, d2, b2);
			this.add(addCityDistance1[i]);
			a1+=c1+d2;
			
			if(a1>800){
				a1=120;
				a2=a2+c2;
			}
		}
		repaint();
	}

	public void addBussinessHall(){
		
		if(addCityDistance!=null){
			for(int i=0;i<addCityDistance.length;i++){
				this.remove(addCityDistance[i]);
				this.remove(addCityDistance1[i]);
			}
			addCityDistance=null;
			addCityDistance1=null;
		}
	
		repaint();
		addCityName.setText("Ӫҵ������");
		addCityName1.setText("");
		addCityCode.setText("Ӫҵ������");
		addCityCode1.setText("");
		
		chooseCity=new NLabel("ѡ�����");
		chooseCity.setBounds(450, 50, 80, 30);
		this.add(chooseCity);
		
		chooseCity1=new JComboBox<String>();
		CompanySettingsController csc=new CompanySettingsController();
		String[] names=csc.getCityName();
		for(int i=0;i<names.length;i++){
			chooseCity1.addItem((String)names[i]);
		}
		chooseCity1.addFocusListener(new ChooseListener("��ת����"));
		chooseCity1.setBounds(550, 50, 100, 30);
		this.add(chooseCity1);
		
		chooseTrans=new NLabel("ѡ����ת����");
		chooseTrans.setBounds(700, 50, 140, 30);
		this.add(chooseTrans);
		
		chooseTrans1=new JComboBox<String>();
		chooseTrans1.setBounds(860, 50, 100, 30);
		chooseTrans1.addFocusListener(new ChooseListener("Ӫҵ��"));
		this.add(chooseTrans1);
		
		/*addCityName=new NLabel("Ӫҵ������");
		addCityName.setBounds(120, 110, 140, 30);
		this.add(addCityName);
		
		addCityName1=new NTextField();
		addCityName1.setBounds(300, 110, 100, 30);
		this.add(addCityName1);
		
		addCityCode=new NLabel("Ӫҵ������");
		addCityCode.setBounds(500, 110, 140, 30);
		this.add(addCityCode);
		
		addCityCode1=new NTextField();
		addCityCode1.setBounds(660, 110, 100, 30);
		this.add(addCityCode1);*/
		repaint();
	}
	public void addTransport(){

		if(addCityDistance!=null){
			for(int i=0;i<addCityDistance.length;i++){
				this.remove(addCityDistance[i]);
				this.remove(addCityDistance1[i]);
			}
			addCityDistance=null;
			addCityDistance1=null;
		}
		
		addCityName.setText("��ת��������");
		addCityName1.setText("");
		addCityCode.setText("��ת���Ĵ���");
		addCityCode1.setText("");
		chooseCity=new NLabel("ѡ�����");
		chooseCity.setBounds(450, 50, 80, 30);
		this.add(chooseCity);
		
		chooseCity=new NLabel("ѡ�����");
		chooseCity.setBounds(500, 50, 140, 30);
		this.add(chooseCity);
		
		chooseCity1=new JComboBox<String>();
		CompanySettingsController csc=new CompanySettingsController();
		String[] names=csc.getCityName();
		for(int i=0;i<names.length;i++){
			chooseCity1.addItem((String)names[i]);
		}
		chooseCity1.addFocusListener(new ChooseListener("��ת����"));
		chooseCity1.setBounds(660, 50, 100, 30);
		this.add(chooseCity1);
		

	}
	class SelectListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			String chosed=(String) chooseType1.getSelectedItem();		
			switch(chosed){
			case "����":
				addCity();
				break;
			case "Ӫҵ��":
				addBussinessHall();
				break;
			case "��ת����":
				addTransport();
				break;
			}
		}
		
	}
	
	class ChooseListener implements FocusListener{
		String type;
		public ChooseListener(String type){
			this.type=type;
		}
		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			if(type.equals("Ӫҵ��")){
				
				repaint();
			}
			if(type.equals("��ת����")){
				CompanySettingsController csc=new CompanySettingsController();
				TransportCenter[] transportCenter=csc.getTransportCenters((String)chooseCity1.getSelectedItem());
				chooseTrans1.removeAllItems();
				for(int i=0;i<transportCenter.length;i++){
					chooseTrans1.addItem((String)transportCenter[i].getName());
				}
				repaint();
			}
		}
		
	}
}
