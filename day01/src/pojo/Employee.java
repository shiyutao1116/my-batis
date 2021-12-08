package pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author shiyutao
 * @create 2021-11-29 21:54
 */

public class Employee {
    private Integer id;
    private String lastName;
    private String gender;
    private String email;
    private Depatement depatement;

    public Employee(Integer id, String lastName, String gender, String email, Depatement depatement) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.depatement = depatement;
    }

    public Employee() {
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Depatement getDepatement() {
        return depatement;
    }

    public void setDepatement(Depatement depatement) {
        this.depatement = depatement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
