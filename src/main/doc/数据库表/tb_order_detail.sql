create table tb_order_detail(
	detail_id varchar(32) not null,
	order_id varchar(32) not null comment '订单ID',
	product_id varchar(32) not null comment '商品数量',
	product_quantity int not null comment '商品数量',
	create_time timestamp not null default current_timestamp comment '创建时间',
	update_time timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
	primary key (detail_id) ,
	key idx_order_id (order_id)
) comment '订单详情表';