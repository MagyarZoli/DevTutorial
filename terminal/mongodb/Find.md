.find({query}, {projection})
```mongosh
db.students.find({name:"Spongebob"})
db.students.find({}, {name:true})
db.students.find({}, {_id:false, name:true})
```