```{bash}
git log --oneline
git diff commit1..commit3
git diff commit1..commit3 > ~/Desktop/for_review.diff
```
```{bash}
git switch -c tester commit1
git apply ~/Desktop/for_review.diff
git status
git diff
git restore shopping.txt
git status
git switch git
```