String, integer, decimal, boolean, date(new Date("2023-10-22T00:00:00")), currentDate(new Date()), null, array, nested documents
```mongosh
db.students.insertOne({
    name: "String", 
    age: 32, 
    gpa: 2.8, 
    fullTime: false, 
    registerDate: new Date(),
    gradutionDate: null,
    courses: ["Biology", "Chemistry", "Calculus"],
    address: {
        street: "123 Fake St.",
        city: "Bikini Bottom",
        zip: 12345
    }
})
```