package q1ex1;

//@author TAU

public class Q1Ex1 {
    public static void main(String[] args) {
        String p1name = "bag";
        String p2name = "sketchpad";
        String p3name = "watch";
        
        String p1color = "grey";
        String p2color = "blue";
        String p3color = "blue";
        
        int p1age = 2;
        int p2age = 1;
        int p3age = 6;
        
        System.out.println("Possession 1");
        System.out.println("Name: " + p1name);
        System.out.println("Color: " + p1color);
        System.out.println("Years in possession: " + p1age + "\n");
        
        System.out.println("Possession 2");
        System.out.println("Name: " + p2name);
        System.out.println("Color: " + p2color);
        System.out.println("Years in possession: " + p2age + "\n");
        
        System.out.println("Possession 1");
        System.out.println("Name: " + p3name);
        System.out.println("Color: " + p3color);
        System.out.println("Years in possession: " + p3age + "\n");
        
        System.out.println("The bag has more years in possession than the sketchpad: " + (p1age > p2age));
        System.out.println("The sketchpad and the watch are of the same : " + (p2color == p3color));
        System.out.println("The sketchpad has more years in possession than the watch: " + (p2age > p3age));
        
    }
    
}
