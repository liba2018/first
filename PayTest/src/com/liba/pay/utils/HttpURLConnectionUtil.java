package com.liba.pay.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class HttpURLConnectionUtil {
	 public static String sendPostRequest(String url,Map<String,Object> parameters){  
	        // Post�����url����get��ͬ���ǲ���Ҫ������  
	        String result="";
	        try {

	        URL postUrl = new URL(url);

	        // �������start

	        /*Properties systemProperties =System.getProperties();
	        systemProperties.setProperty("http.proxyHost",proxyHost);

	        systemProperties.setProperty("http.proxyPort",String.valueOf(proxyPort));*/

	        // �������end

	        // ������  
	        HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();       
	        // �����Ƿ���connection�������Ϊ�����post���󣬲���Ҫ����  
	        // http�����ڣ������Ҫ��Ϊtrue  
	        connection.setDoOutput(true);  
	        // Read from the connection. Default is true.  
	        connection.setDoInput(true);  
	        // Ĭ���� GET��ʽ  
	        connection.setRequestMethod("POST");        
	        // Post ������ʹ�û���  
	        connection.setUseCaches(false);    
	           //���ñ��������Ƿ��Զ��ض���   
	        connection.setInstanceFollowRedirects(true);        
	        // ���ñ������ӵ�Content-type������Ϊapplication/x-www-form-urlencoded��  
	        // ��˼��������urlencoded�������form����  
	        connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");  
	        // ���ӣ���postUrl.openConnection()���˵����ñ���Ҫ��connect֮ǰ��ɣ�  
	        // Ҫע�����connection.getOutputStream�������Ľ���connect��  
	        connection.connect();  
	        DataOutputStream out = new DataOutputStream(connection  
	                .getOutputStream());  
	        // ���ģ�����������ʵ��get��URL�� '? '��Ĳ����ַ���һ��  
	        String content = "";  
	        // DataOutputStream.writeBytes���ַ����е�16λ��unicode�ַ���8λ���ַ���ʽд��������  
	        if(null != parameters && parameters.size()>0){
	            for(Map.Entry<String,Object> entry : parameters.entrySet()){
	                   content +="&"+entry.getKey()+"="+entry.getValue();               
	            }
	            
	            System.out.println("�����������"+content.toString());
		        out.writeBytes(content.replaceFirst("&", ""));
	    }
	          
	        //������ǵù�  

	        out.flush(); 

	       //ȥ������start

	        /*System.getProperties().remove("http.proxyHost");

	        System.getProperties().remove("http.proxyPort");*/

	       //ȥ������end



	        out.close();  
	        //��ȡ��Ӧ  
	        //��ȡ�������Դ  
	        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));  
	        result =br.readLine();  
	        br.close();  
	        //�øɵĶ�������,�ǵð����Ӷ���  
	        connection.disconnect();  
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	             return null;
	        } 
	        return result;
	  }  
	 public static void main(String[] args) throws FileNotFoundException {
		/* Map map =new HashMap();
		sendPostRequest("", map);*/
		 int i=0;
		 try{
			 i=1/0;
		 }
		 catch (Exception e) {
			 //e.printStackTrace(new PrintStream("d:\\test.txt"));
			 //e.printStackTrace(System.out);
			 System.out.println("捕捉异常");
		}finally {
			System.out.println("end.....");
		}
		 
		 
		 
	}
}
