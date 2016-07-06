DROP DATABASE jobcard;
CREATE DATABASE jobcard;
USE jobcard;
CREATE TABLE SparePart(
    part_id varchar(10) primary key,
    description varchar(200)
); 

CREATE TABLE Customer(
    customer_id varchar(10) primary key,
    name varchar(100),
    address varchar(200),
    fax varchar(20),
    tl1 varchar(20),
    tl2 varchar(20)
);

CREATE TABLE Grade(
    grade_id varchar(10) primary key,
    name varchar(100)
);

INSERT INTO Grade VALUES('0' , 'Hybrid');
INSERT INTO Grade VALUES('1' , 'Electronic');
INSERT INTO Grade VALUES('2' , 'Mechanics');

CREATE TABLE JobCard(
    customer_id varchar(10),
    grade_id varchar(10),
    jobNumber varchar(10) primary key,
    vehicleNumber varchar(10),
    date varchar(10),
    model varchar(100),
    groupLeader varchar(100),
    constraint foreign key(customer_id) references Customer(customer_id) 
    on delete cascade on update cascade    ,
    constraint foreign key(grade_id) references Grade(grade_id) 
    on delete cascade on update cascade    
);

CREATE TABLE JobFinish(
    jobFinish_id varchar(10) primary key,
    jobNumber varchar(10),
    testBy varchar(100),
    jobDirector varchar(100),
    finishDate varchar(10),
    constraint foreign key(jobNumber) references JobCard(jobNumber) 
    on delete cascade on update cascade
);   

CREATE TABLE CardDetail(
    jobNumber varchar(10),
    part_id varchar(10),
    qty int,
    amount decimal(10,2),
    constraint primary key(jobNumber,part_id),
    constraint foreign key(jobNumber) references JobCard(jobNumber) 
    on delete cascade on update cascade,
    constraint foreign key(part_id) references SparePart(part_id) 
    on delete cascade on update cascade  
);

CREATE TABLE Complaint(
    jobNumber varchar(100),
    complaint_id varchar(10) primary key,
    nature varchar(200),
    instruction varchar(200),
    constraint foreign key(jobNumber) references JobCard(jobNumber) 
    on delete cascade on update cascade  
);

CREATE TABLE JobDone(
    complaint_id varchar(10),
    jobDone_id varchar(10) primary key,
    nature varchar(200),
    amount int,
    constraint foreign key(complaint_id) references Complaint(complaint_id) 
    on delete cascade on update cascade     
);

CREATE TABLE User(
    user_id int primary key AUTO_INCREMENT,
    name varchar(10),
    password varchar(10)
);
