const fs = require("fs");

fs.mkdir("your-files-here", (err) => {
    if (err) console.log(`ERROR: ${err}`);
    else console.log("directory created");
})