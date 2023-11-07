import './App.css';
import {useReducer, useEffect, useState, useRef} from "react";


// function App(props) {
//   return (
//     <div className="App">
//       <h1>Hello from {props.library}</h1>
//     </div>
//   );
// }

// function App({ library }) {
//     return (
//         <div className="App">
//             <h1>Hello from {library}</h1>
//         </div>
//     );
// }

// const [first, second] = [
//     "Tokyo",
//     "Tahoe City",
//     "Bend"
// ];

// function App() {
//     // const what = useState();
//     // console.log(what);
//     const [emotion, setEmotion] = useState("happy");
//     return (
//         <div className="App">
//             <h1>Current emotion is {emotion}</h1>
//             <button onClick={() => setEmotion("sad")}>Sad</button>
//             <button onClick={() => setEmotion("excited")}>Excited</button>
//         </div>
//     );
// }

// function App() {
//     const [emotion, setEmotion] = useState("happy");
//     useEffect(() => {
//         console.log(`It's ${emotion} right now`);
//     }, [
//         emotion
//     ]);
//     return (
//         <div className="App">
//             <h1>Current emotion is {emotion}</h1>
//             <button onClick={() => setEmotion("sad")}>Sad</button>
//             <button onClick={() => setEmotion("excited")}>Excited</button>
//         </div>
//     );
// }

// function App() {
//     const [emotion, setEmotion] = useState("happy");
//     const [secondary, setSecondary] = useState("tired");
//     useEffect(() => {
//         console.log(`It's ${emotion} right now`);
//     }, [emotion]);
//     useEffect(() => {
//         console.log(`It's ${secondary} around here!`);
//     }, [secondary]);
//     return (
//         <div className="App">
//             <h1>Current emotion is {emotion}</h1>
//             <button onClick={() => setEmotion("sad")}>Sad</button>
//             <button onClick={() => setEmotion("excited")}>Excited</button>
//             <h2>Current secondary emotion is {secondary}.</h2>
//             <button onClick={() => setSecondary("grateful")}>Grateful</button>
//         </div>
//     );
// }

// function App() {
//     const [checked, setChecked] = useState(false);
//     return (
//         <div className="App">
//             <input
//                 type="checkbox"
//                 value={checked}
//                 onChange={() => setChecked(
//                     checked => !checked
//                 )}
//             />
//             <label>
//                 {checked ? "checked" : "not checked"}
//             </label>
//         </div>
//     );
// }

function App() {
    const [checked, setChecked] = useReducer(
        checked => !checked,
        false
    );
    return (
        <div className="App">
            <input
                type="checkbox"
                value={checked}
                onChange={setChecked}
            />
            <label>
                {checked ? "checked" : "not checked"}
            </label>
        </div>
    );
}

export default App;
