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
            <p>We serve the most {props.adjective} food around.</p>
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
            {/*<Footer year={2023} />*/}
            <Footer year={new Date().getFullYear()} />
        </div>
    );
}

ReactDOM.render(
    <App />,
    document.getElementById("root")
);