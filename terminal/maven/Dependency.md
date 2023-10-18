```bash
cd ..
cd ..
mvn clean verify
```
```bash
cd ..
cd ..
mvn dependency:analyze
```
```bash
cd ..
cd ..
mvn dependency:resolve
```
```bash
cd ..
cd ..
mvn dependency:tree
```
```bash
cd ..
cd ..
mvn clean package
jar tf target/JavaTutorial-1.0-SNAPSHOT.jar
```
```{xml}
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <version>${shade.version}</version>
    <configuration>
        <transformers>
            <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                <mainClass>org.example.maven.Main</mainClass>
            </transformer>
        </transformers>
    </configuration>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```
```bash
cd ..
cd ..
mvn clean package
ls -la target
jar tf target/JavaTutorial-1.0-SNAPSHOT.jar
java -jar target/JavaTutorial-1.0-SNAPSHOT.jar
```