# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Orders AS o
RIGHT JOIN Customers AS c
ON o.customerId = c.id
WHERE o.CustomerId IS NULL;