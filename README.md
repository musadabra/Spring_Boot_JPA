# Spring_Boot_JPA

USEFULL RESOURCES
https://dev.to/reytech-lesson/form-submitting-with-spring-boot-validation-5clg

MANY-TO-MANY Relation
https://www.baeldung.com/jpa-many-to-many

https://www.infoworld.com/article/3379043/what-is-jpa-introduction-to-the-java-persistence-api.html?page=2

NOTE

From a programming perspective, the ORM layer is an adapter layer: it adapts the language of object graphs to the language of SQL and relational tables. The ORM layer allows object-oriented developers to build software that persists data without ever leaving the object-oriented paradigm.
When you use JPA, you create a map from the datastore to your application's data model objects. Instead of defining how objects are saved and retrieved, 
you define the mapping between objects and your database, then invoke JPA to persist them. 
If you're using a relational database, much of the actual connection between your application code and the database will then be handled by JDBC, 
the Java Database Connectivity API.

As a spec, JPA provides metadata annotations, which you use to define the mapping between objects and the database. Each JPA implementation provides its own engine for JPA annotations. The JPA spec also provides the PersistanceManager or EntityManager, which are the key points of contact with the JPA system (wherein your business logic code tells the system what to do with the mapped objects).

DTO, or data transfer object. DTOs are a common feature of software development. While they hold many kinds of data, they do not contain any business logic. Persisting data objects is a ubiquitous challenge in software development.

CRUD operations
Once you've mapped a class to a database table and established its primary key, you have everything you need to create, retrieve, delete, and update that class in the database. Calling session.save() will create or update the specified class, depending on whether the primary-key field is null or applies to en existing entity. Calling entityManager.remove() will delete the specified class.