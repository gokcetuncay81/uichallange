# uichallange

To run the tests from terminal use the command below:
mvn surefire-report:report
And you can find the test reports under target/surefire-reports


Running the project for the first time can take few minutes because of the downloads.

Here is the link for UI Test Repository:
https://github.com/gokcetuncay81/uichallange
This a maven repository and in pom.xml there are the list of dependencies and plugins.
Let me briefly explain why did I need these dependencies and plugins in my project:
1- “maven-compiler-plugin” is used to explicity define JDK 1.8 because Intellij is using 1.5 by default, and 1.5 does not support Generics which I have used for traversing image types desktop, mobile and tablet. 
2- “maven-surefire-plugin” For report output.
3- “selenium-java” For WebDriver automation.
4- “TestNG” As the test framework.

There are 3 test cases written;
1st Test Case; is to check if the HomePage is propoerly opened. There are more features to be checked in page body but I tried to keep it simple.
2nd Test Case; is a click and navigate scenario. Opening the home page and clicking one of the first product and make sure that product details page is opened properly. (There are more features to be checked when opening in product page but I tried to keep it simple.)
3rd Test Case; is to sign the first "Best of Adidas" product as favorite. And make sure it is reflected on the top menu as wishlist.

For waiting the DOM elements to be located on the page, I used Implicit Wait for the entire project.
And for signing one product as favorite, and to wait DOM element is displayed dynamically on page, I used the
ExpectedConditions class of Selenium.

While opening each page I check for that pages' elements in thier own Page classes.

This project is written in Page Object Modelling standarts. 
There is a PageObject class defining the Webdriver and initiating the elements at the very base level.
There is a FunctionalTest class which is managing the actions to do before and after running the tests.

To execute test cases with different browsers in the local machine I have integrated TestNG framework with Selenium WebDriver.
For this challange I chose two most popular browsers: Chorme and Firefox. These tests run parallel and open 2 (configurable) threads in order to save time. This feature is handled in testng.xml,

TestNG provides reporting by default with the help of surefire-reports, you can find the test reports under target folder: target/surefire-reports/index.html or you can try target/surefire-reports/emailable-report.html as a summary.
