import {Car} from "./car.js";

export class Suv extends Car {

    constructor(doors, engine, color) {
        super(doors, engine, color);
        this.wheels = 4;
    }
}

export class SuvFactory {

    createCar(type) {
        switch (type) {
            case "car1": return new Suv(4, "V6", "grey");
            case "car2": return new Suv(2, "V8", "red");
            default: return new Suv(null, null, null);
        }
    }

    createCars(type, count) {
        let array = [];
        for (let i = 0; i < count; i++) {
            array[i] = this.createCar(type);
        }
        return array;
    }

    createCustomCars(car, count) {
        let array = [];
        for (let i = 0; i < count; i++) {
            array[i] = car;
        }
        return array;
    }
}