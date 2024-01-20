/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07058;

/**
 *
 * @author Viet Dang
 */
public class Subject implements Comparable<Subject> {
    private String id, name, work;

    public Subject() {
    }

    public Subject(String id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWork(String work) {
        this.work = work;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWork() {
        return work;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + work;
    }
    
    @Override
    public int compareTo(Subject x) {
        return this.id.compareTo(x.id);
    }
}
