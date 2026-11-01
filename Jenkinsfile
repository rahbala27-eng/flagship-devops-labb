
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Flagship application'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing Flagship application'
            }
        }

        stage('Deploy to Development') {
            steps {
                echo 'Deploying Flagship to Development'
            }
        }
    }
}
