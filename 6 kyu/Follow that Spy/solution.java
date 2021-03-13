public class Routes {
    public String findRoutes(String[][] routes) {

        String result = routes[0][0] + ", " + routes[0][1];
        String first = routes[0][0];
        String last = routes[0][1];

        for (int i = 0; i < routes.length - 1; i++) {
            for (int j = 1; j < routes.length; j++) {
                if (routes[j][0].equals(last)) {
                    last = routes[j][1];
                    result += ", " + last;
                } else if (routes[j][1].equals(first)) {
                    first = routes[j][0];
                    result = first + ", " + result;
                }
            }
        }
        return result;
    }
}
