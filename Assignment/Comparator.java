import java.util.*;
class SortById implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if(o1.userId > o2.userId)
        {
             return 1;
        }
        else if(o1.userId < o2.userId)
        {
            return -1;
        }
        else{
             return o1.name.compareTo(o2.name);
        }
    }
}
public class Main
{
    
	public static void main(String[] args) {
	    System.out.println("Users.....");
        List<User> users = new ArrayList<>();

        users.add(new User(1,"Bob"));
        users.add(new User(11,"Alvin"));
        users.add(new User(12,"Smitu"));
        users.add(new User(5,"James"));
        users.add(new User(11,"Adam"));
        users.add(new User(12,"Smith"));

        // apply comparator based on Id
        System.out.println("Sort By ID");
        Collections.sort(users,new SortById());

        for(User usr: users){
            System.out.println(usr);
        }
        /*System.out.println("Sort By Name");
        // sort by name
        Collections.sort(users,new SortByName());
        for(User usr: users){
            System.out.println(usr);
		*/
	}
}
    

class User{

    /*
    * Object class methods, that should be overriden:
    * 1. toString()
    * 2. equals()
    * 3. hashCode()
    *
    * */
    int userId;
    String name;

    User(int id,String uName){
        userId = id;
        name = uName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null ){
            return false;
        }
        User user = (User) o; // type cast the object into our class type
        return userId == user.userId && name.equals(user.name);
    }

    @Override
    public String toString() {
        return "User => Id =" + userId +", Name = "+name;
    }
}
