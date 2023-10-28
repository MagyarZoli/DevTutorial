const car = {
    model: "Mustang",
    color: "red",
    year: 2023,

    driver: function () {
        console.log("You drive the car");
    },
    brake: () => console.log("You step on the brakes")
}

console.log(car.model);
console.log(car.color);
console.log(car.year);

car.driver();
car.brake();