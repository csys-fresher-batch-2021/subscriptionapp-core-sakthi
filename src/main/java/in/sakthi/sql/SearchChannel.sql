create table searchChannel (channelName varchar(40),channelId int,planName varchar(40),price int,validity varchar(40));
insert into searchChannel(channelName,channelId,planName,price,validity) values ('Hotstar',101,'Monthly',200,'30');
insert into searchChannel(channelName,channelId,planName,price,validity) values ('Hotstar Premium',102,'Yearly',1000,'365');
insert into searchChannel(channelName,channelId,planName,price,validity) values ('Hotstar VIP',103,'Monthly',500,'30');
select channelName,channelId,planName,price,validity from searchChannel;