--script.sql

create table tblMyBatis (
	seq number primary key,
	num number not null,
	txt varchar2(100) not null
);

create sequence mybatis_seq;

insert into tblMyBatis values (mybatis_seq.nextval, 0, '없음');
insert into tblMyBatis values (mybatis_seq.nextval, 10, '조금 있음');
insert into tblMyBatis values (mybatis_seq.nextval, 100, '많음');
insert into tblMyBatis values (mybatis_seq.nextval, 1000, '아주 많음');

commit;

select * from tblMyBatis;





