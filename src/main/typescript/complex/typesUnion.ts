type ContactName = string;

type ContactBirthDate = Date | number | string;

type AddressableContact2 = Contact & Address;

type ContactStatus = "active" | "inactive" | "new";

// enum ContactStatus {
//     Active = "active",
//     Inactive = "inactive",
//     New = "new"
// }

// interface Contact extends Address {
interface Contact {
    id: number;
    name: ContactName;
    // birthDate?: Date;
    // birthDate?: Date | number | string;
    birthDate?: ContactBirthDate;
    status?: ContactStatus;
}

interface Address {
    line1: string;
    line2: string;
    province: string;
    region: string;
    postalCode: string;
}

interface AddressableContact extends Contact, Address {}

function getBirthDate(contact: Contact) {
    if (typeof contact.birthDate === "number") {
        return new Date(contact.birthDate);
    } else if (typeof contact.birthDate === "string") {
        return Date.parse(contact.birthDate);
    } else {
        return contact.birthDate;
    }
}

let primaryContact: Contact = {
    id: 12345,
    name: "Jamie Johnson",
    status: "active"
}