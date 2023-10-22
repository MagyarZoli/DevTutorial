```bash
cd ..
cd ..
docker build --file server.entrypoint.Dockerfile --tag our-First-server .
docker run our-First-server
```
```bash
docker kill b439f9b8d0c9
```
```bash
docker run -d our-First-server
```
```bash
docker ps
docker exec cdad70ccebaf date
docker exec --interactive --tty cdad70ccebaf bash
```
```txt
CTRL + D
```