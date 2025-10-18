// Archivo de configuración que define un Pipeline en Jenkins

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo "Simulando un despliegue a un servidor de aplicaciones"
            }
        }
    }

    post {
        always {
            echo "Siempre se ejecutará"
        }
        success {
            echo "Éxito. Se ejecuta si todo el pipeline se ejecuta correctamente"
        }
        failure {
            echo "Fallo. Se ejecuta si falla el pipeline"
        }
    }
}