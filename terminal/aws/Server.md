```bash
ls -ltr server.pem
```
```bash
chmod 600 server.pem
ls -ltr server.pem
ssh -i server.pem ubuntu@ec2-54-144-173-143.compute-1.amazonaws.com
```
```bash
sudo su -
```
```bash
vim install.sh
```
```txt
i
past jenkins-server-automated-installation.sh
ESC
:w
:q
```
```bash
cat install.sh
source install.sh
```