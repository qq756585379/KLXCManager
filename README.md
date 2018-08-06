

```
CREATE TABLE `t_leader_info` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned DEFAULT NULL,
  `create_id` int(10) unsigned DEFAULT NULL,
  `city` varchar(32) DEFAULT NULL,
  `area` varchar(32) DEFAULT NULL,
  `user_name` varchar(64) DEFAULT NULL,
  `user_phone` varchar(64) DEFAULT NULL,
  `create_time` varchar(0) DEFAULT NULL,
  `update_time` varchar(0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `xc_mng_banner` (
  `id` int(11) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `create_time` varchar(0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `wx_sign_up_info` (
  `id` int(11) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `telephone` varchar(64) DEFAULT NULL,
  `lesson` varchar(64) DEFAULT NULL,
  `city_name` varchar(64) DEFAULT NULL,
  `area_name` varchar(64) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `wx_join_up_info` (
  `id` int(11) NOT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```