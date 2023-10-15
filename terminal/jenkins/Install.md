```bash
docker --version
```
```bash
docker pull jenkins/jenkins:lts
```
```bash
docker images
```
```bash
docker run --detach --publish 8080:8080 \
--volume jenkins_home:/var/jenkins_home \
--name  jenkins jenkins/jenkins:lts
```
```bash
docker exec jenkins cat /var/jenkins_home/secrets/initialAdminPassword
```