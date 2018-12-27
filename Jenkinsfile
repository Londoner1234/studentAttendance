pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
               bat 'mvn clean' //Clean generates the classes again       
            }
         stage('Execute Tests') {
            steps {
               bat 'mvn test' //Clean generates the classes again       
            }
           
        }
       
    }
}