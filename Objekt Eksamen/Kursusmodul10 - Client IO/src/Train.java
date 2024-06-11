import java.io.Serializable;

public class Train implements Serializable {
    private String name;

    public Train(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
