let userName = "Bro";
let userInbox = 0;

login();

function login() {
    displayUserName();
    displayUserInbox();

    function displayUserName() {
        console.log(`Welcome ${userName}`);
    }

    function displayUserInbox() {
        console.log(`You have ${userName} new messages`);
    }
}