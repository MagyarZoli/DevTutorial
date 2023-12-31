pipeline {
    agent any
    environment {
        GITHUB_ORG = 'hotel-landon-kb'
        CONTAINER_REGISTRY = "ghcr.io/${GITHUB_ORG}/"
        CONTAINER_REGISTRY_URL = "https://${CONTAINER_REGISTRY}"
        ARTIFACT_ID = readMavenPom().getArtifactId()
        JAR_NAME = "${ARTIFACT_ID}-${BUILD_NUMBER}"
        JAR_LOCATION = "target/${JAR_NAME}.jar"
        IMAGE_NAME = "${CONTAINER_REGISTRY}${ARTIFACT_ID}"
        IMAGE_TAG = "${IMAGE_NAME}:${BUILD_NUMBER}"
    }
    stages {
        stage('Build Application') {
            agent{
                docker {
                    image 'openjdk:11'
                    reuseNode true
                }
            }
            steps {
                sh 'echo Performing Maven Build: ${ARTIFACT_ID}'
                sh './mvnw -DjarName=${JAR_NAME} clean verify'
            }
        }

        stage('Build Container Image') {
            steps {
                sh 'echo Building Container Image: ${IMAGE_NAME}'
                sh 'docker build --build-arg JAR_FILE=${JAR_LOCATION} -t ${IMAGE_TAG} .'
            }
        }

        stage('Publishing Container Image') {
            steps {
                sh 'echo Publishing Container Image to: ${CONTAINER_REGISTRY}'
                script {
                    docker.withRegistry("${CONTAINER_REGISTRY_URL}","github-pat"){
                        sh 'docker push ${IMAGE_TAG}'
                    }
                }
            }
        }
        stage('Trigger CD Pipeline') {
            steps {
                build(job:"/landon-hotel-application/deploy/master", parameters: [
                        string(name: "GITHUB_ORG", value: "${GITHUB_ORG}"),
                        string(name: "IMAGE_NAME", value: "${IMAGE_NAME}"),
                        string(name: "VERSION", value: "${BUILD_NUMBER}")
                ])
            }
        }
    }
}