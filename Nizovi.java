import java.util.Scanner;
public class Nizovi {
    public static void main(String[] args) {
    int [] niz;
    int n,zbir=0,max=0,min=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Unesite koliko clanova niza zelite: ");
    n=scanner.nextInt();
    niz= new int[n];
    //Pravljenje niza
    for(int i=0;i<n;i++){
        System.out.println("unesi na poziciju "+ i + " element koji zelite");
        niz[i]=scanner.nextInt();
    }
    //prikaz niza
    for(int i=0;i<n;i++) {
        System.out.print("Clanovi niza su: " + niz[i] + " ");
    }

    // zbir svih clanova viza
    for (int i=0;i<n;i++){
        zbir+=niz[i];
    }
    System.out.println("\n Zbir svih clanova niza je: "+zbir);
    //najveci broj u nizu
    for(int i=0;i<n;i++){
        max=niz[0];
        if(max<niz[i]){
            max=niz[i];
        }

    }
    System.out.println("Najveci broj u nizu je: "+max);
    //najmanji broj u nizu
    min=niz[0];
    for(int i=0;i<n;i++){
        if(min>niz[i]){
            niz[i]=min;
        }
    }
    System.out.println("Najmanji broj u nizu je: "+min);






    }
}
