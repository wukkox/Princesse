package co.simplon.apispringsimplon.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.apispringsimplon.model.Princesse;

/**
 * 
 * @author Virgile
 * Api de gestion du royaume des princesses
 */
@CrossOrigin("*")
@RestController
public class PrincesseController {
	
	List<Princesse> princesseList;
	
	public PrincesseController (){
	princesseList = new ArrayList<Princesse>( Arrays.asList(
	
			new Princesse("Olivier", "Simplon", "En vrai, c'est compliqué d'être une princesse, mais tous les jours je me lève et je me dis que la vie est amazing, and I think i'm lucky to be a sexy princess... Do you have some cookies or schoko-bon?.", "https://cdn.discordapp.com/attachments/631548145737662504/654989799580499978/Princesse_Olivier.jpg"),
			new Princesse("Blanche Neige", "Disney", "Blanche Neige est une princesse d'une très grande beauté, ce qui rend jalouse sa belle-mère. Celle-ci demande quotidiennement à son miroir magique de lui dire qu'elle est la plus belle ; mais un jour, le miroir affirme que la plus belle femme du royaume est Blanche Neige. La reine décide alors de la tuer mais le garde chargé de cette tâche ne trouve pas le courage et abandonne Blanche Neige dans la forêt. Perdue, à bout de force, elle échoue dans une maison où habitent sept nains.", "https://www.teteamodeler.com/images/assets/8508bc69207e232f9f94de031d61c85a.jpg"),
			new Princesse("Cendrillon ", "Disney", "Cendrillon, servante de sa marâtre et de ses demi-soeurs reçoit un jour la visite de sa marraine fée qui la pare d'une robe de princesse à l'occasion d'une reception donnée par le prince. N'ayant que la permission de minuit, elle s'enfuit et perd une pantoufle de verre. Le prince tombé amoureux tentera de la retrouver grâce à cette pantoufle oubliée, trop petite pour un pied ordinaire.", "https://www.teteamodeler.com/images/assets/6626a421eda3a7020e74b6d33fce244e.jpg"),
			new Princesse("Aurore ", "Disney", "La princesse Aurore, victime d'un sort que lui a jeté la sorcière Maléfique, s'est endormie d'un profond sommeil dont le seul baiser d'un prince peut l'éveiller. Ses marraines, les fées Pimprenelle, Flora et Pâquerette, unissent leurs pouvoirs magiques pour aider le vaillant prince Philippe à combattre le redoutable dragon, gardien du château où dort Aurore.", "https://www.teteamodeler.com/images/assets/c4af9919ac42e65b8230808c48b578ab.jpg"),
			new Princesse("Ariel ", "Disney", "Malgré l'interdiction de son père, le roi Triton, Ariel, la petite sirène, ne peut résister à la tentation d'aller à la rencontre d'un monde inconnu, celui des humains. Accompagnée de Polochon, elle gagne la surface de l'océan et s'approche d'un grand navire où est donnée une grande fête en l'honneur du prince Eric, dont elle tombe immédiatement amoureuse. Une terrible tempête se lève et le prince est projeté par-dessus bord. Ariel le sauve de la noyade, le dépose sur le continent puis disparaît. Mais elle ne réussit pas à oublier le prince.", "https://www.teteamodeler.com/images/assets/ca6acbd412569d37854b09ab781d6e2d.jpg"),
			new Princesse("Belle", "Disney", "Belle est une jeune fille sensible et imaginative, qui passe ses journées plongée dans la lecture et qui repousse obstinément les avances de Gaston, un bellâtre musclé et vaniteux. Seul Maurice, son père, un inventeur farfelu, compte dans sa vie. Un jour que ce dernier se perd dans la forêt, il doit se réfugier dans un château pour échapper à une meute de loups. Irrité par son intrusion, le maître des lieux, une Bête gigantesque et terrifiante, le jette dans un cachot. Pour sauver son père, Belle accepte d'être retenue prisonnière à sa place…", "https://www.teteamodeler.com/images/assets/cad6fce8bea2271089c12a9315caf9e4.jpg"),
			new Princesse("Jasmine ", "Disney", "Jasmine est une princesse indépendante, intelligente qui a du cran. N'écoutant que les inclinations de son cœur, elle souffre de sa vie reclue dans le palais de son père, le sultan ! Quelques jours avant ses seize ans, elle fugue et se réfugie au marché. Aladdin va alors la tirer d'un mauvais pas alors qu'elle se dispute avec un marchand qui l'accuse de vol. C'est à ce moment que commence une magnifique histoire d'amour entre les deux jeunes gens aidés par le géni de la lampe. Jasmine n'est pas l'héroïne principale du film Aladdin mais y tient un rôle très important.", "https://www.teteamodeler.com/images/assets/ef4b998f0537726eba35d67c879a0b6d.jpg"),
			new Princesse("Pocahontas ", "Disney", "Sur le « Nouveau Monde », Pocahontas est la fille du chef Powhatan. En l'an 1607, elle apprend que son père veut la marier à Kocoum, un de ses meilleurs guerriers de leur tribu. Mais Pocahontas trouve cet homme trop sévère et trop sérieux et ne veut pas de ce mariage. Elle demande alors l'avis d'un arbre nommé Grand-Mère Feuillage. L'esprit lui dit de suivre son cœur. Au même moment, des colons anglais dont fait partie John Smith entrent sur le continent. La belle Pocahontas a le pouvoir d'éviter la guerre entre les colons anglais et son peuple et de sauvegarder ainsi ses amours avec le fringant aventurier.", "https://www.teteamodeler.com/images/assets/e07fb768e56c419cdb616935a73c351e.jpg"),
			new Princesse("Mulan ", "Disney", "Mulan est une belle jeune fille qui vit dans un village chinois. Malgré son amour et son respect pour sa famille, son mépris des conventions l'éloigne des rôles dévolus aux filles devouées. Quand son pays est envahi par les Huns, Mulan, n'écoutant que son courage, s'engage à la place de son père dans le but de lui sauver la vie. Elle va devenir, avec l'aide d'un dragon en quète de réhabilitation, un guerrier hors du commun.", "https://www.teteamodeler.com/images/assets/1b6e08500432163a23f5890f60bd078e.jpg"),
			new Princesse("Tiana ", "Disney", "Tiana est une jeune serveuse et une chef talentueuse. Elle rêve de posséder son propre restaurant pour suivre la voie de son père. Tiana a un caractère fort, elle est motivée, déterminée et indépendante. N'écoutant que son coeur, elle aime faire les choses a sa façon. Du haut de ses 19 ans, elle va apprendre à équilibrer sa vie entre l'amour et sa vie professionnelle", "https://www.teteamodeler.com/images/assets/74de8b91c4eeb64117f4aab068ab6fc5.jpg"),
			new Princesse("Raiponce ", "Disney", "Lorsque Flynn Rider, le bandit le plus recherché du royaume, se réfugie dans une mystérieuse tour, il se retrouve pris en otage par Raiponce, une belle et téméraire jeune fille à l’impressionnante chevelure de 20 mètres de long, gardée prisonnière par Mère Gothel. L’étonnante geôlière de Flynn cherche un moyen de sortir de cette tour où elle est enfermée depuis des années. Elle passe alors un accord avec le séduisant brigand… C’est le début d’une aventure délirante bourrée d’action, d’humour et d'émotion, au cours de laquelle l’improbable duo va rencontrer un cheval super-flic, un caméléon à l’instinct de protection surdéveloppé, et une drôle de bande de malfaiteurs.", "https://www.teteamodeler.com/images/assets/24c775083534b077968864e5ef0dd575.jpg"),
			new Princesse("Mérida", "Disney", "Depuis la nuit des temps, au cœur des terres sauvages et mystérieuses des Highlands d’Ecosse, récits de batailles épiques et légendes mythiques se transmettent de génération en génération. Merida, l’impétueuse fille du roi Fergus et de la reine Elinor, a un problème… Elle est la seule fille au monde à ne pas vouloir devenir princesse ! Maniant l’arc comme personne, Merida refuse de se plier aux règles de la cour et défie une tradition millénaire sacrée aux yeux de tous et particulièrement de sa mère. Dans sa quête de liberté, Merida va involontairement voir se réaliser un vœu bien malheureux et précipiter le royaume dans le chaos. Sa détermination va lui être cruciale pour déjouer cette terrible malédiction.", "https://www.teteamodeler.com/images/assets/722ef81b47edce7bff3479c45ee86cba.jpg"),
			new Princesse("Leia Organa", "Star Wars", "Alors qu'elle a déjà perdu sa mère biologique Padmé Amidala à la naissance, et qu'elle est cachée de son père, Dark Vador dont elle ignore l'identité, la jeune fille est élevée par son père adoptif, Bail Organa, sénateur d'Alderaan.", "https://vignette.wikia.nocookie.net/fr.starwars/images/f/fc/Leia_Organa_TLJ.png/revision/latest?cb=20171224084007"),
			new Princesse("Agnès", "Moi Moche et Méchant", "La cadette des trois sœurs est toujours aussi débordante de tendresse et d'affection. Elle est tellement craquante que ses câlins sont à même d'adoucir le cœur du plus insensible des super-vilains.", "https://data.whicdn.com/images/158798268/original.gif"),
			new Princesse("Vanellope von Schweetz", "Disney", "Surnommée « l’anomalie », Vanellope est une erreur de programmation dans le jeu Sugar Rush. Elle a l'esprit de compétition chevillé au corps et est bien décidée à se faire une place sur la ligne de départ, au milieu des autres coureurs. Le problème, c’est que les autres ne veulent pas d’elle, ils refusent de voir une « défaillance » dans leur jeu. Rejetée depuis toujours, Vanellope a développé un humour mordant et un sens de la repartie redoutable. Mais sous cette carapace, il y a un cœur fondant… une douceur qui attend l’occasion de se révéler. En plus elle ne peut pas quitter son jeu car elle est un bug, sauf lorsque elle a corrigé son bug a la ligne d'arrivé, et que la mémoire des habitants du jeu sur celle ci est revenue et elle peut désormais quitter le jeu.", "https://vignette.wikia.nocookie.net/disney/images/2/25/Profile_-_Vanellope_Von_schweetz.jpeg/revision/latest?cb=20190312023329"),
			new Princesse("Elsa", "Disney", "Elsa est la reine d'Arendelle et grande sœur d'Anna. Elle semble majestueuse et réservée, mais elle vit en réalité dans la peur, hantée par le matin où elle a failli tuer sa sœur à cause de ses pouvoirs. Elle a tout fait pour les cacher et essayer de les maîtriser, mais elle ne peut les contenir le soir de son couronnement. Accusée de sorcellerie, elle fuit hors du royaume et ses fortes émotions déclenchent un hiver éternel sur Arendelle. Ne pouvant elle-même l'arrêter, elle est convaincue d'être un monstre destiné à être solitaire et que personne ne peut l'aider.", "https://media1.s-nbcnews.com/j/newscms/2019_40/1487941/elsa-frozen-today-square-190930_9b00e4263b90a7a2da04c98b01babf94.fit-760w.jpg")
			));
	}
	/**
	 * Retourne la liste de toutes les princesses
	 * @return la liste complète des princesses
	 */
	@RequestMapping("/princesses")
	public List<Princesse> getPrincesses() {
		return princesseList;
	}
		
	/**
	 * Retourne la princesse en fonction de l'id passé en paramètre, 404 not found en cas d'echec
	 * @param id de la princesse
	 * @return la princesse trouvée ou 404 not found
	 */
	@RequestMapping("/princesse")
	public ResponseEntity<Object> getPrincesse(@RequestParam(value = "id") int id) {
		for (Princesse princesse : princesseList) {
			if(princesse.getId() == id) {
				return ResponseEntity.ok(princesse);
			}
		}
		return ResponseEntity.notFound().build();
	}
	
	/**
	 * Un simple retour d'une String
	 * @return String utilisé pour changer le titre de l'application
	 */
	@RequestMapping("/hello")
	public ResponseEntity<String> disBonjour() {
		return ResponseEntity.ok("Bienvenue dans le monde des Princesses !");
		}
	
	/**
	 * Ajoute à la liste les paramètres reçu afin de créer une princesse et l'ajouter à la liste existante
	 * @param name de la princesse
	 * @param univers de la princesse
	 * @param description de la princesse 
	 * @param url de la photo de la princesse
	 * @return la liste de princesse mise à jour
	 */
	@RequestMapping("/princesseajout")
	public List<Princesse> ajoutPrincesse(
			@RequestParam(value = "name") String name, 
			@RequestParam(value = "univers") String univers, 
			@RequestParam(value = "description") String description, 
			@RequestParam(defaultValue = "https://radiodisneyclub.fr/wp-content/uploads/2018/05/princesse-disney.jpg",
						  value = "url") String url) {
		princesseList.add(new Princesse(name, univers, description, url));
		return princesseList;
		}
	
	/**
	 * Permet de personnalisé la page d'erreur
	 * @param request
	 * @return le template à charger pour afficher une page d'erreur
	 */
	@GetMapping("/error")
	public String handleError(HttpServletRequest request) {
	    return "404";
	}

}