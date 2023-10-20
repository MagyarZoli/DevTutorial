```bash
docker container create hello-world:linux
```
```bash
docker ps
docker ps -a
docker images
```
```bash
docker start b474ddba2216
docker ps -a
```
```bash
docker logs b474ddba2216
```
```bash
docker container start --attach b474ddba2216
```
```bash
docker run hello-world:linux
docker ps -a
```
```bash
docker build -t our-first-image .
docker run our-first-image
```