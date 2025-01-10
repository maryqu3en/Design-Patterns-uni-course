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
Créer un systeme qui controle l'unicité d'une instance pour toute la durée du programme, et fournir un point d'acces global à celle-ci.
L'idee est que la classe singleton dispose d'un attribut de classe (static) du même type qui pointe vers l'unique instance.
- Le constructeur est privé pour empecher la création d'instances.
- L'instance est stockée dans un attribut de classe.
- Une méthode statique permet d'accéder à l'instance.
- L'instance est créée la première fois que la méthode statique est appelée.
- L'attribut est mis a jour

***The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. It is useful when a single object is required to coordinate actions across a system, such as a shared resource.***

## Les patrons de structuration
### Adapter 
- Permet à des objets avec des interfaces incompatibles de collaborer.
- Convertir une interface en une autre interface attendue par le client.
**Raisons d'utilisation**
- Le système doit intégrer un sous système existant.
- Ce sous système a une interface non standard par rapport au système.
- La solution est de masquer cette interface non standard au système et de lui présenter une interface standard.
- La partie cliente utilise les méthodes de l'adaptateur qui utilise les méthodes du sous-système pour réaliser les opérations correspondantes.

***The Adapter pattern allows objects with incompatible interfaces to collaborate. It acts as a bridge between the two incompatible interfaces, allowing them to work together.***

### Composite