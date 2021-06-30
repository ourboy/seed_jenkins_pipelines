pipeline {
  agent any
  stages {
    stage("Hello") {
      steps {
        echo "Hello from pipeline ${name}"
      }
    }
    stage("Goodbye") {
      steps {
        echo "Goodbye from pipeline ${name}"
      }
    }
  }
}