pipeline{
    agent any
    
    stages{
        stage('code'){
            steps{
                echo "code cloning"
                git url: 'https://github.com/Git-Prajwal-GH/django-notes-app_forked.git', branch:'main'
            }
        }
        stage('Image Build'){
            steps{
                echo "Docker image building"
                sh "whoami"
                sh "docker build -t notes-app:latest ."
            }
        }
        stage("Push to DockerHub"){
            steps{
                echo "Docker image pushing to DockerHub"
                withCredentials([usernamePassword(
                    'credentialsId':"dockerhub-cred",
                    passwordVariable:"dockerHubPass",
                    usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass} "
                sh "docker image tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
                sh "docker push ${env.dockerHubUser}/notes-app:latest"
                }
            }
        }
        stage("Deploy"){
            steps{
                echo "This is deploying the code"
                sh "docker run --name c1 -p 8000:8000 notes-app:latest"
            }
        }
    }
}