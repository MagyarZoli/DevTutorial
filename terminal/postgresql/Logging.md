```bash
psql -h localhost -U postgers -d hplussport
```
\q 
```bash
psql -h localhost -U postgres -f database.sql
```
```bash
psql -h localhost -U postgres -d hplussport -f customer.sql
psql -h localhost -U postgres -d hplussport -f product.sql
psql -h localhost -U postgres -d hplussport -f salesperson.sql
psql -h localhost -U postgres -d hplussport -f orders.sql
```
```bash
psql -h localhost -U postgers -d hplussport
```
```roomsql
SELECT * FROM customer;
```