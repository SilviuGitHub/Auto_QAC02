package courses.java.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Square extends Rectangle {

    @Getter @Setter
    private int length;

    public Square(int length) {
        super(length, length);
    }

    @Override
    public int getArea() {
        System.out.println("Method called from Square!");
        return super.getWidth() * super.getWidth();

    }
}
