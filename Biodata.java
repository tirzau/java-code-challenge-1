public class Biodata {
    public static void main(String[] args) {
        
        //membuat variabel
        String name, birthdayplace, religion, address, hobby;
        int age;
        double height;
        double weight;
        char blood;
        
        //mengisi variabel
        name            = "Tirza Unggu";
        birthdayplace   = "Tangerang"; 
        religion        = "Christian";
        address         = "Jayapura";
        age             = 20;
        height          = 162.5;
        weight          = 61.3;
        blood           = 'A';
        hobby           = "Travelling";
        
        //mencetak isi variabel
        System.out.println("Name                : " + name);
        System.out.println("Birthday Place      : " + birthdayplace);
        System.out.println("Religion            : " + religion);
        System.out.println("Address             : " + address);
        System.out.println("Age                 : " + age + " years old");
        System.out.println("Height              : " + height + " cm");
        System.out.println("Weight              : " + weight + " kg");
        System.out.println("Blood               : " + blood);
        System.out.println("Hobby               : " + hobby);
    }
    
}
