class Animal2 {

    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

class Rabbit
    extends Animal2 {

    constructor(name, age, runSpeed) {
        super(name, age);
        this.runSpeed = runSpeed;
    }

}

class Fish
    extends Animal2 {

    constructor(name, age, swingSpeed) {
        super(name, age);
        this.swingSpeed = swingSpeed;
    }
}

class Hawk
    extends Animal2 {

    constructor(name, age, flySpeed) {
        super(name, age);
        this.flySpeed = flySpeed;
    }
}

const rabbit = new Rabbit("rabbit", 1, 40);
const fish = new Fish("fish", 2, 80);
const hawk = new Hawk("hawk", 3, 200);

console.log(rabbit.name);
console.log(rabbit.age);
console.log(rabbit.runSpeed);

console.log(fish.name);
console.log(fish.age);
console.log(fish.swingSpeed);

console.log(hawk.name);
console.log(hawk.age);
console.log(hawk.flySpeed);