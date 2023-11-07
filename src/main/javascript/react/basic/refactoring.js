let heading = React.createElement(
    "ul",
    { style: {color: "blue" } },
    React.createElement("li", null, "Monday"),
    React.createElement("li", null, "Tuesday"),
    React.createElement("li", null, "Wednesday")
);

ReactDOM.render(
    heading,
    document.getElementById("root")
);