pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        dir( (isUnix() ? '/opt/DevOps' : 'C:/DevOps') ) {
          git credentialsId: 'github.ibm.com.token', url: 'https://github.ibm.com/spm-devops/spm_deployment.git'//, branch: 'fconnolly'
        }//End: Directory Relocation
      }//EndSteps: "Checkout files to shared location"
    }//EndStage: "Checkout files to shared location"
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