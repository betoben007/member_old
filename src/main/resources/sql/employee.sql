mvn install:install-file -Dfile=ojdbc6.jar -DartifactId=ojdbc6 -DgroupId=com.oracle -Dversion=11.2.0 -Dpackaging=jar

select * from dept;

select * from emp;
select * from BONUS;

--
-- inner join1
select dept.deptno, dept.dname, emp.ename, emp.hiredate
  from dept inner join emp
    on dept.deptno = emp.deptno
	order by dept.deptno asc;
    
    
-- inner join2
select *
  from dept d, emp e
 where d.deptno = e.deptno;
 
-- left outer join
select dept.deptno, dept.dname, emp.ename, emp.hiredate
 from dept left outer join emp
 on dept.deptno = emp.deptno
 where dept.deptno >= 30
 order by dept.deptno asc;
 
 -- rigth outerjoin
select dept.deptno, dept.dname, emp.ename, emp.hiredate
  from dept right outer join emp
  on dept.deptno = emp.deptno
  order by dept.deptno asc;
 
 select * from emp;
 
 insert into EMP
 	(empno, ename, job, deptno)
 	values (8000, '홍길동', 'developer', 80);
 	
select * from emp;

select * from dept;

delete emp where empno >= 7600 and empno <= 7200

-- 1. emp에 직원을 추가
-- empno = 8000, ename = 홍길동, job = developer
-- deptno = 80, dname = 총무부, dloc = 서울

-- 2. dept 정보 수정
-- deptno = 20 이면 dname = 개발부, loc 부산

update dept set dname = '개발부', loc = '부산' 
  where deptno = 20;

-- 3. 직원 정보삭제
-- empno >= 7300 and empno <= 7600

delete emp where empno >=7300 and empno <= 7600;

-- 4. 부서별 직원정보 출력(단, 모든 부서 출력)
select *
  from dept d inner join emp e
  on d.deptno = e.deptno
  order by d.deptno asc;
  
 commit
 rollback
 insert into emp
(
	empno,
	ename,
	job,
	mgr,
	hiredate,
	sal,
	deptno
)
 values
(
	1001,
	'홍길동3',
	'deve''x''',
	20,
	null,
	300.2,
	10	
);



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

select * from city;


//city
drop table city;

create table city (
  id 			 numeric(11) 	not null ,
  name			 char(35) 		default '',
  countrycode	 char(3) 		default '',
  district 		 char(20) 		default '',
  population	 numeric(11) 	default 0,
  constraint pk_city primary key (id),
  constraint fk_country foreign key (countrycode) references country(code)
);


//Country
drop table  country;
create table country (
  code 				char(3) 		default '',
  name 				char(52) 		default '',
  continent 		char(20) 		default 'Asia',
  region 			char(26) 		default '',
  surfacearea 		numeric(10,2) 	default '0.00',
  indepyear 		numeric(6) 		default null,
  population 		numeric(11) 	default '0',
  lifeexpectancy 	numeric(3,1) 	default null,
  gnp 				numeric(10,2) 	default null,
  gnpold 			numeric(10,2) 	default null,
  localname 		char(45) 		default '',
  governmentform 	char(45) 		default '',
  headofstate 		char(60) 		default null,
  capital 			numeric(11) 	default null,
  code2 			char(2) 		default '',
  constraint ck_continent check (continent in ('Asia','Europe','North America','Africa','Oceania','Antarctica','South America')),
  constraint pk_country primary key (code)
);

select * from countrylanguage;



drop table countrylanguage;

create table countrylanguage (
  countrycode char(3) 		default '',
  language 	  char(30) 		default '',
  isofficial  char(1) 		default 'f',
  percentage  numeric(4,1) 	default '0.0',
  constraint ck_isofficial  check (isofficial in ('t', 'f')),
  constraint pk_countrylanguage primary key (countrycode,language)
);

create table filelist (
	fname 			varchar(50) 	primary key,
	flength 		numeric(10),
	flast_modified	date,
	image			blob
);

select count(*) from filelist;

delete from dept where deptno = 19;

select * from dept;

--
--Member Table 생성
--

drop table member;
create table member (
	id			int not null,
	email		varchar(30) not null,
	password 	varchar(64) not null,
	name		varchar(12) not null,
	regdate		timestamp not null,
	constraint member_pk primary key (id, email),
	constraint member_email_uq unique (email),
	constraint member_id_uq unique (id)
);


select * from member;

--
--채번
drop sequence member_id_seq;
create sequence member_id_seq
start with 1000;

select member_id_seq.nextval from dual;
select member_id_seq.currval from dual;

insert into member
(id, email, password, name, regdate)
values
(1004 , 'xxx@xxx.com', 'aaa', 'z''zz', '2015/08/11');



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


drop table member2;
create table member2 (
	id			int not null,
	email		varchar(30) not null,
	password 	varchar(64) not null,
	name		varchar(12) not null,
	regdate		timestamp not null,
	constraint member2_pk primary key (id, email),
	constraint member2_email_uq unique (email),
	constraint member2_id_uq unique (id)
);

select * from member2;
