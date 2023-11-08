import {useState} from "react";

const [first, second] = [
    "Tokyo",
    "Tahoe City",
    "Bend"
];

export function App() {
    // const what = useState();
    // console.log(what);
    const [emotion, setEmotion] = useState("happy");
    return (
        <div className="App">
            <h1>
                Current emotion is {emotion}
            </h1>
            <button onClick={() => setEmotion("sad")}>
                Sad
            </button>
            <button onClick={() => setEmotion("excited")}>
                Excited
            </button>
        </div>
    );
}