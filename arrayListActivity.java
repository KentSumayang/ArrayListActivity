import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class arrayListActivity {

// 1st implement an ArrayList and HashSet
// 2nd Ask for user input 5 times, and then add the values into the ArrayList and HashSet
// 3rd Display the values in the arraylist and HashSet.
// 4th Create repository for github and push the code.

    public static void main(String[] args) {
        

        Scanner inputName = new Scanner(System.in);
        System.out.println("Name: ");
        String name = inputName.nextLine();

        Scanner inputAge = new Scanner(System.in);
        System.out.println("Age: ");
        String age = inputAge.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Address: ");
        String address = inputAddress.nextLine();

        Scanner inputFavSong = new Scanner(System.in);
        System.out.println("Favorite Song: ");
        String favSong = inputFavSong.nextLine();

        Scanner inputFavArtist = new Scanner(System.in);
        System.out.println("Favorite Artist: ");
        String favArtist = inputFavArtist.nextLine();


        //ArrayList
        List<String> infoList = new ArrayList<>();
        infoList.add(name);
        infoList.add(age);
        infoList.add(address);
        infoList.add(favSong);
        infoList.add(favArtist);

        //Display ArrayList
        Stream<String> strList = infoList.stream();
        strList.forEach(infoArray ->{
            System.out.println("Informations in ArrayList :" + infoArray);
        });

        }

       
    }
    

