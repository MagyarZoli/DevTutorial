import {Car} from "../auxiliary/car.js";

export class Builder extends Car {
    constructor() {
        super();
        this.car = new Car();
    }

    setDoors(doors) {
        this.car.doors = doors;
        return this;
    }

    setEngine(engine) {
        this.car.engine = engine;
        return this;
    }

    setColor(color) {
        this.car.color = color;
        return this;
    }

    build() {
        return this.car;
    }
}