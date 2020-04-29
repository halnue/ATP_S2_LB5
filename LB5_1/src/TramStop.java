import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TramStop {
String name;
int[] listNumRoute;
Hour[] listHour;

    public TramStop(String name, int[] listNumRoute, Hour[] listHour) {
        this.name = name;
        this.listNumRoute = listNumRoute;
        this.listHour = listHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getListNumRoute() {
        return listNumRoute;
    }

    public void setListNumRoute(int[] listNumRoute) {
        this.listNumRoute = listNumRoute;
    }

    String getMaxComment(){
        if (listHour == null)
            throw new NullPointerException();
        Hour maxComment = listHour[0];
        for (Hour h : listHour) {
            if (h.getComment().length() > maxComment.getComment().length())
                maxComment = h;
        }
        return maxComment.getComment();
    }

    List<Hour> getHourMinPassenger(){
        List<Hour> list = Arrays.asList(listHour);
        Collections.sort(list);
        int max = list.get(0).getQuantityPassenger();
        List listResult = list.stream()
                .sorted()
                .filter(hour -> hour.getQuantityPassenger()==max)
                .collect(Collectors.toList());
        return listResult;
    }

    int getAllPassenger(){
        return Arrays.asList(listHour).stream().mapToInt(Hour::getQuantityPassenger).sum();
    }

    @Override
    public String toString() {
        return "TramStop{" +
                "name='" + name + '\'' +
                ", listNumRoute=" + Arrays.toString(listNumRoute) +
                ", listHour=" + Arrays.toString(listHour) +
                '}';
    }
}
