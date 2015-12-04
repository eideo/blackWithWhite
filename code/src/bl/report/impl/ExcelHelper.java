package bl.report.impl;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;

public class ExcelHelper {
	String type;
	public boolean export(BussinessSheetVO bs){
		
		// ��һ��������һ��webbook����Ӧһ��Excel�ļ�  
		HSSFWorkbook wb = new HSSFWorkbook();  
		// �ڶ�������webbook�����һ��sheet,��ӦExcel�ļ��е�sheet  
		HSSFSheet sheet = wb.createSheet("��Ӫ�����");  
		// ����������sheet����ӱ�ͷ��0��,ע���ϰ汾poi��Excel����������������short  
		HSSFRow row = sheet.createRow((int) 0);  
		// ���Ĳ���������Ԫ�񣬲�����ֵ��ͷ ���ñ�ͷ����  
		HSSFCellStyle style = wb.createCellStyle();  
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // ����һ�����и�ʽ  

		HSSFCell cell = row.createCell((short) 0);  
		cell.setCellValue("����");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 1);  
		cell.setCellValue("��������");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 2);  
		cell.setCellValue("������");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 3);  
		cell.setCellValue("������");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 4);  
		cell.setCellValue("��Ŀ");  
		cell.setCellStyle(style); 
		cell = row.createCell((short) 5);  
		cell.setCellValue("��ע");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 6);  
		cell.setCellValue(" ");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 7);  
		cell.setCellValue("����");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 8);  
		cell.setCellValue("�տ�����");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 9);  
		cell.setCellValue("�տ���");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 10);  
		cell.setCellValue("�տ���Ա");  
		cell.setCellStyle(style);  
		// ���岽��д��ʵ������ ʵ��Ӧ������Щ���ݴ����ݿ�õ���  
		ArrayList<PaymentBill> pay=bs.pay;
		ArrayList<ReceiveMoneyBill> paid=bs.paid;
		for(int i=0;i<Math.max(pay.size(),paid.size());i++){  
			
			row = sheet.createRow((int) i + 1);  
			
			if (i<pay.size()) {
				PaymentBill aPayment=pay.get(i);
				cell = row.createCell((short) 0);
				cell.setCellValue("���");
				cell.setCellStyle(style);
				cell = row.createCell((short) 1);
				cell.setCellValue(aPayment.getDate());
				cell.setCellStyle(style);
				cell = row.createCell((short) 2);
				cell.setCellValue(aPayment.money);
				cell.setCellStyle(style);
				cell = row.createCell((short) 3);
				cell.setCellValue(aPayment.payer);
				cell.setCellStyle(style);
				cell = row.createCell((short) 4);
				cell.setCellValue(aPayment.type);
				cell.setCellStyle(style);
				cell = row.createCell((short) 5);
				cell.setCellValue(aPayment.remarks);
				cell.setCellStyle(style);
				cell = row.createCell((short) 6);
				cell.setCellValue(" ");
				cell.setCellStyle(style);
			}
			if (i<paid.size()) {
				ReceiveMoneyBill aReceiveMoneyBill=paid.get(i);
				cell = row.createCell((short) 7);
				cell.setCellValue("�տ");
				cell.setCellStyle(style);
				cell = row.createCell((short) 8);
				cell.setCellValue(aReceiveMoneyBill.getDate());
				cell.setCellStyle(style);
				cell = row.createCell((short) 9);
				cell.setCellValue(aReceiveMoneyBill.money);
				cell.setCellStyle(style);
				cell = row.createCell((short) 10);
				cell.setCellValue(aReceiveMoneyBill.transactor);
				cell.setCellStyle(style);
			}  
		}
		// �����������ļ��浽ָ��λ��  
		String time=getTime();
		row = sheet.createRow((short)(Math.max(pay.size(),paid.size())+1));
		cell=row.createCell((short)0);
		cell.setCellValue("����");
		cell.setCellStyle(style);  
		cell=row.createCell((short)1);
		cell.setCellValue(time);
		cell.setCellStyle(style);  
		
		// �����������ļ��浽ָ��λ��  
		try{  
			FileOutputStream fout = new FileOutputStream("E:/��Ӫ�����/"+time+"��Ӫ�����.xls");  
			wb.write(fout);  
			fout.close();  
		}catch (Exception e){  
			e.printStackTrace(); 
			return false;
		}  
		return true;
	}
	
	public static boolean export(ProfitSheetVO ps){
		// ��һ��������һ��webbook����Ӧһ��Excel�ļ�  
		HSSFWorkbook wb = new HSSFWorkbook();  
		// �ڶ�������webbook�����һ��sheet,��ӦExcel�ļ��е�sheet  
		HSSFSheet sheet = wb.createSheet("�ɱ������");  
		// ����������sheet����ӱ�ͷ��0��,ע���ϰ汾poi��Excel����������������short  
		HSSFRow row = sheet.createRow((int) 0);  
		// ���Ĳ���������Ԫ�񣬲�����ֵ��ͷ ���ñ�ͷ����  
		HSSFCellStyle style = wb.createCellStyle();  
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // ����һ�����и�ʽ  

		HSSFCell cell = row.createCell((short) 0);  
		cell.setCellValue("�ɱ�");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 1);  
		cell.setCellValue("Ӫ��");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 2);  
		cell.setCellValue("����");  
		cell.setCellStyle(style);  
		
		row = sheet.createRow((int) 1);
		cell=row.createCell((short)0);
		cell.setCellValue(ps.totalPay);
		cell.setCellStyle(style);  
		cell = row.createCell((short) 1);  
		cell.setCellValue(ps.totalGet);  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 2);  
		cell.setCellValue(ps.profit);  
		cell.setCellStyle(style); 
		
		String time=getTime();
		row = sheet.createRow((int) 2);
		cell=row.createCell((short)0);
		cell.setCellValue("����");
		cell.setCellStyle(style);  
		cell=row.createCell((short)1);
		cell.setCellValue(time);
		cell.setCellStyle(style);  
		
		// �����������ļ��浽ָ��λ��  
		try{  
			FileOutputStream fout = new FileOutputStream("E:/�ɱ������/"+time+"�ɱ������.xls");  
			wb.write(fout);  
			fout.close();  
		}catch (Exception e){  
			e.printStackTrace(); 
			return false;
		}  
		return true;
	}
	
	/**
	 * ���ϵͳ��ǰʱ��
	 * @return ������ʱ������ַ���
	 */
	public static String getTime(){
		Calendar c=Calendar.getInstance();
		String s=""+c.get(Calendar.YEAR)+(c.get(Calendar.MONTH)+1)+
				adjustTime(""+c.get(Calendar.DATE),2)+
				adjustTime(""+c.get(Calendar.HOUR),2)+
				adjustTime(""+c.get(Calendar.MINUTE),2)+
				adjustTime(""+c.get(Calendar.SECOND),2);
		
		return s;
	}
	
	/**
	 * getTime������˽�и����������ܹ�ʵ�ְѡ�3��ת��Ϊ��03��
	 * @param s ��ת�����ַ���
	 * @param n ��Ҫ��λ��
	 * @return
	 */
	public static String adjustTime(String s,int n){
		char c[]=s.toCharArray();
		if(c.length<n)
			s="0"+s;
		return s;
	}
	
	//Test
/*	public static void main(String[] args){
		ProfitSheetVO ps=new ProfitSheetVO(500,600,100);
		ExcelHelper.export(ps);
	}*/
}
