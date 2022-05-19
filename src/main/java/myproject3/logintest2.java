package myproject3;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class logintest2 {
	@Test
	public void logintest() {
		 ArrayList data = A.getdata("c://excel project//excelreader.xlsx");
		 keywords key=new keywords();
		 for (int i=0; i<data.size(); i++) {
        if(data.get(i).equals("open")) {
        key.open();
        }
        if(data.get(i).equals("url")) {
        	String httpurl=data.get(i+1).toString();
        	key.url(httpurl);
        }
        if(data.get(i).equals("input")) {
        	String testdata=data.get(i+1).toString();
        	String objectName=data.get(i+2).toString();
        	key.input(testdata,objectName);
        }
		if(data.get(i).equals("click")) {
			String objectName=data.get(i+2).toString();
			key.click(objectName);
		}
		}
		 
	}

}
