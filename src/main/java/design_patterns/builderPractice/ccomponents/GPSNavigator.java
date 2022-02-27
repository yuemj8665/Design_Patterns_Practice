package design_patterns.builderPractice.ccomponents;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221B Baker Street, London to Scotland Yard, 8-10 broadway, London.";
    }

    public GPSNavigator(String maunalRoute) {
        this.route = maunalRoute;
    }

    public String getRoute() {
        return route;
    }
}
