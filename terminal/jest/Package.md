```bash
npm i --save-dev jest supertest
```
```{json} 
"jest" : {
    "testEnvironment": "node"
},
```
```bash 
npm i -D cross-env
```
```{json} 
"test": "corss-env DATABASE_URL=mongodb://localhost:27017//recipe_app_test jest --collectCoverge --forceExit --detectOpenHandles"
```