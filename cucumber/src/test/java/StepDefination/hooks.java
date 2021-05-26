package StepDefination;




import baseLayer.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class hooks extends baseclass {
	
	@Before
	
	public void Setup() {
	  
		baseclass.initalization();
		
	}
	@After
    public void teardown() {
    	driver.close();
    }
}
