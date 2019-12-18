# Le monde merveilleux des princesses

## Description de l'application :

Il s'agit d'une application web pour connaître un peu mieux les princesses.
Voici une liste des fonctionnalités disponible:
* Il y a une possibilité de parcourir la liste des princesses via une liste déroulante.
* Afficher les détails de cette dernière ainsi qu'une photo.
* On peut également rechercher une princesse par son id.
* Ajouter sa princesse dans la base de l'application.

![model MVC](https://i0.wp.com/www.webcky.fr/blog/wp-content/uploads/2016/09/site_web_modele_mvc.png?fit=450%2C269 "Model MVC")

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

* # /ajoutprincesse
<img src="https://github.com/wukkox/Princesse/blob/master/endpoint_ajoutprincesse.PNG?raw=true" />

* # /hello
<img src="https://github.com/wukkox/Princesse/blob/master/endpoint_hello.PNG?raw=true">

* # /princesse
<img src="https://github.com/wukkox/Princesse/blob/master/endpoint_princesse.PNG?raw=true">

* # /princesses
<img src="https://github.com/wukkox/Princesse/blob/master/endpoint_princesses.PNG?raw=true">

* # /error
<img src="https://github.com/wukkox/Princesse/blob/master/endpoint_error.PNG?raw=true">