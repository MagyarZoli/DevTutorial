pipeline {
    agent any
    parameters {
        choice choices: ['hello', 'shebang', 'text', 'for', 'if', 'vars',
                         'pipe', 'while', 'reader', 'func', 'pfunc', 'prompt',
                         'user', 'fibonacci', 'declare', 'greeting', 'headtailwc',
                         'params', 'sport', 'typeset', 'delay', 'proc'],
                name: 'FILE'
        string defaultValue: '',
                name: 'COMMAND'
        text defaultValue: '/Shell/basic/',
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
                sh(".${env.PATH}${env.FILE}.sh ${env.COMMAND}")
            }
        }
        stage('Full path') {
            steps {
                sh("${env.WORKSPACE}${env.PATH}${env.FILE}.sh ${env.COMMAND}")
            }
        }
        stage('Change directory') {
            steps {
                dir("${env.WORKSPACE}${env.PATH}"){
                    sh("./${env.FILE}.sh ${env.COMMAND}")
                }
            }
        }
    }
}