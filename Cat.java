import java.util.ArrayList;
public class Cat implements Contract {


    private String item;
    private int height;
    private int length;
    private int width;
    private String color;
    private ArrayList<String> items;
    private int power;
    private int happiness;

    
    public Cat(String item, int height, int length, int width, String color, ArrayList<String> items, int power, int happiness){
        this.item = item;
        this.height = height;
        this.length = length;
        this.width = width;
        this.color = color;
        this.items = items;
        items.add("Balls");
        items.add("Magic cloak");
        this.happiness = 100;
        this.power = 100;
        
    }

    public void grab(String item){
        items.add(item);
        System.out.println("Meow, "+item+" is mine.");
    }

    public String drop(String item){
        items.remove(item);
        System.out.println("I lost interest on this"+item);
        String dropitem = item;
        return dropitem;
    }

    public void examine(String item){
        
    }

    public void use(String item){
        if(items.equals("Balls")){
           System.out.println("I love these balls!!");
           power++;
           happiness++;
        }
        if(items.equals("Magic stick")){
            System.out.println("Let's turn this into my favorite snacks!!! Meow");
            power = power-5;
        }

    }

    public boolean walk(String direction){
        boolean move_right = true;
        if(direction.equals("right")){
            return move_right;
        } else{
            return false;
        }
    }

    public boolean fly(int x, int y){
        
        if(y>0&&x>0){
            System.out.println("I fly fly fly to the right!!!");
            return true;
        } else if(y>0&&x<0){
            System.out.println("I fly fly fly to the left!!!");
            return true;
        } else if(y>0&&x=0){
            System.out.println("I fly fly fly to the Straight!!!");
        }else if(y<=0){
            return false;
            happiness--;
        }

    }

    public Number shrink(){
        System.out.println("Let me cross the hole");
        return width/2;

    }

    public Number grow(){
        System.out.println("I wanna be really tall!");
        this.height=
        return height*2;
    }

    public void rest(){
        power++;
        happiness++;
    }

    public void undo(){
        this.happiness = 100;
        this.power = 100;
    }


}
