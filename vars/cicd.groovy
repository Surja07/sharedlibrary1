
def gitdownload(repo) 
{
    git branch: 'main', url: "https://github.com/Surja07/${repo}.git"
}
def builtArtifact()
{
    sh 'mvn pacakage'
}
