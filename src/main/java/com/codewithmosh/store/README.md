1. Bean can be managed with code without having to use the annotations inside the code. This is used t
have some level of flexibility when it comes to bean creation especially when you want to have some
flexible logic while creating the bean. To managed bean with code, you can achieve this in the AppConfig
class which is used to manage the bean for the classes in the notification package

2. Spring creates Bean at application startUp. This is known as early/eager initialization. The
creation of bean can also be managed and created when needed. To do this you have to annotate the
class wit @Lazy. If you are to create and manage the bean from the AppConfig, the method should be
annotated with the @Lazy annotation. This is a powerful optimization technique which enables creation
of bean only when it is needed.

3. Values is the application.properties or application.yaml file can be binded in the code suing the
@Value annotation

4. BEAN SCOPE: The scope of a bean determine how and when it is created and how long it lives in the
spring IoC container. Scope types are:
- Singleton: This is the default and only 1 instance of the bean is created
- Prototype: A new instance of the bean is created anytime it is requested in the IoC container. To
change the scope of a bean, with use the annotation @Scope in the AppConfig class or in the service 
class when managing the bean creation using annotation and not AppConfig
- Request: A new instance of the bean is created for each http request
- Session: A new instance of the bean is created for each http session

5. BEAN LIFECYCLE: After a bean is created, we can perform other actions or initializations like
database connections, network connection, etc. 
- After bean creation: This can be achieved by using the @PostConstruct annotation
- Before bean is destroyed: This can be achieved by using the @PreDestroy annotation. This gives us an
opportunity to release resources like database connection.For this to be properly applied, the
application context needs to be closed by using context.close() 

6. LOMBOK
- @Data = @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor.
- @RequiredArgsConstructor generates constructor for only required fields. Fields marked as @NonNull is included
in the generated constructor
- @NoArgsConstructor generates an empty or default constructor
- @AllArgsConstructor generates constructor with all the fields included


CREATING RELATIONSHIPS

            User (1)
                |
                |  (OneToMany)
                ↓
            Address (Many) ---- user_id (FK)
✅ Key Takeaways
1.	One-to-Many means one parent, many children
2.	The Many side owns the relationship (has the foreign key)
3.	Use:
•	@OneToMany(mappedBy = "...") on parent
•	@ManyToOne + @JoinColumn on child
4.	Always update the owning side to persist changes
5.	Sync both sides for clean, predictable behavior