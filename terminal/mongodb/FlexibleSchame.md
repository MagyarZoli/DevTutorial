```mongosh
db.runCommand({collMod:"movies", validator:{$jsonSchema:{bsonType:"object", required:["title", director"], properties:{tittle:{bsonType:"string"}, director:{bsonType:"string"}}}}, validationLevel:"moderate"})
db.runCommand(
    {collMod:"movies",
    validator:
        {$jsonSchema:
            {bsonType:"object",
            required:
                ["title", director"],
            properties:
                {tittle:
                    {bsonType:"string"},
                director:
                    {bsonType:"string"}
                }
            }
        }
    ,
    validationLevel:"moderate"
    }
)
```
```{mongosh}
db.movies.isert({title:"test"})
```