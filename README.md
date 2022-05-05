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
docker run -d --name=nacos -p 8848:8848 -e PREFER_HOST_MODE=hostname -e MODE=standalone nacos/nacos-server:1.4.2
```

## 4. 安装MinIO对象存储服务器
```bash
# 账号为minio，密码为12345678，API端口为9100，控制台端口为9101，挂载目录为D/minio/data
docker run -d --name=minio -e "MINIO_ACCESS_KEY=minio" -e "MINIO_SECRET_KEY=12345678" -p 9100:9100 -p 9101:9101  -v /D/minio/data:/data minio/minio server /data --address ":9100" --console-address ":9101" 
```
