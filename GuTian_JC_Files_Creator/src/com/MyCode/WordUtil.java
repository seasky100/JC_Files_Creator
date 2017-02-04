package com.MyCode;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class WordUtil {
    private Configuration configuration = null;

    public WordUtil() {
        try {
            configuration = new Configuration();
            configuration.setDefaultEncoding("UTF-8");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private Template getTemplate(String templatePath, String templateName)
            throws IOException {
    	
    	/*
    	  System.out.println("1"+Thread.currentThread().getContextClassLoader().getResource(""));     
    	  System.out.println("2"+WordUtil.class.getClassLoader().getResource(""));        
    	  System.out.println("3"+ClassLoader.getSystemResource(""));        
    	  System.out.println("4"+WordUtil.class.getResource(""));        
    	  System.out.println("5"+WordUtil.class.getResource("/")); //Class文件所在路径  
    	  System.out.println("6"+new File("/").getAbsolutePath());        
    	  System.out.println("7"+System.getProperty("user.dir")); */
    	
        configuration.setClassForTemplateLoading(this.getClass(), templatePath);
        Template t = configuration.getTemplate(templateName);
        t.setEncoding("UTF-8");
        return t;
    }

    public void write(String templatePath, String templateName,
            Map<String, String> dataMap, Writer out) {
        try {
            Template t = getTemplate(templatePath, templateName);
            t.process(dataMap, out);
            out.close();
            /*System.out.println("完成案卷自动生成！！！！");*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}