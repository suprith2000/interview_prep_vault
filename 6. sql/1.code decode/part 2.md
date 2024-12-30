
![[Pasted image 20241217192211.png]]

SELECT DISTINCT is a handy way to remove duplicates from a query. SELECT DISTINCT works by GROUPing all fields in the query to create distinct results. To accomplish this goal however, a large amount of processing power is required. Additionally, data may be grouped to the point of being inaccurate. To avoid using SELECT DISTINCT, select more fields to create unique results. Some SQL developers prefer to make joins with WHERE clausesThis type of join creates a Cartesian Join, also called a Cartesian Product or CROSS JOIN. In a Cartesian Join, all possible combinations of the variables are created This is an inefficient use of database resources, as the database has done 100x more work than required. Cartesian Joins are especially problematic in large-scale databases, because a Cartesian Join of two large tables could create billions or trillions of results. To prevent creating a Cartesian Join, use INNER JOIN instead

![[Pasted image 20241217193412.png]]

