--trigger:tetikleyici

--logs tablosu
--id PK NN 
--ziyaret :integer


select * from logs;
select * from region;

--after: sonra

--region içeriğinde bir satır sildiğimde counter tablosundki veri 1 artırsın.
--2 tane yapımız olmamız lazım.
--1 Trigger function
--2 Trigger create


------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------

--1.Trigger function
create or replace Function trigger_ziyaretci()
returns trigger
language plpgsql
as
	$$
		begin
			update logs set ziyaret=ziyaret+1;
			return new;
		end;
	$$;
	
	


------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------
--2.Trigger create
create trigger trigger_sum
	after insert or update --eklemeden sonra çalışsın  --[after,before]  insert or update
 	on region --hangi tablo çalışırken ve orada trigger oluştursun
	for each row --her satı icin
	execute procedure trigger_ziyaretci(); -- olusturduğumuz trigger function 
	
--3  test

insert into region (regionid,regiondescription) values(38,'sonradan 2');

select * from region;
select * from logs;

-- Normalization
-- 1NF 2NF 3NF 
-- JDBC CRUD
-- DP: Creation : singleton DP, Builder

-------------------------------------------------------------------------------------------------------
drop trigger trigger_sum();

--------------------------------------------------------------------------------------------------------
-- region tablosunda bir satır güncellediğimde ;
-- logs tablosundaki ziyaret sutunundaki kolonu 1 azaltsın.











