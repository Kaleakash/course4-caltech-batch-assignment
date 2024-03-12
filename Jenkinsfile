pipeline {
    agent any
     tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN"
    }
    stages {
        stage("create the jar or war"){
            steps{
            	sh "mvn --version"
                sh "mvn package"
            }
        }
         stage("creating the image"){
            steps{
                sh "docker build -t my-spring-app . -f Dockerfile"
                echo "image created"
            }
        }
        stage("run the container"){
            steps{
            	sh "docker rm 40f44c80632e -f"
                sh "docker run -d -p 9090:9090 my-spring-app"
                echo "container running"
            }
        }
    }
}