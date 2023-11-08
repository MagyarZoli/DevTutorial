import {useState, useEffect} from "react";

function GithubUser(props) {
    return (
        <div>
            <h1>{props.name}</h1>
            <p>{props.location}</p>
            <img src={props.avatar}
                 height={150}
                 alt={props.name}/>
        </div>
    );
}

export function App() {
    const [data, setData] = useState(null);
    const [error, setError] = useState(null);
    const [loading, setLoading] = useState(null);
    useEffect(() => {
        fetch(`https://api.github.com/users/moonhighway`)
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
        <GithubUser name={data.name}
                    location={data.location}
                    avatar={data.avatar_url}/>
    );
}