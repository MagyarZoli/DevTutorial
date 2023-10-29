import {Factory} from "./factory.js";
import {Suv, SuvFactory} from "../auxiliary/suv.js";
import {Car} from "../auxiliary/car.js";

export class AbstractFactory {

    createCar(model, type) {
        switch (model) {
            case "car": return new Factory().createCar(type);
            case "suv": return new SuvFactory().createCar(type);
        }
    }

    createCars(model, type, count) {
        switch (model) {
            case "car": return new Factory().createCars(type, count);
            case "suv": return new SuvFactory().createCars(type, count);
        }
    }

    createCustomCars(model, car, count) {
        switch (model) {
            case "car": return new Factory().createCustomCars(car, count);
            case "suv": return new SuvFactory().createCustomCars(car, count);
        }
    }
}