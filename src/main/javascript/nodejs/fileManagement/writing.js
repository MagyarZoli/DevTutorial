const fs = require("fs");

let md = `
This is a New File
==================
    
ES6 Template Strings are cool. They honor whitespace.
    
* Template Strings
* Node File System
* Readline CLIs
`;

// fs.writeFile("writeResult.md", md.trim(), function () {
//     console.log("Markdown Created");
// });

fs.writeFile("writeResult.md", md.trim(), function (err) {
    if (err) throw err;
    fs.appendFileSync("writeResult.md", "\n\n### Node.js Everyone!");
    console.log("Markdown Created");
});