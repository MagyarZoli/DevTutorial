let userName = "  Bro  ";

console.log(userName.length);
console.log(userName.charAt(0));
console.log(userName.indexOf("o"));
console.log(userName.lastIndexOf("o"));
console.log(userName.trim());
console.log(userName.toUpperCase());
console.log(userName.toLowerCase());

let phoneNumber = "123-456-7890";

console.log(phoneNumber.replaceAll("-", "/"));

let fullName = "Bro Code";
let firstName, lastName;

//lastName = fullName.slice(4);
//firstName = fullName.slice(0, 3);
lastName = firstName.slice(fullName.indexOf(" ") + 1);
firstName = fullName.slice(0, fullName.indexOf(" "));

console.log(firstName);
console.log(lastName);

let letter = userName.charAt(0)
        .toUpperCase()
        .trim();

console.log(letter);