import {useState, useEffect} from "react";

export function App() {
    const [data, setData] = useState(null);
    useEffect(() => {
        fetch(`https://api.github.com/users/MagyarZoli`)
            .then(response => response.json())
            .then(data => setData(data));
    }, []);
    if (data) return (
        <pre>{JSON.stringify(data, null, 2)}</pre>
    );
    return (
        <h1>Data</h1>
    );
}