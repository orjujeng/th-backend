#docker cmd for mysql only for local dev env
docker run --name mysql_dev_env -e MYSQL_ROOT_PASSWORD=123456 -d -v /Users/orjujeng/IdeaProjects/mysql_dev_env:/var/lib/mysql -p 3306:3306 --restart always mysql:8.0.39
SET GLOBAL time_zone = 'Asia/Shanghai';


#docker cmd for redis
docker run --name redis_dev_env -d -p 6379:6379 --restart always redis:7.2-alpine