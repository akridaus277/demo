pipeline {
	agent any
	environment {
		mavenHome = tool 'jenkins-maven'
	}
	tools {
		jdk 'java-11'
	}
	stages {
		stage('Build'){
			steps {
				bat "mvn clean install --settings=settings.xml -DskipTests"
			}
		}
		stage('Test'){
			steps{
				bat "mvn --settings=settings.xml test"
			}
		}
		stage('Deploy') {
			steps {
			    bat "mvn --settings=settings.xml jar:jar deploy:deploy"
			}
		}
	}
}