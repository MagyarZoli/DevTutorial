const newItem = new Live(dataObject.itemname, dataObject.pottype, dataObject.qty);

function Live(name, vase, quantity = 1) {
    this.type = 'floral';
    this.storage = "warm";
    this.name = name;
    this.pot = pot;
    this.quantity = quantity;
    this.logItem = () => {
        console.log(`${this.name}, ${this.type}`);
        for (let prop in this) {
            console.log(`${prop} : ${this[prop]}`);
        }
    };
}