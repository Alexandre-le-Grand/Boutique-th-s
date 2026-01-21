Boutique de Thé

Application simple pour gérer un stock de thés (Ajout, Modification, Suppression).
Lancement rapide
1. Lancer la base de données (Docker)

Copie cette commande dans ton terminal pour créer la base de données :
Bash

docker run --name ma-bdd-thes -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=thes -p 3315:3306 -d mysql:8.0

2. Configuration (application.properties)

Vérifie que ton fichier a bien ces 3 lignes :

    URL : jdbc:mysql://127.0.0.1:3315/thes

    User : root

    Password : root

3. Accès

    L'application : http://localhost:8080

    La base de données (interface) : http://localhost:8081 (si tu as lancé phpMyAdmin)

Structure

    Java : Controller, Service, Repository, Model.

    HTML : index.html (liste) et formulaire-produit.html (ajout/modif).