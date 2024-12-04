# SWT-project
KSU SWE 3643 Software Testing and Quality Assurance Semester Project: Web-Based Calculator





















Table of Contents
KSU SWE 3643 Software Testing and Quality Assurance Semester Project: Web-Based Calculator	1
Team members	3
Introduction:	3
Architecture   :	3
Architecture picture	4
Environment configurations and Tests	5
Running the Frontend and Executing the web-:	6
Reviewing unit test coverage:	7
Conclusion:	8




















Team members
1-	NATHANAEL FOKOU KAMGAING


Introduction:
The repository contains a web-based calculator application built to perform basic statistical calculations. It includes functionality for computing the mean, standard deviation, z-score, and regression formula, as well as predicting values based on a regression model. It also contains comprehensive unit and end-to-end tests implemented.

Architecture   :
 The architecture of this project is based on a multi-layer design that separates the concerns of the web-based user interface (UI), the calculator logic, and testing modules. This modular structure allows for clear separation of responsibilities and simplifies unit testing and maintenance.
Web App: The frontend of the application, built using HTML, CSS, and JavaScript, is responsible for interacting with the user. It sends requests to the backend via REST API calls to compute statistical values like mean, standard deviation, regression, etc. The UI handles user input and displays the results received from the backend.
Calculator Logic: The core of the application, where all the mathematical computations occur. This module includes the methods to calculate the mean, standard deviation, z-score, regression formula, and prediction logic. It is implemented in Java as a Spring Boot service and is strictly separated from the UI.
Unit Tests: To ensure the calculator logic is functioning correctly, a separate module contains unit tests for all the functions. The tests cover all possible paths of the calculator logic, including error conditions. These tests are written using the AAA (Arrange, Act, Assert) pattern.
End-to-End Tests: This module contains Playwright scripts that test the entire application, ensuring that the frontend and backend work together seamlessly. These tests simulate user interactions and check that the UI displays the correct results.

Architecture picture
 


![image](https://github.com/user-attachments/assets/07c4b902-d1dc-4ea2-9c4e-7882ab9c9651)

















Environment configurations and Tests
1-	You need to have java 11 or later, maven,node.js, git, Junit, playwright installed on your pc
2-	Running Unit Tests(all unit tests):
To run the unit tests using JUnit, use Maven:
Command : mvn test

3-	 Running End-to-End Tests:
To execute the Playwright end-to-end tests, follow these steps:
•	Install Playwright dependencies: In the root of your project, run the following command:
Command : npm install playwright
 

![image](https://github.com/user-attachments/assets/3bc60ec9-295f-4868-9d2b-3bfb7f46b315)

•	Run the end-to-end tests: After installing Playwright, execute the tests:
Command : npm run test:e2e
 

![image](https://github.com/user-attachments/assets/2b9964a9-3d9b-4811-b041-6a5897190fa9)




 Running the Frontend and Executing the web-:
Serve the frontend using a simple HTTP server: Install a simple HTTP server via npm:
Command: npm install -g http-server
Then run it:
http-server ./path-to-frontend
This will serve the frontend at http://localhost:8080 
 

4-	 Connecting to the Running Web Application:
After the Spring Boot application is running, open a browser and navigate to http://localhost:8080 (or the appropriate port number) to access the web application.
  ![image](https://github.com/user-attachments/assets/29c240f6-18f4-4db8-9552-3eec1aeed906)



Reviewing unit test coverage: 

 
![image](https://github.com/user-attachments/assets/d39e189c-c414-46c9-bfbf-36c8e001ab21)






















Conclusion: 
In conclusion the project was really amazing and challenging and made me think out of the box to find solutions to some of the problem I encountered especially during the testing phase, and this made me develop more skills so I can say the project was an excellent one. 


Link of video: https://youtu.be/EZwaZBQhzMU

