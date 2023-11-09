const path = require("path");
console.log(path.basename(__filename));
const util = require("util");
const v8 = require("v8");
const dirUploads = path.join(
    __dirname,
    "www",
    "files",
    "uploads"
);
console.log(dirUploads);

util.log(path.basename(__filename));
util.log(v8.getHeapStatistics());
