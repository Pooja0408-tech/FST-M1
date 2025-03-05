 --Activity 1
 DROP TABLE Salesman;
 CREATE TABLE salesman (salesman_id INT, salesman_name varchar(32), salesman_city varchar(32), commision int)
 Describe salesman;

 --Activity 2
 INSERT ALL 
 INTO SALESMAN VALUES(1001, 'Shahid', 'Mumbai', 10)
 INTO SALESMAN VALUES(1005, 'Salman', 'Chennai', 12)
 INTO SALESMAN VALUES(1004, 'Hrithik', 'Kochin', 11)
 INTO SALESMAN VALUES(1009, 'Akshay', 'Hyderabad', 11)
 INTO SALESMAN VALUES(1002, 'Sharuk', 'Bengaluru', 12)
 SELECT 1 FROM DUAL;
 SELECT * FROM SALESMAN;

 --Activity 3
 --show data from saleman_id and salesman_city
 SELECT SALESMAN_ID,salesman_city  FROM salesman;
 --show data of salesman from kochin
 SELECT * FROM salesman WHERE salesman_city = 'Kochin';
 --show salesman_id and commision of shahid
 SELECT salesman_id, commision FROM SALESMAN where SALESMAN_NAME='Shahid';
--show data of salesman with ID 1009
SELECT * from SALESMAN WHERE SALESMAN_ID = '1009';

--ACtivity 4
ALTER TABLE salesman ADD grade int;
UPDATE salesman SET grade=100;
SELECT * FROM Salesman;

--Activity 5
-- Update the grade score of salesmen from Kochin to 200
UPDATE SALESMAN set grade=200 where salesman_city='Kochin';
-- Update the grade score of Sharuk to 300.
UPDATE SALESMAN set grade=300 where salesman_name='Sharuk';
-- Update the name Salman to Karthick.
UPDATE SALESMAN set salesman_name='Karthick' where salesman_name ='Salman';
SELECT*FROM SALESMAN;

final table.

"SALESMAN_ID"	"SALESMAN_NAME"	"SALESMAN_CITY"	"COMMISION"	"GRADE"
1001	"Shahid"	"Mumbai"	10	100
1005	"Karthick"	"Chennai"	12	100
1004	"Hrithik"	"Kochin"	11	200
1009	"Akshay"	"Hyderabad"	11	100
1002	"Sharuk"	"Bengaluru"	12	300





 

