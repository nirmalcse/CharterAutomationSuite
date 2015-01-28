package TestScripts;

import java.util.concurrent.TimeUnit;
import Library.CommonFunctions;
import Library.Initialization;
import Library.OptimumAppFunctions;
import Library.ReportingFunctions;
import Library.RunManager;

public class Error_404_500 extends Initialization{
	RunManager cfn=new RunManager();
	ReportingFunctions repfn=new ReportingFunctions();
	OptimumAppFunctions app=new OptimumAppFunctions();
	CommonFunctions cnf=new CommonFunctions();
	public static boolean blnFlag=false;
	public void FNError_TS01_CheckImageText404()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchError404();
                    	 break;
                    	 
                     case 1 :
                    	 blnFlag=app.FnCheckImageText404();                            
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
	public void FNError__TS02_CheckHomeRedirectLink404()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     
                     case 0:
                    	 blnFlag=app.FnLaunchError404();
                    	 break;
                    	 
                     case 1:
                    	 blnFlag=app.FnCheckHomeRedirectLink404();                            
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
	public void FNError_TS07_CheckImageText500()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchError500();
                    	 break;
                    	 
                     case 1:
                    	 blnFlag=app.FnCheckImageText500();                            
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
	public void FNError__TS12_CheckHomeRedirectLink500()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchError500();
                    	 break;
                     
                     case 1:
                    	 blnFlag=app.FnCheckHomeRedirectLink500();                            
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
	// 12-1-2014 - Revathishre - Start
	public void FN_Error_TS03_CheckAskCharter404()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchError404();
                    	 break;
                     
                     case 1:
                    	 blnFlag=app.FnCheckAskCharter404();                            
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
	
	public void FN_Error_TS09_CheckAskCharter500()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchError500();
                    	 break;
                     
                     case 1:
                    	 blnFlag=app.FnCheckAskCharter500();                            
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
	// 12-1-2014 - Revathishre - End
	//12-2-2014 - Revathishre - Start
	public void FN_Error_TS_05_CheckMyAccount404NonLogged()
	{
	m1.put("OVERALLSTATUS", "PASS");
    try{
    
          String Browser=m1.get("BROWSER").toString();
          repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
          for (int iCount=0; iCount<2;iCount++)
          {
                 switch(iCount)
                 {
                 case 0:
                	 blnFlag=app.FnLaunchError404();
                	 break;
                 
                 case 1:
                	 blnFlag=app.FnCheckMyAccount404();                            
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
	
	public void FN_Error_TS_11_CheckMyAccount500NonLogged()
	{
	m1.put("OVERALLSTATUS", "PASS");
    try{
    
          String Browser=m1.get("BROWSER").toString();
          repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
          for (int iCount=0; iCount<2;iCount++)
          {
                 switch(iCount)
                 {
                 case 0:
                	 blnFlag=app.FnLaunchError500();
                	 break;
                 
                 case 1:
                	 blnFlag=app.FnCheckMyAccount500();                            
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
	//12-2-2014 - Revathishre - End
	
	//12-3-2014 - Revathishre - Start
	public void FN_Error_TS_04_CheckMyAccount404Logged()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try{
			if(!blnFlag)

				blnFlag=true;
			String Browser=m1.get("BROWSER").toString();
			repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
			for (int iCount=0; iCount<4;iCount++)
			{
				if(blnFlag){
				switch(iCount)
				{
				case 0:blnFlag=app.FnLaunchOptimumApp();
				    System.out.println(blnFlag);					
					String Appurl = m1.get("AppURL").toString();
					String Errurl=Appurl+"404/";
					System.out.println(Errurl);
					driver.get(Errurl);
					break;
					
				case 1:blnFlag=app.FnCheckMyAccount404();break;
				}
				}
				else
				{
					m1.put("TS_STATUS","false");
					repfn.FnUpdateTestStepResHTML("Execution Aborted", "Test Script Execution Aborted","DONE");
					break;
				}
			}
			repfn.FnUpdateEndTest();
			driver.close();
		}catch(Exception e)
		{
			
			System.err.println("Message : "+e.getMessage());
			System.err.println("Cause : "+e.getCause());
			//throw e;
		}
	}
	
	public void FN_Error_TS_10_CheckMyAccount500Logged()
	{
		
		m1.put("OVERALLSTATUS", "PASS");
		try{
			if(!blnFlag)

				blnFlag=true;
			String Browser=m1.get("BROWSER").toString();
			repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
			for (int iCount=0; iCount<4;iCount++)
			{
				if(blnFlag){
				switch(iCount)
				{
				case 0:blnFlag=app.FnLaunchOptimumApp();
				    System.out.println(blnFlag);					
					String Appurl = m1.get("AppURL").toString();
					String Errurl=Appurl+"500/";
					System.out.println(Errurl);
					driver.get(Errurl);
					break;
					
				case 1:blnFlag=app.FnCheckMyAccount500();break;
				}
				}
				else
				{
					m1.put("TS_STATUS","false");
					repfn.FnUpdateTestStepResHTML("Execution Aborted", "Test Script Execution Aborted","DONE");
					break;
				}
			}
			repfn.FnUpdateEndTest();
			driver.close();
		}catch(Exception e)
		{
			
			System.err.println("Message : "+e.getMessage());
			System.err.println("Cause : "+e.getCause());
			//throw e;
		}
	}
	//12-3-2014 - Revathishre - End
	
	//Vijayasaraswathi
	//Start
	public void FNError_TS06_CheckPayBillLink404()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchError404();
                    	 break;
                    	 
                     case 1 :
                    	 blnFlag=app.FnCheckPayBillLink404();  //FnCheckPayBillRedirectLink404()                          
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
	//End
	
	//Vijayasaraswathi
	//StartRefresh
	public void FNError_TS08_CheckRefreshLink500()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<2;iCount++)
              {
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchError500();
                    	 break;
                    	 
                     case 1 :
                    	 blnFlag=app.FnCheckRefreshLink500();                           
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
	
	
	//EndRefresh
	
	//Vijayasaraswathi
	//CheckPayBillLinkLogged404-Start
	public void FNError_TS13_CheckPayBillLinkLogged404()
	{
		m1.put("OVERALLSTATUS", "PASS");
        try{
        	  if(!blnFlag)
        		  blnFlag=true;
              String Browser=m1.get("BROWSER").toString();
              repfn.FnUpdateTestStepResHTML("Launch Browser", "Browser: "+Browser+" is launched","PASS");
              for (int iCount=0; iCount<4;iCount++)
              {
            	  	 if(blnFlag){
                     switch(iCount)
                     {
                     case 0:
                    	 blnFlag=app.FnLaunchOptimumApp();
                    	 System.out.println(blnFlag);
                    	 String Appurl = m1.get("AppURL").toString();
     					 String Errurl=Appurl+"404/";
     					 System.out.println(Errurl);
     					 driver.get(Errurl);
                    	// blnFlag=app.FnLaunchError404();
                    	 break;
                    	 
                     case 1 :
                    	 blnFlag=app.FnCheckPayBillLinkLogged404();  //FnCheckPayBillRedirectLink404()-Logged                          
                    	 break;
                    
                     }
                     }
            	  	 else
            	  	 {
            	  		m1.put("TS_STATUS","false");
    					repfn.FnUpdateTestStepResHTML("Execution Aborted", "Test Script Execution Aborted","DONE");
    					break;
            	  	 }
              
              /*       if(!blnFlag)
                     {
                            repfn.FnCom_AbortExec();
                            break;
                     } */                                 
        }
              repfn.FnUpdateEndTest();
              driver.close();
        }

        catch(Exception e)
        {
        	System.err.println("Message : "+e.getMessage());  
        	System.err.println("Cause : "+e.getCause());
        	repfn.FnCom_ThrowException(e);                         
        }
	}
}
//End

	
	
	



