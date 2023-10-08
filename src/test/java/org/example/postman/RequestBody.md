```{json}
{
    "filters": [
        {
            "field": "description",
            "value": "management"
        }
    ],
    "sort": "name"
}
```
```bash
curl --location 'http://localhost:3000/api/borders/search' \
--header 'Content-Type: application/json' \
--data '{
    "filters": [
        {
            "field": "description",
            "value": "management"
        }
    ],
    "sort": "name"
}'
```