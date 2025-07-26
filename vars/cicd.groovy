
def gitdownload(repo) 
{
    git branch: 'main', url: "https://github.com/Surja07/${repo}.git"
}
def build() {
    echo 'Building the project using Maven...'
    sh 'mvn clean package'
}
