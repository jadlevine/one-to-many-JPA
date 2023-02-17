# Credit

## BezKoder - JPA One to Many example with Hibernate and Spring Boot

---

[Article](https://www.bezkoder.com/jpa-one-to-many/)

---

[GitHub SourceCode](https://github.com/bezkoder/spring-boot-one-to-many)

---

For Discussion of Exceptions see [this](https://www.bezkoder.com/spring-boot-restcontrolleradvice/)

---

---

# Notes

1. implementing @ManyToOne rather than @OneToMany allows us to:

   - work with Pagination, [ref](https://bezkoder.com/spring-boot-pagination-filter-jpa-pageable/)
   - sort/order by multiple fields, [ref](https://bezkoder.com/spring-data-sort-multiple-columns/)

2. [Derived Queries](https://www.bezkoder.com/jpa-repository-query/)

3. [Custom queries with @Query](https://www.bezkoder.com/spring-jpa-query/)

4. [Unit testing for this project](https://bezkoder.com/spring-boot-unit-test-jpa-repo-datajpatest/)

5. When creating new tutorials, ids are incrementing by 50 (even though allocationSize = 1 ... ?)
   - needed to add @sequenceGenerator between @Id and @GeneratedValue in Tutorial.java
     `@SequenceGenerator(name = "tutorial_generator", sequenceName = "tutorial_generator", allocationSize = 1)`
