create database test;

use test;

DROP TABLE t_member;
-- 회원 테이블 생성
CREATE TABLE t_member(
    id CHAR(20) primary key,
    pwd CHAR(10),
    name CHAR(50),
    email CHAR(50),
    joinDate DATE default now()
);

--회원 정보 추가
INSERT INTO t_member
VALUES('hong', '1212', '홍길동', 'hong@gmail.com', now());

INSERT INTO t_member
VALUES('lee', '1212', '이순신', 'lee@test.com', now());

INSERT INTO t_member
VALUES('kim', '1212', '김유신', 'kim@jweb.com', now());
COMMIT;

SELECT * FROM t_member;

create sequence seq_board;


-- now()가 사용된 경우는 실행의 시작값과 끝 값이 동일한 값을 반환 
-- sysdate()는 동일 SQL문장내에서 호출되는 시점에 따라 결과값을 반환
create table tbl_board(
	bno int(10),
	title char(200) not null,
	content text not null,
	writer char(50) not null,
	regdate date default sysdate(),
	updatedate date default sysdate()
);

alter table tbl_board add constraint pk_board primary key (bno);

insert into tbl_board (bno, title, content, writer) 
values (nextval(seq_board), '테스트 제목','테스트 내용','user00');

select * from tbl_board;

create table tbl_reply(
	rno int(10),
	bno int(10),
	reply text not null,
	replyer char(50) not null,
	replyDate date default sysdate(),
	updateDate date default sysdate()
);

create sequence seq_reply;

alter table tbl_reply add constraint pk_reply primary key (rno);

alter table tbl_reply add constraint fk_reply_board 
foreign key (bno) references tbl_board (bno);


commit;