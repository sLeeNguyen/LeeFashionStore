const EMAIL_REGEXP = /^[a-zA-z0-9]+((\.[a-zA-z0-9]+)+)?@[a-z]+(\.[a-z]+)+/;

var fullname = document.forms["form-name"]["fullname"];
var username = document.forms["form-name"]["username"];
var email = document.forms["form-name"]["email"];
var password = document.forms["form-name"]["password"];
var confirmPass = document.forms["form-name"]["confirm-pass"];

var errFname = document.getElementById('errFname');
var errUsername = document.getElementById('errUsername');
var errEmail = document.getElementById('errEmail');
var errPass = document.getElementById('errPass');
var errConfirmPass = document.getElementById('errCon-Pass');

// err handler
fullname.addEventListener('keyup', fnameVerify);
username.addEventListener('keyup', userVerify);
email.addEventListener('keyup', emailVerify);
password.addEventListener('keyup', passVerify);
confirmPass.addEventListener('keyup', conPassVerify);

function validate() {
    if (!fnameVerify() || !userVerify() || !emailVerify() || !passVerify() || !conPassVerify()) {
        return false;
    }

    return true;
}

function fnameVerify() {
    if (fullname.value === "" || fullname.value === null) {

        fullname.style.border = "1px solid red";
        errFname.innerHTML = "Please fill up your full name!";

        return false;
    } else {

        fullname.style.border = "1px solid #1c1763";
        errFname.innerHTML = "";

        return true;
    }
}

function userVerify() {
    if (username.value === "" || username.value === null) {

        username.style.border = "1px solid red";
        errUsername.innerHTML = "Please fill up your username!";

        return false;
    } else {
        username.style.border = "1px solid #1c1763";
        errUsername.innerHTML = "";
        return true;
    }
}

function emailVerify() {
    if (email.value === "" || email.value === null) {

        email.style.border = "1px solid red";
        errEmail.innerHTML = "Please fill up your email!";

        return false;
    } else if (!EMAIL_REGEXP.test(email.value)) {

        email.style.border = "1px solid red";
        errEmail.innerHTML = "Invalid    email!";


        return false;
    } else {

        email.style.border = "1px solid #1c1763";
        errEmail.innerHTML = "";

        return true;
    }
}

function passVerify() {
    if (password.value === "" || password.value === null) {

        password.style.border = "1px solid red";
        errPass.innerHTML = 'Please fill up your password!';

        return false;
    } else if (password.value.length < 6) {

        password.style.border = "1px solid red";
        errPass.innerHTML = 'Password must be equal or more than 6 characters!';

        return false;
    } else {

        password.style.border = "1px solid #1c1763";
        errPass.innerHTML = '';

        return true;
    }
}

function conPassVerify() {
    if (confirmPass.value === "" || confirmPass.value === null) {

        confirmPass.style.border = "1px solid red";
        errConfirmPass.innerHTML = 'Please confirm password!';

        return false;
    } else if (confirmPass.value !== password.value) {

        confirmPass.style.border = "1px solid red";
        errConfirmPass.innerHTML = 'Incorrect!';

        return false;
    } else {

        confirmPass.style.border = "1px solid #1c1763";
        errConfirmPass.innerHTML = '';

        return true;
    }
}
