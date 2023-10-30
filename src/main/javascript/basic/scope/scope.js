'use strict'

const warrior = {
    name: "Jujin Take",
    type: "Ninja",
    weapon: "Shuriken",
    agility: 79
}

const screamWarrior = () => {
    let warrior2 = "Samurai";
    warrior3 = "Viking"; //use strict
    return {
        shootWarrior: () => {
            console.log(warrior, warrior2);
        }
    }
}
const newWarrior = screamWarrior();
newWarrior.shootWarrior();

console.log(warrior, warrior3);
