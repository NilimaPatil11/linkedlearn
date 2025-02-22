pipeline {
    agent any

    stages {
        stage('Unit Test') {
            steps {
                echo 'Using TestNG'
            }
        }
         stage('Static Analysis') {
            steps {
                echo 'Using Sonar Qube'
            }
        }
        stage('Genetete Build') {
            steps {
                echo 'Using Maven'
            }
        }
         stage('Exicute Regression Test') {
            steps {
                echo 'Using Selenium, Rest Assured'
            }
        }
    }

}
