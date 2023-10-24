```{bash}
mvn compile exec:java \
 -Dexec.mainClass="org.example.Main" \
 -Dmongodb.uri="mongodb+srv://<user>:<password>@<cluster>.gd7v733.mongodb.net/?retryWrites=true&w=majority"
```