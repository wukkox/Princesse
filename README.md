# Le monde merveilleux des princesses

## Description de l'application :

Il s'agit d'une application web pour connaître un peu mieux les princesses.
Voici une liste des fonctionnalités disponible:
* Il y a une possibilité de parcourir la liste des princesses via une liste déroulante.
* Afficher les détails de cette dernière ainsi qu'une photo.
* On peut également rechercher une princesse par son id.
* Ajouter sa princesse dans la base de l'application.

<img src="https://i0.wp.com/www.webcky.fr/blog/wp-content/uploads/2016/09/site_web_modele_mvc.png?fit=450%2C269" alt="Model MVC" >

Le développement de cette application a été pensé sur le Design Pattern MVC.
* **Model** : Constructeur de l'objet princesse
* **Controller** : Initialise la liste des princesses, ainsi que toute la logique du programme
* **View** : L'affichage sur le navigateur du résultat en fonction des requêtes HTTP

## **Liste des techno utilisés pour cette application**

| Front-End  |   | Back-End |       |
| ------------- |:-------------:| ------------- |:-------------:|
| <img src="https://www.w3.org/html/logo/downloads/HTML5_Badge_256.png" width="25" />  |  HTML      | <img src="https://upload.wikimedia.org/wikipedia/fr/thumb/2/2e/Java_Logo.svg/1200px-Java_Logo.svg.png" width="25" /> |Java 
| <img src="https://icons-for-free.com/iconfiles/png/512/css3+internet+style+technology+web+website+icon-1320192729058533072.png" width="25" />    |  CSS     | <img src="https://cdn.iconscout.com/icon/free/png-256/tomcat-4-1175087.png" width="25" />  |   TomCat 
| <img src="https://www.consept.fr/wp-content/uploads/JavaScript-2.png" width="25" />  | Javascript  | <img src="https://camo.githubusercontent.com/95d138b90a604f7a12be60f90cb30035fd4f4507/68747470733a2f2f692e696d6775722e636f6d2f5753446c6c77612e706e67" width="25" /> |     Json via API 


<img src="https://cdn.discordapp.com/attachments/631548145737662504/656820219767029761/DiagrammePrincesses.jpg" />

## Liste des endpoints de l'application

* # /princesseajout?name=&univers=&description=&url=

```json
{
name: "Olivier",
univers: "Simplon",
description: "En vrai, c'est compliqué d'être une princesse, mais tous les jours je me lève et je me dis que la vie est amazing, and I think i'm lucky to be a sexy princess... Do you have some cookies or schoko-bon?.",
id: 1,
url: "https://cdn.discordapp.com/attachments/631548145737662504/654989799580499978/Princesse_Olivier.jpg"
},
{
name: "Blanche Neige",
univers: "Disney",
description: "Blanche Neige est une princesse d'une très grande beauté, ce qui rend jalouse sa belle-mère. Celle-ci demande quotidiennement à son miroir magique de lui dire qu'elle est la plus belle ; mais un jour, le miroir affirme que la plus belle femme du royaume est Blanche Neige. La reine décide alors de la tuer mais le garde chargé de cette tâche ne trouve pas le courage et abandonne Blanche Neige dans la forêt. Perdue, à bout de force, elle échoue dans une maison où habitent sept nains.",
id: 2,
url: "https://www.teteamodeler.com/images/assets/8508bc69207e232f9f94de031d61c85a.jpg"
}
```

* # /hello

```json
Bienvenue dans le monde des Princesses !
```

* # /princesse?id=

```json
{
name: "Olivier",
univers: "Simplon",
description: "En vrai, c'est compliqué d'être une princesse, mais tous les jours je me lève et je me dis que la vie est amazing, and I think i'm lucky to be a sexy princess... Do you have some cookies or schoko-bon?.",
id: 1,
url: "https://cdn.discordapp.com/attachments/631548145737662504/654989799580499978/Princesse_Olivier.jpg"
}
```

* # /princesses

```json
{
name: "Olivier",
univers: "Simplon",
description: "En vrai, c'est compliqué d'être une princesse, mais tous les jours je me lève et je me dis que la vie est amazing, and I think i'm lucky to be a sexy princess... Do you have some cookies or schoko-bon?.",
id: 1,
url: "https://cdn.discordapp.com/attachments/631548145737662504/654989799580499978/Princesse_Olivier.jpg"
},
{
name: "Blanche Neige",
univers: "Disney",
description: "Blanche Neige est une princesse d'une très grande beauté, ce qui rend jalouse sa belle-mère. Celle-ci demande quotidiennement à son miroir magique de lui dire qu'elle est la plus belle ; mais un jour, le miroir affirme que la plus belle femme du royaume est Blanche Neige. La reine décide alors de la tuer mais le garde chargé de cette tâche ne trouve pas le courage et abandonne Blanche Neige dans la forêt. Perdue, à bout de force, elle échoue dans une maison où habitent sept nains.",
id: 2,
url: "https://www.teteamodeler.com/images/assets/8508bc69207e232f9f94de031d61c85a.jpg"
}
```

* # /error
<img src="https://github.com/wukkox/Princesse/blob/master/endpoint_error.PNG?raw=true">

# Page d'accueil de l'application

<img src="https://media.discordapp.net/attachments/631548145737662504/656818808002183168/unknown.png?width=1200&height=568">

<a href="https://api-spring-simplon.cfapps.io/">Version live</a>