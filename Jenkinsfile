pipeline {

    agent any

    stages {
        /*stage('Smoke Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="SmokeTest/Features/Smoke.features"'
                //sh './gradlew clean build'
            }
        }
        stage('Smoke Test Reports') {
            steps {
                publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'target/JSONReports',
                reportFiles: 'Reports.json',
                reportName: "Unit Test Report"
                ])
                
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'Smoke Test',
                fileIncludePattern: '**//*.json'
            }
        }
        stage('check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }*/
        stage('Feature Test') {
            steps {
                sh './gradlew test -Dcucumber.options="SanityTest/Features/Sanity.feature"'
            }
        }
        stage('Feature Test Reports') {
            steps {
                publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'target/SanityTest',
                reportFiles: 'SanityReports.html',
                reportName: "Sanity Test"
                ])
            }
        }
        /*stage('API RestAssured Test') {
            steps {
                sh './gradlew clean test -DsuiteXmlFile="${env.WORKSPACE}/APITest/testng.xml"'
            }
        }
        stage('API RestAssured Test Reports') {
            steps {
                publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'build/reports/tests/test',
                reportFiles: 'index.html',
                reportName: "API RestAssured Test Report"
                ])
            }
        }*/
        
        stage('check') {
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
