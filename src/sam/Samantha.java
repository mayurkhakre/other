package sam;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.github.javafaker.Faker;
public class Samantha {

	static Faker fake = new Faker();
	static WebDriver driver = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		// Samantha.percentSInXpathProgramArray();
		// Samantha.percentSInXpathProgram();
	// Samantha.copyContentsFromClipboard();
		// Samantha.copyContent();
		//Samantha.formatString();
		//Samantha.sendDataByJavascript();
	//	Samantha.multiplyTable();
		//Samantha.copycontentsFromClipboardusingRobot();
		//Samantha.copyContentsUsingJava();
	//	Samantha.array();
		//Samantha.getDateDifferrence("26-07-2021 12:03:34","26-08-2021 11:05:32");
      //Samantha.getDateDifferrence(LocalDate.of(2021,8,25),LocalDate.of(2021,8,28),"11:00:00","12:00:00");
	//getDateAndTimeDifferrence.getDateDifferrence(LocalDate.of(2021,7,10),LocalDate.of(2021,8,12),"11:00:00","12:00:00");
		//Samantha.randomNameGenerator();
		//Samantha.readCsv();
		Samantha.arithmatic();
	
	}
	
	public static void arithmatic(){
		int a=100;
		int b=20;
		int c=50;
		int result=a%b;
		System.out.println(result);
		
	}
	
	public static void readCsv() throws Exception{
		ArrayList<String>al=new ArrayList<>();
		sc=new Scanner(new File("C:/Users/Mayur Khakare/Downloads/blankRowsOfDataManualImport.csv"));
		sc.useDelimiter(",");
		while(sc.hasNext()){
			System.out.println(sc.next());
			al.add(sc.next());
			
		}
		System.out.println(al);
	}
	
	public static void randomNameGenerator(){
		System.out.println("IASYS_"+RandomStringUtils.randomAlphabetic(5));
	}

	public static void initialize() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void formatString() {

		String[] str = new String[3];
		Integer[] integer = new Integer[3];
		for (int i = 0; i < 3; i++) {
			// String str=sc.next();
			// int in=sc.nextInt();
			System.out.println("Enter data string");
			str[i] = sc.next();
			System.out.println("Enter data integer");
			integer[i] = sc.nextInt();

		}
		for (int i = 0; i < 3; i++) {
			System.out.printf("%-25s%05d %n", str[i], integer[i]);
		}

	}
	public static void multiplyTable(){
		System.out.println("Enter digit");
		int integer=sc.nextInt();
		int i=1;
		if(integer<1 || integer>20){
			while(integer<1 || integer>20){
				System.out.println("Enter within 1 to 20 attempt "+i);
				integer=sc.nextInt();
				i++;
				if(i>3){
					System.out.println("Try next time");
					break;
				}
			}//while
	}//if
		if(integer>=1 && integer<=20){
			for(int j=1;j<=10;j++){
				System.out.println(integer+" x "+j+" = "+integer*j);
			}
			
		}
	}

	public static void copyContent() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/Mayur Khakare/Desktop/samJam.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		File a = new File("C:/Users/Mayur Khakare/Desktop/samJam.txt");
		FileReader fr = new FileReader(a);

		String line = br.readLine();
		if (line != null) {
			System.out.println(line);

		}
	}
	
	public static void sendDataByJavascript() throws Exception{
		String name="kia";
     Samantha.initialize();
     driver.get("https://facebook.com");
     Thread.sleep(2000);
     WebElement text=driver.findElement(By.cssSelector("input[id='email']"));
     JavascriptExecutor JS = (JavascriptExecutor) driver;
     JS.executeAsyncScript("arguments[0].value='"+name+"'",text);
   //  JS.executeScript("document.getElementById('email').value='mayurvk1993'"); 
	}
	public static  void copyContentsUsingJava() throws Exception{
		 Transferable t=null;
		StringSelection data = new StringSelection
		         ("This	is 	copied	 to	 the	 clipboard");
		      Clipboard cb = Toolkit.getDefaultToolkit()
		         .getSystemClipboard();
		      cb.setContents(data, data);


		      // This represents the paste (Ctrl+V) operation

		      try {
		          t = cb.getContents(null);
		         if (t.isDataFlavorSupported(DataFlavor.stringFlavor))
		            System.out.println(t.getTransferData(DataFlavor
		               .stringFlavor));
		      } catch (UnsupportedFlavorException | IOException ex) {
		          System.out.println("");
		      }
		     Samantha.initialize();
		      driver.get("https://plaintexttools.github.io/plain-text-table/");
	   		  driver.manage().window().maximize(); 
	   		  Thread.sleep(5000);
	   		  WebElement textBox=driver.findElement(By.cssSelector("table[class='htCore'] tbody tr td"));
	   		 Thread.sleep(5000);
	   		JavascriptExecutor JS = (JavascriptExecutor) driver;
			  JS.executeAsyncScript("arguments[0].value='mk'",textBox);
	   		 
	   		//  Actions act=new Actions(driver);
	   		  Object datas=t.getTransferData(DataFlavor.stringFlavor);
	   		 
	   		// act.moveToElement(textBox).click().sendKeys(t.getTransferData(DataFlavor.stringFlavor)).build().perform();
	      
	} 
     public static void copycontentsFromClipboardusingRobot() throws Exception{
    	 Samantha.initialize();
    	 File inFile = new File("C:/Users/Mayur Khakare/Desktop/samJam.txt");
    	 StringBuilder targetString = new StringBuilder(" ");
		  try { 
			  FileReader fr = new FileReader(inFile);
			  BufferedReader br = new BufferedReader(fr);
			  String s = null; 
			  while ((s = br.readLine()) != null) 
			  {
				  targetString.append(s);
			      targetString.append('\n');
			  }
			  } 
		  catch (IOException e) 
		  { e.printStackTrace(); }
		 String targetString2=targetString.toString();
    	  
    	    StringSelection obj = new StringSelection(targetString2);
    	     
    	     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    	     clipboard.setContents(obj, obj);
    	    	     Robot rb = new Robot();
    			
    		 rb.keyPress(KeyEvent.VK_CONTROL); 
    		 rb.keyPress(KeyEvent.VK_A);
    		 rb.keyRelease(KeyEvent.VK_CONTROL);
    		 rb.keyRelease(KeyEvent.VK_A);
    		 rb.keyPress(KeyEvent.VK_CONTROL);
    		 rb.keyPress(KeyEvent.VK_C);
    		 rb.keyRelease(KeyEvent.VK_CONTROL); 
    		 rb.keyRelease(KeyEvent.VK_C);
    		
    		
    		//save clipboard into string
    		 String newString = "";
    		 
    		     try {
    		       newString = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
    		     } catch (HeadlessException e) {
    		       e.printStackTrace();
    		     } catch (UnsupportedFlavorException e) {
    		       e.printStackTrace();
    		     } catch (IOException e) {
    		       e.printStackTrace();
    		     } 

    		 System.out.println(newString);//prints "myString"
    		 
    		driver.get("https://plaintexttools.github.io/plain-text-table/");
   		  driver.manage().window().maximize(); 
   		  Thread.sleep(5000);
   		  WebElement textBox=driver.findElement(By.cssSelector("table[class='htCore'] tbody tr td"));
   		 Thread.sleep(5000);
   		 
   		  Actions act=new Actions(driver);
   		  act.moveToElement(textBox).click().build().perform();
   		rb.keyPress(KeyEvent.VK_CONTROL); 
		 rb.keyPress(KeyEvent.VK_V);
   		//Actions builder = new Actions(driver);
   		//builder.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"),Keys.chord(Keys.CONTROL,"v")).build().perform();
   		//  act.moveToElement(textBox).click().sendKeys(Keys.chord(Keys.CONTROL,"v")).build(). perform();
   		//act.moveToElement(textBox).click().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"),Keys.chord(Keys.CONTROL,"v")).build(). perform();
    		 
    		 
      }
	public static void copyContentsFromClipboard() throws Exception {
	   File inFile = new File("C:/Users/Mayur Khakare/Desktop/samJam.txt");
    // StringSelection obj = new StringSelection("C:/Users/Mayur Khakare/Desktop/samJam.txt");
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj,obj);
		//Clipboard clip = null;
		//clip.setContents(obj, null);
		//clip = Toolkit.getDefaultToolkit().getSystemClipboard();

		Robot rb = new Robot();
		 rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_A);
		 rb.keyRelease(KeyEvent.VK_CONTROL); rb.keyRelease(KeyEvent.VK_A);
		 rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_C);
		 rb.keyRelease(KeyEvent.VK_CONTROL); rb.keyRelease(KeyEvent.VK_C);
		 rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_V);
		 
		 File inFile2 = new File("C:/Users/Mayur Khakare/Desktop/samJam2.txt");
	//	 System.out.print();
		/*rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(200);
		rb.keyPress(KeyEvent.VK_C);
		Thread.sleep(200);
		rb.keyRelease(KeyEvent.VK_C);
		Thread.sleep(200);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(200);*/

		
		  StringBuilder targetString = new StringBuilder(" ");
		  try { 
			  FileReader fr = new FileReader(inFile);
			  BufferedReader br = new BufferedReader(fr);
			  String s = null; 
			  while ((s = br.readLine()) != null) 
			  {
				  targetString.append(s);
			      targetString.append('\n');
			  }
			  } 
		  catch (IOException e) 
		  { e.printStackTrace(); }
		 

		/*Object data = clip.getData(DataFlavor.stringFlavor);

		System.out.print(data);*/
		Samantha.initialize();
		  String targetString2=targetString.toString();
		  System.out.print(targetString2);
		  driver.get("https://plaintexttools.github.io/plain-text-table/");
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,250)", "");
		  driver.manage().window().maximize(); 
		  Thread.sleep(5000);
		  WebElement textBox=driver.findElement(By.cssSelector("table[class='htCore'] tbody tr td"));
		  Actions act=new Actions(driver);
		  act.moveToElement(textBox).click().build().perform();
		  Thread.sleep(5000);
		  JavascriptExecutor JS = (JavascriptExecutor) driver;
		  JS.executeAsyncScript("arguments[0].value='mk'",textBox);
		  //JS.executeScript("document.getElementById('email').value='mayurvk1993'"); 
		  //Actions act=new Actions(driver);
		  //act.moveToElement(textBox).click().sendKeys(targetString).build(). perform();
		 
		/*
		 * textBox.click(); Thread.sleep(3000);
		 * System.out.println(targetString); textBox.sendKeys(targetString);
		 */
	}

	public static void percentSInXpathProgram() throws Exception {
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Enter option");
		String xpathString = sc.nextLine();
		String xpath = "//a[text()='%s']";
		driver.findElement(By.xpath(String.format(xpath, xpathString))).click();
		}

	public static void percentSInXpathProgramArray() throws Exception {
		String[] argsOfString = { "Linking of PAN with Aadhaar", "Registration for Doorstep Banking",
				"Fair Lending Practice Code" };
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xpath = "//a[text()='%s']";

		for (int i = 0; i < argsOfString.length; i++) {
			String xpathName = driver.findElement(By.xpath(String.format(xpath, argsOfString[i]))).getText();
			System.out.println(xpathName);
		}
	}

	public void substring() {
		String substring = "#CTS00SSMB";
		System.out.println("This is " + substring.substring(1));
	}

	public void channelCountProgram() {
		System.out.println("samantha is great bu");
		int channelCountActual = 507;
		System.out.println("Actual Channel Count " + channelCountActual);
		int channelCountExpected = 169;
		Scanner sc = new Scanner(System.in);
		// String str = sc.next();
		String caseId = sc.next();
		if (caseId.equalsIgnoreCase("test")) {
			int count = channelCountActual / 169;
			channelCountExpected = channelCountExpected * count;
			System.out.println("Expected is " + channelCountExpected);
		}
		sc.close();
	}

	public static String fakeApi(int data) {
		String dataFake = null;
		try {
			switch (data) {
			case 1:

				dataFake = fake.address().city().toString();

			case 2:
				dataFake = String.valueOf(fake.phoneNumber());
			case 3:
				dataFake = String.valueOf(fake.address());
			case 4:

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return dataFake;
	}
	public static void array(){
		int even=10;
		int odd=20;
		int even1=10;
		int odd1=20;
		int [] list={10,20,30,40,50};
		char[] ch={'a','b'};
		for(int i=0;i<list.length;i++){
			
			if(i%2==0 ){
			even=even+list[i];	
			}
			else{
				odd=odd-list[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);
		for(int i=0;i<list.length;i++){
			if(i%2==0){
			even1=even-list[i];	
			}
			else{
				odd1=odd1+list[i];
			}
		}
		
		System.out.println(even1);
		System.out.println(odd1);
	}

	public static String getDateDifferrence(LocalDate startDate,LocalDate endDate,String startTime,String endTime){
		String dateDiff=null;
		try {
			String timedifferrence=Samantha.getTimeDifferrence(startTime,endTime);
			Period perio=Period.between(startDate, endDate);
			System.out.printf("Differrence in date is %d year, %d months, %d days and time differrence is "+timedifferrence ,perio.getYears(),perio.getMonths(),perio.getDays());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dateDiff;
	}
	
	public static String getTimeDifferrence(String startTime,String endTime){
		String timeDifferrence=null;
		try {
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
			Date d1=simpleDateFormat.parse(startTime);
			Date d2=simpleDateFormat.parse(endTime);
			long differrenceInTime=d2.getTime()-d1.getTime();
			long differrenceInSeconds=differrenceInTime/1000;
			long differrenceInMinutes=differrenceInSeconds/60;
			long differrenceInHours=differrenceInMinutes/60;
			timeDifferrence=differrenceInHours+" Hour :"+differrenceInMinutes+" Minutes :"+differrenceInSeconds+" Seconds";
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return timeDifferrence;
	}
	
	
}//class ends
