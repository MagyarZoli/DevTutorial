```{json}
{
    "username": "demouser",
    "password": "demopassword"
}
```
```bash
curl --location 'http://localhost:3000/api/auth' \
--header 'Content-Type: application/json' \
--data '{
    "username": "demouser",
    "password": "demopassword"
}'
```
```{json}
{
  "token": "token1..."
}
```
Collections>mycollection>View more action>Edit>Authorization>Type>Bearer Token>Token: token1...>Update
```bash
curl --location 'http://localhost:3000/api/auth' \
--header 'Authorization: Bearer "token1..."' \
--header 'Content-Type: application/json' \
--data '{
    "username": "demouser",
    "password": "demopassword"
}'
```