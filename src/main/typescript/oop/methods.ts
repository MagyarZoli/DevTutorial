class Message {
    title: string;
    message: string;
    _isSent: boolean;

    constructor(title: string, message: string) {
        this.title = title;
        this.message = message;
        this._isSent = false;
    }

    get isSent(): boolean {
        return this._isSent;
    }

    set setSent(isSent: boolean) {
        this._isSent = isSent;
    }

    methodMessage(): string {
        return this.message.slice(0, 10).concat("...");
    }
}

const message = new Message(
    "New Course!!!",
    "Check out our latest course on OOP with TypeScript!");

message.isSent
message.setSent = true;
message.methodMessage();