# Write your MySQL query statement below
SELECT ( SELECT DISTINCT
e.salary 
FROM Employee e
ORDER BY salary DESC
LIMIT 1,1)AS SecondHighestSalary; 