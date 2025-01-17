public class Page_Object {

    public String name;
    public String city;

    public Page_Object(String name, String city){
        this.name = name;
        this.city = city;
    }
     public String SetName(String name){
        return name;
     }
     public String SetCollege(){
        return city;
     }
    public void getName(String name){
        this.name = name;
    }
    public void getCity(String city){
        this.city = city;
    }
    public static void main(String[] args) {
     Page_Object name = new Page_Object("", "");
      name.SetName("Calabar");
        System.out.println(name.SetName("John" + " This is my name and i love it from my heart thanks to my mom"));
    }
}