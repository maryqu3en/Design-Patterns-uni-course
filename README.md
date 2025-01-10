# Les patrons de conception
Un patron de conception est un arrangement caractéristique de modules, reconnu comme bonne pratique en réponse à un problème de conception d'un logiciel. Le plus souvent basé sur les interfaces et abstractions. 

## Les types de patrons de conception

### Création
donnent des manières de créer de nouveaux objets.
- Singleton : permet de créer un objet unique.
- Abstract Factory : permet de créer des familles d'objets.

### Structuration
permettent de définir des structures de programmes.
- Adapter : permet d'adapter une interface à une autre.
- Composite : permet de traiter des objets simples et des compositions d'objets de la même manière.

### Comportement
permettent de définir moyens d'interaction entre objets.
- Observer : permet de définir une dépendance de type un-à-plusieurs entre objets.

## Les patrons de création
### Abstract Factory (Fabrique abstraite, Usine abstraite)
Fournir une interface pour créer des familles d'objets associés sans spécifier les classes réelles.
Seulment les interfaces sans leurs implementations.
- Une seule fabrique concrete est créée à l'exécution.
- Différente fabriques concrètes pour chaque famille d'objets.
- La fabrique abstraite défère la création des objets à ses sousclasses concrètes.


***The Abstract Factory pattern provides an interface to create families of related or dependent objects without specifying their concrete classes. This helps in maintaining flexibility and ensuring that the code remains open to extension but closed to modification, adhering to the Open/Closed Principle.***

### Singleton 
