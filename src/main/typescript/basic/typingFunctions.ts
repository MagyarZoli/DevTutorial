interface Contact {
    id: number;
    name: string;
    // clone(name: string): Contact;
}

function clone(source: Contact): Contact {
    return Object.apply({}, source);
    // return source;
}

// function clone(source: Contact, func: (source: Contact) => Contact): Contact {
//     return Object.apply({}, source);
//     // return source;
// }

const a: Contact = {
    id: 123,
    name: "Homer Simpson"
};
const b = clone(a);