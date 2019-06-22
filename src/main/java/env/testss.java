package env;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class testss {

	 public DesktopOptions options = new DesktopOptions();
		private static WiniumDriverService service;
	    private static WiniumDriver driver;
	    

	   @Before
		public void setupEnvironment(){
		DesktopOptions options = new DesktopOptions(); //Instantiate Winium Desktop Options
	    options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
	    File driverPath = new File("Webdrivers/Winium.Desktop.Driver.exe");
	    System.setProperty("webdriver.winium.desktop.driver","Webdrivers/Winium.Desktop.Driver.exe");
	    service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true)
	            .withSilent(false).buildDesktopService();
	    try {
	    	//driver= new WiniumDriver(new URL("http://localhost:9999"),options);
	        service.start();
	    } catch (IOException e) {
	        System.out.println("Exception while starting WINIUM service");
	        e.printStackTrace();
	    }
	}



	@After
	public void stopDriver(){
	    driver.close();
	}


@Test
public void CalcAddition() throws InterruptedException, IOException {
  //  WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
  //downnload inspect.exe 
   //

     Thread.sleep(50000);

    driver.findElementById("num8Button").click();
    driver.findElementById("plusButton").click();
    driver.findElementById("num8Button").click();
    driver.findElementById("equalButton").click();
    //SECONDS.sleep(5);
    String output = driver.findElementById("CalculatorResults").getAttribute("Name");
    System.out.println("Result is: " + output);
    //Assert.assertEquals(output, "×”×ª×¦×•×’×” ×”×™×� 16");
    
   //driver.findElementByName("Close").click();
}
}

	    
	    

/*
	@AfterTest
	public void tearDown(){
	    service.stop();
	}*/
	
	

	
	
	
	
	/*
	
	

   // @Before
     public WiniumDriver SetUp() throws IOException  {
    	

        //String outlookApplicationPath = "C:\\SoapUI-5.4.0.exe";
        String winiumDriverPath = "webdrivers/Winium.Desktop.Driver.exe";
        
        
        String calculatorApplicationPath =" C:\\Windows\\system32\\calc.exe";
        //String soapUIApplicationPath =" C:\\Program Files (x86)\\SmartBear\\SoapUI-5.4.0\\bin\\SoapUI-5.4.0.exe";
        
       // options = new DesktopOptions( soapUIApplicationPath = "C:\\Windows\\System32\\runas.exe", Arguments = "\\user:<computer name>\\administrator C:WINDOWS\\system32\\calc.exe" ); //Initiate Winium Desktop Options
        options.setApplicationPath(calculatorApplicationPath); //Set outlook application path
     
        File drivePath = new File(winiumDriverPath); //Set winium driver path
     
        service = new WiniumDriverService.Builder().usingDriverExecutable(drivePath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
        service.start(); //Build and Start a Winium Driver service
        driver = new WiniumDriver(service, options); //Start a winium driver
     
        return driver;
   }

   @Test
    public void CalcAddition() throws InterruptedException, IOException {
      //  WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
      //downnload inspect.exe 
	   //
	
	   
   
        driver.findElementById("num8Button").click();
        driver.findElementById("plusButton").click();
        driver.findElementById("num8Button").click();
        driver.findElementById("equalButton").click();
        //SECONDS.sleep(5);
        String output = driver.findElementById("CalculatorResults").getAttribute("Name");
        System.out.println("Result is: " + output);
        //Assert.assertEquals(output, "×”×ª×¦×•×’×” ×”×™×� 16");
        
	   //driver.findElementByName("Close").click();
  }
   
}*/