pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
               bat 'mvn clean'       
            }
         }
         stage('Execute Tests') {
            steps {
               bat 'mvn test' 
               junit '**/target/surefire-reports/*.xml' //junit captures and associates the JUnit XML files matching the inclusion pattern     
            }
           
        }
       
    }
}