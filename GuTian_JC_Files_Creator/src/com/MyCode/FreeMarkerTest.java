package com.MyCode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import freemarker.template.Configuration;

public class FreeMarkerTest {
	
	private Configuration cfg = null;
	
	public static void main(String[] args) {
	        Map<String, String> map = new HashMap<String, String>();
	        map.put("DSRname", "������");
	        map.put("DSRaddress", "����ʡ��ƽ����ƽ��");
	        map.put("address", "�����غ����򡰵�ʯС�����ض�");
	        WordUtil handler = new WordUtil();
	        Writer out;
	        try {
	        	/*�ж�Ŀ������Ŀ¼�Ƿ���ڣ����������������Ŀ¼*/
	        	String filePath="F:\\��참��������Ŀ¼";
	        	File file = new File(filePath);
	        	if(!file.exists()){
	        		file.mkdirs();/*����Ŀ���ĵ�����Ŀ¼*/
	        	}else{
	        		System.out.println("Ŀ������Ŀ¼�Ѿ����ڣ�");
	        	}
	        	
	        	/*����ĵ�·�����ĵ�����*/
	            out = new OutputStreamWriter(new FileOutputStream(
	                    "F:\\��참��������Ŀ¼\\testModel.doc"), "UTF-8");
	            
	            /*������д��Ŀ���ļ���*/
	            handler.write("/com/MyCode/templete", "09��������������.xml", map, out);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

}


///${DSRname}����������
//${DSRaddress}�����˼�ͥסַ
//${address}Υ����ַ
//