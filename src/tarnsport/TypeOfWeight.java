package tarnsport;

public enum TypeOfWeight {
    N1("с полной массой до 3,5 тонн"),
    N2("с полной массой свыше 3,5 до 12 тонн"),
    N3("с полной массой свыше 12 тонн");
    private final String description;

    TypeOfWeight(String description) {
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