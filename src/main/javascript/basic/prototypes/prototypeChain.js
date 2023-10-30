const newItem = new Live(dataObject.itemname, dataObject.pottype, dataObject.qty);

function Item() {};
Item.prototype.type = "floral";
Item.prototype.logItem = () => {
    console.log(`${this.name}, ${this.type}`);
    for (let prop in this) {
        console.log(`${prop} : ${this[prop]}`);
    }
};

function Live(name, vase, quantity = 1) {
    this.name = name;
    this.pot = pot;
    this.quantity = quantity;
}
Item.prototype = new Item();
Live.prototype.storage = "warm";