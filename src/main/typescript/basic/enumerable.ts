interface Contact {
    id : number;
    name: ContactName;
    birthDate?: Date;
    status: ContactStatus;
}

enum ContactStatus {
    ACTIVE = "active",
    INACTIVE = "inactive",
    NEW = "new"
}

let primaryContact: Contact = {
    birthDate: new Date("01-01-1980"),
    id: 12345,
    name: "Jamie Johnson",
    status: ContactStatus.ACTIVE
}

type ContactName = string;