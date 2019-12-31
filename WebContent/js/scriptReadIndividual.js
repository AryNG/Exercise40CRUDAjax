/**
 * 
 */
let xhr = new XMLHttpRequest();

window.onload = function(){
	document.getElementById("btnReadInidivudal").addEventListener("click",readIndividual);
}

function readIndividual(){
	xhr.onload =  Callback;
	let idProduct = document.getElementById("txtIdProductC").value;
	let myForm = new FormData();
	myForm.append("idProduct", idProduct);
	
	xhr.open("POST","ReadIndividualServlet");
	xhr.send(myFomr);
}
function Callback(){
	document.getElementById("result").innerHTML = xhr.responseText;
}