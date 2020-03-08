# Test_Automation_Verivox
Test Automation Using Cucumber,Page Object Model,TestNg,Maven,JAVA 8,extent reports

# Pre-Requisites

 Install TestNg on eclispe to run TestNg tests
 Install Natural Eclipse editor for Gherkin
 Install Cucumber Eclipse plugins to understand Gherkin syntax 
 Place Chromedriver/IEdriver according to the chrome/IE version used
 Install Maven in local to execute tests tests from command prompt

 # Framework Details

 #1.Framework uses MAVEN for dependency management using POM.xml
 #2.Created layered framework considering SOLID principles in mind.
 #3.Page Object Model is used keep the objects(web elements) and related functions(interactions) of a page in one class
 #4.Cucumber(BDD) framework is used as it ties together the executable specifications(feature file) with the actual code of the system(step definitions) and the automated acceptance tests.
 #5.Test data is maintained in feature file along with the test steps which give advantages in terms of readability, code minimization, maintenance
 #6.Cucumber tags can be used to include tests in smoke / regression suites
 #7.Tags @SmokeTest and @RegressionTest can be used in the testrunner to execute the smoke or regression tests. 
 
 ## Advantages ##
 
 #1. Its a properly layered framework means every layer has its own functionalities 

	#testRunner (src/test/java/engine)
		
		a. Driverconfiguration launches chrome/IE driver or remotedriver(for Saucelabs-Cloud tool) when Utilities has to launch AUT.
		b. TestRunner glues steps in the feature file with the step definitions and executes the tests using testNg.
				
	#pageObjects layer/Business Layer (src/test/java/pageObjects)
	
	    a.Main purpose is to perform business logic tasks
	    b.The objects(web elements) and related functions(interactions) of a page in one class.
	    c.The entire application is divided into different pages with their individual page objects and functions.
		
	#stepDefinitions layer (src/test/java/stepDefinitions)
	    a.For all the steps in the feature file , corresponding functions are defined in the stepDefinitions files

#2. Data is getting picked from feature file for easy maintainance. 
#3. Logger has been implemented and logs can be taken from /logs/output.log
#4. TestData Layer (src/test/resources)
        a. drivers will have chromedriver,IEdriver.exe to launch AUT
        c. feature folder contains feature file contain the acceptence tests.
#5. Test Reports - cucumberReports is available in src/test/resources/cucumberReports folder.
#6. Page Object Model is used for code reusability and code maintainability
 
#TODOs

1. Add tags to determine the smoke/regression tests - completed
2. Run Tests from command line - completed
3. Integrate the scripts on circleci -completed
4. Integrate CircleCI to SauceLabs to execute the test remotely on cloud tool - Pending

