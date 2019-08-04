create table tblSpringMember ( --회원
    id varchar2(30) primary key,
    point number not null
);

create table tblSpringNote ( --게시판
    seq number primary key,
    id varchar2(30) not null references tblSpringMember(id),
    content varchar2(100) not null
);

-- 정책
-- 글쓰기(+10포인트)


insert into tblSpringMember values ('hong', 1000);
commit

create sequence note_seq;

select * from tblSpringMember;
select * from tblSpringNote;






-- 보조업무 + 로그 테이블
create table tblSpringLog (
    seq number primary key, --PK
    url varchar2(200) not null, --접속 페이지
    id varchar2(30) null, --접속 회원 아이디(null - 익명)
    regdate date default sysdate not null
);

create sequence log_seq;


select * from tblSpringLog;





















