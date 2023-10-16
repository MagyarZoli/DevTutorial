```bash
docker --version
```
```bash
docker pull postgres
```
```bash
mkdir -p ~/srv/postgres
```
```bash
docker run --rm --name lil-postgres -e POSTGRES_PASSWORD=Password -d \
-v $HOME/srv/postgres:/var/lib/postgresql/data -p 5432:5432 postgres
```