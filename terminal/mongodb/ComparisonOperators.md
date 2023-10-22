$ne != $lt < $lte <= $gt > $gte >= 
```mongosh
db.students.find({name:{$ne:"Spongebob"}})
db.students.find({age:{$lt:20}})
db.students.find({gpa:{$gte:3, $lte:4}})
db.students.find({name:{$in:["Spongebob", "Patric", "Sandy"]}})
db.students.find({name:{$nin:["Spongebob", "Patric", "Sandy"]}})
```