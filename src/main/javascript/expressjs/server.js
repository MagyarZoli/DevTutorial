const express = require("express");
const app = express();

// http://localhost:3000
// http://localhost:3000/test/testIndex.html
app.use(express.static("public"));

app.use(express.urlencoded({extended: true}));
app.use(express.json());

app.set("view engine", "ejs");
// app.use(logger);

app.get("/", (req, res) => {
    //console.log("Here");
    //res.sendStatus(500);
    //res.send("Hi");
    //res.status(500).send("hi");
    //res.status(500).json({message: "Error"});
    //res.download("server.js");
    res.render("index", {text: "World"});
});

const userRouter = require("./routes/users");

app.use("/users", userRouter);

// function logger(req, res, next) {
//     console.log(req.originalUrl);
//     next();
// }

app.listen(3000, () => {
    console.log("Server is running on port 3000");
});