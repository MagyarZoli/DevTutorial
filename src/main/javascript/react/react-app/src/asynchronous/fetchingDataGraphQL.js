import {useState, useEffect} from "react";

const query = `
    query {
        allLifts {
            name
            elevationGain
            status
        }
    }
`;

const opts = {
    method: "POST",
    Headers: {"Content-Type": "application/json"},
    body: JSON.stringify({query})
};

function Lift(props) {
    return (
        <div>
            <h1>{props.name}</h1>
            <p>{props.elevationGain} {props.status}</p>
        </div>
    );
}

export function App() {
    const [data, setData] = useState(null);
    const [error, setError] = useState(null);
    const [loading, setLoading] = useState(null);
    useEffect(() => {
        fetch(`https://snowtooth.moonhighway.com/`, opts)
            .then(response => response.json())
            .then(data => setData(data))
            .then(() => setLoading(false))
            .catch(setError);
    }, []);
    if (loading) return (
        <h1>Loading...</h1>
    );
    else if (error) return (
        <pre>{JSON.stringify(error)}</pre>
    );
    else if (!data) return null;
    return (
        <div>
            {data.data.allLifts.map(lift => (
                <Lift name={lift.name}
                      elevationGain={lift.elevationGain}
                      status={lift.status} />
            ))}
        </div>
    );
}