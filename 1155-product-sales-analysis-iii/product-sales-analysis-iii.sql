# Write your MySQL query statement below
SELECT s.product_id,s.year AS first_year,s.quantity,s.price
from Sales s JOIN(
    SELECT product_id,MIN(year) as first_year
    from Sales
    GROUP BY product_id
) t
ON s.product_id=t.product_id
and s.year=t.first_year;