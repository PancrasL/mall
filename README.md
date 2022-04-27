# 环境安装
## 1. 安装MySQL
```bash
docker run --name=mysql57 -p 3306:3306 \
 -e MYSQL_ROOT_PASSWORD=123456 \
 -v /D/mysql57/data:/var/lib/mysql \
 -v /D/mysql57/log:/var/log/mysql \
 -v /D/mysql57/conf:/etc/mysql \
 -d mysql:5.7
```

## 2. 安装Redis
```bash
docker run -d --name=redis6 -p 6379:6379 redis:6.2.2
```
## 3. 启动nacos
```bash
docker run -d --name nacos -p 8848:8848 -e PREFER_HOST_MODE=hostname -e MODE=standalone nacos/nacos-server:1.4.2
```
