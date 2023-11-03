// function loadContent() {
//     // ...
// }

export function formatDate(date) {
// export function formatDate(date) {
    return date.toLocaleDateString("en-US", {
        dateStyle: "medium"
    });
}