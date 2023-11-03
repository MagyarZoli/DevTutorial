class MessageClass {
    title;
    message;
    id;
}

class MessageClassCon {
    title: string;
    message: string;
    id: number;

    constructor(title: string, message: string) {
        this.title = title;
        this.message = message;
        this.id = 1;
    }
}

function MessagePrototypes(title, message, id) {
    this.title = title;
    this.message = message;
    this.id = id;
}

const message1Object = {
    title: undefined,
    message: undefined,
    id: undefined
};
const message2Class = new MessageClass();
const message3Pro = new MessagePrototypes("Hello", "World", "infinity");
const message4ClassCon = new MessageClassCon("Hello", "World");