package test;

import java.util.Objects;

public class nguoi {
    private String name ;
    private int age ;
    public nguoi(){

    }
    public nguoi(String name , int age ){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+" "+age;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        nguoi t = (nguoi) obj;
        return this.age == t.age && name.equals(t.name);
    }

public int hashCode(){
        return Objects.hash(name,age);
}


}
