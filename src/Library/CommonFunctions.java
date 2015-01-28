package Library;

import org.openqa.selenium.WebDriver.TargetLocator;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions extends Initialization {



	/**
	* Method Name : DeleteCookies
	* Method Description : This method is used clear the cookies of the browser
	* @param None
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/

	public boolean DeleteCookies()
	{
		boolean blnFlag = false;
		try
		{
			driver.manage().deleteAllCookies();
			blnFlag = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			blnFlag = false;
		}
		return blnFlag;
	}
	

	// =========================== Web Element ======================================
	/**
	* Method Name : isElementExist_Driver
	* Method Description : This method is used verify whether an element is exist or not which directly comes under webdriver
	* @param strControl - property of an object
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/

	public boolean isElementExist(By selector)
	{
	        try {
	                driver.findElement(selector);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	}

	public boolean isElementExist(WebElement e)
	{
	        try {
	            e.isDisplayed();
	            return true;
	        } catch (NoSuchElementException e1) {
	            return false;
	        }
	}

	
	/**
	* Method Name : isElementExist
	* Method Description : This method is used verify whether an element is exist or not
	* @param WebElement - ele -- under which the object exists;strControl - property of an object
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/

	public boolean isElementExist(WebElement ele, By selector)
	{
	        try {
	                ele.findElement(selector);	                
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	}

	
	/**
	* Method Name : ElementClick
	* Method Description : This method is created to click on the particular element which can be directly accessed by driver element
	* @param strControl - property of an object
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	public boolean ElementClick(String strControl) {		
	
		boolean blnFlag;
		try{						
			if(isElementExist(By.xpath(strControl)))
			{
				driver.findElement(By.xpath(strControl)).click();
			}else if(isElementExist(By.id(strControl)))
			{
				driver.findElement(By.id(strControl)).click();
			}
			else if(isElementExist(By.linkText(strControl)))
			{
				driver.findElement(By.linkText(strControl)).click();
			}
			else if(isElementExist(By.name(strControl)))
			{
				driver.findElement(By.name(strControl)).click();
			}
			
			else if(isElementExist(By.cssSelector(strControl)))
			{
				driver.findElement(By.cssSelector(strControl)).click();
			}			
		//	driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
			blnFlag=true;
		}
		catch(Exception e){
			
			blnFlag=false;
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
		}
		return blnFlag;
	}
	
	
	/**
	* Method Name : ElementClick
	* Method Description : This method is created to click on the particular element which can be directly accessed by an web element
	* @param strControl - property of an object
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	public boolean ElementClick(WebElement ele, String strControl) {		
	
		boolean blnFlag;
		try{						
			if(isElementExist(ele,By.xpath(strControl)))
			{
				ele.findElement(By.xpath(strControl)).click();
			}else if(isElementExist(ele,By.id(strControl)))
			{
				ele.findElement(By.id(strControl)).click();
			}
			else if(isElementExist(ele,By.linkText(strControl)))
			{
				ele.findElement(By.linkText(strControl)).click();
			}
			else if(isElementExist(ele,By.name(strControl)))
			{
				ele.findElement(By.name(strControl)).click();
			}
			else if(isElementExist(ele,By.cssSelector(strControl)))
			{
				ele.findElement(By.cssSelector(strControl)).click();
			}			
			//driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
			blnFlag=true;
		}
		catch(Exception e){
			
			blnFlag=false;
		}
		return blnFlag;
	}
	



	
	/**
	* Method Name : ElementClick
	* Method Description : This method is created to click on the particular element which can be directly accessed by an web element
	* @param strControl - property of an object
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	public boolean ElementClick(WebElement ele) {		
	
		boolean blnFlag;
		try{						
			if(isElementExist(ele))
			{
				ele.click();
			}
				
			//driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
			blnFlag=true;
		}
		catch(Exception e){
			
			blnFlag=false;
		}
		return blnFlag;
	}
	


	/**
	* Function Name : FnSetWebEdit
	* Function Description : This Function selects the specified window (and frame, if specified) and enters text in web TextBox.
	* @param: strControl - object property, strValue - value to enter text box 
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	//WEBDRIVER
public boolean FnSetWebEdit(String strControl,String strValue){
		//SelectWindow(strWindowConstruct);
		boolean blnFlag;
		try{
				if(isElementExist(By.id(strControl)))
				{
					driver.findElement(By.id(strControl)).sendKeys(strValue);
				}
				else if(isElementExist(By.name(strControl)))
				{
					System.out.println("String "+ strControl);
					driver.findElement(By.name(strControl)).sendKeys(strValue);
				}
				else if(isElementExist(By.xpath(strControl)))
				{
					driver.findElement(By.xpath(strControl)).sendKeys(strValue);
				}
				String strMessage= "Typed "+"'"+strValue+"' in the textbox" ;
			//	driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
				blnFlag=true;

		}
		catch(Exception e){
			String strMessage="Failed to Type value in text box - "+e.getMessage();	
			blnFlag=false;
		}
		return blnFlag;
}


	/**
	* Method Name : onMouseOver
	* Method Description : This method is used to mouseover on a particular web element
	* @param WebElement element 
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	public boolean onMouseOver(WebElement element)
	{
		boolean blnFlag = false;
		try
		{
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(mouseOverScript, element);
			blnFlag = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			blnFlag = false;
		}
		return blnFlag;
	}
	
	

	/**
	* Method Name : onMouseClickJS
	* Method Description : This method is used to click on particular mouse right or left using JS
	* @param WebElement element  and click type - Left or Right
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	public boolean onMouseClickJS(WebElement element, String clickType)
	{
		boolean blnFlag = false;
		try
		{
			if (clickType.equalsIgnoreCase("Left"))
			{
				if (System.getProperty("browser").contains("firefox"))
				{
					// element.click();
					String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initMouseEvent('click', true, true, window,1,1,1,1,1,false,false,false,false,0,arguments[0]); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { var ev = document.createEventObject();ev.button = 1; arguments[0].fireEvent('onclick',ev);}";
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript(mouseOverScript, element);
				}
				else if (System.getProperty("browser").contains("safari"))
				{
					String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initMouseEvent('click', true, true, window,1,1,1,1,1,false,false,false,false,0,arguments[0]); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { var ev = document.createEventObject();ev.button = 1; arguments[0].fireEvent('onclick',ev);}";
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript(mouseOverScript, element);
				}
				else
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
				blnFlag = true;
				
			}
			else
			{
				onMouseRightClick(element);
				//this.smallWait();
				Thread.sleep(1000);
				blnFlag = true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			blnFlag = false;
		}
		return blnFlag;
	}


	/**
	* Method Name : onMouseRightClick
	* Method Description : This method is used to right click on particular mouse
	* @param strControl - property of an object
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	public boolean onMouseRightClick(WebElement element)
	{
		boolean blnFlag = false;
		try
		{
			if (System.getProperty("browser").contains("safari"))
			{
				String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initMouseEvent('click', true, false, window,0,0,0,0,0,false,false,false,false,2,null); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { var ev = document.createEventObject();ev.button = 2; arguments[0].fireEvent('onclick',ev);}";
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript(mouseOverScript, element);
			}
			else
			{
				org.openqa.selenium.interactions.Actions builderq = new org.openqa.selenium.interactions.Actions(driver);
				org.openqa.selenium.interactions.Action rClick = builderq.contextClick(element).build();
				rClick.perform();
			}
			blnFlag = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			blnFlag = false;
		}
		return blnFlag;
	}
	
		/**
	* Method Name : SendKeyboardInput
	* Method Description : This method is used to send keyboard input
	* @param String st -- input to be sent
	* @return Boolean
	* @author Dhivya Durairaj
	* @throws Exception
	*/
	public boolean SendKeyboardInput(String st)
	{
		boolean blnFlag = false;
		// int ii=0;
		try
		{
			Robot bot = new Robot();
			Thread.sleep(3000);
			int k = 0;
			char[] arr = st.toCharArray();
			for (int i = 0; i < arr.length; i++)
			{
				Thread.sleep(500);
				k = arr[i];
				if (arr[i] < 97)
					bot.keyPress(KeyEvent.VK_SHIFT);
				else
					k -= 32;
				bot.keyPress(k);
				Thread.sleep(500);
				bot.keyRelease(k);
				if (arr[i] < 97)
					bot.keyRelease(KeyEvent.VK_SHIFT);
				blnFlag = true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return blnFlag;
	}


	/**
	 * Method Name : isTextPresent
	 * Method Description: Method to verify whether a given text is present within the page
	 * @param driver The {@link WebDriver} object
	 * @param textToVerify The text to be verified within the page
	 * @return A boolean value indicating if the searched text is found
	 * @author Dhivya Durairaj
	 */
	public boolean isTextPresent(WebDriver driver, String textToVerify)
	{
		textToVerify = textToVerify.replace(" ", "\\s*");
		String pageSource = driver.getPageSource();
		String[] pageSourceLines = pageSource.trim().split("\\n");
		String pageSourceWithoutNewlines = "";
		for (String pageSourceLine : pageSourceLines)
		{
			pageSourceWithoutNewlines += pageSourceLine + " ";
		}
		
		pageSourceWithoutNewlines = pageSourceWithoutNewlines.trim();
		
		Pattern p = Pattern.compile(textToVerify);
		Matcher m = p.matcher(pageSourceWithoutNewlines);
		if(m.find())
			return true;
		else
			return false;
	}

	

	/**
	 * Method Name : scrollDown
	 * Method Description: Method to scroll down to the page end
	 * @param none	 * 
	 * @return none
	 * @author Dhivya Durairaj
	 */
	
	public void scrollDown()
	{
		// ((JavascriptExecutor) driver).executeScript("scroll(0,200);");
		((JavascriptExecutor) driver).executeScript("window.(0, document.body.scrollHeight);");
	}

	/**
	 * Method Name : scrollDown
	 * Method Description: Method to scroll down to the page end
	 * @param :height - to which the scroll has to be performed
	 * @return none
	 * @author Dhivya Durairaj
	 */
	public void scrollDown(int height)
	{
		String str = Integer.toString(height);
		((JavascriptExecutor) driver).executeScript("window.(0," + str + ");");
	}

	

	/**
	 * Method Name : scrollUp
	 * Method Description: Method to scroll up to the page start
	 * @param :none
	 * @return none
	 * @author Dhivya Durairaj
	 */
	public void scrollUp()
	{
		// ((JavascriptExecutor) driver).executeScript("scroll(0,200);");
		((JavascriptExecutor) driver).executeScript("window.(0, -document.body.scrollHeight);");
	}

	
	/**
	 * Method Name : scrollUp
	 * Method Description: Method to scroll up to the page start
	 * @param :height - to which the scroll has to be performed
	 * @return none
	 * @author Dhivya Durairaj
	 */
	public void scrollUp(int height)
	{
		if (height > 0)
		{
			String str = Integer.toString(height);
			((JavascriptExecutor) driver).executeScript("scroll(0,-" + str + ");");
		}
		else
		{
			String str = Integer.toString(height * -1);
			((JavascriptExecutor) driver).executeScript(("window.scrollTo(0," + str + ");"));
		}
	}

	

	/**
	 * Method Name : ScrollToView
	 * Method Description: Method to scroll to view the particular webelement
	 * @param :element - to focus
	 * @return none
	 * @author Dhivya Durairaj
	 */
	
	public boolean ScrollToView(WebElement element)
	{
		boolean blnFlag = false;
		try
		{
			//Thread.sleep(2000);
			int y = element.getLocation().y;
			int y1 = 380;
			// driver.manage().window().getSize().getHeight();
						
			this.scrollUp(y1 / 2 - y);
			//Thread.sleep(2000);
			blnFlag = true;
			System.out.println("Scroll to view is done");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			blnFlag = false;
		}
		return blnFlag;
	}

	
	/**
	 * Function is used to verify the element Font is Bold: 
	 * 
	 * @param element
	 * @return
	 */
	

	/**
	 * Method Name : VerifyFontBold
	 * Method Description: Method to verify whether the font of webelement is bold
	 * @param :element - to verify font
	 * @return none
	 * @author Dhivya Durairaj
	 */
	
	public boolean VerifyFontBold(WebElement element)
	{
		boolean result = false;
		try
		{
			result = (element.getCssValue("font-weight").equalsIgnoreCase("bold") || Integer.parseInt(element.getCssValue("font-weight")) > 400);
		}
		catch (Exception e)
		{
			result = false;
		}
		return result;
	}
	
	/**
	 * Method Name : FnHighligt_IE
	 * Method Description: Method to highlight an element in IE
	 * @param :element - to highlight
	 * @return none
	 * @author Dhivya Durairaj
	 */
	public void FnHighligt_IE(WebElement element)
	{
		try
		{
			for (int i = 0; i < 1; i++)
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 3px solid black;");
				Thread.sleep(300);
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
			}		
		}
		catch (Exception e)
		{
			e.printStackTrace();	
		}
	}
	
	/**
	 * Method Name : FnExplicitWait
	 * Method Description: Method to wait explicitly till the element is located
	 * @param :element - to wait
	 * @return none
	 * @author Dhivya Durairaj
	 */
	public boolean FnExplicitWait(String strByType,String strConst)
	{
		
		boolean blnFlag=false;
		try{
			System.out.println("inside exp wait");
			WebDriverWait wait = new WebDriverWait(driver,60,1000);
			if(strByType.equalsIgnoreCase("ID"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
			
			}else if(strByType.equalsIgnoreCase("XPATH"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
				
			}else if(strByType.equalsIgnoreCase("CLASSNAME"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
				
			}else if(strByType.equalsIgnoreCase("PARTIALTEXT"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
				
			}
			
		}catch(Exception e)
		{
			blnFlag=false;
		}
		return blnFlag;
	}
	
	/**
	 * Method Name : FnExplicitWait
	 * Method Description: Method to wait explicitly till the element is located
	 * @param :element - to wait
	 * @return none
	 * @author Dhivya Durairaj
	 */
	public boolean FnExplicitlessWait(String strByType,String strConst)
	{
		
		boolean blnFlag=false;
		try{
			System.out.println("inside exp wait");
			WebDriverWait wait = new WebDriverWait(driver,60,1000);
			if(strByType.equalsIgnoreCase("ID"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
			
			}else if(strByType.equalsIgnoreCase("XPATH"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
				
			}else if(strByType.equalsIgnoreCase("CLASSNAME"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
				
			}else if(strByType.equalsIgnoreCase("PARTIALTEXT"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
			}else if(strByType.equalsIgnoreCase("cssSelector"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(strConst)));
				System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
				
			}
			
		}catch(Exception e)
		{
			blnFlag=false;
		}
		return blnFlag;
	}
	
	public boolean JSClick(WebElement e)
	{		
		boolean blnFlag=false;
			
			try{
				
				if(e.isDisplayed())
				{
					if(m1.get("BROWSER").toString().equalsIgnoreCase("chrome"))					{
						ElementClick(e);						
					}else{
						blnFlag=true;
						System.out.println("inside JS click");
				    	JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", e);	
					}
				}
		    }catch(Exception e1)
		    {
		    	blnFlag=true;
		    	if(e.isDisplayed()||e.isSelected())
				{
		    		blnFlag=true;
				
		    		System.out.println("inside action click");
					 Actions builder = new Actions(driver);  
					  Actions actions1=(Actions) builder.build();			  
			          actions1.click(e);
				}	   
		    	
		}
		
		
		return blnFlag;
		
          
	}
	
	
	public boolean FnExplicitWaitFeedback(String strByType,String strConst)
	{
		
		boolean blnFlag=false;
		try{
		//	System.out.println("inside exp wait");
			WebDriverWait wait = new WebDriverWait(driver,5,1000);
			if(strByType.equalsIgnoreCase("XPATH"))
			{
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strConst)));
				//System.out.println(strConst +" element display -" + element.isDisplayed());
				if(element.isDisplayed())			
					blnFlag=true;
			}
			
		}catch(Exception e)
		{
			blnFlag=false;
		}
		return blnFlag;
	}
}
