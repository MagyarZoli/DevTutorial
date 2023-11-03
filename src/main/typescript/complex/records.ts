// let x: any = { name: "Wruce Bayne" };
let x: Record<string, string | number | boolean | Function> = { name: "Wruce Bayne" };
x.number = 1234;
x.active = true;
x.log = () => console.log("awesome!")



type ContactStatus = "active" | "inactive" | "new";

interface Address {
    street: string;
    province: string;
    postalCode: string;
}

interface Contact {
    id: number;
    name: string;
    status: ContactStatus;
    address: Address;
}

interface Query {
    sort?: 'asc' | 'desc';
    matches(val): boolean;
}

// function searchContacts(contacts: Contact[], query) {
function searchContacts(
        contacts: Contact[],
        query: Record<keyof Contact, Query>) {
    return contacts.filter(contact => {
        // for (const property of Object.keys(contact)) {
        for (const property of Object.keys(contact) as (keyof Contact)[]) {
            const propertyQuery = query[property];
            if (propertyQuery && propertyQuery.matches(contact[property])) {
                return true;
            }
        }
        return false;
    });
}

// const filteredContacts = searchContacts(
//     [/* contacts */],
//     {
//         id: { matches: (id) => id === 123 },
//         name: { matches: (name) => name === "Carol Weaver" },
//         // phoneNumber: { matches: (name) => name === "Carol Weaver" },
//     }
// );