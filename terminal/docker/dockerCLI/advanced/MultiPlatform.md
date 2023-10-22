```bash
uname -a 
docker run --rm alpine uname -a
```
```{bash}
docker run --rm --platform linux/arm64 alpine uname -a
```
```bash
docker run --privileged --rm aptman/qus --static -- --path arm
```
```bash
limactl Shell docker
sudo apt -y update
sudo apt -y intall qemu qemu-system-misc qemu-user-static qemu-user binfmt-support
exit
docker run --rm --platform linux/arm alpine uname 
docker run --rm --platform linux/arm alpine uname -a
```
```bash
docker build -t my-image:latest-x86 --pull .
docker build -t my-image:latest-arm --platform linux/arm --pull .
```
```bash
docker run --rm my-image:latest-arm
```