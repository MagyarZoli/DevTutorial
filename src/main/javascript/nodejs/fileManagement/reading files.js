const fs = require("fs");

// let ipsum = fs.readFileSync("./ipsum.md", "UTF-8");
// console.log(ipsum);

fs.readFile("./ipsum.md", "UTF-8", (err, ipsum) => {
    if (err) throw err;
    console.log(ipsum);
});