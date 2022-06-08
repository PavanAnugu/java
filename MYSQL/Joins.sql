use c2110;
#inner join
select customer_table.customername,order_table.orderdate from customer_table inner join 
order_table on customer_table.customerid = order_table.customerid;
#or
select customername,orderdate from customer_table inner join 
order_table on customer_table.customerid = order_table.customerid;
#or
select customername,orderdate from customer_table inner join order_table where
customer_table.customerid = order_table.customerid;
#leftouterjoin
select customer_table.customerid,customername,orderdate from customer_table left join
order_table on customer_table.customerid = order_table.customerid;
#rightouterjoin
select customer_table.customerid,customername,orderdate from customer_table right join
order_table on customer_table.customerid = order_table.customerid;
#foreign key
alter table order_table add foreign key(customerid) references customer_table(customerid); 
#foreignkey while table creation
create table orders(
order_id int primary key,
orderdate date,
quantity int,
price double(5,2),
customerid int,foreign key(customerid) references customer_table(customerid)
);
#cross join
select * from customer_table cross join order_table;
#self join
select S1.sname,S1.saddr from student_details S1 inner join student_details S2
on S1.saddr = S2.saddr and S1.id<>S2.id order by S1.id;