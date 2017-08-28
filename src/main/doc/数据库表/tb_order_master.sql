create table tb_order_master(
	order_id varchar(32) not null,
	buyer_name varchar(32) not null comment '买家姓名',
	buyer_phone varchar(32) not null comment '买家电话',
	buyer_address varchar(256) not null comment '买家地址',
	buyer_open_id varchar(64) not null comment '买家微信openId',
	order_amount decimal(8,2) not null default 0 comment '订单总金额',
	order_status int not null default 0 comment '订单状态 0:新订单 1:完成订单 2:失败订单',
	pay_status int not null default 0 comment '支付状态 0:未支付 1:已支付 2:支付失败',
	create_time timestamp not null default current_timestamp comment '创建时间',
	update_time timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
	primary key (order_id) ,
	key idx_buyer_open_id (buyer_open_id)
) comment '订单表';