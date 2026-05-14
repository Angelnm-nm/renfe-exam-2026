package org.iesam.features.train.domain; //cambiar por la ruta correcta

public class Train {
    private String id;
    private String name;
    private String large;
    private String material;

    public Train(String id, String name, String large, String material) {
        this.id = id;
        this.name = name;
        this.large = large;
        this.material = material;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", large='" + large + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
