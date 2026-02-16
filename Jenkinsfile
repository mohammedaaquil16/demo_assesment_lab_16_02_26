pipeline{
    agent any{
       trigger{ 
           githubpush()
       }
        stages{
            stage('complie'){
                bat'javac Calculator.java'
            }
        }
        stage('Run'){
            steps(){
                bat 'java Calculator 10-5'
            }
        }
    }
    post{
        success{
            archieveArtifacts artifacts:*.class,fingerprint:true
        }
        failure{
            echo 'build failes'
        }
    }
}
    
