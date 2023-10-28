const nameTag = document.createElement("h1");
//! vulnerable to XSS attacks
//nameTag.innerHTML = window.prompt("Enter your name");
nameTag.textContent = window.prompt("Enter your name");
document.body.append(nameTag);

const list = document.querySelector("#fruit");
const item = document.createElement("li");
item.textContent = "mango";
list.prepend(item);

list.insertBefore(item, list.getElementsByTagName("li")[1]);