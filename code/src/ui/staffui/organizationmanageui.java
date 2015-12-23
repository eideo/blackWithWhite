package ui.staffui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class organizationmanageui extends JDesktopPane{
	private JTextField textFieldofnewcity;
	private JTextField textFieldofdistance;
	private JTable tableoftransitmanage;
	private JTable tableofbusinesshallmanage;
	private JTable tableofaddnewstaff;
	
	public organizationmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_22 = new JLabel();
		label_22.setBounds(282, 0, 436, 21);
		this.add(label_22);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(46, 36, 881, 536);
		this.add(tabbedPane_4);
		
		JDesktopPane desktopPane_20 = new JDesktopPane();
		desktopPane_20.setBackground(Color.WHITE);
		tabbedPane_4.addTab("����³���", null, desktopPane_20, null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(207, 111, 421, 342);
		desktopPane_20.add(scrollPane_7);
		
		tableofaddnewstaff = new JTable();
		tableofaddnewstaff.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"����������", "ԭ�г�����", "����"
			}
		));
		scrollPane_7.setViewportView(tableofaddnewstaff);
		
		JLabel labelofnewcity = new JLabel("��������");
		labelofnewcity.setBounds(155, 63, 54, 15);
		desktopPane_20.add(labelofnewcity);
		
		textFieldofnewcity = new JTextField();
		textFieldofnewcity.setBounds(252, 60, 66, 21);
		desktopPane_20.add(textFieldofnewcity);
		textFieldofnewcity.setColumns(10);
		
		JLabel labelofdistance = new JLabel("����");
		labelofdistance.setBounds(387, 63, 54, 15);
		desktopPane_20.add(labelofdistance);
		
		JComboBox comboBoxofoldcity = new JComboBox();
		comboBoxofoldcity.setBounds(451, 60, 54, 21);
		desktopPane_20.add(comboBoxofoldcity);
		
		textFieldofdistance = new JTextField();
		textFieldofdistance.setBounds(562, 60, 66, 21);
		desktopPane_20.add(textFieldofdistance);
		textFieldofdistance.setColumns(10);
		
		JLabel labelofmile = new JLabel("km");
		labelofmile.setBounds(638, 63, 54, 15);
		desktopPane_20.add(labelofmile);
		
		JButton buttonofaddnewcity = new JButton("���");
		buttonofaddnewcity.setBounds(648, 88, 93, 23);
		desktopPane_20.add(buttonofaddnewcity);
		
		JButton buttonofcancelnewcity = new JButton("����");
		buttonofcancelnewcity.setBounds(207, 463, 93, 23);
		desktopPane_20.add(buttonofcancelnewcity);
		
		JButton buttonofsubmitnewcity = new JButton("�ύ");
		buttonofsubmitnewcity.setBounds(648, 463, 93, 23);
		desktopPane_20.add(buttonofsubmitnewcity);
		
		JDesktopPane desktopPane_21 = new JDesktopPane();
		desktopPane_21.setBackground(Color.WHITE);
		tabbedPane_4.addTab("��ת���Ĺ���", null, desktopPane_21, null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(207, 111, 421, 342);
		desktopPane_21.add(scrollPane_8);
		
		tableoftransitmanage = new JTable();
		tableoftransitmanage.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"����", "��ת����", "��ת���ı��"
			}
		));
		scrollPane_8.setViewportView(tableoftransitmanage);
		
		JLabel labelofoldcity = new JLabel("����");
		labelofoldcity.setBounds(337, 32, 54, 15);
		desktopPane_21.add(labelofoldcity);
		
		JComboBox comboBoxofoldcity_1 = new JComboBox();
		comboBoxofoldcity_1.setBounds(432, 29, 66, 21);
		desktopPane_21.add(comboBoxofoldcity_1);
		
		JButton buttonofquerytransit = new JButton("��ѯ");
		buttonofquerytransit.setBounds(370, 71, 93, 23);
		desktopPane_21.add(buttonofquerytransit);
		
		JButton buttonofcanceltransit = new JButton("����");
		buttonofcanceltransit.setBounds(663, 460, 93, 23);
		desktopPane_21.add(buttonofcanceltransit);
		
		JButton buttonofsubmittransit = new JButton("�ύ");
		buttonofsubmittransit.setBounds(207, 460, 93, 23);
		desktopPane_21.add(buttonofsubmittransit);
		
		JDesktopPane desktopPane_22 = new JDesktopPane();
		desktopPane_22.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Ӫҵ������", null, desktopPane_22, null);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(207, 111, 421, 342);
		desktopPane_22.add(scrollPane_9);
		
		tableofbusinesshallmanage = new JTable();
		tableofbusinesshallmanage.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"����", "Ӫҵ��", "Ӫҵ�����"
			}
		));
		scrollPane_9.setViewportView(tableofbusinesshallmanage);
		
		JLabel labelofoldcity_2 = new JLabel("����");
		labelofoldcity_2.setBounds(337, 32, 54, 15);
		desktopPane_22.add(labelofoldcity_2);
		
		JComboBox comboBoxofoldcity_2 = new JComboBox();
		comboBoxofoldcity_2.setBounds(432, 29, 66, 21);
		desktopPane_22.add(comboBoxofoldcity_2);
		
		JButton buttonofquerybusinesshall = new JButton("��ѯ");
		buttonofquerybusinesshall.setBounds(370, 71, 93, 23);
		desktopPane_22.add(buttonofquerybusinesshall);
		
		JButton buttonofcancelbussinesshall = new JButton("����");
		buttonofcancelbussinesshall.setBounds(663, 460, 93, 23);
		desktopPane_22.add(buttonofcancelbussinesshall);
		
		JButton buttonofsubmitbussinesshall = new JButton("�ύ");
		buttonofsubmitbussinesshall.setBounds(207, 460, 93, 23);
		desktopPane_22.add(buttonofsubmitbussinesshall);
		
	}
}
