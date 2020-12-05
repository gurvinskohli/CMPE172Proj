# CMPE172Proj
#### San Jose State University 
#### Enterprise Software-CMPE172/Fall 2020
#### Team 8: Hibo Osman, Arielle Shnayder, Gurvin Kohli

## Project Introduction - SpartanFoods
SpartanFoods will be an application that will contain lists pertaining to food recipes. SpartanFoods will be competent to filter recipes based on dietary restrictions the user has. The user will submit a form which asks for the dish name, ingredients, and allergens. There will be a full on display feature that will assist the user in discovering new recipes that fits the user’s dietary restrictions (as they are able to filter by certain ingredients or allergens). As default, there will be a certain number of recipes present on the recipe discovery page but as the application is utilized by users, the number of recipes will increase. Once a recipe is submitted, the user will be prompted to view the recipe discovery page to explore. This application solves the issue individuals with dietary restrictions encounter on a daily basis, which is the perplexing nature of finding recipes that meet their dietary restrictions.         

## Sample UI Screen Shots - 
<img width="600" alt="1" src="https://github.com/hibozahara/CMPE172Proj/blob/main/cmpe172_project/frontend/src/Component/img/Home2.png">
<img width="600" alt="1" src="https://github.com/hibozahara/CMPE172Proj/blob/main/cmpe172_project/frontend/src/Component/img/AddRecipe.png">
<img width="600" alt="1" src="https://github.com/hibozahara/CMPE172Proj/blob/main/cmpe172_project/frontend/src/Component/img/Recipe.png">
<img width="600" alt="1" src="https://github.com/hibozahara/CMPE172Proj/blob/main/cmpe172_project/frontend/src/Component/img/Share.png">

## Required Technologies - 
#### These technologies are required in order to run the project locally.
   - [Node.js](https://nodejs.org/en/download/): Used for front-end UI (React.js)
   - [Java JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html): Necessary to work with Java, which was used for Middle tier ~ Springboot
   - [Maven](https://maven.apache.org/download.cgi): Used for building an executable jar application
   - [mySQL](https://dev.mysql.com/downloads/): To view, hold, and query database content (Database Tier)
   - [Docker](https://docs.docker.com/get-docker/): Optional** Used for containerization
   
## Steps for Execution - 
1. Edit and configure the application properties file to match your own credentials (username/password). You will also need to create your own RDS endpoint or simply use your localhost. Where 'test' is the name of the database you created.
```
jdbc:mysql://localhost:3306/test"
```

2. Open terminal - navigate to /cmpe172_project directory. Run:
```
mvn install
```
3. When 'build success' is seen, run the following command
```
java -jar target/cmpe172_project-0.0.1-SNAPSHOT.jar
```
4. Open your web browser once application successfully runs. The display will be on port 9091
```
localhost:9091
```

## Diagrams/Architecture - 

<img width="600" alt="1" src="https://github.com/hibozahara/CMPE172Proj/blob/main/cmpe172_project/frontend/src/Component/img/sys.png">
<img width="600" alt="1" src="https://github.com/hibozahara/CMPE172Proj/blob/main/cmpe172_project/frontend/src/Component/img/1.png">
<img width="600" alt="1" src="https://github.com/hibozahara/CMPE172Proj/blob/main/cmpe172_project/frontend/src/Component/img/2.png">




