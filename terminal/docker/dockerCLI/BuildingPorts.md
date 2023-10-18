```bash
cd ..
docker build -t our-web-server -f web-server.Dockerfile .
docker run -d --name our-web-server our-web-server
docker logs our-web-server
docker rm -f our-web-server
```
```bash
cd ..
docker run -d --name our-web-server -p 5001:5000 our-web-server
docker logs our-web-server
```