create table tb_product_category(
	category_id int not null auto_increment primary key,
	category_name varchar(64) not null comment '商品类目名称',
	category_type int not null comment '商品类目编号',
	create_time timestamp not null default current_timestamp comment '创建时间',
	update_time timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
	unique key uqe_category_type( category_type )
) comment '商品类目表';