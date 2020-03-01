# service deploy
## 1.create network `service_net`

docker network create service_net --driver bridge

## 2.run mysql
docker run -it \
    --name mysql \
    --restart=always \
    --network service_net \
    -p 3306:3306 \
    -v ~/software/mysql/conf/my.cnf:/etc/mysql/my.cnf \
    -v ~/software/mysql/logs:/var/log \
    -v ~/software/mysql/data:/var/lib/mysql \
    -e MYSQL_ROOT_PASSWORD=Admin@1234 \
    -d mysql:5.7.25 \
    --character-set-server=utf8mb4 \
    --collation-server=utf8mb4_unicode_ci

## 3.run server
docker run -t -d -p 8081:8081 \
    --restart=always \
    --name java-web-template \ 
    --network service_net \ 
    java-web-template

## 4. run jenkins in docker
docker run --name jenkins -d -it --privileged --group-add root \
  	-v /var/run/docker.sock:/var/run/docker.sock \
  	-v $(which docker):/bin/docker \
  	-v "$HOME":/home \
	-p 8080:8080 \
	-p 50000:50000 \
	-v ~/software/jenkins_home:/var/jenkins_home\
	--restart=always \
	jenkins/jenkins:lts