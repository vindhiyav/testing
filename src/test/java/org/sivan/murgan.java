package org.sivan;

import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class murgan {
	
	public static void main (String[]args) {
		
		WebDriverManager .edgedriver().setup();
		WebDriver bala =new EdgeDriver();
		bala.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		bala.manage().window().maximize();
		
		
		
	List<WebElement>mix	=bala.findElements(By.tagName("table"));
	for (int i=0 ;i<mix.size();i++) {
	   WebElement	table = mix.get(i);
	   WebElement tbody =table.findElement(By.tagName("tbody"));
  List<WebElement> iRow= tbody.findElements(By.tagName("tr"));
	      for(int v=0 ;v< iRow.size();v++) {
          WebElement row=iRow.get(v);
          List<WebElement> iDate= row.findElements(By.tagName("td"));
             for(int s=0;s<iDate.size(); s++) {
                WebElement date= iDate.get(s);
                   String text= date.getText();
                  for(int)
                    	System.out.println(text);
                    }
                
 
		
             }}}}
                   
	
