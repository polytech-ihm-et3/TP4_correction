Programmation Java @ Et3
<br>
Polytech Paris-Saclay | 2020-21

___

# TP4

Le but de ce TP est de réaliser une interface de choix de gestion de couleur.

Ce programme devra contenir :

  - un [*TextField*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextField.html) et un [*Slider*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Slider.html) permettant la visualisation et la modification de la composante *Rouge* de la couleur;
  - un [*TextField*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextField.html) et un [*Slider*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Slider.html) permettant la visualisation et la modification de la composante *Vert* de la couleur;
  -   - un [*TextField*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextField.html) et un [*Slider*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Slider.html) permettant la visualisation et la modification de la composante *Bleu* de la couleur;
  - un [*TextField*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextField.html) permettant la visualisation et la modification de la valeur de la couleur en base [hexadécimale](https://fr.wikipedia.org/wiki/Couleur_du_Web#Codage_informatique_des_couleurs);
  - un [*Pane*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Pane.html) qui permet de visualiser la couleur en changeant de background.

<br><div align="center"><img src="images/colorchooser.jpg" width="500"></img></div><br>

1. Créez un projet javaFX.

> Dans Eclipse, allez dans *File* > *New* > *Project...* et selectionnez *JavaFX Project*, dans le répertoire "JavaFX".

> Dans IntelliJ, allez dans *File* > *New* > *Project...* et selectionnez *JavaFX Application*, dans l'onglet "JavaFX".

2. Créez une interface, la plus proche possible de la figure ci-dessus. Vous pouvez utiliser la méthode de votre choix.

3. Créez les classes dont vous avez besoin pour faire fonctionner le programme, en respectant un pattern [*Modèle - Vue - Controlleur*](https://baptiste-wicht.developpez.com/tutoriels/conception/mvc/).

4. Liez les éléments les uns avec les autres pour faire fonctionner le programme.

> Si l'utilisateur manipule le [*Slider*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Slider.html) d'une composante (*Rouge*, *Bleu* ou *Vert*), le [*TextField*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextField.html) correspondant doit se mettre à jour et vice-versa. Une telle action doit également mettre à jour le [*TextField*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextField.html) correspondant à la valeur [hexadécimale](https://fr.wikipedia.org/wiki/Couleur_du_Web#Codage_informatique_des_couleurs) de la couleur ainsi que le [*Pane*](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Pane.html) permettant sa visualisation.
> Si l'utilisateur modifie la valeur [hexadécimale](https://fr.wikipedia.org/wiki/Couleur_du_Web#Codage_informatique_des_couleurs) de la couleur, toutes les autres vues doivent se mettre à jour.
