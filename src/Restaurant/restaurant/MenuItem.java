package Restaurant.restaurant;

public class MenuItem {
    private final int menuId;
    private final String name;
    private final Double price;
    private final String description;
    private final menuCategory category;
    private boolean isNew;

    public MenuItem(String name, Double price, String description, String category, Boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

}
