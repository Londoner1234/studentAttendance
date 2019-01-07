pipeline {
    agent any
    stages {
    
    	stage('Checkout from Git'){
    		steps{
    		  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/Londoner1234/studentAttendance']]])
    		
    		}
    		
    	}
        stage('Clean') {
            steps {
               bat 'mvn clean'       
            }
         }
         stage('Execute Tests') {
            steps {
               bat 'mvn test' 
            }
           
        }
        stage('Publish Results') {
            steps{
                junit '**/target/surefire-reports/*.xml' //junit captures and associates the JUnit XML files matching the inclusion pattern     
            }
        }

    }
    
    	
    	
    
  
}