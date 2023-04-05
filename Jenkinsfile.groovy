pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/kevinram164/Jenkins-Lab.git'
            }
        }
    }
}