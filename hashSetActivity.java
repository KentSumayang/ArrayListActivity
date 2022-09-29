import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class hashSetActivity {

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


        //HashSet
        Set<String> infoList2 = new HashSet<>();
        infoList2.add(name);
        infoList2.add(age);
        infoList2.add(address);
        infoList2.add(favSong);
        infoList2.add(favArtist);
        
        //Display HashSet
        Stream<String> strSet = infoList2.stream();
        strSet.forEach(infosSet ->{
            System.out.println("Informations in HashSet:" + infosSet);
        });
        }

       
    }
    

