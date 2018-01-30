# uichallange

To run the tests from terminal use the command below:
mvn surefire-report:report
And you can find the test reports under target/surefire-reports


Running the project for the first time can take few minutes because of the downloads.

Here is the link for UI Test Repository:
https://github.com/gokcetuncay81/uichallange
This a maven repository and in pom.xml there are the list of dependencies and plugins.
Let me briefly explain why did I need these dependencies and plugins in my project:
1- “maven-compiler-plugin” This plugin is needed because of another dependency in my project: testng (see number-4).
When using the parallel-execution feature of testng, I needed to upgrade my java to version 1.8 and I needed a compiler
plugin in order to compile java-1.8.
2- “maven-surefire-plugin” For report output.
3- “selenium-java” For WebDriver automation.
4- “Testng” As the test framework.

There are 3 test cases written;
1st Test Case; is to check is the HomePage is propoerly opened. I tried to cover all the features as much as I can but
there still are some cases which are not covered in page body.
2nd Test Case; is a click and navigate scenario. Opening the home page and click one the first product and make sure it
is navigating me to the product details page. And if product details page is opened properly. (There are more features
to be covered in product page.)
3nd Test Case; is to sign the first Best Of Adidas product as favorite. And make sure it is reflected on the top menu
as wishlist.

For waiting the DOM elements to be located on the page, I used Implicit Wait for project.
And for signing one product as favorite, and to wait DOM element is displayed dynamically on page, I used the
ExpectedConditions class of selenium.

This project is written in Page Object Modelling standarts. And also when opening each page, checking that pages'
features in related classes.

There is a PageObject class defining the Webdriver and initiating the elements at the very base level.
There is a FunctionalTest class which is managing the actions to do before and after running the tests.
Also cross-browsing is handled inside FunctionalTest class.

These tests can run parallel and open several threads in order to save time. This feature is handled in testng.xml,
besides defining the test suite to be executed.

Reporting is provided in two groups as ChromeTest report and FirefoxTest report.