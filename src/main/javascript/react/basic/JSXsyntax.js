let robot = "🤖";
let cowboy = "🤠";
let moon = "🌝";
let name = "React";

ReactDOM.render(
    <ul>
        <li>{robot}</li>
        <li>{cowboy}</li>
        <li>{moon}</li>
        <li>{name.toUpperCase()}</li>
        <li>{name.length}</li>
    </ul>,
    document.getElementById("root")
);