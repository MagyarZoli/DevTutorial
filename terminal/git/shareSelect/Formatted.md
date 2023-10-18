```{bash}
git log --oneline
git format-patch commit1..commit3 -o ~/Desktop/formatted_patches
git format-patch commit1..commit3 --stdout
git format-patch commit1..commit3 --stdout ~/Desktop/formatted.patch
```
```{bash}
git log --oneline
git switch tester
git am ~/Desktop/formatted_patches/*.patch
git status
git log --oneline
git log --oneline git
```