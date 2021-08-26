pipeline {
    agent any

    stages{
        stage ('checkout') {
            when{ changeset "**/*.*"}

            steps {
                sh "echo I will build now"
            }
        }

    }
}