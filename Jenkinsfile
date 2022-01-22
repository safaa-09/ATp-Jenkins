pipeline {
    agent any

    stages {
        stage('vérification github') {
            steps {
                // Get some code from a GitHub repository
              git credentialsId: 'git_credentials', url: 'https://github.com/safaa-09/ATp-Jenkins.git'

                
            }
        }
         stage('Build du projet') {
            steps {
                // Get some code from a GitHub repository
             sh 'mvn compile'
            }
        }
        
        stage('test du projet') {
            steps {
                // Get some code from a GitHub repository
             sh 'mvn test'
            }
        }
        
        stage('package du projet') {
            steps {
                // Get some code from a GitHub repository
             sh 'mvn package'
            }
        }
        
        stage('Construction de l\'image') {
            steps {
                // Get some code from a GitHub repository
             sh 'docker build --tag safaa09/app1:01 .'
            }
        }
        
         stage('Push de l\'image'){
             steps{
               withCredentials([string(credentialsId: 'dockerhubpass', variable: 'dockerhubpwd')]) {

                  sh "docker login -u safaa09 -p $dockerhubpwd"       
               }
          sh 'docker push safaa09/app1:01 '
             }
         }
    }
}
