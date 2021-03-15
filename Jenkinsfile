pipeline {

    agent any

    stages {
        stage('Smoke Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="SmokeTest/Features/Smoke.features"'
                //sh './gradlew clean build'
            }
        }
        stage('Smoke Test Reports') {
            steps {
            /*    publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'target/JSONReports',
                reportFiles: 'Reports.json',
                reportName: "Unit Test Report"
                ])
            */    
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'Smoke Test',
                fileIncludePattern: '**/*.json'
            }
        }
        stage('First check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Sanity Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="SanityTest/Features/Sanity.feature"'
            }
        }
        stage('Sanity Test Reports') {
            steps {
                publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'target/SanityTest',
                reportFiles: '*.html',
                reportName: "Sanity Test"
                ])
            }
        }
        
        stage('Second check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
