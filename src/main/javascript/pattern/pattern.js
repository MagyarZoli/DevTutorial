import {Car} from "./auxiliary/car.js";
import {Suv} from "./auxiliary/suv.js";
import {Singleton} from "./creational/singleton.js";
import {Factory} from "./creational/factory.js";
import {AbstractFactory} from "./creational/abstractFactory.js";
import {Builder} from "./creational/builder.js";

// const car = new Car(4, "V6", "grey");
// console.log(car);
// const suv = new Suv(4, "V8", "red");
// console.log(suv);
//
// const singletonCar1 = new Singleton(4, "V6", "grey");
// const singletonCar2 = new Singleton(2, "V8", "red");
// console.log(singletonCar1);
// console.log(singletonCar2);
//
// const factory = new Factory();
// const factoryCar = factory.createCar("car1");
// console.log(factoryCar);
// const factoryCars = factory.createCars("car2", 3);
// factoryCars.forEach(c => console.log(c));
// const factoryCustomCars = factory
//         .createCustomCars(new Car(5, "V6", "blue"), 2);
// factoryCustomCars.forEach(c => console.log(c));
//
// const abstractFactory = new AbstractFactory();
// const abstractFactoryCar = abstractFactory
//         .createCar("suv","car1");
// console.log(abstractFactoryCar);
// const abstractFactoryCars = abstractFactory
//         .createCars("suv","car2", 3);
// abstractFactoryCars.forEach(c => console.log(c));
// const abstractFactoryCustomCars = abstractFactory
//         .createCustomCars("suv", new Suv(5, "V6", "blue"), 2);
// abstractFactoryCustomCars.forEach(c => console.log(c));

const builderCar = new Builder().setColor("green").setDoors(3).build();
console.log(builderCar);