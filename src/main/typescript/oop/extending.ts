class Animal {
    public age: number;
    readonly legs: number;
    name: string;

    constructor(age: number, legs: number, name: string) {
        this.age = age;
        this.legs = legs;
        this.name = name;
    }

    owner() {
        console.log(`${this.name} are ${this.age} years old`);
    }
}

class Dog extends Animal {
    toy: string;

    constructor(age: number, legs: number, name: string, toy: string) {
        super(age, legs, name);
        this.toy = toy;
    }

    owner() {
        console.log(`${this.name} are ${this.age} years old, and favorite toy ${this.toy}`);
    }

    woof(): string {
        this.owner();
        return "WOOF!";
    }
}

class Cat extends Animal {

    constructor(data: { age: number, legs: number, name: string }) {
        super(data.age, data.legs, data.name);
    }

    meow(): string {
        super.owner();
        return "Meow!";
    }
}

class Parrot implements Animal {
    age: number;
    legs: number;
    name: string;

    owner(): void {
        console.log(`${this.name} are ${this.age} years old parrot.`);
    }

    chirp(): string {
        this.owner();
        return "Chirp!";
    }
}

const dog = new Dog(2, 4, "Gator", "ball");
const cat = new Cat({age: 19, legs: 4, name: "Tom"});
const parrot = new Parrot();

dog.owner();
cat.owner();
parrot.owner();

dog.woof();
cat.meow();
parrot.chirp();

console.log(dog instanceof Animal); // true;
console.log(cat instanceof Animal); // true;
console.log(parrot instanceof Animal); // false;

const dog2 = new Animal(2, 4, "Gator");
const cat2 = new Animal(19, 4, "Tom");
const parrot2 = new Animal(2, 2, "Fonix");

let numberPublic: number;
numberPublic = dog.age;
numberPublic = cat.age;
numberPublic = parrot.age;
numberPublic = dog2.age;
numberPublic = cat2.age;
numberPublic = parrot2.age;

console.log(dog.legs);
// dog.legs = 44;
