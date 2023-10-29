import {Car} from "../auxiliary/car.js";

export class Factory {

    createCar(type) {
        switch (type) {
            case "car1": return new Car(4, "V6", "grey");
            case "car2": return new Car(2, "V8", "red");
            default: return new Car(null, null, null);
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