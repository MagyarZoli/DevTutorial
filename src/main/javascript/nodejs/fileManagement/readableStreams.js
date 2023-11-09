const fs = require("fs");

// fs.readFile("ipsum.md", "UTF-8", (err, ipsum) => {
//     console.log(ipsum.length)
// });

let stream = fs.createReadStream("ipsum.md", "UTF-8");
let data;

stream.once("data", chunk => {
    console.log("read stream started\n=====================");
    console.log(chunk);
});

stream.on("data", chunk => {
    console.log(`chunk: ${chunk.length}`);
    data += chunk;
});

stream.on("end", () => {
    console.log(`finished ${data.length}`);
});