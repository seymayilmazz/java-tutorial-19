package package4;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Label extends View implements Click{

    @Override
    public void click() {
        System.out.println("label click");
    }

    @Override
    public void doubleClick() {
        System.out.println("label double click");
    }

}
