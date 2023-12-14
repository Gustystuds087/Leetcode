# Write your MySQL query statement below
Select manager.name
from employee 
inner join employee as manager
on employee.managerId=manager.id
group by employee.managerId 
having count(employee.id)>=5