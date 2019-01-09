console.log("JS Loaded");
let userScore = 0;
let compScore = 0;
const userScore_span = document.getElementById("user-score");
const compScore_span = document.getElementById("comp-score");
const scoreBoard_div = document.querySelector(".scoreboard");
const result_div = document.querySelector(".result > p");
const rock_div = document.getElementById("r");
const paper_div = document.getElementById("p");
const scissors_div = document.getElementById("s");

function getCompChoice()
{
	const choices = ['r', 'p', 's'];
	const compChoice = Math.floor(Math.random() * 3);
	console.log("Comp choice is: " + choices[compChoice]);
	return choices[compChoice];
}

function convertToWord(letter)
{
	if (letter === 'r') return "Rock";
	if (letter === 'p') return "Paper";
	return "Scissors";
}

function gameDraw(userCh, compCh){
	console.log("draw");

	const smallUsr = "user".fontsize(3).sub();
	const smallComp = "comp".fontsize(3).sub();
	result_div.innerHTML = `${convertToWord(userCh)}${smallUsr} draws to ${convertToWord(compCh)}${smallComp}. It's a Draw !!! -_-`;
	document.getElementById(userCh).classList.add("draw")
	setTimeout(function(){document.getElementById(userCh).classList.remove("draw");} ,300 );
}

function gameWin(userCh, compCh){
	userScore++;
	userScore_span.innerHTML = userScore;

	const smallUsr = "user".fontsize(3).sub();
	const smallComp = "comp".fontsize(3).sub();
	result_div.innerHTML = `${convertToWord(userCh)}${smallUsr} beats ${convertToWord(compCh)}${smallComp}. You Win !!! :)`;
	document.getElementById(userCh).classList.add("win")
	setTimeout(function(){document.getElementById(userCh).classList.remove("win");} ,300 );
}

function gameLose(userCh, compCh){
	compScore++;
	compScore_span.innerHTML = compScore;

	const smallUsr = "user".fontsize(3).sub();
	const smallComp = "comp".fontsize(3).sub();
	result_div.innerHTML = `${convertToWord(userCh)}${smallUsr} loses to ${convertToWord(compCh)}${smallComp}. You Lose ! :(`;
	document.getElementById(userCh).classList.add("lose")
	setTimeout(function(){document.getElementById(userCh).classList.remove("lose");} ,300 );
}

function game(userChoice)
{
	const computerChoice = getCompChoice();

	switch(userChoice + computerChoice)
	{
		case "rs":
		case "pr":
		case "sp":
			gameWin(userChoice, computerChoice);
			break;
		case "rp":
		case "ps":
		case "sr":
			gameLose(userChoice, computerChoice);
			break;
		case "rr":
		case "pp":
		case "ss":
			gameDraw(userChoice, computerChoice);
			break;
	}
}

function main() {
	console.log("Main function");

	rock_div.addEventListener('click', function() {
		console.log("ROCK clicked!");
		game('r');
	})

	paper_div.addEventListener('click', function() {
		console.log("paper clicked!");
		game('p');
	})

	scissors_div.addEventListener('click', function() {
		console.log("scissors clicked!");
		game('s');
	})
}

main();