const car1 = {
    model: "Mustang",
    color: "red",
    year: 2023,
    driver: function () {
        console.log(`You drive the ${this.model}`);
    }
}
const car2 = {
    model: "Corvette",
    color: "blue",
    year: 2024,
    driver: function () {
        console.log(`You drive the ${car2.model}`);
    }
}

car1.driver();
car2.driver();