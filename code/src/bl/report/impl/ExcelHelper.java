package bl.report.impl;

import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

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
		cell.setCellValue("���");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 1);  
		cell.setCellValue("����");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 2);  
		cell.setCellValue("���");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 3);  
		cell.setCellValue("Ե��");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 4);  
		cell.setCellValue("����Ա");  
		cell.setCellStyle(style);  
		// ���岽��д��ʵ������ ʵ��Ӧ������Щ���ݴ����ݿ�õ���  
		List list = CreateSimpleExcelToDisk.getStudent();  

		for (int i = 0; i < list.size(); i++)  
		{  
		row = sheet.createRow((int) i + 1);  
		Student stu = (Student) list.get(i);  
		// ���Ĳ���������Ԫ�񣬲�����ֵ  
		row.createCell((short) 0).setCellValue((double) stu.getId());  
		row.createCell((short) 1).setCellValue(stu.getName());  
		row.createCell((short) 2).setCellValue((double) stu.getAge());  
		cell = row.createCell((short) 3);  
		cell.setCellValue(new SimpleDateFormat("yyyy-mm-dd").format(stu.getBirth()));  
		}  
		// �����������ļ��浽ָ��λ��  
		try  
		{  
		FileOutputStream fout = new FileOutputStream("E:/students.xls");  
		wb.write(fout);  
		fout.close();  
		}  
		catch (Exception e)  
		{  
		e.printStackTrace();  
		}  
		return false;
		
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
			FileOutputStream fout = new FileOutputStream("E:/"+time+".xls");  
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
