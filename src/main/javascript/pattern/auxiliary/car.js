import {Vehicle} from "./vehicle.js";

export class Car extends Vehicle{

    constructor(doors, engine, color) {
        super();
        this.doors = doors;
        this.engine = engine;
        this.color = color;
    }
}