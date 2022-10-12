package tarnsport;

public enum TypeOfCapacity {

    ESPECIALLY_SMALL("до 10 мест"),
    SMALL("до 25"),
    MIDDLE("40-50"),
    BIG("60-80"),
    ESPECIALLY_BIG("100-120 мест");

    private final String description;

    TypeOfCapacity(String description) {
        if (description == null || description.isBlank()) {
            this.description = "Данные не указаны.";
        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }
}

