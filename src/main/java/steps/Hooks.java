package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {

	@Before
	public void beforeScenario(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test=startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Ramya");
		startApp("chrome");
	}
	
	@After
	public void afterScenario(Scenario sc) {
		endResult();
		closeAllBrowsers();
		/*System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());*/
	}

}
