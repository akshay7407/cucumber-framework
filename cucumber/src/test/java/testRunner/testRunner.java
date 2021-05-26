

package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"C:\\Users\\lenovo\\Desktop\\java files\\cucumber\\src\\test\\java\\Features\\HRM.feature"},
		glue= {"StepDefination"},
		//display the output in proper reable format
		monochrome=true,
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		tags="not @sanityy",
		// to check mapping between feature file and step defination 
		dryRun=false,
		// it will check if any step is not defined in step defination file.
	     strict=true
		
	
		)

public class testRunner extends AbstractTestNGCucumberTests {
	
	  @Override
	    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
	    }

}