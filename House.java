/*Create a class House with a nested static class Room. The Room class should have a
method showRoomDetails() that prints room details. Test the static nested class from the
main method*/
public class House{
    class Room{
        int floor;
        String color;
        int RoomNum;
        int person;
        String name;
        public Room(int RoomNum,int floor,String color,int person, String name){
            this.RoomNum=RoomNum;
            this.floor=floor;
            this.color=color;
            this.person=person;
            this.name=name;
        }
         public void showRoomDetails(){
            System.out.println(" In House,My room is on "+floor+"th floor");
            System.out.println("On floor "+floor+",My room no. is:"+RoomNum);
            System.out.println("My rooms wall color is:"+color);
            System.out.println("In My Room "+RoomNum+",there are "+person+" members");
            System.out.println("They are:"+name);
            

         }
    }
    public static void main(String[] args) {
        House h=new House();
        House.Room r=h.new Room(410,4,"Yellow and white",3,"Honey,Bhavini and Bhavya");
        r.showRoomDetails();
    }
}