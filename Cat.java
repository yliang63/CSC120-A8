/**
 * The Cat class represents a cat that can interact with various items and perform actions.
 * 
 * This class implement Contract class.
 */
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

    /**
     * This class construct a cat object with given parameters and initializes default items, happiness and power.
     * 
     * @param item The item that the cat obtain.
     * @param height The height of the cat.
     * @param length The length of the cat.
     * @param width The width of the cat.
     * @param color The color of the cat.
     * @param items The list of items that the cat owns.
     * @param power The magic power that the cat have.
     * @param happiness The happiness level of the cat.
     */
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

    /**
     * Add the specific item into the list of the items that the cat owns.
     * 
     * @param The item for the cat to grab.
     */
    public void grab(String item){
        items.add(item);
        System.out.println("Meow, "+item+" is mine.");
    }

    /**
     * Remove the item from the list of the items.
     * 
     * @param item The item for the cat to drop.
     */
    public String drop(String item){
        items.remove(item);
        System.out.println("I lost interest on this"+item);
        String dropitem = item;
        return dropitem;
    }

    /**
     * Examine the assigned item and print out the characteristics of the item.
     * 
     * @param item The item that magic cat examines.
     */
    public void examine(String item){
        if(item.equals("Chicken")||item.equals("chicken")){
            System.out.println("It shows feathers.");
            System.out.println("It has two feets...");
            System.out.println("It has two wings...");
            System.out.println("It's a chicken!! Yum yum yum");
        }
        if(item.equals("Fish")||item.equals("fish")){
            System.out.println("It is shinny.");
            System.out.println("It has scale.");
            System.out.println("It has tail.");
            System.out.println("It's a fish!! Yum yum yum");
        }else{
            System.out.println("I am not interested in this");
        }
    }

    /**
     * Use the item in the list of items.
     * 
     * @param item The item that is being used.
     */
    public void use(String item){
        if(items.contains("Balls")){
           System.out.println("I love these balls!!");
           power++;
           happiness++;
        }
        if(items.contains("Magic stick")){
            System.out.println("Let's turn this into my favorite snacks!!! Meow");
            power = power-5;
        }

    }

    /**
     * The cat will walk in right direction or else it will not walk.
     * 
     * @param direction The direction that the user want the cat to move.
     * @return True if the cat is moving right, else return false.
     */
    public boolean walk(String direction){
        boolean move_right = true;
        if(direction.equals("right")){
            return move_right;
        } else{
            return false;
        }
    }

    /**
     * The cat will fly to specific coordinates.
     * 
     * @param x x-coordinate
     * @param y y-coordinate
     * @return True if the cat fly successfully, false if the cat cannot fly.
     */
    public boolean fly(int x, int y){
        if(items.contains("Magic cloak")){
            if(y>0&&x>0){
                System.out.println("I fly fly fly to the right!!!");
                return true;
            } else if(y>0&&x<0){
                System.out.println("I fly fly fly to the left!!!");
                return true;
            } else if(y>0&&x==0){
                System.out.println("I fly fly fly to the Straight!!!");
            }else if(y<=0){
                 happiness = happiness-1;
                 return false;
               
            }
        }
        return false;
    }
   
    /**
     * The cat will shrink.
     * 
     * @return The width after the cat shrinks.
     */
    public Number shrink(){
        System.out.println("Let me cross the hole");
        return width/2;

    }

    /**
     * The cat will grow.
     * 
     * @return The height after the cat grows.
     */
    public Number grow(){
        System.out.println("I wanna be really tall!");
        return height*2;
    }

    /**
     * The cat will rest and increase its power and happiness.
     */
    public void rest(){
        power++;
        happiness++;
    }

    /**
     * The happiness and power will return to defalut state.
     */
    public void undo(){
        this.happiness = 100;
        this.power = 100;
    }
    
    /**
     * Main method that displays the functionality of the every method.
     * @param args
     */
    public static void main(String[] args) {
        Cat myCat = new Cat("Magic Wand", 10, 20, 5, "Black", new ArrayList<>(), 50, 80);
        myCat.grab("Grass");
        myCat.examine("Fish");
        myCat.use("Ball");
        boolean isMovingRight = myCat.walk("right");
        System.out.println("Is the cat moving right? " + isMovingRight);
        boolean isFlying = myCat.fly(10, 5);
        System.out.println("Is the cat flying? " + isFlying);
        Number shrunkWidth = myCat.shrink();
        System.out.println("Width after shrinking: " + shrunkWidth);
        Number grownHeight = myCat.grow();
        System.out.println("Height after growing: " + grownHeight);
        myCat.rest();
        myCat.undo();
    }
 }



