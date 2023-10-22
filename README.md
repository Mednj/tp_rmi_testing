# tp_rmi_testing

Projet Java avec Hibernate et RMI

Ce projet Java illustre l'utilisation d'Hibernate, un framework ORM bien connu, et de l'Invocation de Méthode à Distance (RMI) pour gérer et accéder aux données concernant les "machines" et les "salles" dans une base de données.

Entités :

Machines : L'entité Machine représente les machines et comprend des attributs tels que la référence (ref), la marque (marque) et le prix (prix). Les machines sont liées aux "salles" (Salle) par une relation de clé étrangère.

Salles : L'entité Salle représente les salles avec des attributs, dont un identifiant unique (id) et un code. Chaque salle peut contenir une collection de machines.

Fonctionnalités du Projet :

Opérations de Création, Lecture, Mise à Jour et Suppression (CRUD) : Le projet offre des opérations CRUD pour ces entités via Hibernate, ce qui permet de stocker et récupérer des données concernant les machines et les salles.

Invocation de Méthode à Distance (RMI) : Le projet expose ces fonctionnalités CRUD via RMI, ce qui permet à des clients distants d'interagir avec les services de gestion des données.

Problème Rencontré :
Lors de l'exécution des méthodes RMI, notamment findAll et findById, une exception se produit en lien avec le chargement de classes, plus précisément org.hibernate.collection.internal.PersistentBag. Cette difficulté liée au chargement de classes lors de la désérialisation côté client empêche la récupération réussie des données depuis la base de données.

