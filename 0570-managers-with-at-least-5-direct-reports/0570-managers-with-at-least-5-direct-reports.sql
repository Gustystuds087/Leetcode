# Write your MySQL query statement below
Select anshul.name
from employee 
inner join employee as anshul
on employee.managerId=anshul.id
group by employee.managerId 
having count(employee.id)>=5