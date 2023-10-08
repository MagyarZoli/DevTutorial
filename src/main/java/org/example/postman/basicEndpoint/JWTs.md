```{json}
{
    "email": "postman01@gmail.com",
    "password": "Postman01"
}
```
```bash
curl --location 'https://thinking-tester-contact-list.herokuapp.com/users/login' \
--header 'Content-Type: application/json' \
--header 'Cookie: token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--data-raw '{
    "email": "postman01@gmail.com",
    "password": "Postman01"
}'
```
Token = `eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI`
