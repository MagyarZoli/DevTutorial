'use strict'

const screamWarrior = () => {
    let warrior2 = "Samurai";
    warrior3 = "Viking"; //use strict
    return {
        shootWarrior: () => {
            console.log(warrior2);
        }
    }
}
const newWarrior = screamWarrior();
newWarrior.shootWarrior();

console.log(warrior3);