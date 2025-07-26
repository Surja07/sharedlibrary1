def gitdownload(String repo) 
{
    git branch: 'main', url: "https://github.com/Surja07/${repo}.git"
}
