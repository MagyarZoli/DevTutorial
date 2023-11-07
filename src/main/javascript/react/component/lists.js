const dishes = [
    "black Bean Soup",
    "Macaroni and Cheese",
    "Salmon and Potatoes"
];

function Header(props) {
    return (
        <header>
            <h1>{props.name}'s Kitchen</h1>
        </header>
    );
}

function Main(props) {
    return (
        <section>
            <ul>
                {dishes.map(dish => (
                    <li>{dish}</li>
                ))}
            </ul>
        </section>
    );
}

function Footer(props) {
    return (
        <footer>
            <p>Copyright {props.year}</p>
        </footer>
    );
}

function App() {
    return (
        <div>
            <Header name="Cindy"/>
            <Main adjective="amazing"/>
            <Footer year={new Date().getFullYear()} />
        </div>
    );
}

ReactDOM.render(
    <App />,
    document.getElementById("root")
);