create table tb_product_info(
	product_id varchar(32) not null primary key,
	product_name varchar(64) not null comment '商品名称',
	product_price decimal(8,2) not null comment '商品单价',
	product_stock int not null default 0 comment '商品库存',
	product_description varchar(256) comment '商品描述',
	product_icon varchar(512) comment '商品小图',
	category_type int not null comment '商品类目编号',
	create_time timestamp not null default current_timestamp comment '创建时间',
	update_time timestamp not null default current_timestamp on update current_timestamp comment '更新时间'
) comment '商品表';