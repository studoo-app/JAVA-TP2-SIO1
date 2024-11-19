![separe](https://github.com/studoo-app/.github/blob/main/profile/studoo-banner-logo.png)
# TD 2 Java : Les tableaux et les listes
[![Version](https://img.shields.io/badge/Version-2024-blue)]()

## Objectifs :
- Savoir manipuler les éléments d'un tableau et d'une liste.
- Comprendre les différences entre un tableau et une liste.
- Effectuer des opérations courantes comme tri, recherche et transformation.

## Applications :

### Les tableaux

#### Exercice 1 - Création et affichage d’un tableau :

- Créez un tableau d'entiers contenant les éléments suivants : 5, 10, 15, 20, 25.
- Affichez les éléments du tableau avec une boucle `for`.

#### Exercice 2 - Recherche dans le tableau :
- Créez un tableau d'entiers contenant les éléments suivants : 5, 10, 15, 20, 25.
- Demandez à l’utilisateur de saisir un nombre.
- Vérifiez si ce nombre est présent dans le tableau. Si oui, affichez sa position (index).

#### Exercice 3 - Modification du tableau :
- Créez un tableau d'entiers contenant les éléments suivants : 5, 10, 15, 20, 25.
- Multipliez chaque élément du tableau par 2
- Affichez le nouveau tableau.

#### Exerccice 4 - Exploration des méthodes :
- Créez un tableau d'entiers contenant les éléments suivants : 5, 10, 15, 20, 25.
- Demandez à l’utilisateur de saisir un nombre à ajouter au tableau (utilisez un tableau dynamique, ce qui nécessitera de créer un nouveau tableau avec une taille augmentée de 1).

### Les listes

#### Exercice 1 - Création et affichage d’une liste :
- Créez une liste de chaînes de caractères contenant les noms suivants : Alice, Bob, Charlie, Diana.
- Ajoutez un nom supplémentaire à la liste (Eve) 
- Affichez la liste avec une boucle `for-each`.

#### Exercice 2 - Recherche dans la liste :
- Créez une liste de chaînes de caractères contenant les noms suivants : Alice, Bob, Charlie, Diana.
- Demandez à l’utilisateur de saisir un nom.
- Vérifiez si ce nom est présent dans la liste. Si oui, affichez "Nom trouvé". Sinon, affichez "Nom non trouvé".

#### Exercice 3 - Suppression dans la liste :
- Créez une liste de chaînes de caractères contenant les noms suivants : Alice, Bob, Charlie, Diana.
- Supprimez le nom Charlie de la liste. 
- Affichez à nouveau la liste.

#### Exercice 4 - Tri de la liste :
- Triez la liste par ordre alphabétique en utilisant Collections.sort()
- Affichez la liste.

### Tableau vs Liste

#### Exercice 1 - Conversion tableau → liste :
- Créez un tableau d'entiers contenant les éléments suivants : 5, 10, 15, 20, 25.
- Convertissez le tableau `int[]` de l'exercice 1 en une liste d’entiers (`List<Integer>`).
Affichez la liste obtenue.

#### Exercice 2 - Conversion liste → tableau :
- Créez une liste de chaînes de caractères contenant les noms suivants : Alice, Bob, Charlie, Diana.
- Convertissez la liste en un tableau de chaînes de caractères.
- Affichez le tableau obtenu.

#### Exercice 3 : Challenge (optionnel)
- Créez une fonction qui prend une liste d’entiers en entrée, supprime tous les nombres pairs, et renvoie une nouvelle liste contenant uniquement les nombres impairs.
- Testez cette fonction avec une liste saisie par l'utilisateur.