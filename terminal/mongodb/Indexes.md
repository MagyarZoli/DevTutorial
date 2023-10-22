```mongosh
db.students.find({name:"Larry"})
        .explain("executionsStats")
```
```mongosh
db.students.creatIndex({name: 1})
db.students.find({name:"Larry"})
        .explain("executionsStats")
```
```mongosh
db.students.getIndexes()
db.students.dropIndex("name_1")
db.students.getIndexes()
```