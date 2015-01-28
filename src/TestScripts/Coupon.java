package TestScripts;

import java.util.concurrent.TimeUnit;

import Library.CommonFunctions;
import Library.Initialization;
import Library.OptimumAppFunctions;
import Library.ReportingFunctions;
import Library.RunManager;

public class Coupon extends Initialization {
	RunManager cfn=new RunManager();
	ReportingFunctions repfn=new ReportingFunctions();
	
	CommonFunctions cnf=new CommonFunctions();
	OptimumAppFunctions app=new OptimumAppFunctions();
	public static boolean blnFlag=false;
	
	/* Name: Yoganandhini
	 * Prerequisite  : user should present in My account page
	 * Functionality : click on Claim your Gift or Coupon Link  in My Account overview page and Navigate to Coupon page
	 * Function FNCoupon_Navigatecouponpage starts
	 */
	
	public void FNCoupon_Navigatecouponpage() 
	{		
		m1.put("OVERALLSTATUS", "PASS");
		try{
			String Browser=m1.get("BROWSER").toString();
			repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
			for (int iCount=0; iCount<4;iCount++)
			{ 
				switch(iCount)
					{
					case 0:blnFlag=app.FnLaunchOptimumApp();
					System.out.println(blnFlag);
					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
					break;


					case 1:
						blnFlag=app.FnMyAccountHover();
						System.out.println("in case 1");
						break;
						
					case 2: 
						System.out.println("in case 2");
						blnFlag=app.FnOverviewClick();
						break;
					case 3:
						System.out.println("in case 3");
						blnFlag=app.FnClaim_gift_Click();
						break;

					}
				 if(!blnFlag)
	             {
	                    repfn.FnCom_AbortExec();
	                    break;
	             }  
			}
			repfn.FnUpdateEndTest();
		}
			catch(Exception e)
	          {
	                repfn.FnCom_ThrowException(e);
	          }
	}

//FNCoupon_Navigatecouponpage() End
	

/* Name: Yoganandhini
 * Prerequisite : user should present in Coupon page
 * Functionality : click on of Redeem button without entering text error message should displayed
 * Function :FNCoupon_Error_RedeemClick() starts
 */

	public void FNCoupon_Error_RedeemClick() 
	{		
		m1.put("OVERALLSTATUS", "PASS");
		try{
			
			String Browser=m1.get("BROWSER").toString();
			repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
			for (int iCount=0; iCount<5;iCount++)
			{
				switch(iCount)
					{
					case 0:blnFlag=app.FnLaunchOptimumApp();
					System.out.println(blnFlag);
					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
					break;
					case 1:
						blnFlag=app.FnMyAccountHover();
						System.out.println("Hover On My account");
						break;
						
					case 2: 
						blnFlag=app.FnOverviewClick();
						System.out.println("Navigated Overview page");
						break;
					case 3:
						blnFlag=app.FnClaim_gift_Click();
						System.out.println("Click on Claim your Coupon or Gift link and Navigate to coupon page ");
						break;
					case 4:
						blnFlag=app.FnCoupon_Redeemclick_Error();
						System.out.println("Check if error message is displayed when click of redeem button without Coupon code");
						break;
					}
				if(!blnFlag)
	             {
	                    repfn.FnCom_AbortExec();
	                    break;
	             }  
			}
			repfn.FnUpdateEndTest();
		}
			catch(Exception e)
	          {
	                repfn.FnCom_ThrowException(e);
	          }
	}
//FNCoupon_Error_RedeemClick()  End
	
/* Name: Yoganandhini
 * Prerequisite : user should present in Coupon page
 * Functionality : click on of View Status Link without entering text error message should displayed
 * Function :FNCoupon_Error_ViewStatusClick() starts
 */

	
	public void FNCoupon_Error_ViewStatusClick() 
	{		
		m1.put("OVERALLSTATUS", "PASS");
		try{
			
			String Browser=m1.get("BROWSER").toString();
			repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
			for (int iCount=0; iCount<5;iCount++)
			{ 
				switch(iCount)
					{
					case 0:blnFlag=app.FnLaunchOptimumApp();
					System.out.println(blnFlag);
					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
					break;


					case 1:
						blnFlag=app.FnMyAccountHover();
						System.out.println("Hover On My account");
						break;
						
					case 2: 
						blnFlag=app.FnOverviewClick();
						System.out.println("Navigated Overview page");
						break;
					case 3:
						blnFlag=app.FnClaim_gift_Click();
						System.out.println("Click on Claim your Coupon or Gift link and Navigate to coupon page ");
						break;
					case 4:
						blnFlag=app.FnCoupon_Redeemclick_Error();
						System.out.println("Check if error message is displayed when click of View Status Link without Coupon code");
						break;
					}
				if(!blnFlag)
	             {
	                    repfn.FnCom_AbortExec();
	                    break;
	             }  
			}
			repfn.FnUpdateEndTest();
		}
			catch(Exception e)
	          {
	                repfn.FnCom_ThrowException(e);
	          }
	}
//FNCoupon_Error_ViewStatusClick() End
	

/* Name: Yoganandhini
 * Prerequisite : user should present in My account page
 * Functionality :Checking the Presence of View Status and View History Link in Coupon Page 
 * Function FNCoupon_ViewStatus_History_link_Present() starts
 */
	public void FNCoupon_ViewStatus_History_link_Present() 
	{		
		m1.put("OVERALLSTATUS", "PASS");
		try{
			
			String Browser=m1.get("BROWSER").toString();
			repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
			for (int iCount=0; iCount<5;iCount++)
			{ 
				switch(iCount)
					{
					case 0:blnFlag=app.FnLaunchOptimumApp();
					System.out.println(blnFlag);
					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
					break;


					case 1:
						blnFlag=app.FnMyAccountHover();
						System.out.println("Hover On My account");
						break;
						
					case 2: 
						blnFlag=app.FnOverviewClick();
						System.out.println("Navigated Overview page");
						break;
					case 3:
						blnFlag=app.FnClaim_gift_Click();
						System.out.println("Click on Claim your Coupon or Gift link and Navigate to coupon page ");
						break;
					case 4:
						blnFlag=app.FnViewStatus_Present();
						System.out.println("Check if View Status/view history Link is Present");
						break;
					}
				if(!blnFlag)
	             {
	                    repfn.FnCom_AbortExec();
	                    break;
	             }  
			}
			repfn.FnUpdateEndTest();
		}
			catch(Exception e)
	          {
	                repfn.FnCom_ThrowException(e);
	          }
	}
//FNCoupon_ViewStatus_History_link_Present() End
	
/* Name: Yoganandhini
 * Prerequisite : user should present in Coupon Page
 * Functionality :Checking the Presence of Redeem a coupon/Rebate and Print Link in Coupon/Rebate Redemption Details page
 * Function FNCoupon_ViewHistory_Print_Present() starts
 */
	
	public void FNCoupon_ViewHistory_Print_Present() 
	{		
		m1.put("OVERALLSTATUS", "PASS");
		try{
			
			String Browser=m1.get("BROWSER").toString();
			repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
			for (int iCount=0; iCount<4;iCount++)
			{ 
				switch(iCount)
					{
					case 0:blnFlag=app.FnLaunchOptimumApp();
					System.out.println(blnFlag);
					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
					break;


					case 1:
						blnFlag=app.FnMyAccountHover();
						System.out.println("Hover On My account");
						break;
						
					case 2: 
						blnFlag=app.FnOverviewClick();
						System.out.println("Navigated Overview page");
						break;
					case 3:
						blnFlag=app.FnCoupon_ViewHistory();
						System.out.println("Check if Redeem a coupon/Rebate and Print Link is Present");
						break;
					}
				if(!blnFlag)
	             {
	                    repfn.FnCom_AbortExec();
	                    break;
	             }  
			}
			repfn.FnUpdateEndTest();
		}
			catch(Exception e)
	          {
	                repfn.FnCom_ThrowException(e);
	          }
	}
	
//FNCoupon_ViewHistory_Print_Present() End
	
}
