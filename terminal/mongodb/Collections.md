```mongosh
show collections
db.createCollection("teachers", {capped:true, size:10_000_000, max:100}, {autoIndexId:false})
show collections
db.createCollection("courses")
db.coursed.drop()
```