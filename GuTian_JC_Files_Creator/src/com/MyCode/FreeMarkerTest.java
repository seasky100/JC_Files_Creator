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
	        map.put("DSRname", "王狗蛋");
	        map.put("DSRaddress", "福建省南平市延平区");
	        map.put("address", "古田县鹤塘镇“单石小区”地段");
	        WordUtil handler = new WordUtil();
	        Writer out;
	        try {
	        	/*判断目标生成目录是否存在，如果不在则生成新目录*/
	        	String filePath="F:\\监察案卷生成器目录";
	        	File file = new File(filePath);
	        	if(!file.exists()){
	        		file.mkdirs();/*创建目标文档生成目录*/
	        	}else{
	        		System.out.println("目标生成目录已经存在！");
	        	}
	        	
	        	/*输出文档路径及文档名称*/
	            out = new OutputStreamWriter(new FileOutputStream(
	                    "F:\\监察案卷生成器目录\\testModel.doc"), "UTF-8");
	            
	            /*将内容写至目标文件中*/
	            handler.write("/com/MyCode/templete", "09行政处罚决定书.xml", map, out);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

}


///${DSRname}当事人姓名
//${DSRaddress}当事人家庭住址
//${address}违法地址
//