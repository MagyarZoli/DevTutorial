const newItem = {
    type: "floral",
    storage: "warm",
    name: dataObject.itemname,
    pot: dataObject.pottype,
    quantity: dataObject.qty,
    logItem: () => {
        console.log(`${this.name}, ${this.type}`);
        for (let prop in this) {
            console.log(`${prop} : ${this[prop]}`);
        }
    }
}