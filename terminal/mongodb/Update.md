.updateOne(filter, update)
```mongosh
db.students.updateOne({name:"Spongebob"}, {$set:{fullTime: true}})
db.students.find({name:"Spongebob"})
db.students.updateOne({_id: ObjectId("65354ab2a17a3fe1c9a509e2")}, {$set:{fullTime:false}})
db.students.find({name:"Spongebob"})
db.students.updateOne({_id: ObjectId("65354ab2a17a3fe1c9a509e2")}, {$unset:{fullTime:""}})
db.students.find({name:"Spongebob"})
```
```mongosh
db.students.updateMany({}, {$set:{fullTime:false}})
db.students.find()
db.students.updateMany({name:"Gary"}, {$unset:{fullTime:""}})
db.students.find()
db.students.updateMany({fullTime:{$exists:false}}, {$set:{fullTime:true}})
```