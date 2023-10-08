```bash
curl --location 'https://thinking-tester-contact-list.herokuapp.com/contacts' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--header 'Cookie: token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--data-raw '{
    "firstName": "",
    "lastName": "Prunewhip",
    "birthdate": "1995-05-05",
    "email": "pprunewhip@fake.com",
    "phone": "8005551002",
    "street1": "123 Main St,",
    "street2": "Apartment Q",
    "city": "New York",
    "stateProvince": "NY",
    "postalCode": "12345",
    "contry": "USA"
}'
```
400 Bad Request
```bash
curl --location 'https://thinking-tester-contact-list.herokuapp.com/contacts' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--header 'Cookie: token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--data-raw '{
    "firstName": "Prunella",
    "lastName": "Abcdefghijklmnopqrstu",
    "birthdate": "1995-05-05",
    "email": "pprunewhip@fake.com",
    "phone": "8005551002",
    "street1": "123 Main St,",
    "street2": "Apartment Q",
    "city": "New York",
    "stateProvince": "NY",
    "postalCode": "12345",
    "contry": "USA"
}'
```
400 Bad Request
```bash
curl --location --request PUT 'https://thinking-tester-contact-list.herokuapp.com/contacts/6522c9a28d75bd0013f4b29c' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--header 'Cookie: token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--data-raw '{
    "firstName": "Joe",
    "lastName": "Schmoe",
    "birthdate": "1995-05-05",
    "email": "pprunewhip@fake",
    "phone": "8005551002",
    "street1": "123 Main St,",
    "street2": "Apartment Q",
    "city": "New York",
    "stateProvince": "NY",
    "postalCode": "12345",
    "contry": "USA"
}'
```