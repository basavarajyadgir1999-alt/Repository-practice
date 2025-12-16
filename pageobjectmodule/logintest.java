package pageobjectmodule;

import java.time.Duration;

public class logintest {

	public static void main(String[] args) {
WebDriver Driver	=new ChromeDriver();
    Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Driver.manage().timeout().implicitywait(Duration.ofSeconds(10));
    loginpage lp=new Loginpage(driver);
    lp.enterusn();
    lp.enterpsw();
    lp.click();
	}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

		
		

	}

}
