```mongosh
use sample_data
db.inventory.findOne()
db.inventory.aggregate([{$group:{_id:"$source"}}])
db.inventory.aggregate([{$group:{_id:"$source", count:{$sum: 1}}}])
db.inventory.aggregate([{$group:{_id:"$source", count:{$sum: 1}, item:{$push:"name"}}}])
db.inventory.aggregate([{$group:{_id:"$source", count:{$sum: 1}, item:{$push:"name"}, avg_price:{$avg:"price"}}}])
db.inventory.aggregate(
    [
        {$group:
            {_id:"$source",
             count:{$sum: 1},
             item:{$push:"name"},
             avg_price:{$avg:"price"}
            }
        }
    ]
)
```
```mongosh
db.inventory.aggregate([{$bucket:{groupBy:"$year", boundaries:[1980, 1990, 2000, 2010, 2020], default:"Other"}}])
db.inventory.aggregate([{$bucket:{groupBy:"$year", boundaries:[1980, 1990, 2000, 2010, 2020], default:"Other", output:{count:{$sum:1}, cars:{$push:{name:"$name", model: "$model"}}}}}])
db.inventory.aggregate(
    [
        {$bucket:
            {groupBy:"$year",
             boundaries:[1980, 1990, 2000, 2010, 2020],
             default:"Other",
             output:
                {count:
                 {$sum:1},
                 cars:
                    {$push:
                        {name:"$name",
                         model:"$model"
                        }
                    }
                }
            }
        }
    ]
)
db.inventory.aggregate([{$bucketAuto:{groupBy:"$year", buckets:5}}])
```
```mongosh
db.inventory.aggregate([{$unwind:"$variations"}])
db.inventory.aggregate([{$unwind:"$variations"}, {$mathc:{"variations.variation":"Purple"}}])
db.inventory.aggregate([{$mathc:{"variations.variation":"Purple"}}, {$unwind:"$variations"}, {$mathc:{"variations.variation":"Purple"}}])
```
```mongosh
db.inventory.aggregate([{$mathc:{"variations.variation":"Purple"}}, {$unwind:"$variations"}, {$mathc:{"variations.variation":"Purple"}}, {$out:{db:"sample_date", coll:"purple"}}])
show collections
db.purple.find()
```
```mongosh
db.inventory.aggregate([{$mathc:{"variations.variation":"Purple"}}, {$unwind:"$variations"}, {$mathc:{"variations.variation":"Purple"}}, {$merge:{into:"purple", on:"_id", whenMatched:"keepEcisting", whenNotMatched:"insert"}}])
db.inventory.aggregate(
    [
        {$mathc:
            {"variations.variation":"Purple"}
        },
        {$unwind:"$variations"},
        {$mathc:
            {"variations.variation":"Purple"}
        },
        {$merge:
            {into:"purple",
             on:"_id",
             whenMatched:"keepEcisting",
             whenNotMatched:"insert"
            }
        }
    ]
)
```
```mongosh
db.movies.findOne()
db.movies.aggregate([{$project:{title:1, actor:{$function:{body:"function(actors) { return actors.sort(); }", args:["$actors"], lang:"js"}}}}])
db.movies.aggregate(
    [
        {$project:
            {title:1,
             actor:
                {$function:
                    {body:"
                        function(actors) {
                            return actors.sort(); 
                        }
                     ",
                     args:["$actors"],
                     lang:"js"
                    }
                }
            }
        }
    ]
)
```
```mongosh
db.orders.aggregate([{$lookup:{from:"inventory", localField:"car_id", foreignField:"_id". as:"car_id"}}])
```