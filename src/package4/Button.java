package package4;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Button extends View implements Click{

    public void rightClick(){

    }

    @Override
    public void click() {
        System.out.println("button click");
    }

    @Override
    public void doubleClick() {
        System.out.println("button double click");
    }

}
