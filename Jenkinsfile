//pipeline {
//    agent any
//    options {
//        buildDiscarder(logRotator(daysToKeepStr: '10', numToKeepStr: '10'))
//        timeout(time: 12, unit: 'HOURS')
//        timestamps()
//    }
//    triggers {
//        cron '@midnight'
//    }
//    stages {
//        stage('Requirements') {
//            steps {
//                echo 'Installing requirements...'
//            }
//        }
//        stage('Build') {
//            steps {
//                echo 'Building..'
//            }
//        }
//        stage('Test') {
//            steps {
//                echo 'Testing..'
//            }
//        }
//        stage('Report') {
//            steps {
//                echo 'Reporting....'
//            }
//        }
//    }
//    post {
//        always {
//            echo "This step will run after all other steps have finished.  It will always run, even in the status of the build is not SUCCESS"
//        }
//    }
//}

pipeline {
    agent any
    parameters {
        string defaultValue: 'hello',
                name: 'FILE'
        text defaultValue: '/shell/basic/',
                name: 'PATH'
    }
    options {
        buildDiscarder(logRotator(daysToKeepStr: '10', numToKeepStr: '10'))
        timeout(time: 12, unit: 'HOURS')
        timestamps()
    }
    triggers {
        cron '@midnight'
    }
    stages {
        stage('Make executable') {
            steps {
                sh("chmod +x .${env.PATH}${env.FILE}.sh")
            }
        }
        stage('Relative path') {
            steps {
                sh(".${env.PATH}${env.FILE}.sh ${env.NUMBER}")
            }
        }
        stage('Full path') {
            steps {
                sh("${env.WORKSPACE}${env.PATH}${env.FILE}.sh ${env.NUMBER}")
            }
        }
        stage('Change directory') {
            steps {
                dir("${env.WORKSPACE}${env.PATH}"){
                    sh("./${env.FILE}.sh ${env.NUMBER}")
                }
            }
        }
    }
}