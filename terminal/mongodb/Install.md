```{bash}
npm install -g m
m latest
```
```bash
git clone https://github.com/aheckmann/m.git && cd m && make install
```
```bash
cd ..
mkdir mongodbessentials
cd mongodbessentials
mkdir mongod_only
mongod --dbpath mongod_only
```
```bash
mongosh
```
```mongosh
show databases
db.test.insertOne({"Hello": "world"})
```