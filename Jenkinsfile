pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
               bat 'mvn clean'       
            }
         stage('Execute Tests') {
            steps {
               bat 'mvn test'       
            }
           
        }
       
    }
}