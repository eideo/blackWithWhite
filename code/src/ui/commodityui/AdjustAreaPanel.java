package ui.commodityui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import bill.Account;
import bl.commoditybl.Impl.AreaAdjust;
import bl.commoditybl.Impl.AreaAdjustController;
import bl.commoditybl.Service.AreaAdjustBLService;
import tools.VaildHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;

public class AdjustAreaPanel extends JPanel{
	private NTextField textFieldofrownumber;
	NLabel labeloforiginalarea;
	NLabel labelofnewarea;
	JComboBox comboBoxoforiginalarea;
	JComboBox comboBoxofnewarea;
	NButton buttonofack;
	NButton buttonofcancel;
	NButton buttonofsubmit;
	NTable table;
	JScrollPane scrollPane;
	ArrayList<Pack> list;
	public AdjustAreaPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		NLabel rownumber = new NLabel("�ź�");
		rownumber.setBounds(300, 80, 60, 30);
		this.add(rownumber);
		
		textFieldofrownumber = new NTextField();
		textFieldofrownumber.setBounds(380, 80, 80, 30);
		this.add(textFieldofrownumber);
		textFieldofrownumber.setColumns(10);
		
		labeloforiginalarea = new NLabel("ԭ����");
		labeloforiginalarea.setBounds(300, 120, 60, 30);
		this.add(labeloforiginalarea);
		
		labelofnewarea = new NLabel("�ַ���");
		labelofnewarea.setBounds(300, 160, 60, 30);
		this.add(labelofnewarea);
		
		comboBoxoforiginalarea = new JComboBox();
		comboBoxoforiginalarea.setModel(new DefaultComboBoxModel(new String[] {"������", "������", "������", "������"}));
		comboBoxoforiginalarea.setBounds(380, 120, 80, 30);
		this.add(comboBoxoforiginalarea);
		
		comboBoxofnewarea = new JComboBox();
		comboBoxofnewarea.setModel(new DefaultComboBoxModel(new String[] {"������", "������", "������", "������"}));
		comboBoxofnewarea.setBounds(380, 160, 80, 30);
		this.add(comboBoxofnewarea);
		
		buttonofack = new NButton("add");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(VaildHelper.checkIsValidID(textFieldofrownumber.getText())){
					int row = Integer.parseInt(textFieldofrownumber.getText());
					String orignal = (String) comboBoxoforiginalarea.getSelectedItem();
					String now = (String) comboBoxofnewarea.getSelectedItem();
					if(list==null){
						list=new ArrayList<Pack>();
						list.add(new Pack(row,orignal,now));
					}else{
						list.add(new Pack(row,orignal,now));
					}
					removeTable();
					buildTable();
				}
			}
		});
		buttonofack.setBounds(600, 210, 40, 40);
		this.add(buttonofack);
		
		
		buttonofsubmit = new NButton("ok");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AreaAdjustController aac=new AreaAdjustController();
				
				int size=list.size();
				int[] rows=new int[size];
				String[] type=new String[size];
				for(int i=0;i<size;i++){
					rows[i]=list.get(i).row;
					type[i]=list.get(i).now;
				}
				boolean result=aac.areaAdjust(rows, type);
				if(result){
					TimePanel.makeWords("��������ɹ���");
				}else{
					TimePanel.makeWords("�������ʧ�ܣ������ԣ�");
				}
			}
		});
		buttonofsubmit.setBounds(600, 550, 40, 40);
		this.add(buttonofsubmit);
		

		repaint();
	}
	
	public void buildTable(){
		int size =list.size();
		Object[][] tableData=new Object[size][3];
		for(int i=0;i<size;i++){
			Pack p=list.get(i);
			tableData[i]=new Object[]{p.row,p.ori,p.now};
		}
		Object[] columnTitle = {"�ź�","ԭ����","�ַ���"};  
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+13;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
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
	class Pack{
		int row;
		String ori;
		String now;
		public Pack(int row,String ori,String now){
			this.row=row;
			this.ori=ori;
			this.now=now;
		}
	}
}

