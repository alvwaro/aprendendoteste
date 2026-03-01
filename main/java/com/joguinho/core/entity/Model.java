package com.joguinho.core.entity;

public class Model {

    private int id;
    private int vertexCount;
    private int indexCount;
    private Material material;

    public Model(int id, int vertexCount, int indexCount){
        this.id = id;
        this.vertexCount = vertexCount;
        this.indexCount = indexCount;
        this.material = new Material();
    }

    public Model(int id, int vertexCount, int indexCount, Texture texture) {
        this.id = id;
        this.vertexCount = vertexCount;
        this.indexCount = indexCount;
        this.material = new Material(texture);
    }

    public Model(Model model, Texture texture) {
        this.id = model.getId();
        this.vertexCount = model.getVertexCount();
        this.indexCount = model.getIndexCount();
        this.material = model.getMaterial();
        this.material.setTexture(texture);
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public Texture getTexture() {
        return material.getTexture();
    }

    public void setTexture(Texture texture) {
        material.setTexture(texture);
    }

    public int getIndexCount() {
        return indexCount;
    }

    public void setTexture(Texture texture, float reflectance) {
        this.material.setTexture(texture);
        this.material.setReflectance(reflectance);
    }

}
