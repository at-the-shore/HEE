use product;

-- 상품테이블 --
create table t_product_list(
	pl_id char(5) primary key,  -- 상품ID
    pl_name varchar(50) not null, -- 상품명
    pl_price int default'0', -- 가격
    sc_code char(6) not null, -- 소분류코드 
    br_code char(5) not null, -- 브랜드코드
    pl_img1 varchar(50) not null, -- 이미지1
    pl_img2 varchar(50), -- 이미지2
    pl_img3 varchar(50), -- 이미지3
    pl_desc varchar(50) not null, -- 설명
    pl_isview char(1) default'0', -- 게시여부
    pl_stock int default'0' -- 재고량
);

-- 구매 테이블 -- 
create table t_order_list(
	ol_id char(20) primary key, -- 주문번호
    ol_ismem char(1) default'Y', -- 회원여부
    ol_buyer varchar(20) not null, -- 구매자
    ol_phone varchar(13) not null, -- 전화번호
    ol_zipcode char(5) not null, -- 우편번호
    ol_addr1 varchar(50) not null, -- 주소1
    ol_addr2 varchar(50) not null, -- 주소2
    pl_id char(5) not null, -- 상품ID 
    ol_count int default'1', -- 수량
    ol_payment char(1) default'A', -- 결제수단
    ol_pay int default'0', -- 결제금액
    ol_status char(1) default'A', -- 주문상태
     constraint foreign key(pl_id) references t_product_list(pl_id)
);

insert into t_product_list (pl_id, pl_name, pl_price , sc_code ,br_code , pl_img1 , pl_desc , pl_stock) 
values ('pdt01', '좋은 상품', 150000, 'a10101', 'br001', 'pdt01.jpg', 'pdt01_d.jpg', 100); 

insert into t_product_list (pl_id, pl_name, pl_price , sc_code ,br_code , pl_img1 , pl_desc , pl_stock) 
values ('pdt02', '괜찮은 상품', 180000, 'a10101', 'br001', 'pdt02.jpg', 'pdt02_d.jpg', 150); 

insert into t_product_list (pl_id, pl_name, pl_price , sc_code ,br_code , pl_img1 , pl_desc , pl_stock) 
values ('pdt03', '비싼 상품', 350000, 'a10102', 'br002', 'pdt03.jpg', 'pdt03_d.jpg', 50); 

select * from t_product_list;

--
insert into t_order_list (ol_id, ol_buyer, ol_phone, ol_zipcode, ol_addr1, ol_addr2, pl_id, ol_count,
ol_payment, ol_pay, ol_status)
values ('20200313abcdefgh0001', 'test1', '010-1234-5678', '12345', '서울시 강남구 삼성동', '123-12', 'pdt01', '5',
'a', 750000, 'a' );

insert into t_order_list (ol_id, ol_buyer, ol_phone, ol_zipcode, ol_addr1, ol_addr2, pl_id, ol_count,
ol_payment, ol_pay, ol_status)
values ('20200313abcdefgh0002', 'test2', '010-1234-5679', '12346', '서울시 강남구 역삼동', '123-13', 'pdt02', '2',
'a', 360000, 'a' );

insert into t_order_list (ol_id, ol_buyer, ol_phone, ol_zipcode, ol_addr1, ol_addr2, pl_id, ol_count,
ol_payment, ol_pay, ol_status)
values ('20200313abcdefgh0003', 'test1', '010-1234-5678', '12345', '서울시 강남구 청담동', '123-13', 'pdt02', '4',
'a', 720000, 'a' );

insert into t_order_list (ol_id, ol_buyer, ol_phone, ol_zipcode, ol_addr1, ol_addr2, pl_id, ol_count,
ol_payment, ol_pay, ol_status)
values ('20200313abcdefgh0004', 'test2', '010-1234-5670', '12345', '서울시 강남구 신사동', '123-16', 'pdt01', '2',
'a', 300000, 'a' );

select * from t_order_list;
--

-- 상품ID, 상품명, 구매자, 구매개수
-- select p.pl_id, p.pl_name, o.ol_buyer, o.ol_count from t_product_list p, t_order_list o where p.pl_id = o.pl_id;
select p.pl_id, p.pl_name, o.ol_buyer, o.ol_count 
from t_product_list p inner join t_order_list o on p.pl_id = o.pl_id;

-- 상품Id, 상품명, 상품판매 건수, 상품판매 개수 (상품별로 묶어 작업하기) / 건수 = 레코드 개수(한 줄), 자바의 인스턴스와 비슷한 개념 
-- status 에서 f: 환불, g: 반품  의 상태값** 
select p.pl_id, p.pl_name, count(o.ol_id) ordCnt, sum(o.ol_count) pdtCnt -- (절대 비어있지 않을 PK값) 
from t_product_list p inner join t_order_list o on p.pl_id = o.pl_id
where o.ol_status <> 'f' and o.ol_status <> 'g'  -- status가 환불이나(and) 반품이 아닌 상태  '<> = !='
group by p.pl_id, p.pl_name;  -- 공통으로 묶어서 출력하는 부분 

-- 원하는 쿼리를 만들 때 말로 최대한 자세히 풀어서 써보면 좋다 










