```mongosh
use blog
session = db.getMongo().startSession({readPreferenc:{node:"primary"}})
session.startTransaction()
session.getDatabase("blog").authors.updateMany({}, {$set:{message: "Transaction occured}})
session.commitTransaction()
db.authors.find()
```