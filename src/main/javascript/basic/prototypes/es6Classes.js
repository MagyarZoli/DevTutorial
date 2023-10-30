const newItem = new Live(dataObject.itemname, dataObject.pottype, dataObject.qty);

class Item {
    constructor() {
        this.type = "floral";
    }
    logItem() {
        console.log(`${this.name}, ${this.type}`);
        for (let prop in this) {
            console.log(`${prop} : ${this[prop]}`);
        }
    }
}

class Live extends Item() {
    constructor(name, pot, quantity = 1) {
        super();
        this.name = name;
        this.pot = pot;
        this.quantity = quantity;
        this.storage = "warm";
    }
}