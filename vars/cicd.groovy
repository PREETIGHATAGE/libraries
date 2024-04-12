def newGit()
{
git "${libraries}
}
def newMaven()
{
sh 'mvn package'
}
def newDeploy(http://172.31.86.203:8080,testapp)
{
deploy adapters: [tomcat9(credentialsId: '8a3325e9-d38f-4e77-be7d-f009417b0ffb', path: '', url: 'http://172.31.86.203:8080')], contextPath: 'testapp', war: '**/*.war'
}
def newTest(pipeline)
{
echo "${pipeline}
sh "java -jar /home/ubuntu/.jenkins/workspace/pipeline/testing.jar"
}

