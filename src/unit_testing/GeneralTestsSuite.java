package unit_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses ({
	
	TestHospital.class,
	OrdersTests.class,
	NewsletterTests.class
})

public class GeneralTestsSuite {
}
