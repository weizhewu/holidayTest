package week1;

import java.io.Serializable;

/**
 * @author weizhewu
 */
public class Student implements Serializable {
    public String name;
    public String age;
    public String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
