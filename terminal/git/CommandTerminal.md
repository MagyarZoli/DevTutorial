```{bash}
git init
```
```{bash}
git add src/main/java/org/example/git/example.txt
git add .
```
```bash
git status
```
```{bash}
git commit -m "adds example.txt"
```
```{bash}
git remote add origin https://github.com/userName/repo.git
git push -u origin master
```
```{bash}
git pull
git pull origin git
```
```{bash}
git diff
git diff --cached
```
```{bash}
git add .
git mv src/main/java/org/example/git/example.txt \
src/main/java/org/example/git/anotherexample.txt
```
```{bash}
git restore --staged src/main/java/org/example/git/example.txt
```
```{bash}
git restore --staged .
```
```{bash}
git restore .
```
```{bash}
git checkout commit
git checkout git
git checkout master
```
```{bash}
git rm example.txt
```
```{bash}
git switch master
git merge git
```
```{bash}
git branch -d git
```