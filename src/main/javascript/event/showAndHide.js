const button = document.querySelector("#button");
const image = document.querySelector("#image");

// button.addEventListener("click", () => {
//     console.log(image.style.display);
//     if (image.style.display === "none") image.style.display = "block";
//     else image.style.display = "none";
// });

button.addEventListener("click", () => {
    console.log(image.style.visibility);
    if (image.style.visibility === "hidden") image.style.visibility = "visible";
    else image.style.visibility = "hidden";
});