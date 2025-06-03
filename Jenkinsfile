pipeline {
    agent any

    tools {
        maven 'Maven_3.8.5'
        jdk 'JDK_11'
    }

    environment {
        PATH = "/usr/bin:$PATH"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mmr-mani/selenium_maven.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed!'
        }
        failure {
            echo 'Tests failed. Check reports.'
        }
    }
}
