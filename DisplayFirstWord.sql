-- create database infinite;
-- use infinite;
Create Table EmployInfinite
(
    Empno int AUTO_INCREMENT,
    Name varchar(50), 
    Dept varchar(30),
    Desig varchar(30),
    Basic INT,
    primary key(Empno)
);
select *from EmployInfinite;
Insert into EmployInfinite(Name,Dept,Desig,Basic)
 values
('kiran kumar kailasam','java','developer',42233);

Insert into EmployInfinite(Name,Dept,Desig,Basic) values
('Vishnu Vardhan Reddy','dotnet','programmer',42133);

Insert into EmployInfinite(Name,Dept,Desig,Basic) values
('Ram Kishan','java','developer',82233);

Insert into EmployInfinite(Name,Dept,Desig,Basic) values
('Kareem','dotnet','programmer',52234);


Insert into EmployInfinite(Name,Dept,Desig,Basic) values
('Sheik Sulthan Mohammad','dotnet','developer',42555);



-- 1 query here answer 
-- select *from EmployInfinite where empno=1;
select substring_index(Name,' ',1) as FirstWord from EmployInfinite;
-- --another answer is 
select * from EmployInfinite
where length(name)-length(replace(name,' ',''))=0;

-- 2 query here answer
-- Display all details of Employ tabble who have 2 part name (ex 2 words) (ram kishan)
select substring_index(Name,' ',2) as LastTwoWord from EmployInfinite;

-- another answer of sir is 
select *from EmployInfinite
where length(name)-length(replace(name,' ',''))=1;

-- 3 query here answer;
select substring_index(Name,' ',3) as wholeName from EmployInfinite;

-- another answer of sir is 

select *from EmployInfinite
where length(name)-length(replace(name,' ',''))=2;




