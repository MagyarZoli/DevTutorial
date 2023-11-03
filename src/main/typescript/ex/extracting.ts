type ContactStatus = "active" | "inactive" | "new";

// type ContactQuery = Partial<Record<keyof Contact, Query>>;

/**
 * id?: Query;
 * name?: Query;
 * status?: Query;
 * address?: Query;
 * email?: Query;
 */
// type ContactQuery = {
//     [TProp in keyof Contact]?: Query;
// }

/**
 * id?: Query<number>;
 * name?: Query<string>;
 * status?: Query<ContactStatus>;
 * address?: Query<Address>;
 * email?: Query<string>;
 */
type ContactQuery = {
    [TProp in keyof Contact]?: Query<Contact[TProp]>;
}


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
    email: string;
}

// interface Query {
//     sort?: 'asc' | 'desc';
//     matches(val): boolean;
// }
interface Query<TProp> {
    sort?: 'asc' | 'desc';
    matches(val: TProp): boolean;
}

function searchContacts(contacts: Contact[], query: ContactQuery) {
    return contacts.filter(contact => {
        for (const property of Object.keys(contact) as (keyof Contact)[]) {
            // const propertyQuery = query[property];
            const propertyQuery = query[property] as Query<Contact[keyof Contact]>;

            if (propertyQuery && propertyQuery.matches(contact[property])) {
                return true;
            }
        }
        return false;
    })
}

const filteredContacts = searchContacts(
    [/* contacts */],
    {
        id: { matches: (id) => id === 123 },
        name: { matches: (name) => name === "Carol Weaver" },
    }
);