class Car {

    static numberOfCars = 0;

    constructor(model) {
        this.model = model;
        Car.numberOfCars++;
    }

    static startRace() {
        console.log("3...2...1...GO!");
    }
}

const car1 = new Car("Mustang");
const car2 = new Car("Corvette");
const car3 = new Car("BMW");

console.log(Car.numberOfCars);
console.log(Car.numberOfCars);
console.log(Car.numberOfCars);

Car.startRace();