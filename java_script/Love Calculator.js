prompt("What is your name?");
prompt("What is their name?");

var loveScore = Math.random() * 100;
loveScore = Math.floor(loveScore) + 1;
alert("Your love score is: " + loveScore+ "%");

if (loveScore > 70) {
    alert("You love each other like Kanye loves Kanye.");
}

if (loveScore > 30 && loveScore <= 70) {
    alert("You go together like coke and mentos.");
}
if (loveScore <= 30) {
    alert("You go together like oil and water.");
}