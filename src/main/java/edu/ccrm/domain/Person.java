package edu.ccrm.domain;

/**
 * Abstract Person demonstrating abstraction & inheritance.
 */
public abstract class Person {
    protected final String id;
    protected String fullName;
    protected String email;

    protected Person(String id, String fullName, String email) {
        assert id != null && !id.isBlank();
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }

    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }

    public abstract String profile();
}
