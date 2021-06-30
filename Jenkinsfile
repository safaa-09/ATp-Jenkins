pipeline {
    agent any
 
 tools{
     maven 'apache-maven-3.6.0'
 }

    stages {
        stage('Git Checkout') {
            steps {
               git credentialsId: 'git_credentials', url: 'https://github.com/safaa-09/ATp-Jenkins.git'
            }
        }
        
        stage('build Maven') {
            steps {
               sh 'mvn compile'
            }
        }
        
        
        
          stage('Test Unitaire') {
            steps {
         
               sh 'mvn clean test'
            
            }
        }
        
          stage('App Package') {
            steps {
     
               sh 'mvn clean package'
           
            }
        }
        
          stage('Build Docker Image ') {
            steps {
     
               sh 'docker build -t safaa09/avers1:01 .'
           
            }
        }
        
          stage('Mettre L\'image sur Dockerhub ') {
            steps {
     withCredentials([string(credentialsId: 'dockerhubpass', variable: 'dockerhubp1')]) {
       sh "docker login -u safaa09 -p ${dockerhubp1}"
    }
               sh 'docker build -t safaa09/avers1:01 .'
           
            }
        }
    }
}
