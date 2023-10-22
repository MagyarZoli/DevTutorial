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

//pipeline {
//    agent any
//    parameters {
//        choice choices: ['hello', 'shebang', 'text', 'for', 'if', 'vars',
//                         'pipe', 'while', 'reader', 'func', 'pfunc', 'prompt',
//                         'user', 'fibonacci', 'declare', 'greeting', 'headtailwc',
//                         'params', 'sport', 'typeset', 'delay', 'proc'],
//                name: 'FILE'
//        string defaultValue: '',
//                name: 'COMMAND'
//        text defaultValue: '/shell/basic/',
//                name: 'PATH'
//    }
//    options {
//        buildDiscarder(logRotator(daysToKeepStr: '10', numToKeepStr: '10'))
//        timeout(time: 12, unit: 'HOURS')
//        timestamps()
//    }
//    triggers {
//        cron '@midnight'
//    }
//    stages {
//        stage('Make executable') {
//            steps {
//                sh("chmod +x .${env.PATH}${env.FILE}.sh")
//            }
//        }
//        stage('Relative path') {
//            steps {
//                sh(".${env.PATH}${env.FILE}.sh ${env.COMMAND}")
//            }
//        }
//        stage('Full path') {
//            steps {
//                sh("${env.WORKSPACE}${env.PATH}${env.FILE}.sh ${env.COMMAND}")
//            }
//        }
//        stage('Change directory') {
//            steps {
//                dir("${env.WORKSPACE}${env.PATH}"){
//                    sh("./${env.FILE}.sh ${env.COMMAND}")
//                }
//            }
//        }
//    }
//}

pipeline {
    agent any
    parameters {
        choice(name: 'NUMBER',
                choices: [10,20,30,40,50,60,70,80,90],
                description: 'Select the value for F(n) for the Fibonnai sequence.')
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
                sh('chmod +x ./shell/jenkins/fibonacci.sh')
            }
        }
        stage('Relative path') {
            steps {
                sh("./shell/jenkins/fibonacci.sh ${env.NUMBER}")
            }
        }
        stage('Full path') {
            steps {
                sh("${env.WORKSPACE}/shell/jenkins/fibonacci.sh ${env.NUMBER}")
            }
        }
        stage('Change directory') {
            steps {
                dir("${env.WORKSPACE}/shell/jenkins"){
                    sh("./fibonacci.sh ${env.NUMBER}")
                }
            }
        }
    }
}