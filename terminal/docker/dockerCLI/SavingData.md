```bash
docker run --rm --entrypoint sh ubuntu \
-c "echo 'Hello there.' > /tmp/file && cat /tmp/file"
cat /tmp/file
```
```bash
docker run --rm --entrypoint sh \
-v /tmp/container:/tmp ubuntu \
-c "echo 'Hello there.' > /tmp/file && cat /tmp/file"
cat /tmp/container/file
```
```bash
touch /tmp/change_this_file
docker run --rm --entrypoint sh \
-v /tmp/change_this_file:/tmp/file ubuntu \
-c "echo 'Hello there.' > /tmp/file && cat /tmp/file"
cat /tmp/change_this_file
```
```bash
docker run --rm --entrypoint sh \
-v /tmp/this_file_does_not_exits:/tmp/file ubuntu \
-c "echo 'Hello there.' > /tmp/file && cat /tmp/file"
cat /tmp/this_file_does_not_exits
```
```bash

```

