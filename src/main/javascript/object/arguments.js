class Car {

    constructor(model, year, color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}

const car1 = new Car("Mustang", 2023, "red");

changeColor(car1, "yellow");
displayInfo(car1);

function displayInfo(car) {
    console.log(car.model);
    console.log(car.year);
    console.log(car.color);
}

function changeColor(car, color) {
    car.color = color;
}