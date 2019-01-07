pipeline {
    agent any
    stages {
    
    	stage('Checkout from Git'){
    		checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/Londoner1234/studentAttendance']]])
    		
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
        
        	post { // changed to post action as we always want to execute this step 
                always {
               		junit '**/target/surefire-reports/*.xml' //junit captures and associates the JUnit XML files matching the inclusion pattern     
                }
            }
           
           
        }
       
    }
}