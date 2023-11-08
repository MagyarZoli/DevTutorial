export function App(props) {
  return (
    <div className="App">
      <h1>Hello from {props.library}</h1>
    </div>
  );
}

// function App({ library }) {
//     return (
//         <div className="App">
//             <h1>Hello from {library}</h1>
//         </div>
//     );
// }