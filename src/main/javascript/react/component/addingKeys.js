const dishes = [
    "black Bean Soup",
    "Macaroni and Cheese",
    "Salmon and Potatoes"
];

const dishObjects = dishes.map(
    (dish, i) => ({
        id: i,
        title: dish
    })
);

function Header(props) {
    return (
        <header>
            <h1>{props.name}'s Kitchen</h1>
        </header>
    );
}

// function Main(props) {
//     return (
//         <section>
//             <ul>
//                 {props.dishes.map((dish, i) => (
//                     <li key={i}>{dish}</li>
//                 ))}
//             </ul>
//         </section>
//     );
// }

function Main(props) {
    return (
        <section>
            <ul>
                {props.dishes.map(dish => (
                    <li key={dish.id}>{dish.title}</li>
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
            {/*<Main adjective="amazing" dishes={dishes}/>*/}
            <Main adjective="amazing" dishes={dishObjects}/>
            <Footer year={new Date().getFullYear()} />
        </div>
    );
}

ReactDOM.render(
    <App />,
    document.getElementById("root")
);