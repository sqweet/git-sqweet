CREATE DATABASE AMiao
go
USE Amiao
GO
CREATE TABLE Users
(
UName nvarchar(20) not null,
UPN nvarchar(20) not null,
UPwd nvarchar(20) not null,
UQuestion nvarchar(20),
UAnswer nvarchar(20)  
)
GO
INSERT INTO Users VALUES
( N'张一','15754895301','123456',N'',N''),
( N'张二','15754895302','123456',N'',N''),
( N'张三','15754895303','123456',N'',N''),
( N'张四','15754895304','123456',N'',N'')
GO
 
SELECT * FROM Users
GO
delete from Users
 
 CREATE TABLE Visitor
(
Vid int not null,
Vage char(10) not null, 
)
INSERT INTO Visitor VALUES
(1,N'男'),
(1,N'男'),
(1,N'女枪'),
(1,N'男'),
(1,N'女')
SELECT * FROM Visitor
GO
delete from Visitor
GO
INSERT INTO Users VALUES
( N'张一','15754895301','123456',N'',N''),
( N'张二','15754895302','123456',N'',N''),
( N'张三','15754895303','123456',N'',N''),
( N'张四','15754895304','123456',N'',N'')
GO
 
SELECT * FROM Users
GO
delete from Users
 

CREATE TABLE UserDetails
(
PId char(4) not null primary key,
PName nvarchar(10) not null,
PGender nchar(10) not null,
Page nvarchar(10) NOT NULL,
PComment nvarchar(200) NOT NULL,  
PFavorite nvarchar(10)
)
GO
INSERT INTO UserDetails VALUES
 
('1001',N'张十一',N'女','14',N'','T'),
('1002',N'张十二',N'男','66',N'','T'),
('1003',N'张十三',N'女','30',N'','F'),
('1004',N'张十四',N'男','17',N'','F'),
('1005',N'张十五',N'女','67',N'','F')

go
SELECT * FROM UserDetails
delete from UserDetails
CREATE TABLE ReporterDetails
(
RId char(4) not null primary key,
RName nvarchar(10) not null,
RGender nchar(10) not null,
Rage nvarchar(10) NOT NULL,
RComment nvarchar(200) NOT NULL,  
RFavorite nvarchar(10),
Rissuance nvarchar(200),
Redit nvarchar(1000)
)
GO
INSERT INTO ReporterDetails VALUES
 
 
('1006',N'张十六',N'女','67',N'','T',N'',N''),
('1007',N'张十七',N'男','27',N'','T',N'',N''),
('1008',N'张十八',N'女','87',N'','F',N'',N''),
('1009',N'张十九',N'女','92',N'','F',N'',N''),
('1010',N'张二十',N'男','32',N'','F',N'',N'')
go
SELECT * FROM  ReporterDetails
delete from ReporterDetails

CREATE TABLE Search(
 SKeyword Nvarchar(10) not null,
 STimeSequence Nvarchar(20) not null,
 SCategory Nvarchar(20) not null
 )

CREATE TABLE  News(
 NID int not null primary key,
 Nname Nvarchar(50) not null,
 NBody Nvarchar(300) not null,
 NComment Nvarchar(300) not null
)
INSERT INTO News VALUES
('1',N'后悔药',''),
('2',N'忘忧丹',' '),
('3',N'起死回生药',' '),
('4',N'人参果',' '),
('5',N'断肠草',' ')
 
GO
Select * from News
delete from  News

SELECT * FROM Users
SELECT * FROM  ReporterDetails
Select * from  News