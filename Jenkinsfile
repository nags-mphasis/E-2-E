pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean test -Dcucumber.options="/src/test/resources/Features/login.feature"'
            }
        }
        stage('Unit Test Reports') {
            steps {
                publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'target/JSONReports',
                reportFiles: 'Reports.json',
                reportName: "Unit Test Report"
                ])
            }
        }
        stage('Sanity check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Feature Test') {
            steps {
                sh './gradlew test -Dcucumber.options="/FeatureTest/Features/login.feature"'
            }
        }
        stage('Feature Test Reports') {
            steps {
                publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'target/HTMLReports',
                reportFiles: 'Reports.html',
                reportName: "Feature Test Report"
                ])
            }
        }
        stage('API RestAssured Test') {
            steps {
                sh './gradlew clean test -DsuiteXmlFile=testng.xml '
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
        }
    }
    
    post {
        unsuccessful {
            cleanWs()
        }
    }
}
