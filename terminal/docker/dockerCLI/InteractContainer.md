```bash
cd ..
docker build --file server.Dockerfile --tag our-first-server .
docker run our-first-server
```
```bash
docker kill b439f9b8d0c9
```
```bash
docker run -d our-first-server
```
```bash
docker ps
docker exec cdad70ccebaf date
docker exec --interactive --tty cdad70ccebaf bash
```
```txt
CTRL + D
```