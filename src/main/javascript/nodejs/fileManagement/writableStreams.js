const fs = require("fs");

let answerStream;

process.stdin.once("data", data => {
    let name = data.toString().trim();
    let fileName = `./${name}.md`;
    if (fs.existsSync(fileName)) fs.unlinkSync(fileName);
    answerStream = fs.createWriteStream(fileName);
    answerStream.write(`Question Answers for ${name}\n==========\n`);
});