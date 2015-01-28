package TestScripts;

import java.util.concurrent.TimeUnit;

import Library.CommonFunctions;
import Library.Initialization;
import Library.OptimumAppFunctions;
import Library.ReportingFunctions;
import Library.RunManager;

public class BillPay extends Initialization{
	RunManager cfn=new RunManager();
	ReportingFunctions repfn=new ReportingFunctions();
	OptimumAppFunctions app=new OptimumAppFunctions();
	CommonFunctions cnf=new CommonFunctions();
	public static boolean blnFlag=false;
	
	
	public void FNBillPay_TS4_Info()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				case 1:blnFlag=app.FnMyAccountHover();
				break;
				case 2:blnFlag=app.FnInfo();
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
	

	
	public void FNBillPay_TS9_BillPay()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				case 1:
					blnFlag=app.FnMyAccountHover();
					break;
					
				case 2:
					blnFlag=app.Fnbill();
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
	
	
	public void FNBillPay_TS114_AutoPayCheck()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<6;iCount++)
			{
				switch(iCount)
				{
					
					case 0:blnFlag=app.FnLaunchOptimumApp();					
					
					break;
					
					case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					break;
					
					case 2:blnFlag=app.FnMyAccountHover();
					break;
					
					case 3:
						app.FnPaymentOptions();
						 driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
						break;
						
					case 4:
						blnFlag=app.FnautopayCreditclick();
						break;
						
					case 5:
						blnFlag=app.FnautoPayCheck();
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
	
	public void FNBillPay_TS133_BillDelivery()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<4;iCount++)
			{
				switch(iCount)
				{
					
					case 0:blnFlag=app.FnLaunchOptimumApp();					
					
					break;
					
					case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					break;
					
					case 2:
						blnFlag=app.FnMyAccountHover();
						break;
						
					case 3:
						blnFlag=app.FnbillDelivery();
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
	
	public void FNBillPay_TS136_NextStatementDetails()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<4;iCount++)
			{
				switch(iCount)
				{
					
					case 0:blnFlag=app.FnLaunchOptimumApp();					
					
					break;
					
					case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					break;
					
					
					case 2:blnFlag=app.FnMyAccountHover();
					break;
					
					case 3:
						app.FnNextStateDetails();
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
	public void FNBillPay_TS143_OneTimeDebit()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<5;iCount++)
			{
				switch(iCount)
				{
					
					case 0:blnFlag=app.FnLaunchOptimumApp();					
					
					break;
					
					case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					break;
					
					case 2:
						
					blnFlag=app.FnMyAccountHover();
					break;
					
					case 3:
						app.FnPaymentOptions();
						break;
						
					case 4:
						app.FnoneTimeDebit();
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
	
	public void FNBillPay_TS144_OneTimeChecking()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<5;iCount++)
			{
				switch(iCount)
				{
					
					case 0:blnFlag=app.FnLaunchOptimumApp();					
					
					break;
					
					case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					break;
					
					case 2:
						
						blnFlag=app.FnMyAccountHover();
						break;
					case 3:
						blnFlag=app.FnPaymentOptions();
						break;
						
					case 4:
						blnFlag=app.FnOneTimeChecking();
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
	
	public void FNBillPay_TS145_PayNow()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<5;iCount++)
			{
				switch(iCount)
				{
					
					case 0:blnFlag=app.FnLaunchOptimumApp();					
					
					break;
					
					case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					break;
					
					case 2: blnFlag=app.FnMyAccountHover();
					break;
					
					case 3:
						app.FnPaymentOptions();
						break;
						
					case 4:
						app.FnPayNowCheck();
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
	
	public void FNBillPay_TS148_VisaCardInfo()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<5;iCount++)
			{
				switch(iCount)
				{
					
					case 0:blnFlag=app.FnLaunchOptimumApp();					
					
					break;
					
					case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					break;
					
					case 2:
						
						blnFlag=app.FnMyAccountHover();
						break;
						
					case 3:
						blnFlag=app.FnPaymentOptions();
						 driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
						break;
						
					case 4:
						blnFlag=app.FnVisaCardInfo();
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
	
	public void FNBillPay_TS152_CardNoValidate(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
		String Browser=m1.get("BROWSER").toString();
		repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
		
			
			for (int iCount=0; iCount<6;iCount++)
			{
				switch(iCount)
				{
					
					case 0:
						blnFlag=app.FnLaunchOptimumApp();					
					
						break;
					
					case 1:
						blnFlag=app.FnVerifyTopPanelNavigation();
						break;
					
					case 2:
						
						blnFlag=app.FnMyAccountHover();
						break;
						
					case 3:
						blnFlag=app.FnPaymentOptions();
						break;
						
					case 4:
						blnFlag=app.FnoneTimeDebit();
						break;
						
					case 5:
						blnFlag=app.FnCardNoValidate();
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
	
	
	public void FNBillPay_TS29_Pay(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				
				case 1:
					
					blnFlag=app.FnMyAccountHover();
					break;
					
				case 2:
					blnFlag=app.FnBillingTransaction();
					break;
					
					
				case 3:
					blnFlag=app.Fnpay();
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
	
	
	public void FNBillPay_TS100_AutoPay(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				case 1:blnFlag=app.FnMyAccountHover();
				break;
				
				case 2:blnFlag=app.FnAutoPay();
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
	
	
	public void FNBillPay_TS101_Autodeb(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				case 1:blnFlag=app.FnMyAccountHover();
				break;
				
				case 2:blnFlag=app.FnAutodeb();
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
	
	public void FNBillPay_TS102_Enrol(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				case 1:blnFlag=app.FnMyAccountHover();
				break;
				
				case 2:blnFlag=app.Fnenrol();
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
	
	public void FNBillPay_TS38_Ask(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				case 1:blnFlag=app.FnMyAccountHover();
				break;
				
				case 2:blnFlag=app.Fnask();
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
	
	public void FNBillPay_TS142_onetime(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				case 1:blnFlag=app.FnMyAccountHover();
				break;
				
				case 2:blnFlag=app.Fnonetime();
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
	
	
	public void FNBillPay_TS210_Upcoming(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				
				case 1:blnFlag=app.FnMyAccountHover();
				break;
				
				case 2:blnFlag=app.Fnupcoming();
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
	
	
	public void FNBillPay_TS72_RecentTransactions(){
		m1.put("OVERALLSTATUS", "PASS");
		try
		{
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
				//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
				//break;
				 case 1:
                	 blnFlag=app.FnMyAccountHover();
                 	break;
				case 2:blnFlag=app.Fnrec();
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
	
	public void FNBillPay_TS155_ValidateExpiryDate() throws Exception
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
                     break;
                     
                     case 1:
                    	 blnFlag=app.FnMyAccountHover();
                     	break;
                     
                     case 2:
                    	 
                    	 blnFlag=app.FnPaymentOptions();
                    	 break;
                     
                     case 3:blnFlag=app.FnOneTimeStep1();
                     break;
                     
                     case 4:blnFlag=app.FnOneTimeStep3Navigation();
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
	public void FNBillPay_TS163_OneTimeStep3Navigation() throws Exception
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
                     break;
                     
                     case 1:
                    	 blnFlag=app.FnMyAccountHover();
                    	 break;
                     case 2:
                    	 blnFlag=app.FnPaymentOptions();
                    	 break;
                     case 3:blnFlag=app.FnOneTimeStep1();
                     break;
                     case 4:blnFlag=app.FnOneTimeStep3Navigation();
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
	public void FNBillPay_TS166_OneTimeStep3VerifyContent() throws Exception
	{
		 m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<6;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:blnFlag=app.FnLaunchOptimumApp();                            
                     break;
                     case 1:
                    	 blnFlag=app.FnMyAccountHover();
                    	 break;
                     case 2:blnFlag=app.FnPaymentOptions();
                     break;
                     case 3:blnFlag=app.FnOneTimeStep1();
                     break;
                     case 4:blnFlag=app.FnOneTimeStep3Navigation();
                     break;
                     case 5:blnFlag=app.FnOneTimeStep3VerifyContent();
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
	public void FNBillPay_TS181_OneTime_BrnNoMandatory() throws Exception
	{
		 m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<6;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:blnFlag=app.FnLaunchOptimumApp();                            
                     break;
                     case 1:
                    	 blnFlag=app.FnMyAccountHover();
                    	 break;
                    	 
                     case 2:
                    	 blnFlag=app.FnPaymentOptions();
                     break;
                     case 3:blnFlag=app.FnOneTimeStep1();
                     break;
                     
                     case 4:System.out.println("in case 3");
                   	  blnFlag=app.FnCheckBRNmandatory();
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
	public void FNBillPay_TS185_OneTime_BankAccNoMandatory() throws Exception
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
                     break;
                     case 1:
                    	 blnFlag=app.FnMyAccountHover();
                    	 break;
                     case 2:
                    	 
                    	 blnFlag=app.FnPaymentOptions();
                     break;
                     case 3:blnFlag=app.FnOneTimeStep1();
                     break;
     
                     case 4:blnFlag=app.FnCheckBankAccNomandatory();
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
	public void FNBillPay_TS220_OneTimeBankAccNoTextBox() throws Exception
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
                     break;
                     case 1:
                    	 blnFlag=app.FnMyAccountHover();
                    	 break;
                    	 
                     case 2:
                    	 blnFlag=app.FnPaymentOptions();
                     break;
                     case 3:blnFlag=app.FnOneTimeStep1();
                     break;
                    
                     case 4:blnFlag=app.FnCheckBankAccTextBox();
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
	public void FNBillPay_TS236_AutoPaySupportWidget() throws Exception
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
                     break;
                     
                     case 1: blnFlag=app.FnMyAccountHover();
                     break;
                     case 2:blnFlag=app.FnPaymentOptions();
                     break;
                     case 3:blnFlag=app.FnCheckAutoPaySupprtWidget();
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
	public void FNBillPay_TS216_UpcomingPmtVerifySubType() throws Exception
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
                     break;
                     
                     case 1:blnFlag=app.FnMyAccountHover();
                     break;
                     
                     case 2:blnFlag=app.FnUpcomingPaymentClick();
                     break;
                     case 3:blnFlag=app.FnVerifySubType();
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
	public void FNBillPay_TS212_UpcomingPmtVerifyLayout() throws Exception
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
                     break;
                     case 1:blnFlag=app.FnMyAccountHover();
                     break;
                     
                     case 2:blnFlag=app.FnUpcomingPaymentClick();
                     break;
                     
                     case 3:blnFlag=app.FnVerifyLayout();
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
	
	
	public void FNBillPay_TS61_PaymentHistory()
	{
		 m1.put("OVERALLSTATUS", "PASS");
	        try{
	        
	              String Browser=m1.get("BROWSER").toString();
	              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	              for (int iCount=0; iCount<3;iCount++)
	              {
	                     switch(iCount)
	                     {
	                     case 0:blnFlag=app.FnLaunchOptimumApp();                            
	                     break;
	                     
	                     case 1:blnFlag=app.FnMyAccountHover();
	                     break;
	                     
	                     case 2:blnFlag=app.Fnpayex();
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
	
	public void FNBillPay_TS62_PaymentDate()
	{
		 m1.put("OVERALLSTATUS", "PASS");
	        try{
	        
	              String Browser=m1.get("BROWSER").toString();
	              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	              for (int iCount=0; iCount<2;iCount++)
	              {
	                     switch(iCount)
	                     {
	                     case 0:blnFlag=app.FnLaunchOptimumApp();                            
	                     break;
					//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					//break;
	                     
	                     case 1:blnFlag=app.FnMyAccountHover();
	                     break;
	                     
	                     case 2:blnFlag=app.Fndate();
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
	
	public void FNBillPay_TS64_PaymentType()
	{
		 m1.put("OVERALLSTATUS", "PASS");
	        try{
	        
	              String Browser=m1.get("BROWSER").toString();
	              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	              for (int iCount=0; iCount<2;iCount++)
	              {
	                     switch(iCount)
	                     {
	                     case 0:blnFlag=app.FnLaunchOptimumApp();                            
	                     break;
					//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					//break;
	                     case 1:blnFlag=app.FnMyAccountHover();
	                     break;
	                     
	                     case 2:blnFlag=app.FnType();
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
	
	public void FNBillPay_TS66_PaymentStatus()
	{
		 m1.put("OVERALLSTATUS", "PASS");
	        try{
	        
	              String Browser=m1.get("BROWSER").toString();
	              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	              for (int iCount=0; iCount<2;iCount++)
	              {
	                     switch(iCount)
	                     {
	                     case 0:blnFlag=app.FnLaunchOptimumApp();                            
	                     break;
					//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					//break;
	                     case 1:blnFlag=app.FnMyAccountHover();
	                     break;
	                     case 2:blnFlag=app.Fnstat();
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
	
	public void FNBillPay_TS67_PaymentAmount()
	{
		 m1.put("OVERALLSTATUS", "PASS");
	        try{
	        
	              String Browser=m1.get("BROWSER").toString();
	              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	              for (int iCount=0; iCount<2;iCount++)
	              {
	                     switch(iCount)
	                     {
	                     case 0:blnFlag=app.FnLaunchOptimumApp();                            
	                     break;
					//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
					//break;
	                     case 1:blnFlag=app.FnMyAccountHover();
	                     break;
	                     case 2:blnFlag=app.Fnamt();
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
	public void FNBillPay_TS103_Enrad()
	{
		 m1.put("OVERALLSTATUS", "PASS");
	        try{
	        
	              String Browser=m1.get("BROWSER").toString();
	              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	              for (int iCount=0; iCount<3;iCount++)
	              {
	                     switch(iCount)
	                     {
	                     case 0:blnFlag=app.FnLaunchOptimumApp();
	 					System.out.println(blnFlag);
	 					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 					break;
	 					//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
	 					//break;
	                     case 1:blnFlag=app.FnMyAccountHover();
	                     break;
	 					case 2:blnFlag=app.Fnenrad();
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
	
	public void FNBillPay_TS37_Upcoming()
	{
		 m1.put("OVERALLSTATUS", "PASS");
	        try{
	        
	              String Browser=m1.get("BROWSER").toString();
	              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	              for (int iCount=0; iCount<3;iCount++)
	              {
	                     switch(iCount)
	                     {
	                     case 0:blnFlag=app.FnLaunchOptimumApp();
	 					System.out.println(blnFlag);
	 					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 					break;
	 					//case 1:blnFlag=app.FnVerifyTopPanelNavigation();
	 					//break;
	                     case 1:blnFlag=app.FnMyAccountHover();
	                     break;
	 					case 2:blnFlag=app.Fnupcomingmanage();
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
	
	
	
	public void FNHome_TS48_Paybill()
	{
	    m1.put("OVERALLSTATUS", "PASS");
	    try
	    {
	    String Browser=m1.get("BROWSER").toString();
	    repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	    
	          
	          for (int iCount=0; iCount<7;iCount++)
	          {
	                switch(iCount)
	                {
	                      
	                case 0:blnFlag=app.FnLaunchOptimumApp();
	                break;
	                
	                case 1:blnFlag=app.FnHomenavigationMenu();
	                break;
	                
	                case 2:blnFlag=app.FnMyAccountHover();
	                break;
	                
	                case 3:blnFlag=app.FnBillingTransaction();
	                break;
	                
	                case 4:blnFlag=app.FnBillingpage();
	                break;
	                
	                case 5:blnFlag=app.FnPayBillclick();
	                break;
	                
	                case 6:blnFlag=app.Fnlogout();
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
	
	
	public void FNHome_TS231_Paybillindicator()
	{
	    m1.put("OVERALLSTATUS", "PASS");
	    try
	    {
	    String Browser=m1.get("BROWSER").toString();
	    repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	    
	          
	          for (int iCount=0; iCount<7;iCount++)
	          {
	                switch(iCount)
	                {
	                      
	                case 0:blnFlag=app.FnLaunchOptimumApp();
	                break;
	                
	                case 1:blnFlag=app.FnHomenavigationMenu();
	                break;
	                
	                case 2:blnFlag=app.FnMyAccountHover();
	                break;
	                
	                case 3:blnFlag=app.FnBillingTransaction();
	                break;
	                
	                case 4:blnFlag=app.FnBillingpage();
	                break;
	                
	                
	                case 5:blnFlag=app.FnBillingpageindicator();
	                break;
	                
	                case 6:blnFlag=app.Fnlogout();
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
	
	public void FNHome_TS104_Paybillvisa()
	{
	    m1.put("OVERALLSTATUS", "PASS");
	    try
	    {
	    String Browser=m1.get("BROWSER").toString();
	    repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	    
	          
	          for (int iCount=0; iCount<11;iCount++)
	          {
	                switch(iCount)
	                {
	                      
	                case 0:blnFlag=app.FnLaunchOptimumApp();
	                break;
	                
	                case 1:blnFlag=app.FnHomenavigationMenu();
	                break;
	                
	                case 2:blnFlag=app.FnMyAccountHover();
	                break;
	                
	                case 3:blnFlag=app.FnBillingTransaction();
	                break;
	                
	                case 4:blnFlag=app.FnBillingpage();
	                break;
	                
	                case 5:blnFlag=app.FnPayBillclick();
	                break;
	                
	                case 6:blnFlag=app.FnPayBillautopay();
	                break;
	                
	                case 7:blnFlag=app.FnPayBilldebitcreditpage();
	                break;
	                
	                case 8:blnFlag=app.FnPayBillvisadetails();
	                break;
	                
	                case 9:blnFlag=app.FnPayBillvisaVerifyPayment();
	                break;
	                
	                case 10:blnFlag=app.Fnlogout();
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
	
	public void FNHome_TS110_PaybillvisaDebit()
	{
	    m1.put("OVERALLSTATUS", "PASS");
	    try
	    {
	    String Browser=m1.get("BROWSER").toString();
	    repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	    
	          
	          for (int iCount=0; iCount<11;iCount++)
	          {
	                switch(iCount)
	                {
	                      
	                case 0:blnFlag=app.FnLaunchOptimumApp();
	                break;
	                
	                case 1:blnFlag=app.FnHomenavigationMenu();
	                break;
	                
	                case 2:blnFlag=app.FnMyAccountHover();
	                break;
	                
	                case 3:blnFlag=app.FnBillingTransaction();
	                break;
	                
	                case 4:blnFlag=app.FnBillingpage();
	                break;
	                
	                case 5:blnFlag=app.FnPayBillclick();
	                break;
	                
	                case 6:blnFlag=app.FnPayBillDebitautopay();
	                break;
	                
	                case 7:blnFlag=app.FnPayBilldebitcreditpage();
	                break;
	                
	                case 8:blnFlag=app.FnPayBillvisadetails();
	                break;
	                
	                case 9:blnFlag=app.FnPayBillvisaVerifyPayment();
	                break;
	                
	                case 10:blnFlag=app.Fnlogout();
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
	
	public void FNHome_TS204_PaybillvisaDatepicker()
	{
	    m1.put("OVERALLSTATUS", "PASS");
	    try
	    {
	    String Browser=m1.get("BROWSER").toString();
	    repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	    
	          
	          for (int iCount=0; iCount<11;iCount++)
	          {
	                switch(iCount)
	                {
	                      
	                case 0:blnFlag=app.FnLaunchOptimumApp();
	                break;
	                
	                case 1:blnFlag=app.FnHomenavigationMenu();
	                break;
	                
	                case 2:blnFlag=app.FnMyAccountHover();
	                break;
	                
	                case 3:blnFlag=app.FnBillingTransaction();
	                break;
	                
	                case 4:blnFlag=app.FnBillingpage();
	                break;
	                
	                case 5:blnFlag=app.FnPayBillclick();
	                break;
	                
	                case 6:blnFlag=app.FnPayBillDebitonetimepay();
	                break;
	                
	                case 7:blnFlag=app.FnPayBilldebitcreditpage();
	                break;
	                
	                case 8:blnFlag=app.FnPayBillvisadetails();
	                break;
	                
	                case 9:blnFlag=app.FnPayBillvisaDatepicker();
	                break;
	                
	                case 10:blnFlag=app.Fnlogout();
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
	//Darshana start
	public void BillPay_FnMakePayment()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<6;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnMakePayment();
		             		break;
	             case 4:
	            	 blnFlag=app.FnPaymentPageVerify();
	            	 break;
	              
	              
	             case 5:
	            	 blnFlag=app.Fnlogout();
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
	public void BillPay_FnUpcomingPaymentLink()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<5;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnUpcomingPaymentLink();
		             		break;
	            
	              
	             case 4:
	            	 blnFlag=app.Fnlogout();
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
	public void BillPay_FnChangeNameLink()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<5;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnChangeNameLink();
		             		break;
	            
	              
	             case 4:
	            	 blnFlag=app.Fnlogout();
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
	public void BillPay_FnTransferMyServiceLink()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<5;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnTrfServiceLink();
		             		break;
	            
	              
	             case 4:
	            	 blnFlag=app.Fnlogout();
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
	public void BillPay_FnStmtSummPayBillBtn()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<6;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnStmtSummPayBillBtn();
		             		break;
	             case 4:
	            	 blnFlag=app.FnPaymentPageVerify();
	            	 break;
	              
	              
	             case 5:
	            	 blnFlag=app.Fnlogout();
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
	public void BillPay_FnBillPanelPayBillBtn()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<6;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnBillPanelPayBillBtn();
		             		break;
	             case 4:
	            	 blnFlag=app.FnPaymentPageVerify();
	            	 break;
	              
	             case 5:
	            	 blnFlag=app.Fnlogout();
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
	//Fn to check the information available in bill panel when there is no transactions exist
	public void BillPay_FnNoTransactionsInfo()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<5;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnNoTransactionInfo();
		             		break;
	            
	              
	             case 4:
	            	 blnFlag=app.Fnlogout();
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
	
	public void BillPay_FnAutoPay()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<9;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnPaymentOptions();
	             		break;
	             case 3:
		          	   blnFlag=app.FnPaymentPageVerify();
		             		break;
	             case 4:
	            	 blnFlag=app.FnAutoPayOptions();
	            	 break;
	             case 5:
	            	 blnFlag=app.FnAutoPayCredit();
	            	 break;
	             case 6:
	            	 blnFlag=app.FnSetUpAutoPay();
	            	 break;
	             case 7:
	            	 blnFlag=app.FnSetUpAutoPayClick();
	            	 break;
	             
	             case 8:
	            	 blnFlag=app.Fnlogout();
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
	/* To verify the PCI  session time out rules applicable for Billing and transactions page
	 * Created by Darshana
	 * Date : 12/19/2014*/
	public void BillPay_BillingSessionTimeOut()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<4;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnBilling();
	             		break;
	             case 3:
		          	   blnFlag=app.FnSessionTimeOut();
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
	/* To verify the PCI  session time out rules applicable for Bill delivery page
	 * Created by Darshana
	 * Date : 12/19/2014*/
	public void BillPay_BillDeliverySessionTimeOut()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<4;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
	          	   blnFlag=app.FnMyAccountHover();
	          	   break;
	          	   
	             case 2:
	          	   blnFlag=app.FnbillDelivery();
	             		break;
	             case 3:
		          	   blnFlag=app.FnSessionTimeOut();
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
	/* To verify the PCI  session time out rules applicable for Auto pay page
	 * Created by Darshana
	 * Date : 12/24/2014*/
	public void BillPay_AutoPaySessionTimeOut()
	{
		try
		{
		m1.put("OVERALLSTATUS", "PASS");
		String Browser=m1.get("BROWSER").toString();
	      repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
	      for (int iCount=0; iCount<8;iCount++)
	      {
	             switch(iCount)
	             {
	             case 0:blnFlag=app.FnLaunchOptimumApp();                            
	             break;
	             
	             case 1:
		          	   blnFlag=app.FnMyAccountHover();
		          	   break;
		          	   
		             case 2:
		          	   blnFlag=app.FnPaymentOptions();
		             		break;
		             case 3:
			          	   blnFlag=app.FnPaymentPageVerify();
			             		break;
		       
		             case 4:
		            	 blnFlag=app.FnAutoPayCredit();
		            	 break;
		             case 5:
		            	 blnFlag=app.FnSetUpAutoPay();
		            	 break;
		             case 6:
		            	 blnFlag=app.FnSetUpAutoPayClick();
		            	 break;
		             case 7:
			          	   blnFlag=app.FnSessionTimeOut();
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
	      System.out.println(e);
	}
}
//darshana ends
}


