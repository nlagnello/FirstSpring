/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstspring;

import java.util.Objects;

/**
 *
 * @author nagnello
 */
public class Owner {
    
    private String name;
    private Animal pet;

    public Owner(String name, Animal pet){
        this.name = name;
        this.pet = pet;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Owner other = (Owner) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + ", pet=" + pet + '}';
    }
    
    
    
    
}
