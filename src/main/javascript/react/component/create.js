function Header() {
    return (
        <header>
            <h1>Eve's Kitchen</h1>
        </header>
    );
}

function Main() {
    return (
        <section>
            <p>We serve the most delicious food around</p>
        </section>
    );
}

function App() {
    return (
        <div>
            <Header />
            <Main />
        </div>
    );
}

// ReactDOM.render(
//     <Header />,
//     document.getElementById("root")
// );

// ReactDOM.render(
//     <div>
//         <Header />
//         <Main />
//     </div>,
//     document.getElementById("root")
// );

ReactDOM.render(
    <App />,
    document.getElementById("root")
);