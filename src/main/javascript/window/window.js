const button = document.querySelector("#button");

console.dir(window);

console.log(window.innerWidth);
console.log(window.innerHeight);

console.log(window.outerWidth);
console.log(window.outerHeight);

console.log(window.scrollX);
console.log(window.scrollY);

console.log(window.location.href);
window.location.href = "https://google.com";

console.log(window.location.hostname);
console.log(window.location.pathname);

// button.addEventListener("click", () => window.open("https://google.com"));
// button.addEventListener("click", () => window.close());
button.addEventListener("click", () => window.print());

// window.alert("Hello");
// window.confirm("Press OK to continue!");

let age = window.prompt("Enter your age");
if (age < 18) {
    window.alert("You must be 18+ to visit this site");
    window.close();
}