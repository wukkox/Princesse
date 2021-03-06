// contient la liste de tous les people reçue par l'api starwars
var liste = [];

/**
 * Action à réaliser lorsque le dom est chargé
 */
$(document).ready(function() {
	// on utilise jquery pour faire appel à l'api de starwars
	$.ajax({
		url : "/princesses"
	}).then(function(data) {
		liste = data;
		chargerMenu();
		ajoutPrincesse();
		rechercherParId();
	});
	$.ajax({
		url : "/hello"
	}).then(function(hello) {
		chargerTitre(hello);
	});
});

/**
 * remplit le dropdown menu avec les noms de tous les people de la liste
 */
function chargerMenu() {
	liste.forEach(function(item) {
		// console.log(item);
		var newMenuItem = document.createElement('button');
		newMenuItem.className = "dropdown-item btn-dark";
		newMenuItem.type = "button";
		newMenuItem.textContent = item["name"];

		newMenuItem.addEventListener('click', function(event) {
			// l'action à effectuer lorsqu'on clique sur un element du dropdown
			// console.log(event.toElement.innerText);
			chargerPerso(item);
		});

		document.getElementById("style-1").appendChild(newMenuItem);

	});
}


function rechercherParId() {
    document.getElementById("Search").addEventListener("click",function(event){
		$.ajax({
			url:"/princesse?id="+document.getElementById("SearchId").value,
			success : (chargerPerso),
			error : (error)
		})
	});
}

function error(data){
	document.location.href="/err"
}

function chargerTitre(hello) {

	var newTitre = document.getElementById("title");
	newTitre.textContent = hello;
};

function chargerPerso(item) {

	// console.log(item);
	let newMenuItemTitre = document.getElementById("card-titre")
	newMenuItemTitre.textContent = item["name"] + " princesse "
			+ item["univers"];

	let newMenuItemTexte = document.getElementById("card-texte")
	newMenuItemTexte.textContent = item["description"];

	let newMenuItemUrl = document.getElementById("card-photo")
	let regex = /(.+jpe?g|.+gif|.png|^http.+)/gm;
	if (!regex.test(item["url"])) {
		newMenuItemUrl.src = "https://radiodisneyclub.fr/wp-content/uploads/2018/05/princesse-disney.jpg";
	} else {
		newMenuItemUrl.src = item["url"];
	}

	let newMenuBg = document.getElementById("body")
	if (item["name"] === "Maureen") {
		newMenuBg.className = "easterEgg";
	}

	else if (item["name"] === "maureen") {
		newMenuBg.className = "easterEgg";
	}

	else {
		newMenuBg.className = "";
	}
};

function ajoutPrincesse() {
	document.getElementById("submitPrincesse").addEventListener("click", function(e) {
		$.post("/princesseajout", {
			name : document.getElementById("inputNom").value,
			univers : document.getElementById("inputUnivers").value,
			description : document.getElementById("inputDescription").value,
			url : document.getElementById("inputUrl").value
		});
		document.location.reload(true);
	});
}