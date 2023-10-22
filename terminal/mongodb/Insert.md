```mongosh
use school
db.createCollection("students")
db.students.insertOne({name:"Spongebob", age:30, gpa:3.2})
db.students.insertMany([{name:"Patrick", age:38, gpq:1.5}, {name:"Sandy", age:27, gpq:4.0}, {name:"Gary", age:18, gpq:2.5}])
db.students.find()
```