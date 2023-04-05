pipeline {
    agent any
    stage('Clone') {
        steps {
            git 'https://github.com/kevinram164/Bkacad-ClassDevops.git'
        }
    }
}