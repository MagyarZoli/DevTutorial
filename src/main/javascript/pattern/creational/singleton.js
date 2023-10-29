import {Car} from "../auxiliary/car.js";

export class Singleton extends Car {

    static instance = null;

    constructor(doors, engine, color) {
        if (Singleton.instance === null) {
            super(doors, engine, color);
            Singleton.instance = this;
        }
        return Singleton.instance;
    }
}