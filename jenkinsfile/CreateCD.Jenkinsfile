pipeline {
    options {
        disableConcurrentBuilds()
        overrideIndexTriggers(false)
    }
    agent any
    parameters {
        string(name: "GITHUB_ORG")
        string(name: "IMAGE_NAME")
        string(name: "VERSION")
    }
    environment {
        GITHUB_DEPLOY_REPO_URL = "git@github.com:${GITHUB_ORG}/deploy.git"
    }
    stages{
        stage("Deploy to Staging") {
            steps{
                git url: "${GITHUB_DEPLOY_REPO_URL}", credentialsId: 'github-ssh-key', branch: 'master'
                sh "git config user.email pipeline@linkedin.com"
                sh "git config user.name pipeline"
                sh "cd base && kustomize edit set image ${IMAGE_NAME}=${IMAGE_NAME}:${VERSION}"
                sh 'git commit -am "Updated image ${IMAGE_NAME} to ${VERSION}"'
                sshagent(["github-ssh-key"]) {
                    sh "git push origin master"
                }
            }
        }
    }
}