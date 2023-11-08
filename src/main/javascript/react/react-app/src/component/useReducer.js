import {useReducer, useState} from "react";

// export function App() {
//     const [checked, setChecked] = useState(false);
//     return (
//         <div className="App">
//             <input
//                 type="checkbox"
//                 value={checked}
//                 onChange={() => setChecked(checked => !checked)}/>
//             <label>
//                 {checked ? "checked" : "not checked"}
//             </label>
//         </div>
//     );
// }

export function App() {
    const [checked, setChecked] = useReducer(
        checked => !checked,
        false
    );
    return (
        <div className="App">
            <input
                type="checkbox"
                value={checked}
                onChange={setChecked}/>
            <label>
                {checked ? "checked" : "not checked"}
            </label>
        </div>
    );
}