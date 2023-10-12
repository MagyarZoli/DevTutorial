```{bash}
git log
git log -p
git log shopping.txt
git log -p
```
> e
> 
> f
> 
> g
> 
> G
> 
> /banana
> 
> n
> 
> N
> 
> q
```{bash}
git blame -w shopping.txt
git blame -w -L 5,10 shopping.txt
git blame -w -L 5,+5 shopping.txt
git balme commti shopping.txt
git config --global alias.praise blame
git praise -w shopping.txt
```
```{bash}
git bisect start
git bisect good commit2
git bisect bad HEAD
```
```{bash}
git bisect good
git bisect bad
git bisect reset
```