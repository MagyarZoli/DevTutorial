```{json}
{
    "firstName": "Joe",
    "lastName": "Schmoe",
    "birthdate": "1995-05-05",
    "email": "pprunewhip@fake.com",
    "phone": "8005551002",
    "street1": "123 Main St,",
    "street2": "Apartment Q",
    "city": "New York",
    "stateProvince": "NY",
    "postalCode": "12345",
    "contry": "USA"
}
```
```bash
curl --location --request PUT 'https://thinking-tester-contact-list.herokuapp.com/contacts/6522c13624541900134d887f' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--header 'Cookie: token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--data-raw '{
    "firstName": "Joe",
    "lastName": "Schmoe",
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
```bash
curl --location 'https://thinking-tester-contact-list.herokuapp.com/contacts/6522c13624541900134d887f' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI' \
--header 'Cookie: token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTIyYWQ1ZjhkNzViZDAwMTNmNGIxZTAiLCJpYXQiOjE2OTY3NzE5NTd9.AIkqbZANEoAinaMwDzsrA63hfoYohfuXMHIvMxCMzfI'
```