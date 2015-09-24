select * from emp;
select * from dept;
select count(*) from city; -- totalItem
select * from country;
select * from countrylanguage;

select * from city where countrycode=null

'KOR 의 City' 정보를 출력하세요

select IndepYear,HeadOfState,Population from country where Code = 'KOR';


-- char(10) 255max
-- varchar(10) 255max
-- longvarchar(1000)  -> orcle ==> long, mysql ==> text, mediuntext
-- clob -> oracle ==> clob, mysql ==> longtext

-- numeric(10, 2)
-- decimal(10, 2)

-- Timestamp (날짜, 시간) -> oracle ==> date, mysql ==> datetime
-- Date (날짜) 
-- Time (시간)

-- bLob > oracle ==> blob, mysql ==> blob, mediunblob, longblob

drop table dept;
create table dept (
    deptno numeric(2) not null,
	dname varchar(14),
	loc varchar(13),
	constraint pk_dept primary key (deptno)
) engine=InnoDB default charset=utf8;

--emp
drop table emp;
create table emp (
	empno numeric(4) not null,
	ename varchar(10),
	job varchar(9),
	mgr numeric(4),
	hiredate datetime,
	sal numeric(7,2),
	comm numeric(7,2),
	deptno numeric(2),
	constraint pk_emp primary key (empno),
	constraint fk_deptno foreign key (deptno) references dept(deptno)	
) engine=InnoDB default charset=utf8;


-- bouns
drop table bonus;
create table bonus(
	ename varchar(10)	,
	job varchar(9)  ,
	sal numeric,
	comm numeric
	) engine=InnoDB default charset=utf8;
	
-- salgrade
drop table salgrade;
create table salgrade ( 
	grade numeric,
	losal numeric,
	hisal numeric 
) engine=InnoDB default charset=utf8;


insert into emp
(
	empno,
	ename,
	job
)
 values
(
	1001,
	'왜안되',
	'test'
);

select * 
	from city 
	limit 0, 10; 

-- totalItem
select count(*) from city; 


-- limit start, count ==> start 0, 1, 2 ...
-- ? start ==> firstItem - 1
-- ? count ==> lastItem - firstItem + 1

-- 1page 1 - 10   == > DB : 1page 0 - 9
-- 2page 11 - 20  == > DB : 2page 10 - 19

-- 1page
select *
	from city
	limit 0, 10;
	
-- 2page
select *
	from city
	limit 10, 10;

--
--Member Table 생성
--email 	xxx@xxx.com (regex)
--password	영문 and 숫자 and 6 자리 이상 and 3 자리 이상 반복
--			암호화(encryption) => MD5, SHA-256
--
	
drop table member;
create table member (
	id			int not null auto_increment,
	email		varchar(30) not null,
	password 	varchar(64) not null,
	name		varchar(12) not null,
	regdate		timestamp not null,
	constraint member_pk primary key (id, email),
	constraint member_email_uq unique (email),
	constraint member_id_uq unique (id)
);

alter table member auto_increment=1000;

select * from member;

insert into member
(email, password, name, regdate)
values
('xxx2', 'yyyy', 'zzz', '2015/08/12');

select last_insert_id();


--id generator

select * from id_generator;

drop table id_generator;
create table id_generator (
	name		varchar(20) not null primary key,
	nextval		numeric(10) not null,
	incval		numeric(5) not null
);

insert into id_generator
(name, nextval, incval)
values
('memberId', 10000, 100);


select * from member2;

drop table member2;
create table member2 (
	id			int not null auto_increment,
	email		varchar(30) not null,
	password 	varchar(64) not null,
	name		varchar(12) not null,
	regdate		timestamp not null,
	constraint member2_pk primary key (id, email),
	constraint member2_email_uq unique (email),
	constraint member2_id_uq unique (id)
);

