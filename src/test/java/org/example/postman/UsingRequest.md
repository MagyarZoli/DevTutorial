```{json}
{
    "filters": [
        {
            "filters": "description",
            "value": "management"
        }
    ]
}
```
```bash
curl --location 'http://localhost:3000/api/boards/search' \
--header 'Content-Type: application/json' \
--data '{
    "filters": [
        {
            "filters": "description",
            "value": "management"
        }
    ]
}'
```
```{json}
{
    "filters": [
        {
            "filters": "description",
            "value": "Chapter"
        }
    ]
}
```
```bash
curl --location 'http://localhost:3000/api/boards/search' \
--header 'Content-Type: application/json' \
--data '{
    "filters": [
        {
            "filters": "description",
            "value": "Chapter"
        }
    ]
}'
```