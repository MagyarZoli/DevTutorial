```mongosh
db.students.deleteOne({name:"Larry"})
db.students.deleteMany({fullTime:false})
db.students.deleteMany({registerDate:{$exists:false}})
```