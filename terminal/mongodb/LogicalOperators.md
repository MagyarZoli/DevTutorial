```mongosh
db.students.find({$and:[{fullTime:true}, {age:{$lte:22}}]})
db.students.find({$or:[{fullTime:true}, {age:{$lte:22}}]})
db.students.find({$nor:[{fullTime:true}, {age:{$lte:22}}]})
```
```mongosh
db.students.find({age:{$lt:30}})
db.students.find({age:{$not:{$gte:30}}})
```