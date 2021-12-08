package pojo;

import java.io.Serializable;

/**
 * @author shiyutao
 * @create 2021-12-02 15:09
 */
public class Depatement implements Serializable{
    private Integer id;
    private String  name;

    public Depatement() {
    }

    public Depatement(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Depatement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
