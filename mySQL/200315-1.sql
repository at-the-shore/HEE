use school;

create table t_major (
	m_code char(3) primary key,		-- 학과번호
    m_namekor varchar(20) not null,	-- 학과명(한글)
    m_nameeng varchar(20) not null, -- 학과명(영문)
    m_status char(1) default 'A',	-- 현재 상태코드 
    m_regdate datetime default now()-- 등록일자
 );
 
 create table t_students (
	s_num varchar(8) primary key, -- 학번으로 기본키역할
    s_namekor varchar(50) not null, -- 학생이름 한글
    s_nameeng varchar(50) not null, -- 학생이름 영문 
    s_cellphone varchar(13) not null, -- 휴대폰번호
    s_homephone varchar(13) not null, -- 보호자 전화번호
    s_email varchar(50) not null,  -- 이메일주소
    s_zipcode char(5) not null, -- 우편번호
    s_addr1 varchar(50) not null, -- 주소1
    s_addr2 varchar(50) not null, -- 주소2
    m_code varchar(10), 		-- 학과코드
    s_status char(1) default'A', -- 현재 상태코드
    s_regdate datetime default now(), -- 등록일자
    constraint foreign key(m_code) references t_major(m_code)
);

create table t_lecture (
	l_code char(4) primary key,  -- 과목코드
    l_namekor varchar(20) not null,  -- 과목명한글
    l_nameeng varchar(20) not null,  -- 과목명영문
    l_time int default 0, -- 전체 수업시간
    l_desc text not null  -- 과목소개
);

create table t_gradescore (
	gs_code int auto_increment primary key, -- 자동증가값
    s_num varchar(8), -- 학번
    l_code char(4) , -- 과목코드
    gs_term char(5) not null, -- 연도 및 학기
    gs_midscore int default 0,  -- 중간고사 점수
    gs_finalscore int default 0, -- 기말고사 점수
    gs_grade float default 0.0,  -- 학점
    constraint foreign key(s_num) references t_students(s_num)
);

-- 여기부터 -- 

alter table t_gradescore alter column gs_grade set default 0.0;
-- alter table t_students add column m_code varchar(10);
alter table t_students add constraint foreign key (m_code) references t_major(m_code);

insert into t_major (m_code,m_namekor,m_nameeng)
	values('101','컴퓨터 공학과','Computer Technology');
insert into t_major (m_code,m_namekor,m_nameeng)
	values('102','전자 공학과','Electric Technology');

select * from t_major;
-- 
insert into t_students (s_num,s_namekor,s_nameeng,s_cellphone,s_homephone,s_email,s_zipcode,s_addr1,s_addr2)
	values('20123456','홍길동','Hong,gil dong','010-1234-5678','010-9876-5432','hong@test.com','12345','서울시 강남구 삼성동','123-45');
insert into t_students (s_num,s_namekor,s_nameeng,s_cellphone,s_homephone,s_email,s_zipcode,s_addr1,s_addr2,m_code)
	values('20123457','전우치','Jeon,woo chi','010-1234-5679','010-9876-5433','jeon@test.com','12346','서울시 강남구 삼성1동','102동 123-45','102');
insert into t_students (s_num,s_namekor,s_nameeng,s_cellphone,s_homephone,s_email,s_zipcode,s_addr1,s_addr2,m_code)
	values('20123458','임꺽정','kuk,jung lim','010-1223-5555','010-9999-8773','limlim@test.com','12346','서울시 강남구 삼성1동','102동 123-45','102');    

select * from t_students;

-- 두학과 모두 한글명에서 '과'라는 글자를 제외
select * from t_major where m_code = '101';
update t_major set m_namekor = '컴퓨터 공학' where m_code = '101';
update t_major set m_namekor = '전자 공학' where m_code = '102';

--
insert into t_lecture (l_code,l_namekor,l_nameeng,l_time,l_desc)
	values('1001','전자계산기 구조1','Computer structure1','60','꼭 한번 공부해 볼것');
insert into t_lecture (l_code,l_namekor,l_nameeng,l_time,l_desc)
	values('1002','전자계산기 구조2','Computer structure2','60','꼭 한번 공부해 볼것');
--

insert into t_gradescore(s_num ,l_code ,gs_semester ,gs_attendscore ,gs_midscore ,gs_finalscore ,gs_reportscore)
	values ('20123456','1001','20191',75,65,70,73);
insert into t_gradescore(s_num ,l_code ,gs_semester ,gs_attendscore ,gs_midscore ,gs_finalscore ,gs_reportscore)
	values ('20123457','1002','20192',70,65,72,70);
--
select * from t_students, t_gradescore; 
select * from t_major;
select * from t_students;
select * from t_lecture;
--

select count(*) cnt, sum(gs_midscore) total, avg(gs_finalscore) average from t_gradescore;	-- 집계함수 쓰는법
-- as 이름-> 이름짓기(임시 컬럼명) -- as 도 생략가능

-- 2019년 1,2학기 학생들의 중간고사와 기말고사 점수의 총합과 평균을 구하시오.
select sum(gs_midscore) totalMid, sum(gs_finalscore) totalFinal,
	avg(gs_midscore) averageMid, avg(gs_finalscore) averageFinal
from t_gradescore where gs_semester = '20191' or gs_semester = '20192';

select sum(gs_midscore + gs_finalscore) total,
	sum(gs_midscore + gs_finalscore) / (count(*) *2)
from t_gradescore where gs_semester in ('20191','20192') -- 1,2학기 중간기말 총합, 총 평균
-- where gs_semester in ('20191','20192')

-- 2019년 각 학기별 중간고사의 점수 총합과 평균을 구하시오.
-- 보여줄 데이터는 학기, 총합, 평균의 세 가지 데이터를 추출
select gs_semester, sum(gs_midscore), avg(gs_midscore) 
from t_gradescore where left(gs_semester, 4) = '2019' -- gs_semester 왼쪽에서 4번째까지를 비교해서 2019로 시작하는 것만 출력
group by gs_semester; 

select gs_semester, sum(gs_midscore), avg(gs_midscore)
from t_gradescore where gs_semester = '20192'; -- 2학기 중간고사 총합,평균

-- 19년 1학기에 수강한 모든 과목에 대해 중간고사 점수를 5점 추가시킴
update t_gradescore set gs_midscore = 70 where gs_code = 1;
update t_gradescore set gs_midscore = gs_midscore + 5 where gs_semester = '20191';

-- 19년 2학기에 수강한 모든 과목에 대해 모든 점수를 5점 감소시킴
update t_gradescore set 
gs_attendscore = gs_attendscore -5,
gs_midscore = gs_midscore -5,
gs_finalscore = gs_finalscore - 5,
gs_reportscore = gs_reportscore -5
where gs_semester = '20192';

delete from t_gradescore where gs_code = 2;
select * from t_gradescore where gs_code = 2;
select * from t_gradescore order by gs_term desc, s_num;

select * from t_gradescore
order by gs_term desc, s_num desc 
limit 1,2;
 