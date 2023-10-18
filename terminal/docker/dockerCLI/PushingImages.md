```bash
docker login -u magyarzoli
```
```txt
Password: (PAT)
```
```bash
docker tag our-web-server magyarzoli/our-web-server:0.0.1
docker push magyarzoli/our-web-server:0.0.1
```