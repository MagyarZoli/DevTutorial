```bash
docker ps -a
docker stop b439f9b8d0c9
docker stop -t 0 b439f9b8d0c9
docker kill b439f9b8d0c9
docker ps -aq | xargs docker rm
docker container prune
```
```bash
docker images
docker rmi our-server
docker rmi -f
docker system prune
```