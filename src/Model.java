final class Model {
    private String modelName;
    private CarModelType modelType;

    public Model(String modelName, CarModelType modelType) {
        this.modelName = modelName;
        this.modelType = modelType;
    }

    public String getModelName() {
        return modelName;
    }

    public CarModelType getModelType() {
        return modelType;
    }
}