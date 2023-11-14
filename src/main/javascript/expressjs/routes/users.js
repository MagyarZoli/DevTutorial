const express = require("express");
const router = express.Router();

const users = [
    {name: "Kyle"},
    {name: "Sally"}
];

router.use(logger);

router.get("/", (req, res) => {
    console.log(req.query.name);
    res.send("User List");
});

router.get("/new", (req, res) => {
    // res.send("User New Form");
    res.render("users/new", {firstName: "Test"});
});

router.post("/", (req, res) => {
    // console.log(req.body.firstName);
    const isValid = true;
    if (isValid) {
        users.push({name: req.body.firstName});
        res.redirect(`/users/${users.length - 1}`);
    } else {
        console.log("Error");
        res.render("users/new", {firstName: req.body.firstName});
    }

    res.send();
});

// router.get("/:id", (req, res) => {
//     res.send(`Get User With ID ${req.params.id}`);
// });
// !overflow
// router.get("/", (req, res) => {
//     res.send("User List");
// });

router.route("/:id")
    .get((req, res) => {
        console.log(req.user);
        res.send(`Get User With ID ${req.params.id}`);
    })
    .put((req, res) => {
        res.send(`Put User With ID ${req.params.id}`);
    })
    .delete((req, res) => {
        res.send(`Delete User With ID ${req.params.id}`);
    });

router.param("id", (req, res, next, id) => {
    req.user = users[id];
    next();
});

function logger(req, res, next) {
    console.log(req.originalUrl);
    next();
}

module.exports = router;