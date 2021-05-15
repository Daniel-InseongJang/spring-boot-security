나는 간단하게 테스트 하기위해 도커에 mysql 을 설치했다.
0. docker pull mysql:5.7     -- 버전은 상관없음.
1. docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root --name test mysql:5.7 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
3. database :  db-1 생성
4.  테이블 생성
CREATE TABLE `user` (
  `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '고유값',
  `user_key` varchar(10) NOT NULL COMMENT 'user_test_key',
  `regist_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user'

CREATE TABLE `orders` (
  `orders_id` bigint NOT NULL AUTO_INCREMENT COMMENT '고유값',
  `price` double NOT NULL COMMENT '가격',
  `regist_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일',
  PRIMARY KEY (`orders_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='orders'

