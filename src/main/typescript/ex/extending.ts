let x: Record<string, string | number | boolean | Function> = { name: "Wruce Bayne" };
x.number = 1234;
x.active = true;
x.log = () => console.log("awesome!")



type ContactStatus = "active" | "inactive" | "new";

/**
 * id: Query;
 * name: Query;
 * status: Query;
 * address: Query;
 * email: Query;
 */
// type ContactQuery = Record<keyof Contact, Query>;

/**
 * id?: Query;
 * name?: Query;
 * status?: Query;
 * address?: Query;
 * email?: Query;
 */
// type ContactQuery = Partial<Record<keyof Contact, Query>>;

/**
 * id?: Query;
 * name?: Query;
 * email?: Query;
 */
// type ContactQuery = Omit<Partial<Record<keyof Contact, Query>>, "address" | "status">;


/**
 * id?: Query;
 * name?: Query;
 */
type ContactQuery = Partial<Pick<Record<keyof Contact, Query>, "id" | "name">>;

/**
 * id: Query;
 * name: Query;
 */
type RequiredContactQuery = Required<ContactQuery>;


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

interface Query {
    sort?: 'asc' | 'desc';
    matches(val): boolean;
}

function searchContacts(contacts: Contact[], query: ContactQuery) {
    return contacts.filter(contact => {
        for (const property of Object.keys(contact) as (keyof Contact)[]) {
            const propertyQuery = query[property];
            if (propertyQuery && propertyQuery.matches(contact[property])) {
                return true;
            }
        }
        return false;
    });
}

const filteredContacts = searchContacts(
    [/* contacts */],
    {
        id: { matches: (id) => id === 123 },
        name: { matches: (name) => name === "Carol Weaver" }
    }
);