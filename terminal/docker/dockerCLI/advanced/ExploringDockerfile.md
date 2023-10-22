```bash
docker image build -t my-image .
```
```bash
docker run --rm my-image
docker run --rm my-image --argument
```
```bash
docker image inspect my-image
```
```bash
docker run --rm my-image curl example.com
```
```{bash}
docker image build -t my-image --build-arg curl_bin=invalid .
```
```bash
docker run --rm --entrypoint sh my-image -c 'echo $curl_bin'
```


